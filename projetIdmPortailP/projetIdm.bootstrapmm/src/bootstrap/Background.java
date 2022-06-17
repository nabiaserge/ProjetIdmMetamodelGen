/**
 */
package bootstrap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Background</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bootstrap.Background#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see bootstrap.BootstrapPackage#getBackground()
 * @model
 * @generated
 */
public interface Background extends General {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"WHITE"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see bootstrap.BootstrapPackage#getBackground_Color()
	 * @model default="WHITE"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link bootstrap.Background#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

} // Background
