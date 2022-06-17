/**
 */
package html_model;

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
 *   <li>{@link html_model.ListElement#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see html_model.Html_modelPackage#getListElement()
 * @model abstract="true"
 * @generated
 */
public interface ListElement extends PageContent, ListItemElement {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link html_model.ListItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see html_model.Html_modelPackage#getListElement_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListItem> getItems();

} // ListElement
