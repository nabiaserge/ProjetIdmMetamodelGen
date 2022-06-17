/**
 */
package html_model.impl;

import html_model.CompositeTextElement;
import html_model.Html_modelPackage;
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
 * An implementation of the model object '<em><b>Composite Text Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link html_model.impl.CompositeTextElementImpl#getSubTextElements <em>Sub Text Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CompositeTextElementImpl extends ContainableTextElementImpl implements CompositeTextElement {
	/**
	 * The cached value of the '{@link #getSubTextElements() <em>Sub Text Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTextElements()
	 * @generated
	 * @ordered
	 */
	protected EList<TextElement> subTextElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeTextElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Html_modelPackage.Literals.COMPOSITE_TEXT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextElement> getSubTextElements() {
		if (subTextElements == null) {
			subTextElements = new EObjectContainmentEList<TextElement>(TextElement.class, this, Html_modelPackage.COMPOSITE_TEXT_ELEMENT__SUB_TEXT_ELEMENTS);
		}
		return subTextElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Html_modelPackage.COMPOSITE_TEXT_ELEMENT__SUB_TEXT_ELEMENTS:
				return ((InternalEList<?>)getSubTextElements()).basicRemove(otherEnd, msgs);
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
			case Html_modelPackage.COMPOSITE_TEXT_ELEMENT__SUB_TEXT_ELEMENTS:
				return getSubTextElements();
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
			case Html_modelPackage.COMPOSITE_TEXT_ELEMENT__SUB_TEXT_ELEMENTS:
				getSubTextElements().clear();
				getSubTextElements().addAll((Collection<? extends TextElement>)newValue);
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
			case Html_modelPackage.COMPOSITE_TEXT_ELEMENT__SUB_TEXT_ELEMENTS:
				getSubTextElements().clear();
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
			case Html_modelPackage.COMPOSITE_TEXT_ELEMENT__SUB_TEXT_ELEMENTS:
				return subTextElements != null && !subTextElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeTextElementImpl
