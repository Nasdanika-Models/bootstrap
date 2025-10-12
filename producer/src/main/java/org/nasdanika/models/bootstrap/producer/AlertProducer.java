package org.nasdanika.models.bootstrap.producer;

import java.util.function.BiConsumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.Producer;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.TagBootstrapElement;
import org.nasdanika.models.bootstrap.Alert;

public class AlertProducer extends TagProducer<Alert, TagBootstrapElement> {

	protected AlertProducer(
			Context context, 
			Alert element,
			BiConsumer<EObject, BiConsumer<Producer<Object>, ProgressMonitor>> elementProvider) {
		super(context, element, elementProvider);
	}

	@Override
	protected TagBootstrapElement createDelegate(Alert element, Context context) {
		BootstrapFactory bootstrapFactory = context.get(BootstrapFactory.class, BootstrapFactory.INSTANCE);
		org.nasdanika.html.Tag alert = bootstrapFactory.alert(element.getColor());
		return bootstrapFactory.wrap(alert);
	}
	

}
