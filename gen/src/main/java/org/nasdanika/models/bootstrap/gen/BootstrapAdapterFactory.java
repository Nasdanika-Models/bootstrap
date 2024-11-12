package org.nasdanika.models.bootstrap.gen;

import org.nasdanika.common.ConsumerFactory;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.emf.FunctionAdapterFactory;
import org.nasdanika.html.HTMLElement;
import org.nasdanika.html.HTMLPage;
import org.nasdanika.models.html.gen.HtmlAdapterFactory;
import org.nasdanika.models.bootstrap.Appearance;
import org.nasdanika.models.bootstrap.BootstrapElement;
import org.nasdanika.models.bootstrap.BootstrapPackage;
import org.nasdanika.models.bootstrap.Page;
import org.nasdanika.models.bootstrap.TableCell;
import org.nasdanika.models.bootstrap.TableHeader;
import org.nasdanika.models.bootstrap.TableRow;
import org.nasdanika.models.bootstrap.TableSection;

/**
 * Provides adapters for the Engineering model elements.
 * @author Pavel
 *
 */
public class BootstrapAdapterFactory extends HtmlAdapterFactory {
	
	public BootstrapAdapterFactory() {
		ClassLoader classLoader = getClassLoader();
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory<HTMLPage>, Page>(
					BootstrapPackage.Literals.PAGE, 
					Util.getSupplierFactoryClass(HTMLPage.class), 
					classLoader, 
					PageSupplierFactoryAdapter::new));		
						
		@SuppressWarnings({ "unchecked", "rawtypes" })
		Class<HTMLElement<?>> htmlElementClass = (Class) HTMLElement.class;
		
		registerAdapterFactory(
				new FunctionAdapterFactory<ConsumerFactory<HTMLElement<?>>, Appearance>(
					BootstrapPackage.Literals.APPEARANCE, 
					Util.getConsumerFactoryClass(htmlElementClass), 
					classLoader, 
					AppearanceConsumerFactoryAdapter::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<ConsumerFactory<HTMLElement<?>>, BootstrapElement>(
					BootstrapPackage.Literals.BOOTSTRAP_ELEMENT, 
					Util.getConsumerFactoryClass(htmlElementClass), 
					classLoader, 
					e -> new BootstrapElementConsumerFactoryAdapter<>(e, this)));
								
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory<org.nasdanika.html.Tag>, org.nasdanika.models.bootstrap.Tag>(
					BootstrapPackage.Literals.TAG, 
					Util.getSupplierFactoryClass(org.nasdanika.html.Tag.class), 
					classLoader, 
					e -> new TagSupplierFactoryAdapter<>(e, this)));		
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory<HTMLElement<?>>, org.nasdanika.models.bootstrap.Modal>(
					BootstrapPackage.Literals.MODAL, 
					Util.getSupplierFactoryClass(htmlElementClass), 
					classLoader, 
					e -> new ModalSupplierFactoryAdapter(e, this)));		
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory<org.nasdanika.html.Tag>, org.nasdanika.models.bootstrap.Alert>(
					BootstrapPackage.Literals.ALERT, 
					Util.getSupplierFactoryClass(org.nasdanika.html.Tag.class), 
					classLoader, 
					e -> new AlertSupplierFactoryAdapter(e, this)));		
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory<org.nasdanika.html.Tag>, org.nasdanika.models.bootstrap.Carousel>(
					BootstrapPackage.Literals.CAROUSEL, 
					Util.getSupplierFactoryClass(org.nasdanika.html.Tag.class), 
					classLoader, 
					e -> new CarouselSupplierFactoryAdapter(e, this)));		
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory<org.nasdanika.html.Tag>, org.nasdanika.models.bootstrap.Slide>(
					BootstrapPackage.Literals.SLIDE, 
					Util.getSupplierFactoryClass(org.nasdanika.html.Tag.class), 
					classLoader, 
					e -> new SlideSupplierFactoryAdapter(e, this)));		
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory<HTMLElement<?>>, org.nasdanika.models.bootstrap.Card>(
					BootstrapPackage.Literals.CARD, 
					Util.getSupplierFactoryClass(htmlElementClass), 
					classLoader, 
					e -> new CardSupplierFactoryAdapter(e, this)));		
		
		// Table		
		registerAdapterFactory(
				new FunctionAdapterFactory<ConsumerFactory<HTMLElement<?>>, TableHeader>(
					BootstrapPackage.Literals.TABLE_HEADER, 
					Util.getConsumerFactoryClass(htmlElementClass), 
					classLoader, 
					e -> new TableHeaderConsumerFactoryAdapter(e, this)));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<ConsumerFactory<HTMLElement<?>>, TableSection>(
					BootstrapPackage.Literals.TABLE_SECTION, 
					Util.getConsumerFactoryClass(htmlElementClass), 
					classLoader, 
					e -> new TableSectionConsumerFactoryAdapter(e, this)));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<ConsumerFactory<HTMLElement<?>>, TableRow>(
					BootstrapPackage.Literals.TABLE_ROW, 
					Util.getConsumerFactoryClass(htmlElementClass), 
					classLoader, 
					e -> new TableRowConsumerFactoryAdapter(e, this)));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<ConsumerFactory<HTMLElement<?>>, TableCell>(
					BootstrapPackage.Literals.TABLE_CELL, 
					Util.getConsumerFactoryClass(htmlElementClass), 
					classLoader, 
					e -> new TableCellConsumerFactoryAdapter(e, this)));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<ConsumerFactory<HTMLElement<?>>, org.nasdanika.models.bootstrap.Table>(
					BootstrapPackage.Literals.TABLE, 
					Util.getConsumerFactoryClass(htmlElementClass), 
					classLoader, 
					e -> new TableConsumerFactoryAdapter(e, this)));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory<HTMLElement<?>>, org.nasdanika.models.bootstrap.Table>(
					BootstrapPackage.Literals.TABLE, 
					Util.getSupplierFactoryClass(htmlElementClass), 
					classLoader, 
					e -> new TableSupplierFactoryAdapter(e, this)));		
		
	}
	
}
