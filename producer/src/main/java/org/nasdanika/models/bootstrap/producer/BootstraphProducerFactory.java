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
		
		return new TagProducer<org.nasdanika.models.bootstrap.Tag,org.nasdanika.html.bootstrap.BootstrapElement<?, ?>>(context, tag, elementProvider);
	}

	@org.nasdanika.common.Transformer.Factory
	public final Producer<Object> createDivProducer(
			org.nasdanika.models.bootstrap.Div div,
			boolean parallel,
			BiConsumer<EObject, BiConsumer<Producer<Object>,ProgressMonitor>> elementProvider, 
			Consumer<BiConsumer<Map<EObject, Producer<Object>>,ProgressMonitor>> registry,
			ProgressMonitor progressMonitor) {
		
		return new DivProducer<org.nasdanika.models.bootstrap.Div,org.nasdanika.html.bootstrap.BootstrapElement<?, ?>>(context, div, elementProvider);
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
	
	@org.nasdanika.common.Transformer.Factory
	public final Producer<Object> createAlertProducer(
			org.nasdanika.models.bootstrap.Alert alert,
			boolean parallel,
			BiConsumer<EObject, BiConsumer<Producer<Object>,ProgressMonitor>> elementProvider, 
			Consumer<BiConsumer<Map<EObject, Producer<Object>>,ProgressMonitor>> registry,
			ProgressMonitor progressMonitor) {
		
		return new AlertProducer(context, alert, elementProvider);
	}	
	
	@org.nasdanika.common.Transformer.Factory
	public final Producer<Object> createButtonProducer(
			org.nasdanika.models.bootstrap.Button button,
			boolean parallel,
			BiConsumer<EObject, BiConsumer<Producer<Object>,ProgressMonitor>> elementProvider, 
			Consumer<BiConsumer<Map<EObject, Producer<Object>>,ProgressMonitor>> registry,
			ProgressMonitor progressMonitor) {
		
		return new ButtonProducer(context, button, elementProvider);
	}	
	
	@org.nasdanika.common.Transformer.Factory
	public final Producer<Object> createModalProducer(
			org.nasdanika.models.bootstrap.Modal modal,
			boolean parallel,
			BiConsumer<EObject, BiConsumer<Producer<Object>,ProgressMonitor>> elementProvider, 
			Consumer<BiConsumer<Map<EObject, Producer<Object>>,ProgressMonitor>> registry,
			ProgressMonitor progressMonitor) {
		
		throw new UnsupportedOperationException();
//		return new ModalProducer(context, modal, elementProvider);
	}
	
	@org.nasdanika.common.Transformer.Factory
	public final Producer<Object> createBadgeProducer(
			org.nasdanika.models.bootstrap.Badge badge,
			boolean parallel,
			BiConsumer<EObject, BiConsumer<Producer<Object>,ProgressMonitor>> elementProvider, 
			Consumer<BiConsumer<Map<EObject, Producer<Object>>,ProgressMonitor>> registry,
			ProgressMonitor progressMonitor) {
		
		throw new UnsupportedOperationException();
//		return new BadgeProducer(context, modal, elementProvider);
	}
	
	@org.nasdanika.common.Transformer.Factory
	public final Producer<Object> createTableProducer(
			org.nasdanika.models.bootstrap.Table table,
			boolean parallel,
			BiConsumer<EObject, BiConsumer<Producer<Object>,ProgressMonitor>> elementProvider, 
			Consumer<BiConsumer<Map<EObject, Producer<Object>>,ProgressMonitor>> registry,
			ProgressMonitor progressMonitor) {
		
		throw new UnsupportedOperationException();
//		return new TableProducer(context, modal, elementProvider);
	}

	@org.nasdanika.common.Transformer.Factory
	public final Producer<Object> createTableSectionProducer(
			org.nasdanika.models.bootstrap.TableSection tableSection,
			boolean parallel,
			BiConsumer<EObject, BiConsumer<Producer<Object>,ProgressMonitor>> elementProvider, 
			Consumer<BiConsumer<Map<EObject, Producer<Object>>,ProgressMonitor>> registry,
			ProgressMonitor progressMonitor) {
		
		throw new UnsupportedOperationException();
//		return new TableSectionProducer(context, modal, elementProvider);
	}
		
	@org.nasdanika.common.Transformer.Factory
	public final Producer<Object> createTableHeaderProducer(
			org.nasdanika.models.bootstrap.TableHeader tableHeader,
			boolean parallel,
			BiConsumer<EObject, BiConsumer<Producer<Object>,ProgressMonitor>> elementProvider, 
			Consumer<BiConsumer<Map<EObject, Producer<Object>>,ProgressMonitor>> registry,
			ProgressMonitor progressMonitor) {
		
		throw new UnsupportedOperationException();
//		return new TableHeaderProducer(context, modal, elementProvider);
	}
		
	@org.nasdanika.common.Transformer.Factory
	public final Producer<Object> createTableRowProducer(
			org.nasdanika.models.bootstrap.TableRow tableRow,
			boolean parallel,
			BiConsumer<EObject, BiConsumer<Producer<Object>,ProgressMonitor>> elementProvider, 
			Consumer<BiConsumer<Map<EObject, Producer<Object>>,ProgressMonitor>> registry,
			ProgressMonitor progressMonitor) {
		
		throw new UnsupportedOperationException();
//		return new TableRowProducer(context, modal, elementProvider);
	}
	
	@org.nasdanika.common.Transformer.Factory
	public final Producer<Object> createTableCellProducer(
			org.nasdanika.models.bootstrap.TableCell tableCell,
			boolean parallel,
			BiConsumer<EObject, BiConsumer<Producer<Object>,ProgressMonitor>> elementProvider, 
			Consumer<BiConsumer<Map<EObject, Producer<Object>>,ProgressMonitor>> registry,
			ProgressMonitor progressMonitor) {
		
		throw new UnsupportedOperationException();
//		return new TableCellProducer(context, modal, elementProvider);
	}
	

//	Button.java	
//	ActionGroup.java
//	ActionGroupItem.java
//	Card.java
//	Carousel.java
//	Slide.java
//	Tooltip.java	
//	Item.java
//	LinkActionGroupItem.java
//	ColumnWidth.java
//	ContentActionGroupItem.java
	
	
///	Accordion.java
///	Breadcrumb.java
///	ButtonGroup.java
///	ButtonToolbar.java
///	Collapse.java
///	Dropdown.java
///	Form.java
///	FormGroup.java
///	InputGroup.java
///	ListGroup.java
///	Navbar.java
///	Navs.java
	
}
