/**
 */
package bootstrap.impl;

import bootstrap.BootstrapPackage;
import bootstrap.Emphasis;
import bootstrap.TextContainer;
import bootstrap.TextElements;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bootstrap.impl.TextContainerImpl#getTextelements <em>Textelements</em>}</li>
 *   <li>{@link bootstrap.impl.TextContainerImpl#getColor <em>Color</em>}</li>
 *   <li>{@link bootstrap.impl.TextContainerImpl#getEmphasis <em>Emphasis</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TextContainerImpl extends TextPageContentImpl implements TextContainer {
	/**
	 * The cached value of the '{@link #getTextelements() <em>Textelements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextelements()
	 * @generated
	 * @ordered
	 */
	protected EList<TextElements> textelements;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmphasis() <em>Emphasis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmphasis()
	 * @generated
	 * @ordered
	 */
	protected EList<Emphasis> emphasis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.TEXT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextElements> getTextelements() {
		if (textelements == null) {
			textelements = new EObjectContainmentEList<TextElements>(TextElements.class, this, BootstrapPackage.TEXT_CONTAINER__TEXTELEMENTS);
		}
		return textelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BootstrapPackage.TEXT_CONTAINER__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Emphasis> getEmphasis() {
		if (emphasis == null) {
			emphasis = new EObjectContainmentEList<Emphasis>(Emphasis.class, this, BootstrapPackage.TEXT_CONTAINER__EMPHASIS);
		}
		return emphasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.TEXT_CONTAINER__TEXTELEMENTS:
				return ((InternalEList<?>)getTextelements()).basicRemove(otherEnd, msgs);
			case BootstrapPackage.TEXT_CONTAINER__EMPHASIS:
				return ((InternalEList<?>)getEmphasis()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BootstrapPackage.TEXT_CONTAINER__TEXTELEMENTS:
				return getTextelements();
			case BootstrapPackage.TEXT_CONTAINER__COLOR:
				return getColor();
			case BootstrapPackage.TEXT_CONTAINER__EMPHASIS:
				return getEmphasis();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BootstrapPackage.TEXT_CONTAINER__TEXTELEMENTS:
				getTextelements().clear();
				getTextelements().addAll((Collection<? extends TextElements>)newValue);
				return;
			case BootstrapPackage.TEXT_CONTAINER__COLOR:
				setColor((String)newValue);
				return;
			case BootstrapPackage.TEXT_CONTAINER__EMPHASIS:
				getEmphasis().clear();
				getEmphasis().addAll((Collection<? extends Emphasis>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BootstrapPackage.TEXT_CONTAINER__TEXTELEMENTS:
				getTextelements().clear();
				return;
			case BootstrapPackage.TEXT_CONTAINER__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case BootstrapPackage.TEXT_CONTAINER__EMPHASIS:
				getEmphasis().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BootstrapPackage.TEXT_CONTAINER__TEXTELEMENTS:
				return textelements != null && !textelements.isEmpty();
			case BootstrapPackage.TEXT_CONTAINER__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case BootstrapPackage.TEXT_CONTAINER__EMPHASIS:
				return emphasis != null && !emphasis.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //TextContainerImpl
