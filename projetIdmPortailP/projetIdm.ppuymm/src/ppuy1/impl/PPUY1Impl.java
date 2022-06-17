/**
 */
package ppuy1.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import ppuy1.Departement;
import ppuy1.PPUY1;
import ppuy1.Personne;
import ppuy1.UE;
import ppuy1.ppuy1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PPUY1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppuy1.impl.PPUY1Impl#getNom <em>Nom</em>}</li>
 *   <li>{@link ppuy1.impl.PPUY1Impl#getDescription <em>Description</em>}</li>
 *   <li>{@link ppuy1.impl.PPUY1Impl#getPersonne <em>Personne</em>}</li>
 *   <li>{@link ppuy1.impl.PPUY1Impl#getUe <em>Ue</em>}</li>
 *   <li>{@link ppuy1.impl.PPUY1Impl#getDepartement <em>Departement</em>}</li>
 *   <li>{@link ppuy1.impl.PPUY1Impl#getAPourResponsable <em>APour Responsable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PPUY1Impl extends CDOObjectImpl implements PPUY1 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PPUY1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ppuy1Package.Literals.PPUY1;
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
		return (String)eGet(ppuy1Package.Literals.PPUY1__NOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		eSet(ppuy1Package.Literals.PPUY1__NOM, newNom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(ppuy1Package.Literals.PPUY1__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(ppuy1Package.Literals.PPUY1__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Personne> getPersonne() {
		return (EList<Personne>)eGet(ppuy1Package.Literals.PPUY1__PERSONNE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UE> getUe() {
		return (EList<UE>)eGet(ppuy1Package.Literals.PPUY1__UE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Departement> getDepartement() {
		return (EList<Departement>)eGet(ppuy1Package.Literals.PPUY1__DEPARTEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Personne getAPourResponsable() {
		return (Personne)eGet(ppuy1Package.Literals.PPUY1__APOUR_RESPONSABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourResponsable(Personne newAPourResponsable) {
		eSet(ppuy1Package.Literals.PPUY1__APOUR_RESPONSABLE, newAPourResponsable);
	}

} //PPUY1Impl
