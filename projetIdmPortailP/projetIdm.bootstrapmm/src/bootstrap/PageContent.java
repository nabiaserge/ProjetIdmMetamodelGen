/**
 */
package bootstrap;

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
 *   <li>{@link bootstrap.PageContent#getGeneralProperties <em>General Properties</em>}</li>
 * </ul>
 *
 * @see bootstrap.BootstrapPackage#getPageContent()
 * @model abstract="true"
 * @generated
 */
public interface PageContent extends EObject {
	/**
	 * Returns the value of the '<em><b>General Properties</b></em>' containment reference list.
	 * The list contents are of type {@link bootstrap.General}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Properties</em>' containment reference list.
	 * @see bootstrap.BootstrapPackage#getPageContent_GeneralProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<General> getGeneralProperties();

} // PageContent
