/**
 */
package bootstrap;

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
 *   <li>{@link bootstrap.Table#getTablesections <em>Tablesections</em>}</li>
 * </ul>
 *
 * @see bootstrap.BootstrapPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends TextPageContent {
	/**
	 * Returns the value of the '<em><b>Tablesections</b></em>' containment reference list.
	 * The list contents are of type {@link bootstrap.TableSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tablesections</em>' containment reference list.
	 * @see bootstrap.BootstrapPackage#getTable_Tablesections()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableSection> getTablesections();

} // Table
