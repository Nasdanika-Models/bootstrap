package org.nasdanika.models.bootstrap.producer;

import java.util.function.BiConsumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.Producer;
import org.nasdanika.models.bootstrap.Div;

public class DivProducer<T extends Div, D extends org.nasdanika.html.bootstrap.BootstrapElement<?, ?>> extends TagProducer<T,D> {

	protected DivProducer(
			Context context, 
			T element,
			BiConsumer<EObject, BiConsumer<Producer<Object>, ProgressMonitor>> elementProvider) {
		super(context, element, elementProvider);
//		new Exception().printStackTrace();
	}

}
