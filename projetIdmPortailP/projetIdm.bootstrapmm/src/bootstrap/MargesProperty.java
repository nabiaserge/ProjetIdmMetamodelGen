/**
 */
package bootstrap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marges Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bootstrap.MargesProperty#getLevel <em>Level</em>}</li>
 *   <li>{@link bootstrap.MargesProperty#getAlignement <em>Alignement</em>}</li>
 * </ul>
 *
 * @see bootstrap.BootstrapPackage#getMargesProperty()
 * @model abstract="true"
 * @generated
 */
public interface MargesProperty extends General {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see bootstrap.BootstrapPackage#getMargesProperty_Level()
	 * @model
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link bootstrap.MargesProperty#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Alignement</b></em>' attribute.
	 * The literals are from the enumeration {@link bootstrap.Alignement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignement</em>' attribute.
	 * @see bootstrap.Alignement
	 * @see #setAlignement(Alignement)
	 * @see bootstrap.BootstrapPackage#getMargesProperty_Alignement()
	 * @model
	 * @generated
	 */
	Alignement getAlignement();

	/**
	 * Sets the value of the '{@link bootstrap.MargesProperty#getAlignement <em>Alignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignement</em>' attribute.
	 * @see bootstrap.Alignement
	 * @see #getAlignement()
	 * @generated
	 */
	void setAlignement(Alignement value);

} // MargesProperty
