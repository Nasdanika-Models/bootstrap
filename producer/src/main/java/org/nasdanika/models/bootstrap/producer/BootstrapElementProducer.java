package org.nasdanika.models.bootstrap.producer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.Container;
import org.nasdanika.html.HTMLElement;
import org.nasdanika.html.Producer;
import org.nasdanika.models.bootstrap.Appearance;
import org.nasdanika.models.bootstrap.BootstrapElement;

import reactor.core.publisher.Mono;

public class BootstrapElementProducer<T extends BootstrapElement, D extends org.nasdanika.html.bootstrap.BootstrapElement<?, ?>> implements Producer<Object> {
	
	protected T element;
	protected D delegate;
	
	protected Consumer<Object> builder;
	
	public static Producer<Object> createProxyProducer(EObject element, BiConsumer<EObject, BiConsumer<Producer<Object>, ProgressMonitor>> elementProvider) {
		return new Producer<Object>() {
			
			private Producer<Object> cDelegate;
			
			{
				elementProvider.accept(element, (cp, pm) -> cDelegate = cp);
			}

			@Override
			public Mono<Object> produceAsync(int indent) {
				return cDelegate.produceAsync(indent);
			}
			
			@Override
			public Object produce(int indent) {
				return cDelegate.produce(indent);
			}
			
			@Override
			public void build(Object obj) {
				cDelegate.build(obj);
			}
			
		};		
	}
	
	public static List<Producer<Object>> createProxyProducers(Collection<? extends EObject> elements, BiConsumer<EObject, BiConsumer<Producer<Object>, ProgressMonitor>> elementProvider) {
		return elements
				.stream()
				.map(e -> createProxyProducer(e, elementProvider))
				.toList();
	}
	
	protected D createDelegate(T element, Context context) {
		return null;
	}
	
	protected Map<String,Producer<?>> attributeProducers = new ConcurrentHashMap<>();
	protected Collection<Producer<?>> contentProducers = Collections.synchronizedCollection(new ArrayList<>());
	protected AppearanceBuilder appearanceBuilder;
	
	protected BootstrapElementProducer(
			Context context, 
			T element, 
			BiConsumer<EObject, BiConsumer<Producer<Object>, ProgressMonitor>> elementProvider) {
		
		this.element = element;
		delegate = createDelegate(element, context); 		
		HTMLElement<?> delegateHtmlElement = delegate == null ? null : delegate.toHTMLElement();
		
		for (Entry<String, EObject> attr: element.getAttributes().entrySet()) {			
			elementProvider.accept(attr.getValue(), (ap, pm) -> {
				if (delegateHtmlElement != null) {
					delegateHtmlElement.attribute(attr.getKey(), ap);					
				}
				attributeProducers.put(attr.getKey(), ap);
			});
		}
		
		for (EObject ce: element.getContent()) {
			Producer<Object> proxyProducer = createProxyProducer(ce, elementProvider);
			if (delegateHtmlElement instanceof Container) {
				((Container<?>) delegateHtmlElement).content(proxyProducer);
			}
			contentProducers.add(proxyProducer);
		}
		
		Appearance appearance = element.getAppearance();
		if (appearance != null) {
			for (Entry<String, EObject> attr: appearance.getAttributes().entrySet()) {			
				elementProvider.accept(attr.getValue(), (ap, pm) -> {
					if (delegateHtmlElement != null) {
						delegateHtmlElement.attribute(attr.getKey(), ap);
					}
					attributeProducers.put(attr.getKey(), ap);
				});
			}
			appearanceBuilder = new AppearanceBuilder(appearance);
			appearanceBuilder.build(delegate.toHTMLElement());
		}		
	}
	
	@Override
	public void build(Object obj) {
		HTMLElement<?> delegateHtmlElement =  ((org.nasdanika.html.bootstrap.BootstrapElement<?,?>) obj).toHTMLElement();
		attributeProducers.forEach((k,v) -> delegateHtmlElement.attribute(k, k));			
		if (appearanceBuilder != null) {
			appearanceBuilder.build(delegateHtmlElement);
		}
		for (Producer<?> cp: contentProducers) {
			if (delegateHtmlElement instanceof Container) {
				((Container<?>) delegateHtmlElement).content(cp);
			}
		}		
	}

	@Override
	public Mono<Object> produceAsync(int indent) {
		return delegate.produceAsync(indent);
	}
	
	@Override
	public Object produce(int indent) {
		return delegate.produce(indent);
	}

}
