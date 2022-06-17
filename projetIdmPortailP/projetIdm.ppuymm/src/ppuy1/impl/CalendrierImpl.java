/**
 */
package ppuy1.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import ppuy1.Calendrier;
import ppuy1.ppuy1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calendrier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppuy1.impl.CalendrierImpl#getEvenement <em>Evenement</em>}</li>
 *   <li>{@link ppuy1.impl.CalendrierImpl#getDebut <em>Debut</em>}</li>
 *   <li>{@link ppuy1.impl.CalendrierImpl#getFin <em>Fin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalendrierImpl extends ContenuImpl implements Calendrier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalendrierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ppuy1Package.Literals.CALENDRIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvenement() {
		return (String)eGet(ppuy1Package.Literals.CALENDRIER__EVENEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvenement(String newEvenement) {
		eSet(ppuy1Package.Literals.CALENDRIER__EVENEMENT, newEvenement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDebut() {
		return (Date)eGet(ppuy1Package.Literals.CALENDRIER__DEBUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebut(Date newDebut) {
		eSet(ppuy1Package.Literals.CALENDRIER__DEBUT, newDebut);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFin() {
		return (Date)eGet(ppuy1Package.Literals.CALENDRIER__FIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFin(Date newFin) {
		eSet(ppuy1Package.Literals.CALENDRIER__FIN, newFin);
	}

} //CalendrierImpl
