/**
 */
package ppuy1.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import ppuy1.Contenu;
import ppuy1.Niveau;
import ppuy1.Semestre;
import ppuy1.ppuy1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Niveau</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppuy1.impl.NiveauImpl#getId_niveau <em>Id niveau</em>}</li>
 *   <li>{@link ppuy1.impl.NiveauImpl#getSemestre <em>Semestre</em>}</li>
 *   <li>{@link ppuy1.impl.NiveauImpl#getContenu <em>Contenu</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NiveauImpl extends CDOObjectImpl implements Niveau {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NiveauImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ppuy1Package.Literals.NIVEAU;
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
	public int getId_niveau() {
		return (Integer)eGet(ppuy1Package.Literals.NIVEAU__ID_NIVEAU, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId_niveau(int newId_niveau) {
		eSet(ppuy1Package.Literals.NIVEAU__ID_NIVEAU, newId_niveau);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Semestre> getSemestre() {
		return (EList<Semestre>)eGet(ppuy1Package.Literals.NIVEAU__SEMESTRE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Contenu> getContenu() {
		return (EList<Contenu>)eGet(ppuy1Package.Literals.NIVEAU__CONTENU, true);
	}

} //NiveauImpl
