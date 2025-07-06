package org.nasdanika.models.bootstrap.producer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.BiConsumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.Producer;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.models.bootstrap.Container;
import org.nasdanika.models.bootstrap.Row;

public class ContainerProducer extends BootstrapElementProducer<Container, org.nasdanika.html.bootstrap.Container> {
	
	protected Collection<Producer<?>> rowBuilders = Collections.synchronizedCollection(new ArrayList<>());	

	protected ContainerProducer(
			Context context, 
			Container element,
			BiConsumer<EObject, BiConsumer<Producer<Object>, ProgressMonitor>> elementProvider) {
		super(context, element, elementProvider);
		
		for (Row row: element.getRows()) {
			rowBuilders.add(createProxyProducer(row, elementProvider));
		}		
	}

	@Override
	protected org.nasdanika.html.bootstrap.Container createDelegate(Container element, Context context) {
		BootstrapFactory bootstrapFactory = context.get(BootstrapFactory.class, BootstrapFactory.INSTANCE);
		return element.isFluid() ? bootstrapFactory.fluidContainer() : bootstrapFactory.container(); 		
	}
		
	@Override
	public void build(Object obj) {
		super.build(obj);		
		if (obj instanceof org.nasdanika.html.bootstrap.Container) {
			for (Producer<?> rb: rowBuilders) {
				rb.build(((org.nasdanika.html.bootstrap.Container) obj).row());
			}
		}
	}
	
	public void buildDelegateRows() {
		for (Producer<?> rb: rowBuilders) {
			rb.build(((org.nasdanika.html.bootstrap.Container) delegate).row());
		}
	}	

}
