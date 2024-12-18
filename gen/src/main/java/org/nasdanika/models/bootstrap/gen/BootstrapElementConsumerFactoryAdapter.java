package org.nasdanika.models.bootstrap.gen;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.nasdanika.common.ConsumerFactory;
import org.nasdanika.common.Context;
import org.nasdanika.common.Function;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.HTMLElement;
import org.nasdanika.models.html.gen.HtmlElementConsumerFactoryAdapter;
import org.nasdanika.models.bootstrap.Appearance;

public class BootstrapElementConsumerFactoryAdapter<M extends org.nasdanika.models.bootstrap.BootstrapElement, T extends org.nasdanika.html.bootstrap.BootstrapElement<?,?>> extends HtmlElementConsumerFactoryAdapter<M, org.nasdanika.html.HTMLElement<?>> {
	
	public BootstrapElementConsumerFactoryAdapter(M bootstrapElement, AdapterFactory adapterFactory) {
		super(bootstrapElement, adapterFactory);
	}

	@Override
	protected Function<HTMLElement<?>, HTMLElement<?>> createConfigureFunction(Context context) {
		Appearance appearance = getTarget().getAppearance();
		Function<HTMLElement<?>, HTMLElement<?>> configureFunction = super.createConfigureFunction(context);
		if (appearance == null) {
			return configureFunction;
		}
		@SuppressWarnings({ "rawtypes", "unchecked" })
		ConsumerFactory<HTMLElement<?>> appearanceConsumerFactory = (ConsumerFactory) EObjectAdaptable.adaptToConsumerFactoryNonNull(appearance, org.nasdanika.html.HTMLElement.class);
		return configureFunction.then(appearanceConsumerFactory.asFunctionFactory().create(context));
	}
	
	/**
	 * Retrieves wrapping bootstrap element.
	 * @param context
	 * @return
	 */
	protected Function<org.nasdanika.html.HTMLElement<?>, T> getWrapper(Context context) {
		return new Function<org.nasdanika.html.HTMLElement<?>, T>() {
	
			@Override
			public double size() {
				return 1;
			}
	
			@Override
			public String name() {
				return "Retrieving wrapping bootstrap element";
			}
	
			@SuppressWarnings("unchecked")
			@Override
			public T execute(HTMLElement<?> htmlElement, ProgressMonitor progressMonitor) {
				return (T) htmlElement.getData(org.nasdanika.html.bootstrap.BootstrapElement.class);
			}
			
		};
	}
	
	/**
	 * Helper function for calling BootstrapElement.toHTMLElement();
	 * @param context
	 * @return
	 */
	protected Function<org.nasdanika.html.bootstrap.BootstrapElement<?, ?>, org.nasdanika.html.HTMLElement<?>> toHTMLElement(Context context) {
		return new Function<org.nasdanika.html.bootstrap.BootstrapElement<?, ?>, org.nasdanika.html.HTMLElement<?>>() {
	
			@Override
			public double size() {
				return 1;
			}
	
			@Override
			public String name() {
				return "To HTML elment";
			}
	
			@Override
			public HTMLElement<?> execute(org.nasdanika.html.bootstrap.BootstrapElement<?, ?> bootstrapElement, ProgressMonitor progressMonitor) {
				return bootstrapElement.toHTMLElement();
			}
			
		};
	}

}
