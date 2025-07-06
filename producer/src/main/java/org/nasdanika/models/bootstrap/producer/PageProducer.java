package org.nasdanika.models.bootstrap.producer;

import java.util.function.BiConsumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.Producer;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Theme;
import org.nasdanika.models.bootstrap.Page;

public class PageProducer extends org.nasdanika.models.html.producer.PageProducer {
	
	public PageProducer(
			Context context, 
			Page page, 
			BiConsumer<EObject, BiConsumer<Producer<Object>, ProgressMonitor>> elementProvider) {
		
		super(context, page, elementProvider);

		Theme theme = page.getTheme();
		if (theme == null && page.isCdn()) {
			theme = Theme.Default;
		}
		if (theme != null) {
			BootstrapFactory.INSTANCE.bootstrapCdnHTMLPage(delegate, org.nasdanika.html.bootstrap.Theme.valueOf(theme.name()));
		}
	}

}
