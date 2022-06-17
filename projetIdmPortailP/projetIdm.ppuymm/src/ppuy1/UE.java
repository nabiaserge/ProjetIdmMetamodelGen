/**
 */
package ppuy1;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppuy1.UE#getNom_ue <em>Nom ue</em>}</li>
 *   <li>{@link ppuy1.UE#isOptionnelle <em>Optionnelle</em>}</li>
 *   <li>{@link ppuy1.UE#getEstDispenser <em>Est Dispenser</em>}</li>
 *   <li>{@link ppuy1.UE#getContenu <em>Contenu</em>}</li>
 * </ul>
 *
 * @see ppuy1.ppuy1Package#getUE()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface UE extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Nom ue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom ue</em>' attribute.
	 * @see #setNom_ue(String)
	 * @see ppuy1.ppuy1Package#getUE_Nom_ue()
	 * @model
	 * @generated
	 */
	String getNom_ue();

	/**
	 * Sets the value of the '{@link ppuy1.UE#getNom_ue <em>Nom ue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom ue</em>' attribute.
	 * @see #getNom_ue()
	 * @generated
	 */
	void setNom_ue(String value);

	/**
	 * Returns the value of the '<em><b>Optionnelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optionnelle</em>' attribute.
	 * @see #setOptionnelle(boolean)
	 * @see ppuy1.ppuy1Package#getUE_Optionnelle()
	 * @model
	 * @generated
	 */
	boolean isOptionnelle();

	/**
	 * Sets the value of the '{@link ppuy1.UE#isOptionnelle <em>Optionnelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optionnelle</em>' attribute.
	 * @see #isOptionnelle()
	 * @generated
	 */
	void setOptionnelle(boolean value);

	/**
	 * Returns the value of the '<em><b>Est Dispenser</b></em>' reference list.
	 * The list contents are of type {@link ppuy1.Personne}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Dispenser</em>' reference list.
	 * @see ppuy1.ppuy1Package#getUE_EstDispenser()
	 * @model
	 * @generated
	 */
	EList<Personne> getEstDispenser();

	/**
	 * Returns the value of the '<em><b>Contenu</b></em>' containment reference list.
	 * The list contents are of type {@link ppuy1.Contenu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenu</em>' containment reference list.
	 * @see ppuy1.ppuy1Package#getUE_Contenu()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contenu> getContenu();

} // UE
