/**
 */
package html_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link html_model.ListItem#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see html_model.Html_modelPackage#getListItem()
 * @model
 * @generated
 */
public interface ListItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link html_model.ListItemElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see html_model.Html_modelPackage#getListItem_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListItemElement> getElements();

} // ListItem
