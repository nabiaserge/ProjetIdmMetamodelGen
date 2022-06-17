/**
 */
package ppuy1.impl;

import org.eclipse.emf.ecore.EClass;

import ppuy1.Ressource;
import ppuy1.ppuy1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppuy1.impl.RessourceImpl#getFichier <em>Fichier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RessourceImpl extends ContenuImpl implements Ressource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RessourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ppuy1Package.Literals.RESSOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFichier() {
		return (String)eGet(ppuy1Package.Literals.RESSOURCE__FICHIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFichier(String newFichier) {
		eSet(ppuy1Package.Literals.RESSOURCE__FICHIER, newFichier);
	}

} //RessourceImpl
