/**
 */
package org.nasdanika.models.bootstrap.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.models.bootstrap.BootstrapPackage;
import org.nasdanika.models.bootstrap.TableCell;
import org.nasdanika.models.bootstrap.TableRow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bootstrap.impl.TableRowImpl#getCells <em>Cells</em>}</li>
 *   <li>{@link org.nasdanika.models.bootstrap.impl.TableRowImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.models.bootstrap.impl.TableRowImpl#getBackground <em>Background</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableRowImpl extends BootstrapElementImpl implements TableRow {
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
	protected TableRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.TABLE_ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<TableCell> getCells() {
		return (EList<TableCell>)eDynamicGet(BootstrapPackage.TABLE_ROW__CELLS, BootstrapPackage.Literals.TABLE_ROW__CELLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getColor() {
		return (Color)eDynamicGet(BootstrapPackage.TABLE_ROW__COLOR, BootstrapPackage.Literals.TABLE_ROW__COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(Color newColor) {
		eDynamicSet(BootstrapPackage.TABLE_ROW__COLOR, BootstrapPackage.Literals.TABLE_ROW__COLOR, newColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getBackground() {
		return (Color)eDynamicGet(BootstrapPackage.TABLE_ROW__BACKGROUND, BootstrapPackage.Literals.TABLE_ROW__BACKGROUND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackground(Color newBackground) {
		eDynamicSet(BootstrapPackage.TABLE_ROW__BACKGROUND, BootstrapPackage.Literals.TABLE_ROW__BACKGROUND, newBackground);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.TABLE_ROW__CELLS:
				return ((InternalEList<?>)getCells()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BootstrapPackage.TABLE_ROW__CELLS:
				return getCells();
			case BootstrapPackage.TABLE_ROW__COLOR:
				return getColor();
			case BootstrapPackage.TABLE_ROW__BACKGROUND:
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
			case BootstrapPackage.TABLE_ROW__CELLS:
				getCells().clear();
				getCells().addAll((Collection<? extends TableCell>)newValue);
				return;
			case BootstrapPackage.TABLE_ROW__COLOR:
				setColor((Color)newValue);
				return;
			case BootstrapPackage.TABLE_ROW__BACKGROUND:
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
			case BootstrapPackage.TABLE_ROW__CELLS:
				getCells().clear();
				return;
			case BootstrapPackage.TABLE_ROW__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case BootstrapPackage.TABLE_ROW__BACKGROUND:
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
			case BootstrapPackage.TABLE_ROW__CELLS:
				return !getCells().isEmpty();
			case BootstrapPackage.TABLE_ROW__COLOR:
				return COLOR_EDEFAULT == null ? getColor() != null : !COLOR_EDEFAULT.equals(getColor());
			case BootstrapPackage.TABLE_ROW__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? getBackground() != null : !BACKGROUND_EDEFAULT.equals(getBackground());
		}
		return super.eIsSet(featureID);
	}

} //TableRowImpl
