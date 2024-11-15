/**
 */
package org.nasdanika.models.bootstrap.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.models.bootstrap.BootstrapPackage;
import org.nasdanika.models.bootstrap.TableCell;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bootstrap.impl.TableCellImpl#isHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.models.bootstrap.impl.TableCellImpl#getColSpan <em>Col Span</em>}</li>
 *   <li>{@link org.nasdanika.models.bootstrap.impl.TableCellImpl#getRowSpan <em>Row Span</em>}</li>
 *   <li>{@link org.nasdanika.models.bootstrap.impl.TableCellImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.models.bootstrap.impl.TableCellImpl#getBackground <em>Background</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableCellImpl extends BootstrapElementImpl implements TableCell {
	/**
	 * The default value of the '{@link #isHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHeader()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HEADER_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getColSpan() <em>Col Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColSpan()
	 * @generated
	 * @ordered
	 */
	protected static final int COL_SPAN_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getRowSpan() <em>Row Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowSpan()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_SPAN_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color COLOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected static final Color BACKGROUND_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableCellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.TABLE_CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHeader() {
		return (Boolean)eDynamicGet(BootstrapPackage.TABLE_CELL__HEADER, BootstrapPackage.Literals.TABLE_CELL__HEADER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeader(boolean newHeader) {
		eDynamicSet(BootstrapPackage.TABLE_CELL__HEADER, BootstrapPackage.Literals.TABLE_CELL__HEADER, newHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getColSpan() {
		return (Integer)eDynamicGet(BootstrapPackage.TABLE_CELL__COL_SPAN, BootstrapPackage.Literals.TABLE_CELL__COL_SPAN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColSpan(int newColSpan) {
		eDynamicSet(BootstrapPackage.TABLE_CELL__COL_SPAN, BootstrapPackage.Literals.TABLE_CELL__COL_SPAN, newColSpan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRowSpan() {
		return (Integer)eDynamicGet(BootstrapPackage.TABLE_CELL__ROW_SPAN, BootstrapPackage.Literals.TABLE_CELL__ROW_SPAN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRowSpan(int newRowSpan) {
		eDynamicSet(BootstrapPackage.TABLE_CELL__ROW_SPAN, BootstrapPackage.Literals.TABLE_CELL__ROW_SPAN, newRowSpan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getColor() {
		return (Color)eDynamicGet(BootstrapPackage.TABLE_CELL__COLOR, BootstrapPackage.Literals.TABLE_CELL__COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(Color newColor) {
		eDynamicSet(BootstrapPackage.TABLE_CELL__COLOR, BootstrapPackage.Literals.TABLE_CELL__COLOR, newColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getBackground() {
		return (Color)eDynamicGet(BootstrapPackage.TABLE_CELL__BACKGROUND, BootstrapPackage.Literals.TABLE_CELL__BACKGROUND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackground(Color newBackground) {
		eDynamicSet(BootstrapPackage.TABLE_CELL__BACKGROUND, BootstrapPackage.Literals.TABLE_CELL__BACKGROUND, newBackground);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BootstrapPackage.TABLE_CELL__HEADER:
				return isHeader();
			case BootstrapPackage.TABLE_CELL__COL_SPAN:
				return getColSpan();
			case BootstrapPackage.TABLE_CELL__ROW_SPAN:
				return getRowSpan();
			case BootstrapPackage.TABLE_CELL__COLOR:
				return getColor();
			case BootstrapPackage.TABLE_CELL__BACKGROUND:
				return getBackground();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BootstrapPackage.TABLE_CELL__HEADER:
				setHeader((Boolean)newValue);
				return;
			case BootstrapPackage.TABLE_CELL__COL_SPAN:
				setColSpan((Integer)newValue);
				return;
			case BootstrapPackage.TABLE_CELL__ROW_SPAN:
				setRowSpan((Integer)newValue);
				return;
			case BootstrapPackage.TABLE_CELL__COLOR:
				setColor((Color)newValue);
				return;
			case BootstrapPackage.TABLE_CELL__BACKGROUND:
				setBackground((Color)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BootstrapPackage.TABLE_CELL__HEADER:
				setHeader(HEADER_EDEFAULT);
				return;
			case BootstrapPackage.TABLE_CELL__COL_SPAN:
				setColSpan(COL_SPAN_EDEFAULT);
				return;
			case BootstrapPackage.TABLE_CELL__ROW_SPAN:
				setRowSpan(ROW_SPAN_EDEFAULT);
				return;
			case BootstrapPackage.TABLE_CELL__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case BootstrapPackage.TABLE_CELL__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BootstrapPackage.TABLE_CELL__HEADER:
				return isHeader() != HEADER_EDEFAULT;
			case BootstrapPackage.TABLE_CELL__COL_SPAN:
				return getColSpan() != COL_SPAN_EDEFAULT;
			case BootstrapPackage.TABLE_CELL__ROW_SPAN:
				return getRowSpan() != ROW_SPAN_EDEFAULT;
			case BootstrapPackage.TABLE_CELL__COLOR:
				return COLOR_EDEFAULT == null ? getColor() != null : !COLOR_EDEFAULT.equals(getColor());
			case BootstrapPackage.TABLE_CELL__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? getBackground() != null : !BACKGROUND_EDEFAULT.equals(getBackground());
		}
		return super.eIsSet(featureID);
	}

} //TableCellImpl
