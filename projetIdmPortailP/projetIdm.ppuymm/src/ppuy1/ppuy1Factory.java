/**
 */
package ppuy1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ppuy1.ppuy1Package
 * @generated
 */
public interface ppuy1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ppuy1Factory eINSTANCE = ppuy1.impl.ppuy1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Calendrier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calendrier</em>'.
	 * @generated
	 */
	Calendrier createCalendrier();

	/**
	 * Returns a new object of class '<em>Departement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Departement</em>'.
	 * @generated
	 */
	Departement createDepartement();

	/**
	 * Returns a new object of class '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description</em>'.
	 * @generated
	 */
	Description createDescription();

	/**
	 * Returns a new object of class '<em>Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ressource</em>'.
	 * @generated
	 */
	Ressource createRessource();

	/**
	 * Returns a new object of class '<em>Niveau</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Niveau</em>'.
	 * @generated
	 */
	Niveau createNiveau();

	/**
	 * Returns a new object of class '<em>Semestre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semestre</em>'.
	 * @generated
	 */
	Semestre createSemestre();

	/**
	 * Returns a new object of class '<em>Personne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Personne</em>'.
	 * @generated
	 */
	Personne createPersonne();

	/**
	 * Returns a new object of class '<em>PPUY1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PPUY1</em>'.
	 * @generated
	 */
	PPUY1 createPPUY1();

	/**
	 * Returns a new object of class '<em>Formation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formation</em>'.
	 * @generated
	 */
	Formation createFormation();

	/**
	 * Returns a new object of class '<em>UE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UE</em>'.
	 * @generated
	 */
	UE createUE();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ppuy1Package getppuy1Package();

} //ppuy1Factory
