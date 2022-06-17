/**
 */
package bootstrap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bootstrap.Container#getPagecontents <em>Pagecontents</em>}</li>
 * </ul>
 *
 * @see bootstrap.BootstrapPackage#getContainer()
 * @model abstract="true"
 * @generated
 */
public interface Container extends PageContent {
	/**
	 * Returns the value of the '<em><b>Pagecontents</b></em>' containment reference list.
	 * The list contents are of type {@link bootstrap.PageContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagecontents</em>' containment reference list.
	 * @see bootstrap.BootstrapPackage#getContainer_Pagecontents()
	 * @model containment="true"
	 * @generated
	 */
	EList<PageContent> getPagecontents();

} // Container
