/**
 */
package ppuy1.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import ppuy1.util.ppuy1AdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ppuy1ItemProviderAdapterFactory extends ppuy1AdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ppuy1ItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ppuy1.Calendrier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalendrierItemProvider calendrierItemProvider;

	/**
	 * This creates an adapter for a {@link ppuy1.Calendrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCalendrierAdapter() {
		if (calendrierItemProvider == null) {
			calendrierItemProvider = new CalendrierItemProvider(this);
		}

		return calendrierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ppuy1.Departement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartementItemProvider departementItemProvider;

	/**
	 * This creates an adapter for a {@link ppuy1.Departement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDepartementAdapter() {
		if (departementItemProvider == null) {
			departementItemProvider = new DepartementItemProvider(this);
		}

		return departementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ppuy1.Description} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptionItemProvider descriptionItemProvider;

	/**
	 * This creates an adapter for a {@link ppuy1.Description}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDescriptionAdapter() {
		if (descriptionItemProvider == null) {
			descriptionItemProvider = new DescriptionItemProvider(this);
		}

		return descriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ppuy1.Ressource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RessourceItemProvider ressourceItemProvider;

	/**
	 * This creates an adapter for a {@link ppuy1.Ressource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRessourceAdapter() {
		if (ressourceItemProvider == null) {
			ressourceItemProvider = new RessourceItemProvider(this);
		}

		return ressourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ppuy1.Niveau} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NiveauItemProvider niveauItemProvider;

	/**
	 * This creates an adapter for a {@link ppuy1.Niveau}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNiveauAdapter() {
		if (niveauItemProvider == null) {
			niveauItemProvider = new NiveauItemProvider(this);
		}

		return niveauItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ppuy1.Semestre} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemestreItemProvider semestreItemProvider;

	/**
	 * This creates an adapter for a {@link ppuy1.Semestre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSemestreAdapter() {
		if (semestreItemProvider == null) {
			semestreItemProvider = new SemestreItemProvider(this);
		}

		return semestreItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ppuy1.Personne} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonneItemProvider personneItemProvider;

	/**
	 * This creates an adapter for a {@link ppuy1.Personne}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPersonneAdapter() {
		if (personneItemProvider == null) {
			personneItemProvider = new PersonneItemProvider(this);
		}

		return personneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ppuy1.PPUY1} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PPUY1ItemProvider ppuy1ItemProvider;

	/**
	 * This creates an adapter for a {@link ppuy1.PPUY1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPPUY1Adapter() {
		if (ppuy1ItemProvider == null) {
			ppuy1ItemProvider = new PPUY1ItemProvider(this);
		}

		return ppuy1ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ppuy1.Formation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormationItemProvider formationItemProvider;

	/**
	 * This creates an adapter for a {@link ppuy1.Formation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFormationAdapter() {
		if (formationItemProvider == null) {
			formationItemProvider = new FormationItemProvider(this);
		}

		return formationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ppuy1.UE} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UEItemProvider ueItemProvider;

	/**
	 * This creates an adapter for a {@link ppuy1.UE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUEAdapter() {
		if (ueItemProvider == null) {
			ueItemProvider = new UEItemProvider(this);
		}

		return ueItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (calendrierItemProvider != null) calendrierItemProvider.dispose();
		if (departementItemProvider != null) departementItemProvider.dispose();
		if (descriptionItemProvider != null) descriptionItemProvider.dispose();
		if (ressourceItemProvider != null) ressourceItemProvider.dispose();
		if (niveauItemProvider != null) niveauItemProvider.dispose();
		if (semestreItemProvider != null) semestreItemProvider.dispose();
		if (personneItemProvider != null) personneItemProvider.dispose();
		if (ppuy1ItemProvider != null) ppuy1ItemProvider.dispose();
		if (formationItemProvider != null) formationItemProvider.dispose();
		if (ueItemProvider != null) ueItemProvider.dispose();
	}

}