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
	public final Producer<Object> createTagProducer(
			org.nasdanika.models.bootstrap.Tag tag,
			boolean parallel,
			BiConsumer<EObject, BiConsumer<Producer<Object>,ProgressMonitor>> elementProvider, 
			Consumer<BiConsumer<Map<EObject, Producer<Object>>,ProgressMonitor>> registry,
			ProgressMonitor progressMonitor) {
		
		return new TagProducer(context, tag, elementProvider);
	}
	
//	BootstrapElement.java
//	Tag.java
//	Div.java
	

//	Accordion.java
//	ActionGroup.java
//	ActionGroupItem.java
//	Alert.java
//	Appearance.java
//	Badge.java
//	Border.java
//	Breadcrumb.java
//	Button.java
//	ButtonGroup.java
//	ButtonToolbar.java
//	Card.java
//	Carousel.java
//	Collapse.java
//	Column.java
//	ColumnWidth.java
//	Container.java
//	ContentActionGroupItem.java
//	Dropdown.java
//	Float.java
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
//	Row.java
//	Slide.java
//	Spacing.java
//	Table.java
//	TableCell.java
//	TableConfiguration.java
//	TableHeader.java
//	TableRow.java
//	TableRowContainer.java
//	TableSection.java
//	Text.java
//	Tooltip.java	
	
}
