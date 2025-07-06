package org.nasdanika.models.bootstrap.producer.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.nasdanika.common.Context;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.html.Producer;
import org.nasdanika.html.bootstrap.Breakpoint;
import org.nasdanika.html.bootstrap.Size;
import org.nasdanika.html.bootstrap.Theme;
import org.nasdanika.html.producer.HtmlGenerator;
import org.nasdanika.models.bootstrap.BootstrapFactory;
import org.nasdanika.models.bootstrap.Column;
import org.nasdanika.models.bootstrap.ColumnWidth;
import org.nasdanika.models.bootstrap.Container;
import org.nasdanika.models.html.HtmlFactory;
import org.nasdanika.models.bootstrap.Page;
import org.nasdanika.models.bootstrap.Row;
import org.nasdanika.models.html.Tag;

public class TestBootstrapGeneration {

	@Test
	public void testTag() {
		PrintStreamProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		HtmlGenerator htmlGenerator = HtmlGenerator.load(
				Context.EMPTY_CONTEXT, 
				null, 
				progressMonitor);

		
		Tag tag = HtmlFactory.eINSTANCE.createTag();
		tag.setName("b");
		tag.getAttributes().put("style", org.nasdanika.ncore.String.wrap("margin:5px"));
		tag.getContent().add(org.nasdanika.ncore.String.wrap("Hello World"));
		
		assertTrue(htmlGenerator.canHandle(tag));
				
		Producer<Object> processor = htmlGenerator.createProducer(tag, progressMonitor);
		Object result = processor.produce(0);
		
		System.out.println(result);
	}
	
	@Test
	public void testPage() {
		PrintStreamProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		HtmlGenerator htmlGenerator = HtmlGenerator.load(
				Context.EMPTY_CONTEXT, 
				null, 
				progressMonitor);

		Tag tag = HtmlFactory.eINSTANCE.createTag();
		tag.setName("b");
		tag.getAttributes().put("style", org.nasdanika.ncore.String.wrap("margin:5px"));
		tag.getContent().add(org.nasdanika.ncore.String.wrap("Hello World"));
		
		assertTrue(htmlGenerator.canHandle(tag));
		
		Page page = BootstrapFactory.eINSTANCE.createPage();
		page.setName("Test page");
		page.setTheme(Theme.Cerulean);		
		
		page.getBody().add(tag);		
				
		Producer<Object> processor = htmlGenerator.createProducer(page, progressMonitor);
		Object result = processor.produce(0);
		
		System.out.println(result);
	}
		
	@Test
	public void testContainer() {
		PrintStreamProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		HtmlGenerator htmlGenerator = HtmlGenerator.load(
				Context.EMPTY_CONTEXT, 
				null, 
				progressMonitor);

		Tag tag = HtmlFactory.eINSTANCE.createTag();
		tag.setName("b");
		tag.getAttributes().put("style", org.nasdanika.ncore.String.wrap("margin:5px"));
		tag.getContent().add(org.nasdanika.ncore.String.wrap("Hello World"));
		
		assertTrue(htmlGenerator.canHandle(tag));
				
		BootstrapFactory bootstrapFactory = BootstrapFactory.eINSTANCE;
		Page page = bootstrapFactory.createPage();
		page.setName("Test page");
		page.setTheme(Theme.Cerulean);		
		
		Container container = bootstrapFactory.createContainer();
		container.setFluid(true);
		page.getBody().add(container);
		
		Row row = bootstrapFactory.createRow();
		container.getRows().add(row);
		
		Column col = bootstrapFactory.createColumn();
		row.getColumns().add(col);
		
		col.getContent().add(tag);
		
		ColumnWidth colWidth = bootstrapFactory.createColumnWidth();
		colWidth.setWidth(Size.S0.name());
		colWidth.setBreakpoint(Breakpoint.DEFAULT.name());
		col.getWidth().add(colWidth);
								
		Producer<Object> processor = htmlGenerator.createProducer(page, progressMonitor);
		Object result = processor.produce(0);
		
		System.out.println(result);
	}

}
