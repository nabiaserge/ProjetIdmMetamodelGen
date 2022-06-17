/**
 */
package ppuy1;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Niveau</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppuy1.Niveau#getId_niveau <em>Id niveau</em>}</li>
 *   <li>{@link ppuy1.Niveau#getSemestre <em>Semestre</em>}</li>
 *   <li>{@link ppuy1.Niveau#getContenu <em>Contenu</em>}</li>
 * </ul>
 *
 * @see ppuy1.ppuy1Package#getNiveau()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Niveau extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Id niveau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id niveau</em>' attribute.
	 * @see #setId_niveau(int)
	 * @see ppuy1.ppuy1Package#getNiveau_Id_niveau()
	 * @model
	 * @generated
	 */
	int getId_niveau();

	/**
	 * Sets the value of the '{@link ppuy1.Niveau#getId_niveau <em>Id niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id niveau</em>' attribute.
	 * @see #getId_niveau()
	 * @generated
	 */
	void setId_niveau(int value);

	/**
	 * Returns the value of the '<em><b>Semestre</b></em>' containment reference list.
	 * The list contents are of type {@link ppuy1.Semestre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semestre</em>' containment reference list.
	 * @see ppuy1.ppuy1Package#getNiveau_Semestre()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semestre> getSemestre();

	/**
	 * Returns the value of the '<em><b>Contenu</b></em>' containment reference list.
	 * The list contents are of type {@link ppuy1.Contenu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenu</em>' containment reference list.
	 * @see ppuy1.ppuy1Package#getNiveau_Contenu()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contenu> getContenu();

} // Niveau
