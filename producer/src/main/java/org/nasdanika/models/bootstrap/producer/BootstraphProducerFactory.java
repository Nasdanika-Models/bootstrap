package org.nasdanika.models.bootstrap.producer;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.Producer;

public class BootstraphProducerFactory {
			
	private Context context;

	public BootstraphProducerFactory(Context context)  {
		this.context = context;
	}

	@org.nasdanika.common.Transformer.Factory
	public final Producer<String> createPageProducer(
			org.nasdanika.models.bootstrap.Page page,
			boolean parallel,
			BiConsumer<EObject, BiConsumer<Producer<Object>,ProgressMonitor>> elementProvider, 
			Consumer<BiConsumer<Map<EObject, Producer<Object>>,ProgressMonitor>> registry,
			ProgressMonitor progressMonitor) {
		
		return new PageProducer(context, page, elementProvider);
	}

	@org.nasdanika.common.Transformer.Factory
	public final Producer<Object> createTagProducer(
			org.nasdanika.models.bootstrap.Tag tag,
			boolean parallel,
			BiConsumer<EObject, BiConsumer<Producer<Object>,ProgressMonitor>> elementProvider, 
			Consumer<BiConsumer<Map<EObject, Producer<Object>>,ProgressMonitor>> registry,
			ProgressMonitor progressMonitor) {
		
		return new TagProducer(context, tag, elementProvider);
	}
	
	@org.nasdanika.common.Transformer.Factory
	public final Producer<Object> createContainerProducer(
			org.nasdanika.models.bootstrap.Container container,
			boolean parallel,
			BiConsumer<EObject, BiConsumer<Producer<Object>,ProgressMonitor>> elementProvider, 
			Consumer<BiConsumer<Map<EObject, Producer<Object>>,ProgressMonitor>> registry,
			ProgressMonitor progressMonitor) {
		
		return new ContainerProducer(context, container, elementProvider);
	}
	
	@org.nasdanika.common.Transformer.Wire
	public final void wireContainerRows(
			org.nasdanika.models.bootstrap.Container container,
			ContainerProducer containerProducer,
			Map<?,?> registry,
			int pass,
			ProgressMonitor progressMonitor) {

		containerProducer.buildDelegateRows();
	}	

	@org.nasdanika.common.Transformer.Factory
	public final Producer<Object> createRowProducer(
			org.nasdanika.models.bootstrap.Row row,
			boolean parallel,
			BiConsumer<EObject, BiConsumer<Producer<Object>,ProgressMonitor>> elementProvider, 
			Consumer<BiConsumer<Map<EObject, Producer<Object>>,ProgressMonitor>> registry,
			ProgressMonitor progressMonitor) {
		
		return new RowProducer(context, row, elementProvider);
	}

	@org.nasdanika.common.Transformer.Factory
	public final Producer<Object> createColumnProducer(
			org.nasdanika.models.bootstrap.Column column,
			boolean parallel,
			BiConsumer<EObject, BiConsumer<Producer<Object>,ProgressMonitor>> elementProvider, 
			Consumer<BiConsumer<Map<EObject, Producer<Object>>,ProgressMonitor>> registry,
			ProgressMonitor progressMonitor) {
		
		return new ColumnProducer(context, column, elementProvider);
	}
	
//	Accordion.java
//	ActionGroup.java
//	ActionGroupItem.java
//	Alert.java
//	Badge.java
//	Breadcrumb.java
//	Button.java
//	ButtonGroup.java
//	ButtonToolbar.java
//	Card.java
//	Carousel.java
//	Collapse.java
//	ColumnWidth.java
//	ContentActionGroupItem.java
//	Dropdown.java
//	Form.java
//	FormGroup.java
//	InputGroup.java
//	Item.java
//	LinkActionGroupItem.java
//	ListGroup.java
//	Modal.java
//	Navbar.java
//	Navs.java
//	Page.java
//	Slide.java
//	Table.java
//	TableCell.java
//	TableConfiguration.java
//	TableHeader.java
//	TableRow.java
//	TableRowContainer.java
//	TableSection.java
//	Tooltip.java	
	
}
