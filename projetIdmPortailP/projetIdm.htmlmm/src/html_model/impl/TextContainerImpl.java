/**
 */
package html_model.impl;

import html_model.Html_modelPackage;
import html_model.TextContainer;
import html_model.TextElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link html_model.impl.TextContainerImpl#getTextElements <em>Text Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TextContainerImpl extends PageContentImpl implements TextContainer {
	/**
	 * The cached value of the '{@link #getTextElements() <em>Text Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextElements()
	 * @generated
	 * @ordered
	 */
	protected EList<TextElement> textElements;

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
		return Html_modelPackage.Literals.TEXT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextElement> getTextElements() {
		if (textElements == null) {
			textElements = new EObjectContainmentEList<TextElement>(TextElement.class, this, Html_modelPackage.TEXT_CONTAINER__TEXT_ELEMENTS);
		}
		return textElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Html_modelPackage.TEXT_CONTAINER__TEXT_ELEMENTS:
				return ((InternalEList<?>)getTextElements()).basicRemove(otherEnd, msgs);
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
			case Html_modelPackage.TEXT_CONTAINER__TEXT_ELEMENTS:
				return getTextElements();
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
			case Html_modelPackage.TEXT_CONTAINER__TEXT_ELEMENTS:
				getTextElements().clear();
				getTextElements().addAll((Collection<? extends TextElement>)newValue);
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
			case Html_modelPackage.TEXT_CONTAINER__TEXT_ELEMENTS:
				getTextElements().clear();
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
			case Html_modelPackage.TEXT_CONTAINER__TEXT_ELEMENTS:
				return textElements != null && !textElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TextContainerImpl
