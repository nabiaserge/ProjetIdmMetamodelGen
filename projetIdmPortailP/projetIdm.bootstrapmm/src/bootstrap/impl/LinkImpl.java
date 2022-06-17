/**
 */
package bootstrap.impl;

import bootstrap.BadgeProperty;
import bootstrap.BootstrapPackage;
import bootstrap.ButtonProperty;
import bootstrap.Link;
import bootstrap.LinkProperty;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bootstrap.impl.LinkImpl#getLinkproperties <em>Linkproperties</em>}</li>
 *   <li>{@link bootstrap.impl.LinkImpl#getButtonproperties <em>Buttonproperties</em>}</li>
 *   <li>{@link bootstrap.impl.LinkImpl#getBadgeproperties <em>Badgeproperties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends UrlBasedLinkImpl implements Link {
	/**
	 * The cached value of the '{@link #getLinkproperties() <em>Linkproperties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkproperties()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkProperty> linkproperties;

	/**
	 * The cached value of the '{@link #getButtonproperties() <em>Buttonproperties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonproperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ButtonProperty> buttonproperties;

	/**
	 * The cached value of the '{@link #getBadgeproperties() <em>Badgeproperties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBadgeproperties()
	 * @generated
	 * @ordered
	 */
	protected EList<BadgeProperty> badgeproperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkProperty> getLinkproperties() {
		if (linkproperties == null) {
			linkproperties = new EObjectContainmentEList<LinkProperty>(LinkProperty.class, this, BootstrapPackage.LINK__LINKPROPERTIES);
		}
		return linkproperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ButtonProperty> getButtonproperties() {
		if (buttonproperties == null) {
			buttonproperties = new EObjectContainmentEList<ButtonProperty>(ButtonProperty.class, this, BootstrapPackage.LINK__BUTTONPROPERTIES);
		}
		return buttonproperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BadgeProperty> getBadgeproperties() {
		if (badgeproperties == null) {
			badgeproperties = new EObjectContainmentEList<BadgeProperty>(BadgeProperty.class, this, BootstrapPackage.LINK__BADGEPROPERTIES);
		}
		return badgeproperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.LINK__LINKPROPERTIES:
				return ((InternalEList<?>)getLinkproperties()).basicRemove(otherEnd, msgs);
			case BootstrapPackage.LINK__BUTTONPROPERTIES:
				return ((InternalEList<?>)getButtonproperties()).basicRemove(otherEnd, msgs);
			case BootstrapPackage.LINK__BADGEPROPERTIES:
				return ((InternalEList<?>)getBadgeproperties()).basicRemove(otherEnd, msgs);
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
			case BootstrapPackage.LINK__LINKPROPERTIES:
				return getLinkproperties();
			case BootstrapPackage.LINK__BUTTONPROPERTIES:
				return getButtonproperties();
			case BootstrapPackage.LINK__BADGEPROPERTIES:
				return getBadgeproperties();
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
			case BootstrapPackage.LINK__LINKPROPERTIES:
				getLinkproperties().clear();
				getLinkproperties().addAll((Collection<? extends LinkProperty>)newValue);
				return;
			case BootstrapPackage.LINK__BUTTONPROPERTIES:
				getButtonproperties().clear();
				getButtonproperties().addAll((Collection<? extends ButtonProperty>)newValue);
				return;
			case BootstrapPackage.LINK__BADGEPROPERTIES:
				getBadgeproperties().clear();
				getBadgeproperties().addAll((Collection<? extends BadgeProperty>)newValue);
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
			case BootstrapPackage.LINK__LINKPROPERTIES:
				getLinkproperties().clear();
				return;
			case BootstrapPackage.LINK__BUTTONPROPERTIES:
				getButtonproperties().clear();
				return;
			case BootstrapPackage.LINK__BADGEPROPERTIES:
				getBadgeproperties().clear();
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
			case BootstrapPackage.LINK__LINKPROPERTIES:
				return linkproperties != null && !linkproperties.isEmpty();
			case BootstrapPackage.LINK__BUTTONPROPERTIES:
				return buttonproperties != null && !buttonproperties.isEmpty();
			case BootstrapPackage.LINK__BADGEPROPERTIES:
				return badgeproperties != null && !badgeproperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LinkImpl
