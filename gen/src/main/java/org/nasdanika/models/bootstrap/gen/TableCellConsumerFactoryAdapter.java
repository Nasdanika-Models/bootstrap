package org.nasdanika.models.bootstrap.gen;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.nasdanika.common.Context;
import org.nasdanika.common.Function;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.HTMLElement;
import org.nasdanika.html.bootstrap.RowContainer;
import org.nasdanika.models.bootstrap.TableCell;

/**
 * Adds a cell to the consumed row.
 * @author Pavel
 *
 */
public class TableCellConsumerFactoryAdapter extends BootstrapElementConsumerFactoryAdapter<org.nasdanika.models.bootstrap.TableCell, org.nasdanika.html.bootstrap.RowContainer.Row> {

	public TableCellConsumerFactoryAdapter(org.nasdanika.models.bootstrap.TableCell tableCell, AdapterFactory adapterFactory) {
		super(tableCell, adapterFactory);
	}
	
	@Override
	protected Function<HTMLElement<?>, HTMLElement<?>> createConfigureFunction(Context context) {		
		return getWrapper(context)
				.then(createTableCellFunction(context))
				.then(toHTMLElement(context))
				.then(super.createConfigureFunction(context));
	}
	
	/**
	 * Takes {@link RowContainer}, creates a row, configures and returns for passing to cell consumers. 
	 * @param context
	 * @return Row instance to pass to cell consumers.
	 */
	protected Function<org.nasdanika.html.bootstrap.RowContainer.Row, org.nasdanika.html.bootstrap.RowContainer.Row.Cell> createTableCellFunction(Context context) {
		return new Function<org.nasdanika.html.bootstrap.RowContainer.Row, org.nasdanika.html.bootstrap.RowContainer.Row.Cell>() {
	
			@Override
			public double size() {
				return 1;
			}
	
			@Override
			public String name() {
				return "Table cell";
			}

			@Override
			public org.nasdanika.html.bootstrap.RowContainer.Row.Cell execute(org.nasdanika.html.bootstrap.RowContainer.Row row, ProgressMonitor progressMonitor) {
				TableCell semanticElement = getTarget();
				org.nasdanika.html.bootstrap.RowContainer.Row.Cell ret = semanticElement.isHeader() ? row.header() : row.cell();
				int colSpan = semanticElement.getColSpan();
				if (colSpan > 0) {
					ret.toHTMLElement().colspan(colSpan);
				}
				int rowSpan = semanticElement.getRowSpan();
				if (rowSpan > 0) {
					ret.toHTMLElement().rowspan(rowSpan);
				}
				ret.color(semanticElement.getColor());
				ret.backgroundColor(semanticElement.getColor());
				return ret;
			}
			
		};
	}	

}
