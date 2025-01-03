/**
 */
package org.nasdanika.models.bootstrap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bootstrap [card](https://getbootstrap.com/docs/4.0/components/card/).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bootstrap.Card#getHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.models.bootstrap.Card#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.models.bootstrap.Card#getFooter <em>Footer</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.bootstrap.BootstrapPackage#getCard()
 * @model
 * @generated
 */
public interface Card extends Div {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Card header.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(BootstrapElement)
	 * @see org.nasdanika.models.bootstrap.BootstrapPackage#getCard_Header()
	 * @model containment="true"
	 * @generated
	 */
	BootstrapElement getHeader();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bootstrap.Card#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(BootstrapElement value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Card body.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(BootstrapElement)
	 * @see org.nasdanika.models.bootstrap.BootstrapPackage#getCard_Body()
	 * @model containment="true"
	 * @generated
	 */
	BootstrapElement getBody();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bootstrap.Card#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(BootstrapElement value);

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Card footer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Footer</em>' containment reference.
	 * @see #setFooter(BootstrapElement)
	 * @see org.nasdanika.models.bootstrap.BootstrapPackage#getCard_Footer()
	 * @model containment="true"
	 * @generated
	 */
	BootstrapElement getFooter();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bootstrap.Card#getFooter <em>Footer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' containment reference.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(BootstrapElement value);

} // Card
