/**
 */
package html_model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link html_model.Table#getTablesections <em>Tablesections</em>}</li>
 * </ul>
 *
 * @see html_model.Html_modelPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends PageContent {
	/**
	 * Returns the value of the '<em><b>Tablesections</b></em>' containment reference list.
	 * The list contents are of type {@link html_model.TableSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tablesections</em>' containment reference list.
	 * @see html_model.Html_modelPackage#getTable_Tablesections()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableSection> getTablesections();

} // Table
