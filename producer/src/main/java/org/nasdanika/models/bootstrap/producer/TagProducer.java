package org.nasdanika.models.bootstrap.producer;

import java.util.function.BiConsumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.Producer;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.models.bootstrap.Tag;

public class TagProducer extends BootstrapElementProducer<Tag, org.nasdanika.html.bootstrap.BootstrapElement<org.nasdanika.html.Tag,?>> {

	protected TagProducer(
			Context context, 
			Tag element,
			BiConsumer<EObject, BiConsumer<Producer<Object>, ProgressMonitor>> elementProvider) {
		super(context, element, elementProvider);
	}

	@Override
	protected org.nasdanika.html.bootstrap.BootstrapElement<org.nasdanika.html.Tag,?> createDelegate(Tag element, Context context) {
		BootstrapFactory bootstrapFactory = context.get(BootstrapFactory.class, BootstrapFactory.INSTANCE);
		org.nasdanika.html.Tag htmlTag = bootstrapFactory.getHTMLFactory().tag(element.getName());
		return bootstrapFactory.wrap(htmlTag);
	}

}
