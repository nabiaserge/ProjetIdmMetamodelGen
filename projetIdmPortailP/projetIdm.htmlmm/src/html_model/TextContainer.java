/**
 */
package html_model;

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
 *   <li>{@link html_model.TextContainer#getTextElements <em>Text Elements</em>}</li>
 * </ul>
 *
 * @see html_model.Html_modelPackage#getTextContainer()
 * @model abstract="true"
 * @generated
 */
public interface TextContainer extends PageContent {
	/**
	 * Returns the value of the '<em><b>Text Elements</b></em>' containment reference list.
	 * The list contents are of type {@link html_model.TextElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Elements</em>' containment reference list.
	 * @see html_model.Html_modelPackage#getTextContainer_TextElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextElement> getTextElements();

} // TextContainer
