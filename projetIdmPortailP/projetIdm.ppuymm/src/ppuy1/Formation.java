/**
 */
package ppuy1;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppuy1.Formation#getNom <em>Nom</em>}</li>
 *   <li>{@link ppuy1.Formation#getContenu <em>Contenu</em>}</li>
 *   <li>{@link ppuy1.Formation#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link ppuy1.Formation#getSemestre <em>Semestre</em>}</li>
 *   <li>{@link ppuy1.Formation#getAPourResponsable <em>APour Responsable</em>}</li>
 * </ul>
 *
 * @see ppuy1.ppuy1Package#getFormation()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Formation extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see ppuy1.ppuy1Package#getFormation_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link ppuy1.Formation#getNom <em>Nom</em>}' attribute.
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
	 * @see ppuy1.ppuy1Package#getFormation_Contenu()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contenu> getContenu();

	/**
	 * Returns the value of the '<em><b>Niveau</b></em>' containment reference list.
	 * The list contents are of type {@link ppuy1.Niveau}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau</em>' containment reference list.
	 * @see ppuy1.ppuy1Package#getFormation_Niveau()
	 * @model containment="true"
	 * @generated
	 */
	EList<Niveau> getNiveau();

	/**
	 * Returns the value of the '<em><b>Semestre</b></em>' containment reference list.
	 * The list contents are of type {@link ppuy1.Semestre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semestre</em>' containment reference list.
	 * @see ppuy1.ppuy1Package#getFormation_Semestre()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semestre> getSemestre();

	/**
	 * Returns the value of the '<em><b>APour Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Responsable</em>' reference.
	 * @see #setAPourResponsable(Personne)
	 * @see ppuy1.ppuy1Package#getFormation_APourResponsable()
	 * @model
	 * @generated
	 */
	Personne getAPourResponsable();

	/**
	 * Sets the value of the '{@link ppuy1.Formation#getAPourResponsable <em>APour Responsable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Responsable</em>' reference.
	 * @see #getAPourResponsable()
	 * @generated
	 */
	void setAPourResponsable(Personne value);

} // Formation
