/**
 */
package html_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link html_model.PageContent#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @see html_model.Html_modelPackage#getPageContent()
 * @model abstract="true"
 * @generated
 */
public interface PageContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Section</b></em>' containment reference list.
	 * The list contents are of type {@link html_model.Section}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' containment reference list.
	 * @see html_model.Html_modelPackage#getPageContent_Section()
	 * @model containment="true"
	 * @generated
	 */
	EList<Section> getSection();

} // PageContent
