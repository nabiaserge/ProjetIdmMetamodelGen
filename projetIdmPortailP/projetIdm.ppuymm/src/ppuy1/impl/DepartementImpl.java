/**
 */
package ppuy1.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import ppuy1.Contenu;
import ppuy1.Departement;
import ppuy1.Formation;
import ppuy1.Personne;
import ppuy1.ppuy1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Departement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppuy1.impl.DepartementImpl#getFormation <em>Formation</em>}</li>
 *   <li>{@link ppuy1.impl.DepartementImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link ppuy1.impl.DepartementImpl#getContenu <em>Contenu</em>}</li>
 *   <li>{@link ppuy1.impl.DepartementImpl#getApourResponsable <em>Apour Responsable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartementImpl extends CDOObjectImpl implements Departement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ppuy1Package.Literals.DEPARTEMENT;
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
	@SuppressWarnings("unchecked")
	public EList<Formation> getFormation() {
		return (EList<Formation>)eGet(ppuy1Package.Literals.DEPARTEMENT__FORMATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return (String)eGet(ppuy1Package.Literals.DEPARTEMENT__NOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		eSet(ppuy1Package.Literals.DEPARTEMENT__NOM, newNom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Contenu> getContenu() {
		return (EList<Contenu>)eGet(ppuy1Package.Literals.DEPARTEMENT__CONTENU, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Personne getApourResponsable() {
		return (Personne)eGet(ppuy1Package.Literals.DEPARTEMENT__APOUR_RESPONSABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApourResponsable(Personne newApourResponsable) {
		eSet(ppuy1Package.Literals.DEPARTEMENT__APOUR_RESPONSABLE, newApourResponsable);
	}

} //DepartementImpl
