package org.nasdanika.models.bootstrap.util;

import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.bootstrap.TableCell;

/**
 * Interface for building table columns.
 * @author Pavel
 *
 */
public interface ColumnBuilder<T> {

	/**
	 * Builds a header cell.
	 * @param header
	 */
	public void buildHeader(
			TableCell header,
			ProgressMonitor progressMonitor);

	/**
	 * Builds a value cell
	 */
	public void buildCell(
			T rowElement, 
			TableCell cell,
			ProgressMonitor progressMonitor);
	
}
