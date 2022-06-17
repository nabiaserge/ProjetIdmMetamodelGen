/**
 */
package ppuy1.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ppuy1.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ppuy1FactoryImpl extends EFactoryImpl implements ppuy1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ppuy1Factory init() {
		try {
			ppuy1Factory theppuy1Factory = (ppuy1Factory)EPackage.Registry.INSTANCE.getEFactory(ppuy1Package.eNS_URI);
			if (theppuy1Factory != null) {
				return theppuy1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ppuy1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ppuy1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ppuy1Package.CALENDRIER: return (EObject)createCalendrier();
			case ppuy1Package.DEPARTEMENT: return (EObject)createDepartement();
			case ppuy1Package.DESCRIPTION: return (EObject)createDescription();
			case ppuy1Package.RESSOURCE: return (EObject)createRessource();
			case ppuy1Package.NIVEAU: return (EObject)createNiveau();
			case ppuy1Package.SEMESTRE: return (EObject)createSemestre();
			case ppuy1Package.PERSONNE: return (EObject)createPersonne();
			case ppuy1Package.PPUY1: return (EObject)createPPUY1();
			case ppuy1Package.FORMATION: return (EObject)createFormation();
			case ppuy1Package.UE: return (EObject)createUE();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendrier createCalendrier() {
		CalendrierImpl calendrier = new CalendrierImpl();
		return calendrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Departement createDepartement() {
		DepartementImpl departement = new DepartementImpl();
		return departement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description createDescription() {
		DescriptionImpl description = new DescriptionImpl();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource createRessource() {
		RessourceImpl ressource = new RessourceImpl();
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Niveau createNiveau() {
		NiveauImpl niveau = new NiveauImpl();
		return niveau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semestre createSemestre() {
		SemestreImpl semestre = new SemestreImpl();
		return semestre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Personne createPersonne() {
		PersonneImpl personne = new PersonneImpl();
		return personne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPUY1 createPPUY1() {
		PPUY1Impl ppuy1 = new PPUY1Impl();
		return ppuy1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formation createFormation() {
		FormationImpl formation = new FormationImpl();
		return formation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UE createUE() {
		UEImpl ue = new UEImpl();
		return ue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ppuy1Package getppuy1Package() {
		return (ppuy1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ppuy1Package getPackage() {
		return ppuy1Package.eINSTANCE;
	}

} //ppuy1FactoryImpl
