/**
 */
package ppuy1;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Departement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppuy1.Departement#getFormation <em>Formation</em>}</li>
 *   <li>{@link ppuy1.Departement#getNom <em>Nom</em>}</li>
 *   <li>{@link ppuy1.Departement#getContenu <em>Contenu</em>}</li>
 *   <li>{@link ppuy1.Departement#getApourResponsable <em>Apour Responsable</em>}</li>
 * </ul>
 *
 * @see ppuy1.ppuy1Package#getDepartement()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Departement extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Formation</b></em>' containment reference list.
	 * The list contents are of type {@link ppuy1.Formation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formation</em>' containment reference list.
	 * @see ppuy1.ppuy1Package#getDepartement_Formation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Formation> getFormation();

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see ppuy1.ppuy1Package#getDepartement_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link ppuy1.Departement#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Contenu</b></em>' containment reference list.
	 * The list contents are of type {@link ppuy1.Contenu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenu</em>' containment reference list.
	 * @see ppuy1.ppuy1Package#getDepartement_Contenu()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Contenu> getContenu();

	/**
	 * Returns the value of the '<em><b>Apour Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apour Responsable</em>' reference.
	 * @see #setApourResponsable(Personne)
	 * @see ppuy1.ppuy1Package#getDepartement_ApourResponsable()
	 * @model
	 * @generated
	 */
	Personne getApourResponsable();

	/**
	 * Sets the value of the '{@link ppuy1.Departement#getApourResponsable <em>Apour Responsable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apour Responsable</em>' reference.
	 * @see #getApourResponsable()
	 * @generated
	 */
	void setApourResponsable(Personne value);

} // Departement
