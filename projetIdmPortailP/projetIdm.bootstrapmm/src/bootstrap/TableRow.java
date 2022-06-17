/**
 */
package bootstrap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bootstrap.TableRow#getTablecells <em>Tablecells</em>}</li>
 *   <li>{@link bootstrap.TableRow#getGenerals <em>Generals</em>}</li>
 * </ul>
 *
 * @see bootstrap.BootstrapPackage#getTableRow()
 * @model
 * @generated
 */
public interface TableRow extends EObject {
	/**
	 * Returns the value of the '<em><b>Tablecells</b></em>' containment reference list.
	 * The list contents are of type {@link bootstrap.TableCell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tablecells</em>' containment reference list.
	 * @see bootstrap.BootstrapPackage#getTableRow_Tablecells()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableCell> getTablecells();

	/**
	 * Returns the value of the '<em><b>Generals</b></em>' containment reference list.
	 * The list contents are of type {@link bootstrap.General}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generals</em>' containment reference list.
	 * @see bootstrap.BootstrapPackage#getTableRow_Generals()
	 * @model containment="true"
	 * @generated
	 */
	EList<General> getGenerals();

} // TableRow
