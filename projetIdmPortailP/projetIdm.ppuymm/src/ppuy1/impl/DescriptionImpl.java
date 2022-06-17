/**
 */
package ppuy1.impl;

import org.eclipse.emf.ecore.EClass;

import ppuy1.Description;
import ppuy1.ppuy1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppuy1.impl.DescriptionImpl#getText <em>Text</em>}</li>
 *   <li>{@link ppuy1.impl.DescriptionImpl#getLien <em>Lien</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescriptionImpl extends ContenuImpl implements Description {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ppuy1Package.Literals.DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return (String)eGet(ppuy1Package.Literals.DESCRIPTION__TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		eSet(ppuy1Package.Literals.DESCRIPTION__TEXT, newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLien() {
		return (String)eGet(ppuy1Package.Literals.DESCRIPTION__LIEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLien(String newLien) {
		eSet(ppuy1Package.Literals.DESCRIPTION__LIEN, newLien);
	}

} //DescriptionImpl
