/**
 */
package ppuy1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppuy1.Description#getText <em>Text</em>}</li>
 *   <li>{@link ppuy1.Description#getLien <em>Lien</em>}</li>
 * </ul>
 *
 * @see ppuy1.ppuy1Package#getDescription()
 * @model
 * @generated
 */
public interface Description extends Contenu {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see ppuy1.ppuy1Package#getDescription_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link ppuy1.Description#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Lien</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lien</em>' attribute.
	 * @see #setLien(String)
	 * @see ppuy1.ppuy1Package#getDescription_Lien()
	 * @model
	 * @generated
	 */
	String getLien();

	/**
	 * Sets the value of the '{@link ppuy1.Description#getLien <em>Lien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lien</em>' attribute.
	 * @see #getLien()
	 * @generated
	 */
	void setLien(String value);

} // Description
