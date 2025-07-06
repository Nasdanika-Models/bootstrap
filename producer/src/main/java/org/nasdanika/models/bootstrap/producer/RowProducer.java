package org.nasdanika.models.bootstrap.producer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.BiConsumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.Producer;
import org.nasdanika.models.bootstrap.Column;
import org.nasdanika.models.bootstrap.Row;

public class RowProducer extends BootstrapElementProducer<Row, org.nasdanika.html.bootstrap.Container.Row> {
	
	protected Collection<Producer<?>> columnBuilders = Collections.synchronizedCollection(new ArrayList<>());	

	protected RowProducer(
			Context context, 
			Row element,
			BiConsumer<EObject, BiConsumer<Producer<Object>, ProgressMonitor>> elementProvider) {
		super(context, element, elementProvider);
		
		for (Column col: element.getColumns()) {
			columnBuilders.add(createProxyProducer(col, elementProvider));
		}				
	}
	
	@Override
	public void build(Object obj) {
		super.build(obj);		
		if (obj instanceof org.nasdanika.html.bootstrap.Container.Row) {
			for (Producer<?> cb: columnBuilders) {
				cb.build(((org.nasdanika.html.bootstrap.Container.Row) obj).col());
			}
		}
	}

}
