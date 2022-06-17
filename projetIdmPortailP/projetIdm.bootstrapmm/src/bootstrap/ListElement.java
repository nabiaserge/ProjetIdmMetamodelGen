/**
 */
package bootstrap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bootstrap.ListElement#getListitems <em>Listitems</em>}</li>
 *   <li>{@link bootstrap.ListElement#getListproperty <em>Listproperty</em>}</li>
 * </ul>
 *
 * @see bootstrap.BootstrapPackage#getListElement()
 * @model abstract="true"
 * @generated
 */
public interface ListElement extends TextPageContent, ListItemElement {
	/**
	 * Returns the value of the '<em><b>Listitems</b></em>' containment reference list.
	 * The list contents are of type {@link bootstrap.ListItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listitems</em>' containment reference list.
	 * @see bootstrap.BootstrapPackage#getListElement_Listitems()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListItem> getListitems();

	/**
	 * Returns the value of the '<em><b>Listproperty</b></em>' containment reference list.
	 * The list contents are of type {@link bootstrap.ListProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listproperty</em>' containment reference list.
	 * @see bootstrap.BootstrapPackage#getListElement_Listproperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListProperty> getListproperty();

} // ListElement
