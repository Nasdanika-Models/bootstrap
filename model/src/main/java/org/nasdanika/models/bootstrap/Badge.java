/**
 */
package org.nasdanika.models.bootstrap;

import org.nasdanika.html.bootstrap.Color;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Badge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bootstrap.Badge#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.bootstrap.BootstrapPackage#getBadge()
 * @model
 * @generated
 */
public interface Badge extends Div {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(Color)
	 * @see org.nasdanika.models.bootstrap.BootstrapPackage#getBadge_Color()
	 * @model dataType="org.nasdanika.models.bootstrap.Color"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bootstrap.Badge#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

} // Badge
