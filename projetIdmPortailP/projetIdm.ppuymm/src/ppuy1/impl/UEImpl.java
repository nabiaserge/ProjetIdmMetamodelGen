/**
 */
package ppuy1.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import ppuy1.Contenu;
import ppuy1.Personne;
import ppuy1.UE;
import ppuy1.ppuy1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppuy1.impl.UEImpl#getNom_ue <em>Nom ue</em>}</li>
 *   <li>{@link ppuy1.impl.UEImpl#isOptionnelle <em>Optionnelle</em>}</li>
 *   <li>{@link ppuy1.impl.UEImpl#getEstDispenser <em>Est Dispenser</em>}</li>
 *   <li>{@link ppuy1.impl.UEImpl#getContenu <em>Contenu</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UEImpl extends CDOObjectImpl implements UE {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ppuy1Package.Literals.UE;
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
	public String getNom_ue() {
		return (String)eGet(ppuy1Package.Literals.UE__NOM_UE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom_ue(String newNom_ue) {
		eSet(ppuy1Package.Literals.UE__NOM_UE, newNom_ue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptionnelle() {
		return (Boolean)eGet(ppuy1Package.Literals.UE__OPTIONNELLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionnelle(boolean newOptionnelle) {
		eSet(ppuy1Package.Literals.UE__OPTIONNELLE, newOptionnelle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Personne> getEstDispenser() {
		return (EList<Personne>)eGet(ppuy1Package.Literals.UE__EST_DISPENSER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Contenu> getContenu() {
		return (EList<Contenu>)eGet(ppuy1Package.Literals.UE__CONTENU, true);
	}

} //UEImpl
