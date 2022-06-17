/**
 */
package ppuy1.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import ppuy1.Contenu;
import ppuy1.Semestre;
import ppuy1.UE;
import ppuy1.ppuy1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semestre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppuy1.impl.SemestreImpl#getId_semestre <em>Id semestre</em>}</li>
 *   <li>{@link ppuy1.impl.SemestreImpl#getUe <em>Ue</em>}</li>
 *   <li>{@link ppuy1.impl.SemestreImpl#getContenu <em>Contenu</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemestreImpl extends CDOObjectImpl implements Semestre {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemestreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ppuy1Package.Literals.SEMESTRE;
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
	public int getId_semestre() {
		return (Integer)eGet(ppuy1Package.Literals.SEMESTRE__ID_SEMESTRE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId_semestre(int newId_semestre) {
		eSet(ppuy1Package.Literals.SEMESTRE__ID_SEMESTRE, newId_semestre);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UE> getUe() {
		return (EList<UE>)eGet(ppuy1Package.Literals.SEMESTRE__UE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Contenu> getContenu() {
		return (EList<Contenu>)eGet(ppuy1Package.Literals.SEMESTRE__CONTENU, true);
	}

} //SemestreImpl
