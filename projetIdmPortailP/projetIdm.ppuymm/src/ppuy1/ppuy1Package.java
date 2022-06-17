/**
 */
package ppuy1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ppuy1.ppuy1Factory
 * @model kind="package"
 * @generated
 */
public interface ppuy1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ppuy1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ppuy1.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ppuy1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ppuy1Package eINSTANCE = ppuy1.impl.ppuy1PackageImpl.init();

	/**
	 * The meta object id for the '{@link ppuy1.impl.ContenuImpl <em>Contenu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppuy1.impl.ContenuImpl
	 * @see ppuy1.impl.ppuy1PackageImpl#getContenu()
	 * @generated
	 */
	int CONTENU = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU__TITLE = 0;

	/**
	 * The number of structural features of the '<em>Contenu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Contenu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ppuy1.impl.CalendrierImpl <em>Calendrier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppuy1.impl.CalendrierImpl
	 * @see ppuy1.impl.ppuy1PackageImpl#getCalendrier()
	 * @generated
	 */
	int CALENDRIER = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDRIER__TITLE = CONTENU__TITLE;

	/**
	 * The feature id for the '<em><b>Evenement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDRIER__EVENEMENT = CONTENU_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDRIER__DEBUT = CONTENU_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDRIER__FIN = CONTENU_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Calendrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDRIER_FEATURE_COUNT = CONTENU_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Calendrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDRIER_OPERATION_COUNT = CONTENU_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ppuy1.impl.DepartementImpl <em>Departement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppuy1.impl.DepartementImpl
	 * @see ppuy1.impl.ppuy1PackageImpl#getDepartement()
	 * @generated
	 */
	int DEPARTEMENT = 1;

	/**
	 * The feature id for the '<em><b>Formation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__FORMATION = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__NOM = 1;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__CONTENU = 2;

	/**
	 * The feature id for the '<em><b>Apour Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__APOUR_RESPONSABLE = 3;

	/**
	 * The number of structural features of the '<em>Departement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Departement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ppuy1.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppuy1.impl.DescriptionImpl
	 * @see ppuy1.impl.ppuy1PackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__TITLE = CONTENU__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__TEXT = CONTENU_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lien</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__LIEN = CONTENU_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = CONTENU_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_OPERATION_COUNT = CONTENU_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ppuy1.impl.RessourceImpl <em>Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppuy1.impl.RessourceImpl
	 * @see ppuy1.impl.ppuy1PackageImpl#getRessource()
	 * @generated
	 */
	int RESSOURCE = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__TITLE = CONTENU__TITLE;

	/**
	 * The feature id for the '<em><b>Fichier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__FICHIER = CONTENU_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_FEATURE_COUNT = CONTENU_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_OPERATION_COUNT = CONTENU_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ppuy1.impl.NiveauImpl <em>Niveau</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppuy1.impl.NiveauImpl
	 * @see ppuy1.impl.ppuy1PackageImpl#getNiveau()
	 * @generated
	 */
	int NIVEAU = 4;

	/**
	 * The feature id for the '<em><b>Id niveau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU__ID_NIVEAU = 0;

	/**
	 * The feature id for the '<em><b>Semestre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU__SEMESTRE = 1;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU__CONTENU = 2;

	/**
	 * The number of structural features of the '<em>Niveau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Niveau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ppuy1.impl.SemestreImpl <em>Semestre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppuy1.impl.SemestreImpl
	 * @see ppuy1.impl.ppuy1PackageImpl#getSemestre()
	 * @generated
	 */
	int SEMESTRE = 5;

	/**
	 * The feature id for the '<em><b>Id semestre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__ID_SEMESTRE = 0;

	/**
	 * The feature id for the '<em><b>Ue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__UE = 1;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__CONTENU = 2;

	/**
	 * The number of structural features of the '<em>Semestre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Semestre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ppuy1.impl.PersonneImpl <em>Personne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppuy1.impl.PersonneImpl
	 * @see ppuy1.impl.ppuy1PackageImpl#getPersonne()
	 * @generated
	 */
	int PERSONNE = 6;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__PRENOM = 1;

	/**
	 * The number of structural features of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ppuy1.impl.PPUY1Impl <em>PPUY1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppuy1.impl.PPUY1Impl
	 * @see ppuy1.impl.ppuy1PackageImpl#getPPUY1()
	 * @generated
	 */
	int PPUY1 = 7;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPUY1__NOM = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPUY1__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Personne</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPUY1__PERSONNE = 2;

	/**
	 * The feature id for the '<em><b>Ue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPUY1__UE = 3;

	/**
	 * The feature id for the '<em><b>Departement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPUY1__DEPARTEMENT = 4;

	/**
	 * The feature id for the '<em><b>APour Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPUY1__APOUR_RESPONSABLE = 5;

	/**
	 * The number of structural features of the '<em>PPUY1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPUY1_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>PPUY1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPUY1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ppuy1.impl.FormationImpl <em>Formation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppuy1.impl.FormationImpl
	 * @see ppuy1.impl.ppuy1PackageImpl#getFormation()
	 * @generated
	 */
	int FORMATION = 8;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__NOM = 0;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__CONTENU = 1;

	/**
	 * The feature id for the '<em><b>Niveau</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__NIVEAU = 2;

	/**
	 * The feature id for the '<em><b>Semestre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__SEMESTRE = 3;

	/**
	 * The feature id for the '<em><b>APour Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__APOUR_RESPONSABLE = 4;

	/**
	 * The number of structural features of the '<em>Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ppuy1.impl.UEImpl <em>UE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppuy1.impl.UEImpl
	 * @see ppuy1.impl.ppuy1PackageImpl#getUE()
	 * @generated
	 */
	int UE = 10;

	/**
	 * The feature id for the '<em><b>Nom ue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__NOM_UE = 0;

	/**
	 * The feature id for the '<em><b>Optionnelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__OPTIONNELLE = 1;

	/**
	 * The feature id for the '<em><b>Est Dispenser</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__EST_DISPENSER = 2;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__CONTENU = 3;

	/**
	 * The number of structural features of the '<em>UE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>UE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ppuy1.Calendrier <em>Calendrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendrier</em>'.
	 * @see ppuy1.Calendrier
	 * @generated
	 */
	EClass getCalendrier();

	/**
	 * Returns the meta object for the attribute '{@link ppuy1.Calendrier#getEvenement <em>Evenement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evenement</em>'.
	 * @see ppuy1.Calendrier#getEvenement()
	 * @see #getCalendrier()
	 * @generated
	 */
	EAttribute getCalendrier_Evenement();

	/**
	 * Returns the meta object for the attribute '{@link ppuy1.Calendrier#getDebut <em>Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debut</em>'.
	 * @see ppuy1.Calendrier#getDebut()
	 * @see #getCalendrier()
	 * @generated
	 */
	EAttribute getCalendrier_Debut();

	/**
	 * Returns the meta object for the attribute '{@link ppuy1.Calendrier#getFin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fin</em>'.
	 * @see ppuy1.Calendrier#getFin()
	 * @see #getCalendrier()
	 * @generated
	 */
	EAttribute getCalendrier_Fin();

	/**
	 * Returns the meta object for class '{@link ppuy1.Departement <em>Departement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Departement</em>'.
	 * @see ppuy1.Departement
	 * @generated
	 */
	EClass getDepartement();

	/**
	 * Returns the meta object for the containment reference list '{@link ppuy1.Departement#getFormation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formation</em>'.
	 * @see ppuy1.Departement#getFormation()
	 * @see #getDepartement()
	 * @generated
	 */
	EReference getDepartement_Formation();

	/**
	 * Returns the meta object for the attribute '{@link ppuy1.Departement#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see ppuy1.Departement#getNom()
	 * @see #getDepartement()
	 * @generated
	 */
	EAttribute getDepartement_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link ppuy1.Departement#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contenu</em>'.
	 * @see ppuy1.Departement#getContenu()
	 * @see #getDepartement()
	 * @generated
	 */
	EReference getDepartement_Contenu();

	/**
	 * Returns the meta object for the reference '{@link ppuy1.Departement#getApourResponsable <em>Apour Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Apour Responsable</em>'.
	 * @see ppuy1.Departement#getApourResponsable()
	 * @see #getDepartement()
	 * @generated
	 */
	EReference getDepartement_ApourResponsable();

	/**
	 * Returns the meta object for class '{@link ppuy1.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see ppuy1.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the attribute '{@link ppuy1.Description#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ppuy1.Description#getText()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Text();

	/**
	 * Returns the meta object for the attribute '{@link ppuy1.Description#getLien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lien</em>'.
	 * @see ppuy1.Description#getLien()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Lien();

	/**
	 * Returns the meta object for class '{@link ppuy1.Ressource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressource</em>'.
	 * @see ppuy1.Ressource
	 * @generated
	 */
	EClass getRessource();

	/**
	 * Returns the meta object for the attribute '{@link ppuy1.Ressource#getFichier <em>Fichier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fichier</em>'.
	 * @see ppuy1.Ressource#getFichier()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_Fichier();

	/**
	 * Returns the meta object for class '{@link ppuy1.Niveau <em>Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Niveau</em>'.
	 * @see ppuy1.Niveau
	 * @generated
	 */
	EClass getNiveau();

	/**
	 * Returns the meta object for the attribute '{@link ppuy1.Niveau#getId_niveau <em>Id niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id niveau</em>'.
	 * @see ppuy1.Niveau#getId_niveau()
	 * @see #getNiveau()
	 * @generated
	 */
	EAttribute getNiveau_Id_niveau();

	/**
	 * Returns the meta object for the containment reference list '{@link ppuy1.Niveau#getSemestre <em>Semestre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semestre</em>'.
	 * @see ppuy1.Niveau#getSemestre()
	 * @see #getNiveau()
	 * @generated
	 */
	EReference getNiveau_Semestre();

	/**
	 * Returns the meta object for the containment reference list '{@link ppuy1.Niveau#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contenu</em>'.
	 * @see ppuy1.Niveau#getContenu()
	 * @see #getNiveau()
	 * @generated
	 */
	EReference getNiveau_Contenu();

	/**
	 * Returns the meta object for class '{@link ppuy1.Semestre <em>Semestre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semestre</em>'.
	 * @see ppuy1.Semestre
	 * @generated
	 */
	EClass getSemestre();

	/**
	 * Returns the meta object for the attribute '{@link ppuy1.Semestre#getId_semestre <em>Id semestre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id semestre</em>'.
	 * @see ppuy1.Semestre#getId_semestre()
	 * @see #getSemestre()
	 * @generated
	 */
	EAttribute getSemestre_Id_semestre();

	/**
	 * Returns the meta object for the containment reference list '{@link ppuy1.Semestre#getUe <em>Ue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ue</em>'.
	 * @see ppuy1.Semestre#getUe()
	 * @see #getSemestre()
	 * @generated
	 */
	EReference getSemestre_Ue();

	/**
	 * Returns the meta object for the containment reference list '{@link ppuy1.Semestre#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contenu</em>'.
	 * @see ppuy1.Semestre#getContenu()
	 * @see #getSemestre()
	 * @generated
	 */
	EReference getSemestre_Contenu();

	/**
	 * Returns the meta object for class '{@link ppuy1.Personne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personne</em>'.
	 * @see ppuy1.Personne
	 * @generated
	 */
	EClass getPersonne();

	/**
	 * Returns the meta object for the attribute '{@link ppuy1.Personne#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see ppuy1.Personne#getNom()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Nom();

	/**
	 * Returns the meta object for the attribute '{@link ppuy1.Personne#getPrenom <em>Prenom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prenom</em>'.
	 * @see ppuy1.Personne#getPrenom()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Prenom();

	/**
	 * Returns the meta object for class '{@link ppuy1.PPUY1 <em>PPUY1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PPUY1</em>'.
	 * @see ppuy1.PPUY1
	 * @generated
	 */
	EClass getPPUY1();

	/**
	 * Returns the meta object for the attribute '{@link ppuy1.PPUY1#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see ppuy1.PPUY1#getNom()
	 * @see #getPPUY1()
	 * @generated
	 */
	EAttribute getPPUY1_Nom();

	/**
	 * Returns the meta object for the attribute '{@link ppuy1.PPUY1#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ppuy1.PPUY1#getDescription()
	 * @see #getPPUY1()
	 * @generated
	 */
	EAttribute getPPUY1_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link ppuy1.PPUY1#getPersonne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personne</em>'.
	 * @see ppuy1.PPUY1#getPersonne()
	 * @see #getPPUY1()
	 * @generated
	 */
	EReference getPPUY1_Personne();

	/**
	 * Returns the meta object for the containment reference list '{@link ppuy1.PPUY1#getUe <em>Ue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ue</em>'.
	 * @see ppuy1.PPUY1#getUe()
	 * @see #getPPUY1()
	 * @generated
	 */
	EReference getPPUY1_Ue();

	/**
	 * Returns the meta object for the containment reference list '{@link ppuy1.PPUY1#getDepartement <em>Departement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Departement</em>'.
	 * @see ppuy1.PPUY1#getDepartement()
	 * @see #getPPUY1()
	 * @generated
	 */
	EReference getPPUY1_Departement();

	/**
	 * Returns the meta object for the reference '{@link ppuy1.PPUY1#getAPourResponsable <em>APour Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>APour Responsable</em>'.
	 * @see ppuy1.PPUY1#getAPourResponsable()
	 * @see #getPPUY1()
	 * @generated
	 */
	EReference getPPUY1_APourResponsable();

	/**
	 * Returns the meta object for class '{@link ppuy1.Formation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formation</em>'.
	 * @see ppuy1.Formation
	 * @generated
	 */
	EClass getFormation();

	/**
	 * Returns the meta object for the attribute '{@link ppuy1.Formation#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see ppuy1.Formation#getNom()
	 * @see #getFormation()
	 * @generated
	 */
	EAttribute getFormation_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link ppuy1.Formation#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contenu</em>'.
	 * @see ppuy1.Formation#getContenu()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_Contenu();

	/**
	 * Returns the meta object for the containment reference list '{@link ppuy1.Formation#getNiveau <em>Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Niveau</em>'.
	 * @see ppuy1.Formation#getNiveau()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_Niveau();

	/**
	 * Returns the meta object for the containment reference list '{@link ppuy1.Formation#getSemestre <em>Semestre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semestre</em>'.
	 * @see ppuy1.Formation#getSemestre()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_Semestre();

	/**
	 * Returns the meta object for the reference '{@link ppuy1.Formation#getAPourResponsable <em>APour Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>APour Responsable</em>'.
	 * @see ppuy1.Formation#getAPourResponsable()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_APourResponsable();

	/**
	 * Returns the meta object for class '{@link ppuy1.Contenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenu</em>'.
	 * @see ppuy1.Contenu
	 * @generated
	 */
	EClass getContenu();

	/**
	 * Returns the meta object for the attribute '{@link ppuy1.Contenu#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see ppuy1.Contenu#getTitle()
	 * @see #getContenu()
	 * @generated
	 */
	EAttribute getContenu_Title();

	/**
	 * Returns the meta object for class '{@link ppuy1.UE <em>UE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UE</em>'.
	 * @see ppuy1.UE
	 * @generated
	 */
	EClass getUE();

	/**
	 * Returns the meta object for the attribute '{@link ppuy1.UE#getNom_ue <em>Nom ue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom ue</em>'.
	 * @see ppuy1.UE#getNom_ue()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_Nom_ue();

	/**
	 * Returns the meta object for the attribute '{@link ppuy1.UE#isOptionnelle <em>Optionnelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optionnelle</em>'.
	 * @see ppuy1.UE#isOptionnelle()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_Optionnelle();

	/**
	 * Returns the meta object for the reference list '{@link ppuy1.UE#getEstDispenser <em>Est Dispenser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Est Dispenser</em>'.
	 * @see ppuy1.UE#getEstDispenser()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_EstDispenser();

	/**
	 * Returns the meta object for the containment reference list '{@link ppuy1.UE#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contenu</em>'.
	 * @see ppuy1.UE#getContenu()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_Contenu();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ppuy1Factory getppuy1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ppuy1.impl.CalendrierImpl <em>Calendrier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppuy1.impl.CalendrierImpl
		 * @see ppuy1.impl.ppuy1PackageImpl#getCalendrier()
		 * @generated
		 */
		EClass CALENDRIER = eINSTANCE.getCalendrier();

		/**
		 * The meta object literal for the '<em><b>Evenement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDRIER__EVENEMENT = eINSTANCE.getCalendrier_Evenement();

		/**
		 * The meta object literal for the '<em><b>Debut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDRIER__DEBUT = eINSTANCE.getCalendrier_Debut();

		/**
		 * The meta object literal for the '<em><b>Fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDRIER__FIN = eINSTANCE.getCalendrier_Fin();

		/**
		 * The meta object literal for the '{@link ppuy1.impl.DepartementImpl <em>Departement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppuy1.impl.DepartementImpl
		 * @see ppuy1.impl.ppuy1PackageImpl#getDepartement()
		 * @generated
		 */
		EClass DEPARTEMENT = eINSTANCE.getDepartement();

		/**
		 * The meta object literal for the '<em><b>Formation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTEMENT__FORMATION = eINSTANCE.getDepartement_Formation();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTEMENT__NOM = eINSTANCE.getDepartement_Nom();

		/**
		 * The meta object literal for the '<em><b>Contenu</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTEMENT__CONTENU = eINSTANCE.getDepartement_Contenu();

		/**
		 * The meta object literal for the '<em><b>Apour Responsable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTEMENT__APOUR_RESPONSABLE = eINSTANCE.getDepartement_ApourResponsable();

		/**
		 * The meta object literal for the '{@link ppuy1.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppuy1.impl.DescriptionImpl
		 * @see ppuy1.impl.ppuy1PackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__TEXT = eINSTANCE.getDescription_Text();

		/**
		 * The meta object literal for the '<em><b>Lien</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__LIEN = eINSTANCE.getDescription_Lien();

		/**
		 * The meta object literal for the '{@link ppuy1.impl.RessourceImpl <em>Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppuy1.impl.RessourceImpl
		 * @see ppuy1.impl.ppuy1PackageImpl#getRessource()
		 * @generated
		 */
		EClass RESSOURCE = eINSTANCE.getRessource();

		/**
		 * The meta object literal for the '<em><b>Fichier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__FICHIER = eINSTANCE.getRessource_Fichier();

		/**
		 * The meta object literal for the '{@link ppuy1.impl.NiveauImpl <em>Niveau</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppuy1.impl.NiveauImpl
		 * @see ppuy1.impl.ppuy1PackageImpl#getNiveau()
		 * @generated
		 */
		EClass NIVEAU = eINSTANCE.getNiveau();

		/**
		 * The meta object literal for the '<em><b>Id niveau</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NIVEAU__ID_NIVEAU = eINSTANCE.getNiveau_Id_niveau();

		/**
		 * The meta object literal for the '<em><b>Semestre</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NIVEAU__SEMESTRE = eINSTANCE.getNiveau_Semestre();

		/**
		 * The meta object literal for the '<em><b>Contenu</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NIVEAU__CONTENU = eINSTANCE.getNiveau_Contenu();

		/**
		 * The meta object literal for the '{@link ppuy1.impl.SemestreImpl <em>Semestre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppuy1.impl.SemestreImpl
		 * @see ppuy1.impl.ppuy1PackageImpl#getSemestre()
		 * @generated
		 */
		EClass SEMESTRE = eINSTANCE.getSemestre();

		/**
		 * The meta object literal for the '<em><b>Id semestre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTRE__ID_SEMESTRE = eINSTANCE.getSemestre_Id_semestre();

		/**
		 * The meta object literal for the '<em><b>Ue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTRE__UE = eINSTANCE.getSemestre_Ue();

		/**
		 * The meta object literal for the '<em><b>Contenu</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTRE__CONTENU = eINSTANCE.getSemestre_Contenu();

		/**
		 * The meta object literal for the '{@link ppuy1.impl.PersonneImpl <em>Personne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppuy1.impl.PersonneImpl
		 * @see ppuy1.impl.ppuy1PackageImpl#getPersonne()
		 * @generated
		 */
		EClass PERSONNE = eINSTANCE.getPersonne();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__NOM = eINSTANCE.getPersonne_Nom();

		/**
		 * The meta object literal for the '<em><b>Prenom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__PRENOM = eINSTANCE.getPersonne_Prenom();

		/**
		 * The meta object literal for the '{@link ppuy1.impl.PPUY1Impl <em>PPUY1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppuy1.impl.PPUY1Impl
		 * @see ppuy1.impl.ppuy1PackageImpl#getPPUY1()
		 * @generated
		 */
		EClass PPUY1 = eINSTANCE.getPPUY1();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PPUY1__NOM = eINSTANCE.getPPUY1_Nom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PPUY1__DESCRIPTION = eINSTANCE.getPPUY1_Description();

		/**
		 * The meta object literal for the '<em><b>Personne</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PPUY1__PERSONNE = eINSTANCE.getPPUY1_Personne();

		/**
		 * The meta object literal for the '<em><b>Ue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PPUY1__UE = eINSTANCE.getPPUY1_Ue();

		/**
		 * The meta object literal for the '<em><b>Departement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PPUY1__DEPARTEMENT = eINSTANCE.getPPUY1_Departement();

		/**
		 * The meta object literal for the '<em><b>APour Responsable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PPUY1__APOUR_RESPONSABLE = eINSTANCE.getPPUY1_APourResponsable();

		/**
		 * The meta object literal for the '{@link ppuy1.impl.FormationImpl <em>Formation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppuy1.impl.FormationImpl
		 * @see ppuy1.impl.ppuy1PackageImpl#getFormation()
		 * @generated
		 */
		EClass FORMATION = eINSTANCE.getFormation();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATION__NOM = eINSTANCE.getFormation_Nom();

		/**
		 * The meta object literal for the '<em><b>Contenu</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__CONTENU = eINSTANCE.getFormation_Contenu();

		/**
		 * The meta object literal for the '<em><b>Niveau</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__NIVEAU = eINSTANCE.getFormation_Niveau();

		/**
		 * The meta object literal for the '<em><b>Semestre</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__SEMESTRE = eINSTANCE.getFormation_Semestre();

		/**
		 * The meta object literal for the '<em><b>APour Responsable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__APOUR_RESPONSABLE = eINSTANCE.getFormation_APourResponsable();

		/**
		 * The meta object literal for the '{@link ppuy1.impl.ContenuImpl <em>Contenu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppuy1.impl.ContenuImpl
		 * @see ppuy1.impl.ppuy1PackageImpl#getContenu()
		 * @generated
		 */
		EClass CONTENU = eINSTANCE.getContenu();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENU__TITLE = eINSTANCE.getContenu_Title();

		/**
		 * The meta object literal for the '{@link ppuy1.impl.UEImpl <em>UE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppuy1.impl.UEImpl
		 * @see ppuy1.impl.ppuy1PackageImpl#getUE()
		 * @generated
		 */
		EClass UE = eINSTANCE.getUE();

		/**
		 * The meta object literal for the '<em><b>Nom ue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__NOM_UE = eINSTANCE.getUE_Nom_ue();

		/**
		 * The meta object literal for the '<em><b>Optionnelle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__OPTIONNELLE = eINSTANCE.getUE_Optionnelle();

		/**
		 * The meta object literal for the '<em><b>Est Dispenser</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__EST_DISPENSER = eINSTANCE.getUE_EstDispenser();

		/**
		 * The meta object literal for the '<em><b>Contenu</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__CONTENU = eINSTANCE.getUE_Contenu();

	}

} //ppuy1Package
