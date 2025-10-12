package org.nasdanika.models.bootstrap.producer;

import java.util.function.BiConsumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.Producer;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.models.bootstrap.Button;

public class ButtonProducer extends TagProducer<Button, org.nasdanika.html.bootstrap.Button<org.nasdanika.html.Button>> {

	protected ButtonProducer(
			Context context, 
			Button element,
			BiConsumer<EObject, BiConsumer<Producer<Object>, ProgressMonitor>> elementProvider) {
		super(context, element, elementProvider);
	}

	@Override
	protected org.nasdanika.html.bootstrap.Button<org.nasdanika.html.Button> createDelegate(Button element, Context context) {
		BootstrapFactory bootstrapFactory = context.get(BootstrapFactory.class, BootstrapFactory.INSTANCE);
		org.nasdanika.html.Button button = bootstrapFactory.getHTMLFactory().button();
		return bootstrapFactory.button(button, element.getColor(), element.isOutline()); 
	}
	
}
