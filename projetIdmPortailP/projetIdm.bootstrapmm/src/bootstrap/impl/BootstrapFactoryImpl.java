/**
 */
package bootstrap.impl;

import bootstrap.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BootstrapFactoryImpl extends EFactoryImpl implements BootstrapFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BootstrapFactory init() {
		try {
			BootstrapFactory theBootstrapFactory = (BootstrapFactory)EPackage.Registry.INSTANCE.getEFactory(BootstrapPackage.eNS_URI);
			if (theBootstrapFactory != null) {
				return theBootstrapFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BootstrapFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BootstrapFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BootstrapPackage.ITALIC: return createItalic();
			case BootstrapPackage.BACKGROUND: return createBackground();
			case BootstrapPackage.TEXT: return createText();
			case BootstrapPackage.HORIZONTAL_LINE: return createHorizontalLine();
			case BootstrapPackage.HORIZONTAL_LIST: return createHorizontalList();
			case BootstrapPackage.DISABLED: return createDisabled();
			case BootstrapPackage.BADGE_STYLE: return createBadgeStyle();
			case BootstrapPackage.DISPLAY2: return createDisplay2();
			case BootstrapPackage.PAGE: return createPage();
			case BootstrapPackage.FLUID_CONTAINER: return createFluidContainer();
			case BootstrapPackage.STRONG: return createStrong();
			case BootstrapPackage.DISPLAY3: return createDisplay3();
			case BootstrapPackage.BUTTON_SIZE: return createButtonSize();
			case BootstrapPackage.VERTICAL: return createVertical();
			case BootstrapPackage.LINK: return createLink();
			case BootstrapPackage.PARAGRAPHE: return createParagraphe();
			case BootstrapPackage.IMAGE: return createImage();
			case BootstrapPackage.LINK_BRAND: return createLinkBrand();
			case BootstrapPackage.ALERT_ANIMATED: return createAlertAnimated();
			case BootstrapPackage.ACTIVE: return createActive();
			case BootstrapPackage.TBODY: return createTbody();
			case BootstrapPackage.TFOOT: return createTfoot();
			case BootstrapPackage.TABLE: return createTable();
			case BootstrapPackage.BADGE_PILL: return createBadgePill();
			case BootstrapPackage.NAVIGATION: return createNavigation();
			case BootstrapPackage.BASIC: return createBasic();
			case BootstrapPackage.LIST_ITEM: return createListItem();
			case BootstrapPackage.UN_ORDERED_LIST: return createUnOrderedList();
			case BootstrapPackage.ALERT_LINK: return createAlertLink();
			case BootstrapPackage.BORDER: return createBorder();
			case BootstrapPackage.BUTTON: return createButton();
			case BootstrapPackage.TABLE_CELL: return createTableCell();
			case BootstrapPackage.TITLE: return createTitle();
			case BootstrapPackage.DISPLAY4: return createDisplay4();
			case BootstrapPackage.THEAD: return createThead();
			case BootstrapPackage.ORDER_LIST: return createOrderList();
			case BootstrapPackage.BASIC_LIST: return createBasicList();
			case BootstrapPackage.ALERT_STYLE: return createAlertStyle();
			case BootstrapPackage.CENTERED: return createCentered();
			case BootstrapPackage.BUTTON_LINK: return createButtonLink();
			case BootstrapPackage.BRAND: return createBrand();
			case BootstrapPackage.DISPLAY1: return createDisplay1();
			case BootstrapPackage.TABLE_ROW: return createTableRow();
			case BootstrapPackage.PADDING: return createPadding();
			case BootstrapPackage.MARGIN: return createMargin();
			case BootstrapPackage.COLORED_BORDER: return createColoredBorder();
			case BootstrapPackage.FIX_CONTAINER: return createFixContainer();
			case BootstrapPackage.BUTTON_STYLE: return createButtonStyle();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BootstrapPackage.SIZE:
				return createSizeFromString(eDataType, initialValue);
			case BootstrapPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case BootstrapPackage.ALIGNEMENT:
				return createAlignementFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BootstrapPackage.SIZE:
				return convertSizeToString(eDataType, instanceValue);
			case BootstrapPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case BootstrapPackage.ALIGNEMENT:
				return convertAlignementToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Italic createItalic() {
		ItalicImpl italic = new ItalicImpl();
		return italic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Background createBackground() {
		BackgroundImpl background = new BackgroundImpl();
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalLine createHorizontalLine() {
		HorizontalLineImpl horizontalLine = new HorizontalLineImpl();
		return horizontalLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalList createHorizontalList() {
		HorizontalListImpl horizontalList = new HorizontalListImpl();
		return horizontalList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Disabled createDisabled() {
		DisabledImpl disabled = new DisabledImpl();
		return disabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BadgeStyle createBadgeStyle() {
		BadgeStyleImpl badgeStyle = new BadgeStyleImpl();
		return badgeStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Display2 createDisplay2() {
		Display2Impl display2 = new Display2Impl();
		return display2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FluidContainer createFluidContainer() {
		FluidContainerImpl fluidContainer = new FluidContainerImpl();
		return fluidContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strong createStrong() {
		StrongImpl strong = new StrongImpl();
		return strong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Display3 createDisplay3() {
		Display3Impl display3 = new Display3Impl();
		return display3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonSize createButtonSize() {
		ButtonSizeImpl buttonSize = new ButtonSizeImpl();
		return buttonSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertical createVertical() {
		VerticalImpl vertical = new VerticalImpl();
		return vertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraphe createParagraphe() {
		ParagrapheImpl paragraphe = new ParagrapheImpl();
		return paragraphe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkBrand createLinkBrand() {
		LinkBrandImpl linkBrand = new LinkBrandImpl();
		return linkBrand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertAnimated createAlertAnimated() {
		AlertAnimatedImpl alertAnimated = new AlertAnimatedImpl();
		return alertAnimated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Active createActive() {
		ActiveImpl active = new ActiveImpl();
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tbody createTbody() {
		TbodyImpl tbody = new TbodyImpl();
		return tbody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tfoot createTfoot() {
		TfootImpl tfoot = new TfootImpl();
		return tfoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BadgePill createBadgePill() {
		BadgePillImpl badgePill = new BadgePillImpl();
		return badgePill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Navigation createNavigation() {
		NavigationImpl navigation = new NavigationImpl();
		return navigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basic createBasic() {
		BasicImpl basic = new BasicImpl();
		return basic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListItem createListItem() {
		ListItemImpl listItem = new ListItemImpl();
		return listItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnOrderedList createUnOrderedList() {
		UnOrderedListImpl unOrderedList = new UnOrderedListImpl();
		return unOrderedList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertLink createAlertLink() {
		AlertLinkImpl alertLink = new AlertLinkImpl();
		return alertLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Border createBorder() {
		BorderImpl border = new BorderImpl();
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableCell createTableCell() {
		TableCellImpl tableCell = new TableCellImpl();
		return tableCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Title createTitle() {
		TitleImpl title = new TitleImpl();
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Display4 createDisplay4() {
		Display4Impl display4 = new Display4Impl();
		return display4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thead createThead() {
		TheadImpl thead = new TheadImpl();
		return thead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderList createOrderList() {
		OrderListImpl orderList = new OrderListImpl();
		return orderList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicList createBasicList() {
		BasicListImpl basicList = new BasicListImpl();
		return basicList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertStyle createAlertStyle() {
		AlertStyleImpl alertStyle = new AlertStyleImpl();
		return alertStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Centered createCentered() {
		CenteredImpl centered = new CenteredImpl();
		return centered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonLink createButtonLink() {
		ButtonLinkImpl buttonLink = new ButtonLinkImpl();
		return buttonLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Brand createBrand() {
		BrandImpl brand = new BrandImpl();
		return brand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Display1 createDisplay1() {
		Display1Impl display1 = new Display1Impl();
		return display1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableRow createTableRow() {
		TableRowImpl tableRow = new TableRowImpl();
		return tableRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Padding createPadding() {
		PaddingImpl padding = new PaddingImpl();
		return padding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Margin createMargin() {
		MarginImpl margin = new MarginImpl();
		return margin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColoredBorder createColoredBorder() {
		ColoredBorderImpl coloredBorder = new ColoredBorderImpl();
		return coloredBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixContainer createFixContainer() {
		FixContainerImpl fixContainer = new FixContainerImpl();
		return fixContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonStyle createButtonStyle() {
		ButtonStyleImpl buttonStyle = new ButtonStyleImpl();
		return buttonStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size createSizeFromString(EDataType eDataType, String initialValue) {
		Size result = Size.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSizeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColorFromString(EDataType eDataType, String initialValue) {
		Color result = Color.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alignement createAlignementFromString(EDataType eDataType, String initialValue) {
		Alignement result = Alignement.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BootstrapPackage getBootstrapPackage() {
		return (BootstrapPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BootstrapPackage getPackage() {
		return BootstrapPackage.eINSTANCE;
	}

} //BootstrapFactoryImpl
