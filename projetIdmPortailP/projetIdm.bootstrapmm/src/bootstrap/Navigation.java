/**
 */
package bootstrap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bootstrap.Navigation#getListelement <em>Listelement</em>}</li>
 *   <li>{@link bootstrap.Navigation#getNavbar <em>Navbar</em>}</li>
 *   <li>{@link bootstrap.Navigation#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see bootstrap.BootstrapPackage#getNavigation()
 * @model
 * @generated
 */
public interface Navigation extends TextPageContent {
	/**
	 * Returns the value of the '<em><b>Listelement</b></em>' containment reference list.
	 * The list contents are of type {@link bootstrap.ListElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listelement</em>' containment reference list.
	 * @see bootstrap.BootstrapPackage#getNavigation_Listelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListElement> getListelement();

	/**
	 * Returns the value of the '<em><b>Navbar</b></em>' containment reference list.
	 * The list contents are of type {@link bootstrap.NavBarProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navbar</em>' containment reference list.
	 * @see bootstrap.BootstrapPackage#getNavigation_Navbar()
	 * @model containment="true"
	 * @generated
	 */
	EList<NavBarProperty> getNavbar();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link bootstrap.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see bootstrap.BootstrapPackage#getNavigation_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

} // Navigation
