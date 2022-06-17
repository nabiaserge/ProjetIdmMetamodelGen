/**
 */
package bootstrap;

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
 *   <li>{@link bootstrap.TableSection#getTablerows <em>Tablerows</em>}</li>
 *   <li>{@link bootstrap.TableSection#getGenerals <em>Generals</em>}</li>
 * </ul>
 *
 * @see bootstrap.BootstrapPackage#getTableSection()
 * @model abstract="true"
 * @generated
 */
public interface TableSection extends EObject {
	/**
	 * Returns the value of the '<em><b>Tablerows</b></em>' containment reference list.
	 * The list contents are of type {@link bootstrap.TableRow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tablerows</em>' containment reference list.
	 * @see bootstrap.BootstrapPackage#getTableSection_Tablerows()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableRow> getTablerows();

	/**
	 * Returns the value of the '<em><b>Generals</b></em>' containment reference list.
	 * The list contents are of type {@link bootstrap.General}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generals</em>' containment reference list.
	 * @see bootstrap.BootstrapPackage#getTableSection_Generals()
	 * @model containment="true"
	 * @generated
	 */
	EList<General> getGenerals();

} // TableSection
