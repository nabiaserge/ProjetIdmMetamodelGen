/**
 */
package bootstrap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bootstrap.Link#getLinkproperties <em>Linkproperties</em>}</li>
 *   <li>{@link bootstrap.Link#getButtonproperties <em>Buttonproperties</em>}</li>
 *   <li>{@link bootstrap.Link#getBadgeproperties <em>Badgeproperties</em>}</li>
 * </ul>
 *
 * @see bootstrap.BootstrapPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends UrlBasedLink, TextNested {
	/**
	 * Returns the value of the '<em><b>Linkproperties</b></em>' containment reference list.
	 * The list contents are of type {@link bootstrap.LinkProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkproperties</em>' containment reference list.
	 * @see bootstrap.BootstrapPackage#getLink_Linkproperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkProperty> getLinkproperties();

	/**
	 * Returns the value of the '<em><b>Buttonproperties</b></em>' containment reference list.
	 * The list contents are of type {@link bootstrap.ButtonProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buttonproperties</em>' containment reference list.
	 * @see bootstrap.BootstrapPackage#getLink_Buttonproperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<ButtonProperty> getButtonproperties();

	/**
	 * Returns the value of the '<em><b>Badgeproperties</b></em>' containment reference list.
	 * The list contents are of type {@link bootstrap.BadgeProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Badgeproperties</em>' containment reference list.
	 * @see bootstrap.BootstrapPackage#getLink_Badgeproperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<BadgeProperty> getBadgeproperties();

} // Link
