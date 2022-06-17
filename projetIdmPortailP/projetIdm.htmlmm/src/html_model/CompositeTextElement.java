/**
 */
package html_model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Text Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link html_model.CompositeTextElement#getSubTextElements <em>Sub Text Elements</em>}</li>
 * </ul>
 *
 * @see html_model.Html_modelPackage#getCompositeTextElement()
 * @model abstract="true"
 * @generated
 */
public interface CompositeTextElement extends ContainableTextElement {
	/**
	 * Returns the value of the '<em><b>Sub Text Elements</b></em>' containment reference list.
	 * The list contents are of type {@link html_model.TextElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Text Elements</em>' containment reference list.
	 * @see html_model.Html_modelPackage#getCompositeTextElement_SubTextElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextElement> getSubTextElements();

} // CompositeTextElement
