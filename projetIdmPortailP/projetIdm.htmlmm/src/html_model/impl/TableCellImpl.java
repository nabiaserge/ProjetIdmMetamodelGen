/**
 */
package html_model.impl;

import html_model.Html_modelPackage;
import html_model.TableCell;
import html_model.TableCellAlignement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link html_model.impl.TableCellImpl#getAlignement <em>Alignement</em>}</li>
 *   <li>{@link html_model.impl.TableCellImpl#getSpan <em>Span</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableCellImpl extends TextContainerImpl implements TableCell {
	/**
	 * The default value of the '{@link #getAlignement() <em>Alignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignement()
	 * @generated
	 * @ordered
	 */
	protected static final TableCellAlignement ALIGNEMENT_EDEFAULT = TableCellAlignement.LEFT;

	/**
	 * The cached value of the '{@link #getAlignement() <em>Alignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignement()
	 * @generated
	 * @ordered
	 */
	protected TableCellAlignement alignement = ALIGNEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpan() <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpan()
	 * @generated
	 * @ordered
	 */
	protected static final int SPAN_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getSpan() <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpan()
	 * @generated
	 * @ordered
	 */
	protected int span = SPAN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableCellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Html_modelPackage.Literals.TABLE_CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableCellAlignement getAlignement() {
		return alignement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignement(TableCellAlignement newAlignement) {
		TableCellAlignement oldAlignement = alignement;
		alignement = newAlignement == null ? ALIGNEMENT_EDEFAULT : newAlignement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Html_modelPackage.TABLE_CELL__ALIGNEMENT, oldAlignement, alignement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSpan() {
		return span;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpan(int newSpan) {
		int oldSpan = span;
		span = newSpan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Html_modelPackage.TABLE_CELL__SPAN, oldSpan, span));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Html_modelPackage.TABLE_CELL__ALIGNEMENT:
				return getAlignement();
			case Html_modelPackage.TABLE_CELL__SPAN:
				return getSpan();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Html_modelPackage.TABLE_CELL__ALIGNEMENT:
				setAlignement((TableCellAlignement)newValue);
				return;
			case Html_modelPackage.TABLE_CELL__SPAN:
				setSpan((Integer)newValue);
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
			case Html_modelPackage.TABLE_CELL__ALIGNEMENT:
				setAlignement(ALIGNEMENT_EDEFAULT);
				return;
			case Html_modelPackage.TABLE_CELL__SPAN:
				setSpan(SPAN_EDEFAULT);
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
			case Html_modelPackage.TABLE_CELL__ALIGNEMENT:
				return alignement != ALIGNEMENT_EDEFAULT;
			case Html_modelPackage.TABLE_CELL__SPAN:
				return span != SPAN_EDEFAULT;
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
		result.append(" (alignement: ");
		result.append(alignement);
		result.append(", span: ");
		result.append(span);
		result.append(')');
		return result.toString();
	}

} //TableCellImpl
