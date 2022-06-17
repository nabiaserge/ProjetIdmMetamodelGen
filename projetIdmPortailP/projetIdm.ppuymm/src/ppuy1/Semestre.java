/**
 */
package ppuy1;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semestre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppuy1.Semestre#getId_semestre <em>Id semestre</em>}</li>
 *   <li>{@link ppuy1.Semestre#getUe <em>Ue</em>}</li>
 *   <li>{@link ppuy1.Semestre#getContenu <em>Contenu</em>}</li>
 * </ul>
 *
 * @see ppuy1.ppuy1Package#getSemestre()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Semestre extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Id semestre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id semestre</em>' attribute.
	 * @see #setId_semestre(int)
	 * @see ppuy1.ppuy1Package#getSemestre_Id_semestre()
	 * @model
	 * @generated
	 */
	int getId_semestre();

	/**
	 * Sets the value of the '{@link ppuy1.Semestre#getId_semestre <em>Id semestre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id semestre</em>' attribute.
	 * @see #getId_semestre()
	 * @generated
	 */
	void setId_semestre(int value);

	/**
	 * Returns the value of the '<em><b>Ue</b></em>' containment reference list.
	 * The list contents are of type {@link ppuy1.UE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ue</em>' containment reference list.
	 * @see ppuy1.ppuy1Package#getSemestre_Ue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<UE> getUe();

	/**
	 * Returns the value of the '<em><b>Contenu</b></em>' containment reference list.
	 * The list contents are of type {@link ppuy1.Contenu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenu</em>' containment reference list.
	 * @see ppuy1.ppuy1Package#getSemestre_Contenu()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contenu> getContenu();

} // Semestre
