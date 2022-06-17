/**
 */
package bootstrap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bootstrap.ButtonSize#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see bootstrap.BootstrapPackage#getButtonSize()
 * @model
 * @generated
 */
public interface ButtonSize extends ButtonProperty {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The literals are from the enumeration {@link bootstrap.Size}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see bootstrap.Size
	 * @see #setSize(Size)
	 * @see bootstrap.BootstrapPackage#getButtonSize_Size()
	 * @model
	 * @generated
	 */
	Size getSize();

	/**
	 * Sets the value of the '{@link bootstrap.ButtonSize#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see bootstrap.Size
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Size value);

} // ButtonSize
