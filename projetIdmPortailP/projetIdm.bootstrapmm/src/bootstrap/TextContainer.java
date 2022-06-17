/**
 */
package bootstrap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bootstrap.TextContainer#getTextelements <em>Textelements</em>}</li>
 *   <li>{@link bootstrap.TextContainer#getColor <em>Color</em>}</li>
 *   <li>{@link bootstrap.TextContainer#getEmphasis <em>Emphasis</em>}</li>
 * </ul>
 *
 * @see bootstrap.BootstrapPackage#getTextContainer()
 * @model abstract="true"
 * @generated
 */
public interface TextContainer extends TextPageContent {
	/**
	 * Returns the value of the '<em><b>Textelements</b></em>' containment reference list.
	 * The list contents are of type {@link bootstrap.TextElements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textelements</em>' containment reference list.
	 * @see bootstrap.BootstrapPackage#getTextContainer_Textelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextElements> getTextelements();

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see bootstrap.BootstrapPackage#getTextContainer_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link bootstrap.TextContainer#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Emphasis</b></em>' containment reference list.
	 * The list contents are of type {@link bootstrap.Emphasis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emphasis</em>' containment reference list.
	 * @see bootstrap.BootstrapPackage#getTextContainer_Emphasis()
	 * @model containment="true"
	 * @generated
	 */
	EList<Emphasis> getEmphasis();

} // TextContainer
