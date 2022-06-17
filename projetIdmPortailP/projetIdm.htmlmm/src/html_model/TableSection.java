/**
 */
package html_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link html_model.TableSection#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @see html_model.Html_modelPackage#getTableSection()
 * @model abstract="true"
 * @generated
 */
public interface TableSection extends EObject {
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link html_model.TableRow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see html_model.Html_modelPackage#getTableSection_Rows()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableRow> getRows();

} // TableSection
