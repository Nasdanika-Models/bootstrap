package org.nasdanika.models.bootstrap.producer;

import java.util.function.BiConsumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.Producer;
import org.nasdanika.html.bootstrap.Breakpoint;
import org.nasdanika.html.bootstrap.Container;
import org.nasdanika.html.bootstrap.Size;
import org.nasdanika.models.bootstrap.Column;
import org.nasdanika.models.bootstrap.ColumnWidth;

public class ColumnProducer extends BootstrapElementProducer<Column, org.nasdanika.html.bootstrap.Container.Row.Col> {

	protected ColumnProducer(
			Context context, 
			Column element,
			BiConsumer<EObject, BiConsumer<Producer<Object>, ProgressMonitor>> elementProvider) {
		super(context, element, elementProvider);		
	}
	
	@Override
	public void build(Object obj) {
		super.build(obj);
		for (ColumnWidth cw: element.getWidth()) {
			((Container.Row.Col) obj).width(Breakpoint.valueOf(cw.getBreakpoint()), Size.valueOf(cw.getWidth()));
		}		
	}

}
