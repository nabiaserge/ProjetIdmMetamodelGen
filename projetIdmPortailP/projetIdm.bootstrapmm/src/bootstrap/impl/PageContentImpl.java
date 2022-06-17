/**
 */
package bootstrap.impl;

import bootstrap.BootstrapPackage;
import bootstrap.General;
import bootstrap.PageContent;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bootstrap.impl.PageContentImpl#getGeneralProperties <em>General Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PageContentImpl extends MinimalEObjectImpl.Container implements PageContent {
	/**
	 * The cached value of the '{@link #getGeneralProperties() <em>General Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<General> generalProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.PAGE_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<General> getGeneralProperties() {
		if (generalProperties == null) {
			generalProperties = new EObjectContainmentEList<General>(General.class, this, BootstrapPackage.PAGE_CONTENT__GENERAL_PROPERTIES);
		}
		return generalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.PAGE_CONTENT__GENERAL_PROPERTIES:
				return ((InternalEList<?>)getGeneralProperties()).basicRemove(otherEnd, msgs);
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
			case BootstrapPackage.PAGE_CONTENT__GENERAL_PROPERTIES:
				return getGeneralProperties();
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
			case BootstrapPackage.PAGE_CONTENT__GENERAL_PROPERTIES:
				getGeneralProperties().clear();
				getGeneralProperties().addAll((Collection<? extends General>)newValue);
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
			case BootstrapPackage.PAGE_CONTENT__GENERAL_PROPERTIES:
				getGeneralProperties().clear();
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
			case BootstrapPackage.PAGE_CONTENT__GENERAL_PROPERTIES:
				return generalProperties != null && !generalProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PageContentImpl
