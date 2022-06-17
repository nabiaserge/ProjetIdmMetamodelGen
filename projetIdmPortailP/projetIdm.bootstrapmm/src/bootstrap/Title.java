/**
 */
package bootstrap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Title</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bootstrap.Title#getLevel <em>Level</em>}</li>
 *   <li>{@link bootstrap.Title#getDisplayproperties <em>Displayproperties</em>}</li>
 * </ul>
 *
 * @see bootstrap.BootstrapPackage#getTitle()
 * @model
 * @generated
 */
public interface Title extends TextContainer {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see bootstrap.BootstrapPackage#getTitle_Level()
	 * @model
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link bootstrap.Title#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Displayproperties</b></em>' containment reference list.
	 * The list contents are of type {@link bootstrap.DisplayProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displayproperties</em>' containment reference list.
	 * @see bootstrap.BootstrapPackage#getTitle_Displayproperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<DisplayProperty> getDisplayproperties();

} // Title
