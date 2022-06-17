/**
 */
package ppuy1;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PPUY1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppuy1.PPUY1#getNom <em>Nom</em>}</li>
 *   <li>{@link ppuy1.PPUY1#getDescription <em>Description</em>}</li>
 *   <li>{@link ppuy1.PPUY1#getPersonne <em>Personne</em>}</li>
 *   <li>{@link ppuy1.PPUY1#getUe <em>Ue</em>}</li>
 *   <li>{@link ppuy1.PPUY1#getDepartement <em>Departement</em>}</li>
 *   <li>{@link ppuy1.PPUY1#getAPourResponsable <em>APour Responsable</em>}</li>
 * </ul>
 *
 * @see ppuy1.ppuy1Package#getPPUY1()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface PPUY1 extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see ppuy1.ppuy1Package#getPPUY1_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link ppuy1.PPUY1#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ppuy1.ppuy1Package#getPPUY1_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ppuy1.PPUY1#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Personne</b></em>' containment reference list.
	 * The list contents are of type {@link ppuy1.Personne}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personne</em>' containment reference list.
	 * @see ppuy1.ppuy1Package#getPPUY1_Personne()
	 * @model containment="true"
	 * @generated
	 */
	EList<Personne> getPersonne();

	/**
	 * Returns the value of the '<em><b>Ue</b></em>' containment reference list.
	 * The list contents are of type {@link ppuy1.UE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ue</em>' containment reference list.
	 * @see ppuy1.ppuy1Package#getPPUY1_Ue()
	 * @model containment="true"
	 * @generated
	 */
	EList<UE> getUe();

	/**
	 * Returns the value of the '<em><b>Departement</b></em>' containment reference list.
	 * The list contents are of type {@link ppuy1.Departement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departement</em>' containment reference list.
	 * @see ppuy1.ppuy1Package#getPPUY1_Departement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Departement> getDepartement();

	/**
	 * Returns the value of the '<em><b>APour Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Responsable</em>' reference.
	 * @see #setAPourResponsable(Personne)
	 * @see ppuy1.ppuy1Package#getPPUY1_APourResponsable()
	 * @model
	 * @generated
	 */
	Personne getAPourResponsable();

	/**
	 * Sets the value of the '{@link ppuy1.PPUY1#getAPourResponsable <em>APour Responsable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Responsable</em>' reference.
	 * @see #getAPourResponsable()
	 * @generated
	 */
	void setAPourResponsable(Personne value);

} // PPUY1
