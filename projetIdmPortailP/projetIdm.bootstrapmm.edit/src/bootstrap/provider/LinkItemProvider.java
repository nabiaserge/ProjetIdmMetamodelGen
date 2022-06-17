/**
 */
package bootstrap.provider;


import bootstrap.BootstrapFactory;
import bootstrap.BootstrapPackage;
import bootstrap.Link;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link bootstrap.Link} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LinkItemProvider extends UrlBasedLinkItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BootstrapPackage.Literals.LINK__LINKPROPERTIES);
			childrenFeatures.add(BootstrapPackage.Literals.LINK__BUTTONPROPERTIES);
			childrenFeatures.add(BootstrapPackage.Literals.LINK__BADGEPROPERTIES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Link.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Link"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Link)object).getUrl();
		return label == null || label.length() == 0 ?
			getString("_UI_Link_type") :
			getString("_UI_Link_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Link.class)) {
			case BootstrapPackage.LINK__LINKPROPERTIES:
			case BootstrapPackage.LINK__BUTTONPROPERTIES:
			case BootstrapPackage.LINK__BADGEPROPERTIES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.LINK__LINKPROPERTIES,
				 BootstrapFactory.eINSTANCE.createLinkBrand()));

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.LINK__LINKPROPERTIES,
				 BootstrapFactory.eINSTANCE.createAlertLink()));

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.LINK__BUTTONPROPERTIES,
				 BootstrapFactory.eINSTANCE.createDisabled()));

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.LINK__BUTTONPROPERTIES,
				 BootstrapFactory.eINSTANCE.createButtonSize()));

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.LINK__BUTTONPROPERTIES,
				 BootstrapFactory.eINSTANCE.createActive()));

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.LINK__BUTTONPROPERTIES,
				 BootstrapFactory.eINSTANCE.createButtonStyle()));

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.LINK__BUTTONPROPERTIES,
				 BootstrapFactory.eINSTANCE.createButtonLink()));

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.LINK__BADGEPROPERTIES,
				 BootstrapFactory.eINSTANCE.createBadgeStyle()));

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.LINK__BADGEPROPERTIES,
				 BootstrapFactory.eINSTANCE.createBadgePill()));
	}

}
