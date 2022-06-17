/**
 */
package bootstrap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colored Border</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bootstrap.ColoredBorder#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see bootstrap.BootstrapPackage#getColoredBorder()
 * @model
 * @generated
 */
public interface ColoredBorder extends BorderProperty {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link bootstrap.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see bootstrap.Color
	 * @see #setColor(Color)
	 * @see bootstrap.BootstrapPackage#getColoredBorder_Color()
	 * @model
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link bootstrap.ColoredBorder#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see bootstrap.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

} // ColoredBorder
