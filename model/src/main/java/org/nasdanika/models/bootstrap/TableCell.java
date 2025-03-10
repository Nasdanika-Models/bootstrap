/**
 */
package org.nasdanika.models.bootstrap;

import org.nasdanika.html.bootstrap.Color;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Table cell - regular or header.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bootstrap.TableCell#isHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.models.bootstrap.TableCell#getColSpan <em>Col Span</em>}</li>
 *   <li>{@link org.nasdanika.models.bootstrap.TableCell#getRowSpan <em>Row Span</em>}</li>
 *   <li>{@link org.nasdanika.models.bootstrap.TableCell#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.models.bootstrap.TableCell#getBackground <em>Background</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.bootstrap.BootstrapPackage#getTableCell()
 * @model
 * @generated
 */
public interface TableCell extends BootstrapElement {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, table cell is generated as ``<th>`` instead of the default ``<td>``.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see #setHeader(boolean)
	 * @see org.nasdanika.models.bootstrap.BootstrapPackage#getTableCell_Header()
	 * @model
	 * @generated
	 */
	boolean isHeader();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bootstrap.TableCell#isHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see #isHeader()
	 * @generated
	 */
	void setHeader(boolean value);

	/**
	 * Returns the value of the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Column span for the cell.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Col Span</em>' attribute.
	 * @see #setColSpan(int)
	 * @see org.nasdanika.models.bootstrap.BootstrapPackage#getTableCell_ColSpan()
	 * @model
	 * @generated
	 */
	int getColSpan();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bootstrap.TableCell#getColSpan <em>Col Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Span</em>' attribute.
	 * @see #getColSpan()
	 * @generated
	 */
	void setColSpan(int value);

	/**
	 * Returns the value of the '<em><b>Row Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Row span for the cell.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Row Span</em>' attribute.
	 * @see #setRowSpan(int)
	 * @see org.nasdanika.models.bootstrap.BootstrapPackage#getTableCell_RowSpan()
	 * @model
	 * @generated
	 */
	int getRowSpan();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bootstrap.TableCell#getRowSpan <em>Row Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Span</em>' attribute.
	 * @see #getRowSpan()
	 * @generated
	 */
	void setRowSpan(int value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cell color.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(Color)
	 * @see org.nasdanika.models.bootstrap.BootstrapPackage#getTableCell_Color()
	 * @model dataType="org.nasdanika.models.bootstrap.Color"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bootstrap.TableCell#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cell background color. Displays differently from "Color". Can also be specified via appearance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Background</em>' attribute.
	 * @see #setBackground(Color)
	 * @see org.nasdanika.models.bootstrap.BootstrapPackage#getTableCell_Background()
	 * @model dataType="org.nasdanika.models.bootstrap.Color"
	 * @generated
	 */
	Color getBackground();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bootstrap.TableCell#getBackground <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' attribute.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(Color value);

} // TableCell
