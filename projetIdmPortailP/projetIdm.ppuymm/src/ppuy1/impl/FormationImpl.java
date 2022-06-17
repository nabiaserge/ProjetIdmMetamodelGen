/**
 */
package ppuy1.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import ppuy1.Contenu;
import ppuy1.Formation;
import ppuy1.Niveau;
import ppuy1.Personne;
import ppuy1.Semestre;
import ppuy1.ppuy1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppuy1.impl.FormationImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link ppuy1.impl.FormationImpl#getContenu <em>Contenu</em>}</li>
 *   <li>{@link ppuy1.impl.FormationImpl#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link ppuy1.impl.FormationImpl#getSemestre <em>Semestre</em>}</li>
 *   <li>{@link ppuy1.impl.FormationImpl#getAPourResponsable <em>APour Responsable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormationImpl extends CDOObjectImpl implements Formation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ppuy1Package.Literals.FORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return (String)eGet(ppuy1Package.Literals.FORMATION__NOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		eSet(ppuy1Package.Literals.FORMATION__NOM, newNom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Contenu> getContenu() {
		return (EList<Contenu>)eGet(ppuy1Package.Literals.FORMATION__CONTENU, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Niveau> getNiveau() {
		return (EList<Niveau>)eGet(ppuy1Package.Literals.FORMATION__NIVEAU, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Semestre> getSemestre() {
		return (EList<Semestre>)eGet(ppuy1Package.Literals.FORMATION__SEMESTRE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Personne getAPourResponsable() {
		return (Personne)eGet(ppuy1Package.Literals.FORMATION__APOUR_RESPONSABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourResponsable(Personne newAPourResponsable) {
		eSet(ppuy1Package.Literals.FORMATION__APOUR_RESPONSABLE, newAPourResponsable);
	}

} //FormationImpl
