/**
 */
package bootstrap.util;

import bootstrap.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see bootstrap.BootstrapPackage
 * @generated
 */
public class BootstrapAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BootstrapPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BootstrapAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BootstrapPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BootstrapSwitch<Adapter> modelSwitch =
		new BootstrapSwitch<Adapter>() {
			@Override
			public Adapter caseItalic(Italic object) {
				return createItalicAdapter();
			}
			@Override
			public Adapter caseBackground(Background object) {
				return createBackgroundAdapter();
			}
			@Override
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseHorizontalLine(HorizontalLine object) {
				return createHorizontalLineAdapter();
			}
			@Override
			public Adapter caseHorizontalList(HorizontalList object) {
				return createHorizontalListAdapter();
			}
			@Override
			public Adapter caseDisabled(Disabled object) {
				return createDisabledAdapter();
			}
			@Override
			public Adapter caseContainableTextElement(ContainableTextElement object) {
				return createContainableTextElementAdapter();
			}
			@Override
			public Adapter caseBadgeStyle(BadgeStyle object) {
				return createBadgeStyleAdapter();
			}
			@Override
			public Adapter caseDisplay2(Display2 object) {
				return createDisplay2Adapter();
			}
			@Override
			public Adapter casePage(Page object) {
				return createPageAdapter();
			}
			@Override
			public Adapter caseBadgeProperty(BadgeProperty object) {
				return createBadgePropertyAdapter();
			}
			@Override
			public Adapter caseAlertProperty(AlertProperty object) {
				return createAlertPropertyAdapter();
			}
			@Override
			public Adapter caseFluidContainer(FluidContainer object) {
				return createFluidContainerAdapter();
			}
			@Override
			public Adapter caseListProperty(ListProperty object) {
				return createListPropertyAdapter();
			}
			@Override
			public Adapter caseGeneral(General object) {
				return createGeneralAdapter();
			}
			@Override
			public Adapter caseStrong(Strong object) {
				return createStrongAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseDisplay3(Display3 object) {
				return createDisplay3Adapter();
			}
			@Override
			public Adapter caseButtonSize(ButtonSize object) {
				return createButtonSizeAdapter();
			}
			@Override
			public Adapter caseDisplayProperty(DisplayProperty object) {
				return createDisplayPropertyAdapter();
			}
			@Override
			public Adapter caseVertical(Vertical object) {
				return createVerticalAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseParagraphe(Paragraphe object) {
				return createParagrapheAdapter();
			}
			@Override
			public Adapter caseImage(Image object) {
				return createImageAdapter();
			}
			@Override
			public Adapter caseTextPageContent(TextPageContent object) {
				return createTextPageContentAdapter();
			}
			@Override
			public Adapter caseLinkBrand(LinkBrand object) {
				return createLinkBrandAdapter();
			}
			@Override
			public Adapter caseAlertAnimated(AlertAnimated object) {
				return createAlertAnimatedAdapter();
			}
			@Override
			public Adapter caseActive(Active object) {
				return createActiveAdapter();
			}
			@Override
			public Adapter casePropertyClass(PropertyClass object) {
				return createPropertyClassAdapter();
			}
			@Override
			public Adapter caseTbody(Tbody object) {
				return createTbodyAdapter();
			}
			@Override
			public Adapter caseTfoot(Tfoot object) {
				return createTfootAdapter();
			}
			@Override
			public Adapter caseButtonProperty(ButtonProperty object) {
				return createButtonPropertyAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseTextContainer(TextContainer object) {
				return createTextContainerAdapter();
			}
			@Override
			public Adapter caseBadgePill(BadgePill object) {
				return createBadgePillAdapter();
			}
			@Override
			public Adapter caseNavigation(Navigation object) {
				return createNavigationAdapter();
			}
			@Override
			public Adapter caseBasic(Basic object) {
				return createBasicAdapter();
			}
			@Override
			public Adapter caseListItem(ListItem object) {
				return createListItemAdapter();
			}
			@Override
			public Adapter caseUnOrderedList(UnOrderedList object) {
				return createUnOrderedListAdapter();
			}
			@Override
			public Adapter caseAlertLink(AlertLink object) {
				return createAlertLinkAdapter();
			}
			@Override
			public Adapter caseListElement(ListElement object) {
				return createListElementAdapter();
			}
			@Override
			public Adapter caseBorderProperty(BorderProperty object) {
				return createBorderPropertyAdapter();
			}
			@Override
			public Adapter caseBorder(Border object) {
				return createBorderAdapter();
			}
			@Override
			public Adapter caseButton(Button object) {
				return createButtonAdapter();
			}
			@Override
			public Adapter caseTableCell(TableCell object) {
				return createTableCellAdapter();
			}
			@Override
			public Adapter caseTitle(Title object) {
				return createTitleAdapter();
			}
			@Override
			public Adapter caseListItemElement(ListItemElement object) {
				return createListItemElementAdapter();
			}
			@Override
			public Adapter caseEmphasis(Emphasis object) {
				return createEmphasisAdapter();
			}
			@Override
			public Adapter caseDisplay4(Display4 object) {
				return createDisplay4Adapter();
			}
			@Override
			public Adapter caseCompositeTextElement(CompositeTextElement object) {
				return createCompositeTextElementAdapter();
			}
			@Override
			public Adapter caseTextNested(TextNested object) {
				return createTextNestedAdapter();
			}
			@Override
			public Adapter caseThead(Thead object) {
				return createTheadAdapter();
			}
			@Override
			public Adapter caseOrderList(OrderList object) {
				return createOrderListAdapter();
			}
			@Override
			public Adapter caseTextElements(TextElements object) {
				return createTextElementsAdapter();
			}
			@Override
			public Adapter caseUrlBasedLink(UrlBasedLink object) {
				return createUrlBasedLinkAdapter();
			}
			@Override
			public Adapter caseMargesProperty(MargesProperty object) {
				return createMargesPropertyAdapter();
			}
			@Override
			public Adapter caseBasicList(BasicList object) {
				return createBasicListAdapter();
			}
			@Override
			public Adapter caseAlertStyle(AlertStyle object) {
				return createAlertStyleAdapter();
			}
			@Override
			public Adapter caseCentered(Centered object) {
				return createCenteredAdapter();
			}
			@Override
			public Adapter caseButtonLink(ButtonLink object) {
				return createButtonLinkAdapter();
			}
			@Override
			public Adapter caseBrand(Brand object) {
				return createBrandAdapter();
			}
			@Override
			public Adapter caseDisplay1(Display1 object) {
				return createDisplay1Adapter();
			}
			@Override
			public Adapter caseTableRow(TableRow object) {
				return createTableRowAdapter();
			}
			@Override
			public Adapter caseNavBarProperty(NavBarProperty object) {
				return createNavBarPropertyAdapter();
			}
			@Override
			public Adapter casePadding(Padding object) {
				return createPaddingAdapter();
			}
			@Override
			public Adapter caseMargin(Margin object) {
				return createMarginAdapter();
			}
			@Override
			public Adapter caseColoredBorder(ColoredBorder object) {
				return createColoredBorderAdapter();
			}
			@Override
			public Adapter caseButtonState(ButtonState object) {
				return createButtonStateAdapter();
			}
			@Override
			public Adapter caseTextContainable(TextContainable object) {
				return createTextContainableAdapter();
			}
			@Override
			public Adapter caseLinkProperty(LinkProperty object) {
				return createLinkPropertyAdapter();
			}
			@Override
			public Adapter caseFixContainer(FixContainer object) {
				return createFixContainerAdapter();
			}
			@Override
			public Adapter casePageContent(PageContent object) {
				return createPageContentAdapter();
			}
			@Override
			public Adapter caseButtonStyle(ButtonStyle object) {
				return createButtonStyleAdapter();
			}
			@Override
			public Adapter caseTableSection(TableSection object) {
				return createTableSectionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Italic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Italic
	 * @generated
	 */
	public Adapter createItalicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Background <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Background
	 * @generated
	 */
	public Adapter createBackgroundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.HorizontalLine <em>Horizontal Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.HorizontalLine
	 * @generated
	 */
	public Adapter createHorizontalLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.HorizontalList <em>Horizontal List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.HorizontalList
	 * @generated
	 */
	public Adapter createHorizontalListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Disabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Disabled
	 * @generated
	 */
	public Adapter createDisabledAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.ContainableTextElement <em>Containable Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.ContainableTextElement
	 * @generated
	 */
	public Adapter createContainableTextElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.BadgeStyle <em>Badge Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.BadgeStyle
	 * @generated
	 */
	public Adapter createBadgeStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Display2 <em>Display2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Display2
	 * @generated
	 */
	public Adapter createDisplay2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.BadgeProperty <em>Badge Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.BadgeProperty
	 * @generated
	 */
	public Adapter createBadgePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.AlertProperty <em>Alert Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.AlertProperty
	 * @generated
	 */
	public Adapter createAlertPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.FluidContainer <em>Fluid Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.FluidContainer
	 * @generated
	 */
	public Adapter createFluidContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.ListProperty <em>List Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.ListProperty
	 * @generated
	 */
	public Adapter createListPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.General <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.General
	 * @generated
	 */
	public Adapter createGeneralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Strong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Strong
	 * @generated
	 */
	public Adapter createStrongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Display3 <em>Display3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Display3
	 * @generated
	 */
	public Adapter createDisplay3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.ButtonSize <em>Button Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.ButtonSize
	 * @generated
	 */
	public Adapter createButtonSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.DisplayProperty <em>Display Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.DisplayProperty
	 * @generated
	 */
	public Adapter createDisplayPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Vertical <em>Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Vertical
	 * @generated
	 */
	public Adapter createVerticalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Paragraphe <em>Paragraphe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Paragraphe
	 * @generated
	 */
	public Adapter createParagrapheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.TextPageContent <em>Text Page Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.TextPageContent
	 * @generated
	 */
	public Adapter createTextPageContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.LinkBrand <em>Link Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.LinkBrand
	 * @generated
	 */
	public Adapter createLinkBrandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.AlertAnimated <em>Alert Animated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.AlertAnimated
	 * @generated
	 */
	public Adapter createAlertAnimatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Active <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Active
	 * @generated
	 */
	public Adapter createActiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.PropertyClass <em>Property Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.PropertyClass
	 * @generated
	 */
	public Adapter createPropertyClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Tbody <em>Tbody</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Tbody
	 * @generated
	 */
	public Adapter createTbodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Tfoot <em>Tfoot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Tfoot
	 * @generated
	 */
	public Adapter createTfootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.ButtonProperty <em>Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.ButtonProperty
	 * @generated
	 */
	public Adapter createButtonPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.TextContainer <em>Text Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.TextContainer
	 * @generated
	 */
	public Adapter createTextContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.BadgePill <em>Badge Pill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.BadgePill
	 * @generated
	 */
	public Adapter createBadgePillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Navigation <em>Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Navigation
	 * @generated
	 */
	public Adapter createNavigationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Basic <em>Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Basic
	 * @generated
	 */
	public Adapter createBasicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.ListItem <em>List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.ListItem
	 * @generated
	 */
	public Adapter createListItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.UnOrderedList <em>Un Ordered List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.UnOrderedList
	 * @generated
	 */
	public Adapter createUnOrderedListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.AlertLink <em>Alert Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.AlertLink
	 * @generated
	 */
	public Adapter createAlertLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.ListElement <em>List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.ListElement
	 * @generated
	 */
	public Adapter createListElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.BorderProperty <em>Border Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.BorderProperty
	 * @generated
	 */
	public Adapter createBorderPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Border <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Border
	 * @generated
	 */
	public Adapter createBorderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.TableCell <em>Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.TableCell
	 * @generated
	 */
	public Adapter createTableCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Title
	 * @generated
	 */
	public Adapter createTitleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.ListItemElement <em>List Item Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.ListItemElement
	 * @generated
	 */
	public Adapter createListItemElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Emphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Emphasis
	 * @generated
	 */
	public Adapter createEmphasisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Display4 <em>Display4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Display4
	 * @generated
	 */
	public Adapter createDisplay4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.CompositeTextElement <em>Composite Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.CompositeTextElement
	 * @generated
	 */
	public Adapter createCompositeTextElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.TextNested <em>Text Nested</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.TextNested
	 * @generated
	 */
	public Adapter createTextNestedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Thead <em>Thead</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Thead
	 * @generated
	 */
	public Adapter createTheadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.OrderList <em>Order List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.OrderList
	 * @generated
	 */
	public Adapter createOrderListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.TextElements <em>Text Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.TextElements
	 * @generated
	 */
	public Adapter createTextElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.UrlBasedLink <em>Url Based Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.UrlBasedLink
	 * @generated
	 */
	public Adapter createUrlBasedLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.MargesProperty <em>Marges Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.MargesProperty
	 * @generated
	 */
	public Adapter createMargesPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.BasicList <em>Basic List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.BasicList
	 * @generated
	 */
	public Adapter createBasicListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.AlertStyle <em>Alert Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.AlertStyle
	 * @generated
	 */
	public Adapter createAlertStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Centered <em>Centered</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Centered
	 * @generated
	 */
	public Adapter createCenteredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.ButtonLink <em>Button Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.ButtonLink
	 * @generated
	 */
	public Adapter createButtonLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Brand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Brand
	 * @generated
	 */
	public Adapter createBrandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Display1 <em>Display1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Display1
	 * @generated
	 */
	public Adapter createDisplay1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.TableRow
	 * @generated
	 */
	public Adapter createTableRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.NavBarProperty <em>Nav Bar Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.NavBarProperty
	 * @generated
	 */
	public Adapter createNavBarPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Padding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Padding
	 * @generated
	 */
	public Adapter createPaddingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.Margin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.Margin
	 * @generated
	 */
	public Adapter createMarginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.ColoredBorder <em>Colored Border</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.ColoredBorder
	 * @generated
	 */
	public Adapter createColoredBorderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.ButtonState <em>Button State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.ButtonState
	 * @generated
	 */
	public Adapter createButtonStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.TextContainable <em>Text Containable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.TextContainable
	 * @generated
	 */
	public Adapter createTextContainableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.LinkProperty <em>Link Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.LinkProperty
	 * @generated
	 */
	public Adapter createLinkPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.FixContainer <em>Fix Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.FixContainer
	 * @generated
	 */
	public Adapter createFixContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.PageContent <em>Page Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.PageContent
	 * @generated
	 */
	public Adapter createPageContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.ButtonStyle <em>Button Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.ButtonStyle
	 * @generated
	 */
	public Adapter createButtonStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bootstrap.TableSection <em>Table Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bootstrap.TableSection
	 * @generated
	 */
	public Adapter createTableSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BootstrapAdapterFactory
