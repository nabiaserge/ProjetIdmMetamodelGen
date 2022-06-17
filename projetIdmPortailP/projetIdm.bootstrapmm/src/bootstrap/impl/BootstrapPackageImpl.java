/**
 */
package bootstrap.impl;

import bootstrap.Active;
import bootstrap.AlertAnimated;
import bootstrap.AlertLink;
import bootstrap.AlertProperty;
import bootstrap.AlertStyle;
import bootstrap.Alignement;
import bootstrap.Background;
import bootstrap.BadgePill;
import bootstrap.BadgeProperty;
import bootstrap.BadgeStyle;
import bootstrap.Basic;
import bootstrap.BasicList;
import bootstrap.BootstrapFactory;
import bootstrap.BootstrapPackage;
import bootstrap.Border;
import bootstrap.BorderProperty;
import bootstrap.Brand;
import bootstrap.Button;
import bootstrap.ButtonLink;
import bootstrap.ButtonProperty;
import bootstrap.ButtonSize;
import bootstrap.ButtonState;
import bootstrap.ButtonStyle;
import bootstrap.Centered;
import bootstrap.Color;
import bootstrap.ColoredBorder;
import bootstrap.CompositeTextElement;
import bootstrap.ContainableTextElement;
import bootstrap.Disabled;
import bootstrap.Display1;
import bootstrap.Display2;
import bootstrap.Display3;
import bootstrap.Display4;
import bootstrap.DisplayProperty;
import bootstrap.Emphasis;
import bootstrap.FixContainer;
import bootstrap.FluidContainer;
import bootstrap.General;
import bootstrap.HorizontalLine;
import bootstrap.HorizontalList;
import bootstrap.Image;
import bootstrap.Italic;
import bootstrap.Link;
import bootstrap.LinkBrand;
import bootstrap.LinkProperty;
import bootstrap.ListElement;
import bootstrap.ListItem;
import bootstrap.ListItemElement;
import bootstrap.ListProperty;
import bootstrap.MargesProperty;
import bootstrap.Margin;
import bootstrap.NavBarProperty;
import bootstrap.Navigation;
import bootstrap.OrderList;
import bootstrap.Padding;
import bootstrap.Page;
import bootstrap.PageContent;
import bootstrap.Paragraphe;
import bootstrap.PropertyClass;
import bootstrap.Size;
import bootstrap.Strong;
import bootstrap.Table;
import bootstrap.TableCell;
import bootstrap.TableRow;
import bootstrap.TableSection;
import bootstrap.Tbody;
import bootstrap.Text;
import bootstrap.TextContainable;
import bootstrap.TextContainer;
import bootstrap.TextElements;
import bootstrap.TextNested;
import bootstrap.TextPageContent;
import bootstrap.Tfoot;
import bootstrap.Thead;
import bootstrap.Title;
import bootstrap.UnOrderedList;
import bootstrap.UrlBasedLink;
import bootstrap.Vertical;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BootstrapPackageImpl extends EPackageImpl implements BootstrapPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass italicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backgroundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass horizontalLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass horizontalListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disabledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containableTextElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass badgeStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass display2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass badgePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alertPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fluidContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass display3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verticalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paragrapheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textPageContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkBrandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alertAnimatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tbodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tfootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass badgePillEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unOrderedListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alertLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass borderPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass borderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listItemElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emphasisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass display4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeTextElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textNestedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass theadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlBasedLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass margesPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alertStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass centeredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass display1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navBarPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paddingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass marginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coloredBorderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textContainableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sizeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alignementEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see bootstrap.BootstrapPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BootstrapPackageImpl() {
		super(eNS_URI, BootstrapFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BootstrapPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BootstrapPackage init() {
		if (isInited) return (BootstrapPackage)EPackage.Registry.INSTANCE.getEPackage(BootstrapPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBootstrapPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BootstrapPackageImpl theBootstrapPackage = registeredBootstrapPackage instanceof BootstrapPackageImpl ? (BootstrapPackageImpl)registeredBootstrapPackage : new BootstrapPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theBootstrapPackage.createPackageContents();

		// Initialize created meta-data
		theBootstrapPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBootstrapPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BootstrapPackage.eNS_URI, theBootstrapPackage);
		return theBootstrapPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItalic() {
		return italicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBackground() {
		return backgroundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackground_Color() {
		return (EAttribute)backgroundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Text() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHorizontalLine() {
		return horizontalLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHorizontalList() {
		return horizontalListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisabled() {
		return disabledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainableTextElement() {
		return containableTextElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBadgeStyle() {
		return badgeStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBadgeStyle_Color() {
		return (EAttribute)badgeStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplay2() {
		return display2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_Name() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Pagecontents() {
		return (EReference)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBadgeProperty() {
		return badgePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlertProperty() {
		return alertPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFluidContainer() {
		return fluidContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListProperty() {
		return listPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneral() {
		return generalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrong() {
		return strongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Pagecontents() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplay3() {
		return display3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonSize() {
		return buttonSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonSize_Size() {
		return (EAttribute)buttonSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplayProperty() {
		return displayPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVertical() {
		return verticalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Linkproperties() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Buttonproperties() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Badgeproperties() {
		return (EReference)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParagraphe() {
		return paragrapheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextPageContent() {
		return textPageContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkBrand() {
		return linkBrandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlertAnimated() {
		return alertAnimatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActive() {
		return activeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyClass() {
		return propertyClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTbody() {
		return tbodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTfoot() {
		return tfootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonProperty() {
		return buttonPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Tablesections() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextContainer() {
		return textContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextContainer_Textelements() {
		return (EReference)textContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextContainer_Color() {
		return (EAttribute)textContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextContainer_Emphasis() {
		return (EReference)textContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBadgePill() {
		return badgePillEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigation() {
		return navigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigation_Listelement() {
		return (EReference)navigationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigation_Navbar() {
		return (EReference)navigationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigation_Links() {
		return (EReference)navigationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasic() {
		return basicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListItem() {
		return listItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListItem_Listitemelements() {
		return (EReference)listItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListItem_Active() {
		return (EAttribute)listItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnOrderedList() {
		return unOrderedListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlertLink() {
		return alertLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListElement() {
		return listElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListElement_Listitems() {
		return (EReference)listElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListElement_Listproperty() {
		return (EReference)listElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBorderProperty() {
		return borderPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBorder() {
		return borderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getButton_Buttonproperties() {
		return (EReference)buttonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableCell() {
		return tableCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableCell_Alignment() {
		return (EAttribute)tableCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableCell_Span() {
		return (EAttribute)tableCellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTitle() {
		return titleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitle_Level() {
		return (EAttribute)titleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTitle_Displayproperties() {
		return (EReference)titleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListItemElement() {
		return listItemElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmphasis() {
		return emphasisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplay4() {
		return display4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeTextElement() {
		return compositeTextElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextNested() {
		return textNestedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThead() {
		return theadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderList() {
		return orderListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextElements() {
		return textElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUrlBasedLink() {
		return urlBasedLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlBasedLink_Url() {
		return (EAttribute)urlBasedLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlBasedLink_Title() {
		return (EAttribute)urlBasedLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMargesProperty() {
		return margesPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMargesProperty_Level() {
		return (EAttribute)margesPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMargesProperty_Alignement() {
		return (EAttribute)margesPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicList() {
		return basicListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlertStyle() {
		return alertStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlertStyle_Color() {
		return (EAttribute)alertStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCentered() {
		return centeredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonLink() {
		return buttonLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrand() {
		return brandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplay1() {
		return display1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableRow() {
		return tableRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableRow_Tablecells() {
		return (EReference)tableRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableRow_Generals() {
		return (EReference)tableRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavBarProperty() {
		return navBarPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPadding() {
		return paddingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMargin() {
		return marginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColoredBorder() {
		return coloredBorderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColoredBorder_Color() {
		return (EAttribute)coloredBorderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonState() {
		return buttonStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextContainable() {
		return textContainableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkProperty() {
		return linkPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixContainer() {
		return fixContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageContent() {
		return pageContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageContent_GeneralProperties() {
		return (EReference)pageContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonStyle() {
		return buttonStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonStyle_Color() {
		return (EAttribute)buttonStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableSection() {
		return tableSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableSection_Tablerows() {
		return (EReference)tableSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableSection_Generals() {
		return (EReference)tableSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSize() {
		return sizeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColor() {
		return colorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAlignement() {
		return alignementEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BootstrapFactory getBootstrapFactory() {
		return (BootstrapFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		italicEClass = createEClass(ITALIC);

		backgroundEClass = createEClass(BACKGROUND);
		createEAttribute(backgroundEClass, BACKGROUND__COLOR);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__TEXT);

		horizontalLineEClass = createEClass(HORIZONTAL_LINE);

		horizontalListEClass = createEClass(HORIZONTAL_LIST);

		disabledEClass = createEClass(DISABLED);

		containableTextElementEClass = createEClass(CONTAINABLE_TEXT_ELEMENT);

		badgeStyleEClass = createEClass(BADGE_STYLE);
		createEAttribute(badgeStyleEClass, BADGE_STYLE__COLOR);

		display2EClass = createEClass(DISPLAY2);

		pageEClass = createEClass(PAGE);
		createEAttribute(pageEClass, PAGE__NAME);
		createEReference(pageEClass, PAGE__PAGECONTENTS);

		badgePropertyEClass = createEClass(BADGE_PROPERTY);

		alertPropertyEClass = createEClass(ALERT_PROPERTY);

		fluidContainerEClass = createEClass(FLUID_CONTAINER);

		listPropertyEClass = createEClass(LIST_PROPERTY);

		generalEClass = createEClass(GENERAL);

		strongEClass = createEClass(STRONG);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__PAGECONTENTS);

		display3EClass = createEClass(DISPLAY3);

		buttonSizeEClass = createEClass(BUTTON_SIZE);
		createEAttribute(buttonSizeEClass, BUTTON_SIZE__SIZE);

		displayPropertyEClass = createEClass(DISPLAY_PROPERTY);

		verticalEClass = createEClass(VERTICAL);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__LINKPROPERTIES);
		createEReference(linkEClass, LINK__BUTTONPROPERTIES);
		createEReference(linkEClass, LINK__BADGEPROPERTIES);

		paragrapheEClass = createEClass(PARAGRAPHE);

		imageEClass = createEClass(IMAGE);

		textPageContentEClass = createEClass(TEXT_PAGE_CONTENT);

		linkBrandEClass = createEClass(LINK_BRAND);

		alertAnimatedEClass = createEClass(ALERT_ANIMATED);

		activeEClass = createEClass(ACTIVE);

		propertyClassEClass = createEClass(PROPERTY_CLASS);

		tbodyEClass = createEClass(TBODY);

		tfootEClass = createEClass(TFOOT);

		buttonPropertyEClass = createEClass(BUTTON_PROPERTY);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__TABLESECTIONS);

		textContainerEClass = createEClass(TEXT_CONTAINER);
		createEReference(textContainerEClass, TEXT_CONTAINER__TEXTELEMENTS);
		createEAttribute(textContainerEClass, TEXT_CONTAINER__COLOR);
		createEReference(textContainerEClass, TEXT_CONTAINER__EMPHASIS);

		badgePillEClass = createEClass(BADGE_PILL);

		navigationEClass = createEClass(NAVIGATION);
		createEReference(navigationEClass, NAVIGATION__LISTELEMENT);
		createEReference(navigationEClass, NAVIGATION__NAVBAR);
		createEReference(navigationEClass, NAVIGATION__LINKS);

		basicEClass = createEClass(BASIC);

		listItemEClass = createEClass(LIST_ITEM);
		createEReference(listItemEClass, LIST_ITEM__LISTITEMELEMENTS);
		createEAttribute(listItemEClass, LIST_ITEM__ACTIVE);

		unOrderedListEClass = createEClass(UN_ORDERED_LIST);

		alertLinkEClass = createEClass(ALERT_LINK);

		listElementEClass = createEClass(LIST_ELEMENT);
		createEReference(listElementEClass, LIST_ELEMENT__LISTITEMS);
		createEReference(listElementEClass, LIST_ELEMENT__LISTPROPERTY);

		borderPropertyEClass = createEClass(BORDER_PROPERTY);

		borderEClass = createEClass(BORDER);

		buttonEClass = createEClass(BUTTON);
		createEReference(buttonEClass, BUTTON__BUTTONPROPERTIES);

		tableCellEClass = createEClass(TABLE_CELL);
		createEAttribute(tableCellEClass, TABLE_CELL__ALIGNMENT);
		createEAttribute(tableCellEClass, TABLE_CELL__SPAN);

		titleEClass = createEClass(TITLE);
		createEAttribute(titleEClass, TITLE__LEVEL);
		createEReference(titleEClass, TITLE__DISPLAYPROPERTIES);

		listItemElementEClass = createEClass(LIST_ITEM_ELEMENT);

		emphasisEClass = createEClass(EMPHASIS);

		display4EClass = createEClass(DISPLAY4);

		compositeTextElementEClass = createEClass(COMPOSITE_TEXT_ELEMENT);

		textNestedEClass = createEClass(TEXT_NESTED);

		theadEClass = createEClass(THEAD);

		orderListEClass = createEClass(ORDER_LIST);

		textElementsEClass = createEClass(TEXT_ELEMENTS);

		urlBasedLinkEClass = createEClass(URL_BASED_LINK);
		createEAttribute(urlBasedLinkEClass, URL_BASED_LINK__URL);
		createEAttribute(urlBasedLinkEClass, URL_BASED_LINK__TITLE);

		margesPropertyEClass = createEClass(MARGES_PROPERTY);
		createEAttribute(margesPropertyEClass, MARGES_PROPERTY__LEVEL);
		createEAttribute(margesPropertyEClass, MARGES_PROPERTY__ALIGNEMENT);

		basicListEClass = createEClass(BASIC_LIST);

		alertStyleEClass = createEClass(ALERT_STYLE);
		createEAttribute(alertStyleEClass, ALERT_STYLE__COLOR);

		centeredEClass = createEClass(CENTERED);

		buttonLinkEClass = createEClass(BUTTON_LINK);

		brandEClass = createEClass(BRAND);

		display1EClass = createEClass(DISPLAY1);

		tableRowEClass = createEClass(TABLE_ROW);
		createEReference(tableRowEClass, TABLE_ROW__TABLECELLS);
		createEReference(tableRowEClass, TABLE_ROW__GENERALS);

		navBarPropertyEClass = createEClass(NAV_BAR_PROPERTY);

		paddingEClass = createEClass(PADDING);

		marginEClass = createEClass(MARGIN);

		coloredBorderEClass = createEClass(COLORED_BORDER);
		createEAttribute(coloredBorderEClass, COLORED_BORDER__COLOR);

		buttonStateEClass = createEClass(BUTTON_STATE);

		textContainableEClass = createEClass(TEXT_CONTAINABLE);

		linkPropertyEClass = createEClass(LINK_PROPERTY);

		fixContainerEClass = createEClass(FIX_CONTAINER);

		pageContentEClass = createEClass(PAGE_CONTENT);
		createEReference(pageContentEClass, PAGE_CONTENT__GENERAL_PROPERTIES);

		buttonStyleEClass = createEClass(BUTTON_STYLE);
		createEAttribute(buttonStyleEClass, BUTTON_STYLE__COLOR);

		tableSectionEClass = createEClass(TABLE_SECTION);
		createEReference(tableSectionEClass, TABLE_SECTION__TABLEROWS);
		createEReference(tableSectionEClass, TABLE_SECTION__GENERALS);

		// Create enums
		sizeEEnum = createEEnum(SIZE);
		colorEEnum = createEEnum(COLOR);
		alignementEEnum = createEEnum(ALIGNEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		italicEClass.getESuperTypes().add(this.getTextContainable());
		backgroundEClass.getESuperTypes().add(this.getGeneral());
		textEClass.getESuperTypes().add(this.getTextElements());
		horizontalLineEClass.getESuperTypes().add(this.getTextPageContent());
		horizontalListEClass.getESuperTypes().add(this.getListProperty());
		disabledEClass.getESuperTypes().add(this.getButtonState());
		containableTextElementEClass.getESuperTypes().add(this.getTextElements());
		containableTextElementEClass.getESuperTypes().add(this.getTextPageContent());
		badgeStyleEClass.getESuperTypes().add(this.getBadgeProperty());
		display2EClass.getESuperTypes().add(this.getDisplayProperty());
		badgePropertyEClass.getESuperTypes().add(this.getPropertyClass());
		alertPropertyEClass.getESuperTypes().add(this.getGeneral());
		fluidContainerEClass.getESuperTypes().add(this.getContainer());
		listPropertyEClass.getESuperTypes().add(this.getPropertyClass());
		generalEClass.getESuperTypes().add(this.getPropertyClass());
		strongEClass.getESuperTypes().add(this.getTextContainable());
		containerEClass.getESuperTypes().add(this.getPageContent());
		display3EClass.getESuperTypes().add(this.getDisplayProperty());
		buttonSizeEClass.getESuperTypes().add(this.getButtonProperty());
		displayPropertyEClass.getESuperTypes().add(this.getPropertyClass());
		verticalEClass.getESuperTypes().add(this.getNavBarProperty());
		linkEClass.getESuperTypes().add(this.getUrlBasedLink());
		linkEClass.getESuperTypes().add(this.getTextNested());
		paragrapheEClass.getESuperTypes().add(this.getTextContainer());
		paragrapheEClass.getESuperTypes().add(this.getListItemElement());
		imageEClass.getESuperTypes().add(this.getUrlBasedLink());
		textPageContentEClass.getESuperTypes().add(this.getPageContent());
		linkBrandEClass.getESuperTypes().add(this.getLinkProperty());
		alertAnimatedEClass.getESuperTypes().add(this.getAlertProperty());
		activeEClass.getESuperTypes().add(this.getButtonState());
		tbodyEClass.getESuperTypes().add(this.getTableSection());
		tfootEClass.getESuperTypes().add(this.getTableSection());
		buttonPropertyEClass.getESuperTypes().add(this.getPropertyClass());
		tableEClass.getESuperTypes().add(this.getTextPageContent());
		textContainerEClass.getESuperTypes().add(this.getTextPageContent());
		badgePillEClass.getESuperTypes().add(this.getBadgeProperty());
		navigationEClass.getESuperTypes().add(this.getTextPageContent());
		basicEClass.getESuperTypes().add(this.getNavBarProperty());
		unOrderedListEClass.getESuperTypes().add(this.getListElement());
		alertLinkEClass.getESuperTypes().add(this.getLinkProperty());
		listElementEClass.getESuperTypes().add(this.getTextPageContent());
		listElementEClass.getESuperTypes().add(this.getListItemElement());
		borderPropertyEClass.getESuperTypes().add(this.getGeneral());
		borderEClass.getESuperTypes().add(this.getBorderProperty());
		buttonEClass.getESuperTypes().add(this.getContainableTextElement());
		buttonEClass.getESuperTypes().add(this.getTextNested());
		tableCellEClass.getESuperTypes().add(this.getTextContainer());
		titleEClass.getESuperTypes().add(this.getTextContainer());
		emphasisEClass.getESuperTypes().add(this.getPropertyClass());
		display4EClass.getESuperTypes().add(this.getDisplayProperty());
		compositeTextElementEClass.getESuperTypes().add(this.getContainableTextElement());
		theadEClass.getESuperTypes().add(this.getTableSection());
		orderListEClass.getESuperTypes().add(this.getListElement());
		textElementsEClass.getESuperTypes().add(this.getListItemElement());
		urlBasedLinkEClass.getESuperTypes().add(this.getCompositeTextElement());
		margesPropertyEClass.getESuperTypes().add(this.getGeneral());
		basicListEClass.getESuperTypes().add(this.getListProperty());
		alertStyleEClass.getESuperTypes().add(this.getAlertProperty());
		centeredEClass.getESuperTypes().add(this.getNavBarProperty());
		buttonLinkEClass.getESuperTypes().add(this.getButtonStyle());
		brandEClass.getESuperTypes().add(this.getNavBarProperty());
		display1EClass.getESuperTypes().add(this.getDisplayProperty());
		navBarPropertyEClass.getESuperTypes().add(this.getPropertyClass());
		paddingEClass.getESuperTypes().add(this.getMargesProperty());
		marginEClass.getESuperTypes().add(this.getMargesProperty());
		coloredBorderEClass.getESuperTypes().add(this.getBorderProperty());
		buttonStateEClass.getESuperTypes().add(this.getButtonProperty());
		textContainableEClass.getESuperTypes().add(this.getContainableTextElement());
		textContainableEClass.getESuperTypes().add(this.getTextNested());
		linkPropertyEClass.getESuperTypes().add(this.getPropertyClass());
		fixContainerEClass.getESuperTypes().add(this.getContainer());
		buttonStyleEClass.getESuperTypes().add(this.getButtonProperty());

		// Initialize classes, features, and operations; add parameters
		initEClass(italicEClass, Italic.class, "Italic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(backgroundEClass, Background.class, "Background", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBackground_Color(), ecorePackage.getEString(), "color", "WHITE", 0, 1, Background.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Text(), ecorePackage.getEString(), "text", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(horizontalLineEClass, HorizontalLine.class, "HorizontalLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(horizontalListEClass, HorizontalList.class, "HorizontalList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(disabledEClass, Disabled.class, "Disabled", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containableTextElementEClass, ContainableTextElement.class, "ContainableTextElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(badgeStyleEClass, BadgeStyle.class, "BadgeStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBadgeStyle_Color(), this.getColor(), "color", "LIGHT", 0, 1, BadgeStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(display2EClass, Display2.class, "Display2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Pagecontents(), this.getPageContent(), null, "pagecontents", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(badgePropertyEClass, BadgeProperty.class, "BadgeProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alertPropertyEClass, AlertProperty.class, "AlertProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fluidContainerEClass, FluidContainer.class, "FluidContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listPropertyEClass, ListProperty.class, "ListProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(generalEClass, General.class, "General", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strongEClass, Strong.class, "Strong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containerEClass, bootstrap.Container.class, "Container", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Pagecontents(), this.getPageContent(), null, "pagecontents", null, 0, -1, bootstrap.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(display3EClass, Display3.class, "Display3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonSizeEClass, ButtonSize.class, "ButtonSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButtonSize_Size(), this.getSize(), "size", null, 0, 1, ButtonSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displayPropertyEClass, DisplayProperty.class, "DisplayProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(verticalEClass, Vertical.class, "Vertical", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_Linkproperties(), this.getLinkProperty(), null, "linkproperties", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Buttonproperties(), this.getButtonProperty(), null, "buttonproperties", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Badgeproperties(), this.getBadgeProperty(), null, "badgeproperties", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paragrapheEClass, Paragraphe.class, "Paragraphe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textPageContentEClass, TextPageContent.class, "TextPageContent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkBrandEClass, LinkBrand.class, "LinkBrand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alertAnimatedEClass, AlertAnimated.class, "AlertAnimated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activeEClass, Active.class, "Active", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyClassEClass, PropertyClass.class, "PropertyClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tbodyEClass, Tbody.class, "Tbody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tfootEClass, Tfoot.class, "Tfoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonPropertyEClass, ButtonProperty.class, "ButtonProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_Tablesections(), this.getTableSection(), null, "tablesections", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textContainerEClass, TextContainer.class, "TextContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextContainer_Textelements(), this.getTextElements(), null, "textelements", null, 0, -1, TextContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextContainer_Color(), ecorePackage.getEString(), "color", null, 0, 1, TextContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextContainer_Emphasis(), this.getEmphasis(), null, "emphasis", null, 0, -1, TextContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(badgePillEClass, BadgePill.class, "BadgePill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigationEClass, Navigation.class, "Navigation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNavigation_Listelement(), this.getListElement(), null, "listelement", null, 0, -1, Navigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNavigation_Navbar(), this.getNavBarProperty(), null, "navbar", null, 0, -1, Navigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNavigation_Links(), this.getLink(), null, "links", null, 0, -1, Navigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicEClass, Basic.class, "Basic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listItemEClass, ListItem.class, "ListItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListItem_Listitemelements(), this.getListItemElement(), null, "listitemelements", null, 0, -1, ListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListItem_Active(), ecorePackage.getEBoolean(), "active", null, 0, 1, ListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unOrderedListEClass, UnOrderedList.class, "UnOrderedList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alertLinkEClass, AlertLink.class, "AlertLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listElementEClass, ListElement.class, "ListElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListElement_Listitems(), this.getListItem(), null, "listitems", null, 0, -1, ListElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListElement_Listproperty(), this.getListProperty(), null, "listproperty", null, 0, -1, ListElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(borderPropertyEClass, BorderProperty.class, "BorderProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(borderEClass, Border.class, "Border", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getButton_Buttonproperties(), this.getButtonProperty(), null, "buttonproperties", null, 0, -1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableCellEClass, TableCell.class, "TableCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableCell_Alignment(), this.getAlignement(), "alignment", null, 0, 1, TableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableCell_Span(), ecorePackage.getEString(), "span", null, 0, 1, TableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(titleEClass, Title.class, "Title", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTitle_Level(), ecorePackage.getEInt(), "level", null, 0, 1, Title.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTitle_Displayproperties(), this.getDisplayProperty(), null, "displayproperties", null, 0, -1, Title.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listItemElementEClass, ListItemElement.class, "ListItemElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emphasisEClass, Emphasis.class, "Emphasis", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(display4EClass, Display4.class, "Display4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeTextElementEClass, CompositeTextElement.class, "CompositeTextElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textNestedEClass, TextNested.class, "TextNested", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(theadEClass, Thead.class, "Thead", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orderListEClass, OrderList.class, "OrderList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textElementsEClass, TextElements.class, "TextElements", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(urlBasedLinkEClass, UrlBasedLink.class, "UrlBasedLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUrlBasedLink_Url(), ecorePackage.getEString(), "url", null, 0, 1, UrlBasedLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUrlBasedLink_Title(), ecorePackage.getEString(), "title", null, 0, 1, UrlBasedLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(margesPropertyEClass, MargesProperty.class, "MargesProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMargesProperty_Level(), ecorePackage.getEInt(), "level", null, 0, 1, MargesProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMargesProperty_Alignement(), this.getAlignement(), "alignement", null, 0, 1, MargesProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicListEClass, BasicList.class, "BasicList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alertStyleEClass, AlertStyle.class, "AlertStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlertStyle_Color(), this.getColor(), "color", "LIGHT", 0, 1, AlertStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(centeredEClass, Centered.class, "Centered", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonLinkEClass, ButtonLink.class, "ButtonLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(brandEClass, Brand.class, "Brand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(display1EClass, Display1.class, "Display1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableRowEClass, TableRow.class, "TableRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableRow_Tablecells(), this.getTableCell(), null, "tablecells", null, 0, -1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableRow_Generals(), this.getGeneral(), null, "generals", null, 0, -1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navBarPropertyEClass, NavBarProperty.class, "NavBarProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paddingEClass, Padding.class, "Padding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(marginEClass, Margin.class, "Margin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coloredBorderEClass, ColoredBorder.class, "ColoredBorder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColoredBorder_Color(), this.getColor(), "color", null, 0, 1, ColoredBorder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonStateEClass, ButtonState.class, "ButtonState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textContainableEClass, TextContainable.class, "TextContainable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkPropertyEClass, LinkProperty.class, "LinkProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fixContainerEClass, FixContainer.class, "FixContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pageContentEClass, PageContent.class, "PageContent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPageContent_GeneralProperties(), this.getGeneral(), null, "generalProperties", null, 0, -1, PageContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonStyleEClass, ButtonStyle.class, "ButtonStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButtonStyle_Color(), this.getColor(), "color", "LIGHT", 0, 1, ButtonStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableSectionEClass, TableSection.class, "TableSection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableSection_Tablerows(), this.getTableRow(), null, "tablerows", null, 0, -1, TableSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableSection_Generals(), this.getGeneral(), null, "generals", null, 0, -1, TableSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(sizeEEnum, Size.class, "Size");
		addEEnumLiteral(sizeEEnum, Size.DEFAULT);
		addEEnumLiteral(sizeEEnum, Size.SMALL);
		addEEnumLiteral(sizeEEnum, Size.LARGE);

		initEEnum(colorEEnum, Color.class, "Color");
		addEEnumLiteral(colorEEnum, Color.DARK);
		addEEnumLiteral(colorEEnum, Color.PRIMARY);
		addEEnumLiteral(colorEEnum, Color.SECONDARY);
		addEEnumLiteral(colorEEnum, Color.SUCCESS);
		addEEnumLiteral(colorEEnum, Color.INFO);
		addEEnumLiteral(colorEEnum, Color.WHITE);
		addEEnumLiteral(colorEEnum, Color.WARNING);
		addEEnumLiteral(colorEEnum, Color.DANGER);
		addEEnumLiteral(colorEEnum, Color.LIGHT);

		initEEnum(alignementEEnum, Alignement.class, "Alignement");
		addEEnumLiteral(alignementEEnum, Alignement.CENTER);
		addEEnumLiteral(alignementEEnum, Alignement.TOP);
		addEEnumLiteral(alignementEEnum, Alignement.BOTTOM);
		addEEnumLiteral(alignementEEnum, Alignement.LEFT);
		addEEnumLiteral(alignementEEnum, Alignement.RIGHT);

		// Create resource
		createResource(eNS_URI);
	}

} //BootstrapPackageImpl
