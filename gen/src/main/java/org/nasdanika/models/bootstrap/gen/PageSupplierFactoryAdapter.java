package org.nasdanika.models.bootstrap.gen;

import java.util.List;
import java.util.Map;

import org.nasdanika.common.Context;
import org.nasdanika.common.Function;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.HTMLPage;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.models.bootstrap.Page;
import org.nasdanika.persistence.ConfigurationException;

public class PageSupplierFactoryAdapter extends org.nasdanika.models.html.gen.PageSupplierFactoryAdapter {
	
	public PageSupplierFactoryAdapter(Page page) {
		super(page);
	}
	
	@Override
	public boolean isAdapterForType(Object type) {
		return type == SupplierFactory.class;
	}
	
	@Override
	protected Function<Map<PagePart, List<Object>>, HTMLPage> createPageFunction(Context context) {
		return new Function<Map<PagePart, List<Object>>, HTMLPage>() {
			
			@Override
			public double size() {
				return 1;
			}
			
			@Override
			public String name() {
				return "Bootstrap Page";
			}
			
			@Override
			public HTMLPage execute(Map<PagePart, List<Object>> pageParts, ProgressMonitor progressMonitor) {
				BootstrapFactory factory = context.get(BootstrapFactory.class, BootstrapFactory.INSTANCE);
				HTMLFactory htmlFactory = factory.getHTMLFactory();
				Page semanticElement = (Page) getTarget();
				String pageName = context.interpolateToString(semanticElement.getName());
				HTMLPage ret = htmlFactory.page();
				ret.title(pageName);
				ret.lang(semanticElement.getLanguage());
				
				if (semanticElement.isCdn()) {
					factory.bootstrapCdnHTMLPage(ret, semanticElement.getTheme());
				} else if (semanticElement.getTheme() != null) {
					throw new ConfigurationException("Theme cannot be specified when 'cdn' is set to 'false'");			
				}
				
				factory.bootstrapHTMLPage(ret);
				
				for (String styleseet: semanticElement.getStylesheets()) {
					ret.stylesheet(styleseet);
				}
				for (String script: semanticElement.getScripts()) {
					ret.script(script);
				}				
				
				for (Object prologElement: context.get(PAGE_PROLOG_PROPERTY, List.class)) {
					ret.prolog(prologElement);
				}
				for (Object prologElement: pageParts.get(PagePart.prolog)) {
					ret.prolog(prologElement);
				}
				
				for (Object headElement: context.get(PAGE_HEAD_PROPERTY, List.class)) {
					ret.head(headElement);
				}
				for (Object headElement: pageParts.get(PagePart.head)) {
					ret.head(headElement);
				}
				
				for (Object bodyElement: context.get(PAGE_BODY_PROPERTY, List.class)) {
					ret.body(bodyElement);
				}
				for (Object bodyElement: pageParts.get(PagePart.body)) {
					ret.body(bodyElement);
				}
				
				for (Object epilogElement: context.get(PAGE_EPILOG_PROPERTY, List.class)) {
					ret.epilog(epilogElement);
				}
				for (Object epilogElement: pageParts.get(PagePart.epilog)) {
					ret.epilog(epilogElement);
				}
				return ret;
			}
		};
		
	}

}
