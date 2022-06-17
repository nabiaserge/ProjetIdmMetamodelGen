/**
 */
package bootstrap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alert Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bootstrap.AlertStyle#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see bootstrap.BootstrapPackage#getAlertStyle()
 * @model
 * @generated
 */
public interface AlertStyle extends AlertProperty {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"LIGHT"</code>.
	 * The literals are from the enumeration {@link bootstrap.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see bootstrap.Color
	 * @see #setColor(Color)
	 * @see bootstrap.BootstrapPackage#getAlertStyle_Color()
	 * @model default="LIGHT"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link bootstrap.AlertStyle#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see bootstrap.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

} // AlertStyle
