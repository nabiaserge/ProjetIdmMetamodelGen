/**
 */
package bootstrap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bootstrap.BootstrapFactory
 * @model kind="package"
 * @generated
 */
public interface BootstrapPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bootstrap";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/bootstrap";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bootstrap";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BootstrapPackage eINSTANCE = bootstrap.impl.BootstrapPackageImpl.init();

	/**
	 * The meta object id for the '{@link bootstrap.ListItemElement <em>List Item Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.ListItemElement
	 * @see bootstrap.impl.BootstrapPackageImpl#getListItemElement()
	 * @generated
	 */
	int LIST_ITEM_ELEMENT = 46;

	/**
	 * The number of structural features of the '<em>List Item Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>List Item Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bootstrap.TextElements <em>Text Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.TextElements
	 * @see bootstrap.impl.BootstrapPackageImpl#getTextElements()
	 * @generated
	 */
	int TEXT_ELEMENTS = 53;

	/**
	 * The number of structural features of the '<em>Text Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENTS_FEATURE_COUNT = LIST_ITEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENTS_OPERATION_COUNT = LIST_ITEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.ContainableTextElementImpl <em>Containable Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.ContainableTextElementImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getContainableTextElement()
	 * @generated
	 */
	int CONTAINABLE_TEXT_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_TEXT_ELEMENT__GENERAL_PROPERTIES = TEXT_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Containable Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_TEXT_ELEMENT_FEATURE_COUNT = TEXT_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Containable Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_TEXT_ELEMENT_OPERATION_COUNT = TEXT_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.TextContainableImpl <em>Text Containable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.TextContainableImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getTextContainable()
	 * @generated
	 */
	int TEXT_CONTAINABLE = 68;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINABLE__GENERAL_PROPERTIES = CONTAINABLE_TEXT_ELEMENT__GENERAL_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Text Containable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINABLE_FEATURE_COUNT = CONTAINABLE_TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Containable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINABLE_OPERATION_COUNT = CONTAINABLE_TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.ItalicImpl <em>Italic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.ItalicImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getItalic()
	 * @generated
	 */
	int ITALIC = 0;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC__GENERAL_PROPERTIES = TEXT_CONTAINABLE__GENERAL_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Italic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_FEATURE_COUNT = TEXT_CONTAINABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Italic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_OPERATION_COUNT = TEXT_CONTAINABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.PropertyClassImpl <em>Property Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.PropertyClassImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getPropertyClass()
	 * @generated
	 */
	int PROPERTY_CLASS = 28;

	/**
	 * The number of structural features of the '<em>Property Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CLASS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Property Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.GeneralImpl <em>General</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.GeneralImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getGeneral()
	 * @generated
	 */
	int GENERAL = 14;

	/**
	 * The number of structural features of the '<em>General</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_FEATURE_COUNT = PROPERTY_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>General</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_OPERATION_COUNT = PROPERTY_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.BackgroundImpl <em>Background</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.BackgroundImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getBackground()
	 * @generated
	 */
	int BACKGROUND = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__COLOR = GENERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Background</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_FEATURE_COUNT = GENERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Background</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_OPERATION_COUNT = GENERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.TextImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT = TEXT_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = TEXT_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = TEXT_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.PageContentImpl <em>Page Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.PageContentImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getPageContent()
	 * @generated
	 */
	int PAGE_CONTENT = 71;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTENT__GENERAL_PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Page Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Page Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.TextPageContentImpl <em>Text Page Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.TextPageContentImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getTextPageContent()
	 * @generated
	 */
	int TEXT_PAGE_CONTENT = 24;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PAGE_CONTENT__GENERAL_PROPERTIES = PAGE_CONTENT__GENERAL_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Text Page Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PAGE_CONTENT_FEATURE_COUNT = PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Page Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PAGE_CONTENT_OPERATION_COUNT = PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.HorizontalLineImpl <em>Horizontal Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.HorizontalLineImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getHorizontalLine()
	 * @generated
	 */
	int HORIZONTAL_LINE = 3;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LINE__GENERAL_PROPERTIES = TEXT_PAGE_CONTENT__GENERAL_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Horizontal Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LINE_FEATURE_COUNT = TEXT_PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Horizontal Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LINE_OPERATION_COUNT = TEXT_PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.ListPropertyImpl <em>List Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.ListPropertyImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getListProperty()
	 * @generated
	 */
	int LIST_PROPERTY = 13;

	/**
	 * The number of structural features of the '<em>List Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_FEATURE_COUNT = PROPERTY_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>List Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_OPERATION_COUNT = PROPERTY_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.HorizontalListImpl <em>Horizontal List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.HorizontalListImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getHorizontalList()
	 * @generated
	 */
	int HORIZONTAL_LIST = 4;

	/**
	 * The number of structural features of the '<em>Horizontal List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LIST_FEATURE_COUNT = LIST_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Horizontal List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LIST_OPERATION_COUNT = LIST_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.ButtonPropertyImpl <em>Button Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.ButtonPropertyImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getButtonProperty()
	 * @generated
	 */
	int BUTTON_PROPERTY = 31;

	/**
	 * The number of structural features of the '<em>Button Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_PROPERTY_FEATURE_COUNT = PROPERTY_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Button Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_PROPERTY_OPERATION_COUNT = PROPERTY_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.ButtonStateImpl <em>Button State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.ButtonStateImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getButtonState()
	 * @generated
	 */
	int BUTTON_STATE = 67;

	/**
	 * The number of structural features of the '<em>Button State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STATE_FEATURE_COUNT = BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Button State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STATE_OPERATION_COUNT = BUTTON_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.DisabledImpl <em>Disabled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.DisabledImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getDisabled()
	 * @generated
	 */
	int DISABLED = 5;

	/**
	 * The number of structural features of the '<em>Disabled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLED_FEATURE_COUNT = BUTTON_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Disabled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLED_OPERATION_COUNT = BUTTON_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.BadgePropertyImpl <em>Badge Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.BadgePropertyImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getBadgeProperty()
	 * @generated
	 */
	int BADGE_PROPERTY = 10;

	/**
	 * The number of structural features of the '<em>Badge Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_PROPERTY_FEATURE_COUNT = PROPERTY_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Badge Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_PROPERTY_OPERATION_COUNT = PROPERTY_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.BadgeStyleImpl <em>Badge Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.BadgeStyleImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getBadgeStyle()
	 * @generated
	 */
	int BADGE_STYLE = 7;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_STYLE__COLOR = BADGE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Badge Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_STYLE_FEATURE_COUNT = BADGE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Badge Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_STYLE_OPERATION_COUNT = BADGE_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.DisplayPropertyImpl <em>Display Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.DisplayPropertyImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getDisplayProperty()
	 * @generated
	 */
	int DISPLAY_PROPERTY = 19;

	/**
	 * The number of structural features of the '<em>Display Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_PROPERTY_FEATURE_COUNT = PROPERTY_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Display Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_PROPERTY_OPERATION_COUNT = PROPERTY_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.Display2Impl <em>Display2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.Display2Impl
	 * @see bootstrap.impl.BootstrapPackageImpl#getDisplay2()
	 * @generated
	 */
	int DISPLAY2 = 8;

	/**
	 * The number of structural features of the '<em>Display2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY2_FEATURE_COUNT = DISPLAY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Display2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY2_OPERATION_COUNT = DISPLAY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.PageImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pagecontents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PAGECONTENTS = 1;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.AlertPropertyImpl <em>Alert Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.AlertPropertyImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getAlertProperty()
	 * @generated
	 */
	int ALERT_PROPERTY = 11;

	/**
	 * The number of structural features of the '<em>Alert Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_PROPERTY_FEATURE_COUNT = GENERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alert Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_PROPERTY_OPERATION_COUNT = GENERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.ContainerImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 16;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__GENERAL_PROPERTIES = PAGE_CONTENT__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Pagecontents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PAGECONTENTS = PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = PAGE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.FluidContainerImpl <em>Fluid Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.FluidContainerImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getFluidContainer()
	 * @generated
	 */
	int FLUID_CONTAINER = 12;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUID_CONTAINER__GENERAL_PROPERTIES = CONTAINER__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Pagecontents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUID_CONTAINER__PAGECONTENTS = CONTAINER__PAGECONTENTS;

	/**
	 * The number of structural features of the '<em>Fluid Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUID_CONTAINER_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fluid Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUID_CONTAINER_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.StrongImpl <em>Strong</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.StrongImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getStrong()
	 * @generated
	 */
	int STRONG = 15;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__GENERAL_PROPERTIES = TEXT_CONTAINABLE__GENERAL_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Strong</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_FEATURE_COUNT = TEXT_CONTAINABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Strong</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_OPERATION_COUNT = TEXT_CONTAINABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.Display3Impl <em>Display3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.Display3Impl
	 * @see bootstrap.impl.BootstrapPackageImpl#getDisplay3()
	 * @generated
	 */
	int DISPLAY3 = 17;

	/**
	 * The number of structural features of the '<em>Display3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY3_FEATURE_COUNT = DISPLAY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Display3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY3_OPERATION_COUNT = DISPLAY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.ButtonSizeImpl <em>Button Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.ButtonSizeImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getButtonSize()
	 * @generated
	 */
	int BUTTON_SIZE = 18;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_SIZE__SIZE = BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_SIZE_FEATURE_COUNT = BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Button Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_SIZE_OPERATION_COUNT = BUTTON_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.NavBarPropertyImpl <em>Nav Bar Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.NavBarPropertyImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getNavBarProperty()
	 * @generated
	 */
	int NAV_BAR_PROPERTY = 63;

	/**
	 * The number of structural features of the '<em>Nav Bar Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_BAR_PROPERTY_FEATURE_COUNT = PROPERTY_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Nav Bar Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_BAR_PROPERTY_OPERATION_COUNT = PROPERTY_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.VerticalImpl <em>Vertical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.VerticalImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getVertical()
	 * @generated
	 */
	int VERTICAL = 20;

	/**
	 * The number of structural features of the '<em>Vertical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_FEATURE_COUNT = NAV_BAR_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vertical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_OPERATION_COUNT = NAV_BAR_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.CompositeTextElementImpl <em>Composite Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.CompositeTextElementImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getCompositeTextElement()
	 * @generated
	 */
	int COMPOSITE_TEXT_ELEMENT = 49;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEXT_ELEMENT__GENERAL_PROPERTIES = CONTAINABLE_TEXT_ELEMENT__GENERAL_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Composite Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEXT_ELEMENT_FEATURE_COUNT = CONTAINABLE_TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composite Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEXT_ELEMENT_OPERATION_COUNT = CONTAINABLE_TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.UrlBasedLinkImpl <em>Url Based Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.UrlBasedLinkImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getUrlBasedLink()
	 * @generated
	 */
	int URL_BASED_LINK = 54;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_LINK__GENERAL_PROPERTIES = COMPOSITE_TEXT_ELEMENT__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_LINK__URL = COMPOSITE_TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_LINK__TITLE = COMPOSITE_TEXT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Url Based Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_LINK_FEATURE_COUNT = COMPOSITE_TEXT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Url Based Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_LINK_OPERATION_COUNT = COMPOSITE_TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.LinkImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 21;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__GENERAL_PROPERTIES = URL_BASED_LINK__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__URL = URL_BASED_LINK__URL;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TITLE = URL_BASED_LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Linkproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LINKPROPERTIES = URL_BASED_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Buttonproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__BUTTONPROPERTIES = URL_BASED_LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Badgeproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__BADGEPROPERTIES = URL_BASED_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = URL_BASED_LINK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = URL_BASED_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.TextContainerImpl <em>Text Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.TextContainerImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getTextContainer()
	 * @generated
	 */
	int TEXT_CONTAINER = 33;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER__GENERAL_PROPERTIES = TEXT_PAGE_CONTENT__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Textelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER__TEXTELEMENTS = TEXT_PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER__COLOR = TEXT_PAGE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Emphasis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER__EMPHASIS = TEXT_PAGE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Text Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER_FEATURE_COUNT = TEXT_PAGE_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Text Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER_OPERATION_COUNT = TEXT_PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.ParagrapheImpl <em>Paragraphe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.ParagrapheImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getParagraphe()
	 * @generated
	 */
	int PARAGRAPHE = 22;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE__GENERAL_PROPERTIES = TEXT_CONTAINER__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Textelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE__TEXTELEMENTS = TEXT_CONTAINER__TEXTELEMENTS;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE__COLOR = TEXT_CONTAINER__COLOR;

	/**
	 * The feature id for the '<em><b>Emphasis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE__EMPHASIS = TEXT_CONTAINER__EMPHASIS;

	/**
	 * The number of structural features of the '<em>Paragraphe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE_FEATURE_COUNT = TEXT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Paragraphe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE_OPERATION_COUNT = TEXT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.ImageImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 23;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__GENERAL_PROPERTIES = URL_BASED_LINK__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__URL = URL_BASED_LINK__URL;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TITLE = URL_BASED_LINK__TITLE;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = URL_BASED_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = URL_BASED_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.LinkPropertyImpl <em>Link Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.LinkPropertyImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getLinkProperty()
	 * @generated
	 */
	int LINK_PROPERTY = 69;

	/**
	 * The number of structural features of the '<em>Link Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY_FEATURE_COUNT = PROPERTY_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Link Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY_OPERATION_COUNT = PROPERTY_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.LinkBrandImpl <em>Link Brand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.LinkBrandImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getLinkBrand()
	 * @generated
	 */
	int LINK_BRAND = 25;

	/**
	 * The number of structural features of the '<em>Link Brand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BRAND_FEATURE_COUNT = LINK_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Link Brand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BRAND_OPERATION_COUNT = LINK_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.AlertAnimatedImpl <em>Alert Animated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.AlertAnimatedImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getAlertAnimated()
	 * @generated
	 */
	int ALERT_ANIMATED = 26;

	/**
	 * The number of structural features of the '<em>Alert Animated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_ANIMATED_FEATURE_COUNT = ALERT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alert Animated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_ANIMATED_OPERATION_COUNT = ALERT_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.ActiveImpl <em>Active</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.ActiveImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getActive()
	 * @generated
	 */
	int ACTIVE = 27;

	/**
	 * The number of structural features of the '<em>Active</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_FEATURE_COUNT = BUTTON_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Active</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_OPERATION_COUNT = BUTTON_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.TableSectionImpl <em>Table Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.TableSectionImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getTableSection()
	 * @generated
	 */
	int TABLE_SECTION = 73;

	/**
	 * The feature id for the '<em><b>Tablerows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__TABLEROWS = 0;

	/**
	 * The feature id for the '<em><b>Generals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__GENERALS = 1;

	/**
	 * The number of structural features of the '<em>Table Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Table Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.TbodyImpl <em>Tbody</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.TbodyImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getTbody()
	 * @generated
	 */
	int TBODY = 29;

	/**
	 * The feature id for the '<em><b>Tablerows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY__TABLEROWS = TABLE_SECTION__TABLEROWS;

	/**
	 * The feature id for the '<em><b>Generals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY__GENERALS = TABLE_SECTION__GENERALS;

	/**
	 * The number of structural features of the '<em>Tbody</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_FEATURE_COUNT = TABLE_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tbody</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_OPERATION_COUNT = TABLE_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.TfootImpl <em>Tfoot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.TfootImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getTfoot()
	 * @generated
	 */
	int TFOOT = 30;

	/**
	 * The feature id for the '<em><b>Tablerows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT__TABLEROWS = TABLE_SECTION__TABLEROWS;

	/**
	 * The feature id for the '<em><b>Generals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT__GENERALS = TABLE_SECTION__GENERALS;

	/**
	 * The number of structural features of the '<em>Tfoot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_FEATURE_COUNT = TABLE_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tfoot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_OPERATION_COUNT = TABLE_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.TableImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 32;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__GENERAL_PROPERTIES = TEXT_PAGE_CONTENT__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Tablesections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TABLESECTIONS = TEXT_PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = TEXT_PAGE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = TEXT_PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.BadgePillImpl <em>Badge Pill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.BadgePillImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getBadgePill()
	 * @generated
	 */
	int BADGE_PILL = 34;

	/**
	 * The number of structural features of the '<em>Badge Pill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_PILL_FEATURE_COUNT = BADGE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Badge Pill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_PILL_OPERATION_COUNT = BADGE_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.NavigationImpl <em>Navigation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.NavigationImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getNavigation()
	 * @generated
	 */
	int NAVIGATION = 35;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__GENERAL_PROPERTIES = TEXT_PAGE_CONTENT__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Listelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__LISTELEMENT = TEXT_PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Navbar</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__NAVBAR = TEXT_PAGE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__LINKS = TEXT_PAGE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FEATURE_COUNT = TEXT_PAGE_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_OPERATION_COUNT = TEXT_PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.BasicImpl <em>Basic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.BasicImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getBasic()
	 * @generated
	 */
	int BASIC = 36;

	/**
	 * The number of structural features of the '<em>Basic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FEATURE_COUNT = NAV_BAR_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OPERATION_COUNT = NAV_BAR_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.ListItemImpl <em>List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.ListItemImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getListItem()
	 * @generated
	 */
	int LIST_ITEM = 37;

	/**
	 * The feature id for the '<em><b>Listitemelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__LISTITEMELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__ACTIVE = 1;

	/**
	 * The number of structural features of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.ListElementImpl <em>List Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.ListElementImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getListElement()
	 * @generated
	 */
	int LIST_ELEMENT = 40;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT__GENERAL_PROPERTIES = TEXT_PAGE_CONTENT__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Listitems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT__LISTITEMS = TEXT_PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Listproperty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT__LISTPROPERTY = TEXT_PAGE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT_FEATURE_COUNT = TEXT_PAGE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>List Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT_OPERATION_COUNT = TEXT_PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.UnOrderedListImpl <em>Un Ordered List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.UnOrderedListImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getUnOrderedList()
	 * @generated
	 */
	int UN_ORDERED_LIST = 38;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_ORDERED_LIST__GENERAL_PROPERTIES = LIST_ELEMENT__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Listitems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_ORDERED_LIST__LISTITEMS = LIST_ELEMENT__LISTITEMS;

	/**
	 * The feature id for the '<em><b>Listproperty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_ORDERED_LIST__LISTPROPERTY = LIST_ELEMENT__LISTPROPERTY;

	/**
	 * The number of structural features of the '<em>Un Ordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_ORDERED_LIST_FEATURE_COUNT = LIST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Un Ordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_ORDERED_LIST_OPERATION_COUNT = LIST_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.AlertLinkImpl <em>Alert Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.AlertLinkImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getAlertLink()
	 * @generated
	 */
	int ALERT_LINK = 39;

	/**
	 * The number of structural features of the '<em>Alert Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_LINK_FEATURE_COUNT = LINK_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alert Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_LINK_OPERATION_COUNT = LINK_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.BorderPropertyImpl <em>Border Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.BorderPropertyImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getBorderProperty()
	 * @generated
	 */
	int BORDER_PROPERTY = 41;

	/**
	 * The number of structural features of the '<em>Border Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_PROPERTY_FEATURE_COUNT = GENERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Border Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_PROPERTY_OPERATION_COUNT = GENERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.BorderImpl <em>Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.BorderImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getBorder()
	 * @generated
	 */
	int BORDER = 42;

	/**
	 * The number of structural features of the '<em>Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_FEATURE_COUNT = BORDER_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_OPERATION_COUNT = BORDER_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.ButtonImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 43;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__GENERAL_PROPERTIES = CONTAINABLE_TEXT_ELEMENT__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Buttonproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__BUTTONPROPERTIES = CONTAINABLE_TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = CONTAINABLE_TEXT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = CONTAINABLE_TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.TableCellImpl <em>Table Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.TableCellImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getTableCell()
	 * @generated
	 */
	int TABLE_CELL = 44;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__GENERAL_PROPERTIES = TEXT_CONTAINER__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Textelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__TEXTELEMENTS = TEXT_CONTAINER__TEXTELEMENTS;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__COLOR = TEXT_CONTAINER__COLOR;

	/**
	 * The feature id for the '<em><b>Emphasis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__EMPHASIS = TEXT_CONTAINER__EMPHASIS;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__ALIGNMENT = TEXT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__SPAN = TEXT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_FEATURE_COUNT = TEXT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_OPERATION_COUNT = TEXT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.TitleImpl <em>Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.TitleImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getTitle()
	 * @generated
	 */
	int TITLE = 45;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__GENERAL_PROPERTIES = TEXT_CONTAINER__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Textelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__TEXTELEMENTS = TEXT_CONTAINER__TEXTELEMENTS;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__COLOR = TEXT_CONTAINER__COLOR;

	/**
	 * The feature id for the '<em><b>Emphasis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__EMPHASIS = TEXT_CONTAINER__EMPHASIS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__LEVEL = TEXT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Displayproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__DISPLAYPROPERTIES = TEXT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_FEATURE_COUNT = TEXT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_OPERATION_COUNT = TEXT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.EmphasisImpl <em>Emphasis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.EmphasisImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getEmphasis()
	 * @generated
	 */
	int EMPHASIS = 47;

	/**
	 * The number of structural features of the '<em>Emphasis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS_FEATURE_COUNT = PROPERTY_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Emphasis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS_OPERATION_COUNT = PROPERTY_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.Display4Impl <em>Display4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.Display4Impl
	 * @see bootstrap.impl.BootstrapPackageImpl#getDisplay4()
	 * @generated
	 */
	int DISPLAY4 = 48;

	/**
	 * The number of structural features of the '<em>Display4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY4_FEATURE_COUNT = DISPLAY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Display4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY4_OPERATION_COUNT = DISPLAY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.TextNested <em>Text Nested</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.TextNested
	 * @see bootstrap.impl.BootstrapPackageImpl#getTextNested()
	 * @generated
	 */
	int TEXT_NESTED = 50;

	/**
	 * The number of structural features of the '<em>Text Nested</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_NESTED_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Text Nested</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_NESTED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.TheadImpl <em>Thead</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.TheadImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getThead()
	 * @generated
	 */
	int THEAD = 51;

	/**
	 * The feature id for the '<em><b>Tablerows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD__TABLEROWS = TABLE_SECTION__TABLEROWS;

	/**
	 * The feature id for the '<em><b>Generals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD__GENERALS = TABLE_SECTION__GENERALS;

	/**
	 * The number of structural features of the '<em>Thead</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_FEATURE_COUNT = TABLE_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Thead</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_OPERATION_COUNT = TABLE_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.OrderListImpl <em>Order List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.OrderListImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getOrderList()
	 * @generated
	 */
	int ORDER_LIST = 52;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LIST__GENERAL_PROPERTIES = LIST_ELEMENT__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Listitems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LIST__LISTITEMS = LIST_ELEMENT__LISTITEMS;

	/**
	 * The feature id for the '<em><b>Listproperty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LIST__LISTPROPERTY = LIST_ELEMENT__LISTPROPERTY;

	/**
	 * The number of structural features of the '<em>Order List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LIST_FEATURE_COUNT = LIST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Order List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LIST_OPERATION_COUNT = LIST_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.MargesPropertyImpl <em>Marges Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.MargesPropertyImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getMargesProperty()
	 * @generated
	 */
	int MARGES_PROPERTY = 55;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGES_PROPERTY__LEVEL = GENERAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alignement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGES_PROPERTY__ALIGNEMENT = GENERAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Marges Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGES_PROPERTY_FEATURE_COUNT = GENERAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Marges Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGES_PROPERTY_OPERATION_COUNT = GENERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.BasicListImpl <em>Basic List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.BasicListImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getBasicList()
	 * @generated
	 */
	int BASIC_LIST = 56;

	/**
	 * The number of structural features of the '<em>Basic List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_LIST_FEATURE_COUNT = LIST_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_LIST_OPERATION_COUNT = LIST_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.AlertStyleImpl <em>Alert Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.AlertStyleImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getAlertStyle()
	 * @generated
	 */
	int ALERT_STYLE = 57;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_STYLE__COLOR = ALERT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alert Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_STYLE_FEATURE_COUNT = ALERT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Alert Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_STYLE_OPERATION_COUNT = ALERT_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.CenteredImpl <em>Centered</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.CenteredImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getCentered()
	 * @generated
	 */
	int CENTERED = 58;

	/**
	 * The number of structural features of the '<em>Centered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTERED_FEATURE_COUNT = NAV_BAR_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Centered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTERED_OPERATION_COUNT = NAV_BAR_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.ButtonStyleImpl <em>Button Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.ButtonStyleImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getButtonStyle()
	 * @generated
	 */
	int BUTTON_STYLE = 72;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__COLOR = BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE_FEATURE_COUNT = BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Button Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE_OPERATION_COUNT = BUTTON_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.ButtonLinkImpl <em>Button Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.ButtonLinkImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getButtonLink()
	 * @generated
	 */
	int BUTTON_LINK = 59;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_LINK__COLOR = BUTTON_STYLE__COLOR;

	/**
	 * The number of structural features of the '<em>Button Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_LINK_FEATURE_COUNT = BUTTON_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Button Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_LINK_OPERATION_COUNT = BUTTON_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.BrandImpl <em>Brand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.BrandImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getBrand()
	 * @generated
	 */
	int BRAND = 60;

	/**
	 * The number of structural features of the '<em>Brand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAND_FEATURE_COUNT = NAV_BAR_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Brand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAND_OPERATION_COUNT = NAV_BAR_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.Display1Impl <em>Display1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.Display1Impl
	 * @see bootstrap.impl.BootstrapPackageImpl#getDisplay1()
	 * @generated
	 */
	int DISPLAY1 = 61;

	/**
	 * The number of structural features of the '<em>Display1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY1_FEATURE_COUNT = DISPLAY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Display1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY1_OPERATION_COUNT = DISPLAY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.TableRowImpl <em>Table Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.TableRowImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getTableRow()
	 * @generated
	 */
	int TABLE_ROW = 62;

	/**
	 * The feature id for the '<em><b>Tablecells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__TABLECELLS = 0;

	/**
	 * The feature id for the '<em><b>Generals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__GENERALS = 1;

	/**
	 * The number of structural features of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.PaddingImpl <em>Padding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.PaddingImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getPadding()
	 * @generated
	 */
	int PADDING = 64;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PADDING__LEVEL = MARGES_PROPERTY__LEVEL;

	/**
	 * The feature id for the '<em><b>Alignement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PADDING__ALIGNEMENT = MARGES_PROPERTY__ALIGNEMENT;

	/**
	 * The number of structural features of the '<em>Padding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PADDING_FEATURE_COUNT = MARGES_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Padding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PADDING_OPERATION_COUNT = MARGES_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.MarginImpl <em>Margin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.MarginImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getMargin()
	 * @generated
	 */
	int MARGIN = 65;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN__LEVEL = MARGES_PROPERTY__LEVEL;

	/**
	 * The feature id for the '<em><b>Alignement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN__ALIGNEMENT = MARGES_PROPERTY__ALIGNEMENT;

	/**
	 * The number of structural features of the '<em>Margin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN_FEATURE_COUNT = MARGES_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Margin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN_OPERATION_COUNT = MARGES_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.ColoredBorderImpl <em>Colored Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.ColoredBorderImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getColoredBorder()
	 * @generated
	 */
	int COLORED_BORDER = 66;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_BORDER__COLOR = BORDER_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Colored Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_BORDER_FEATURE_COUNT = BORDER_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Colored Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_BORDER_OPERATION_COUNT = BORDER_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.FixContainerImpl <em>Fix Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.FixContainerImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getFixContainer()
	 * @generated
	 */
	int FIX_CONTAINER = 70;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIX_CONTAINER__GENERAL_PROPERTIES = CONTAINER__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Pagecontents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIX_CONTAINER__PAGECONTENTS = CONTAINER__PAGECONTENTS;

	/**
	 * The number of structural features of the '<em>Fix Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIX_CONTAINER_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fix Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIX_CONTAINER_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.Size <em>Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.Size
	 * @see bootstrap.impl.BootstrapPackageImpl#getSize()
	 * @generated
	 */
	int SIZE = 74;

	/**
	 * The meta object id for the '{@link bootstrap.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.Color
	 * @see bootstrap.impl.BootstrapPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 75;

	/**
	 * The meta object id for the '{@link bootstrap.Alignement <em>Alignement</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.Alignement
	 * @see bootstrap.impl.BootstrapPackageImpl#getAlignement()
	 * @generated
	 */
	int ALIGNEMENT = 76;


	/**
	 * Returns the meta object for class '{@link bootstrap.Italic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Italic</em>'.
	 * @see bootstrap.Italic
	 * @generated
	 */
	EClass getItalic();

	/**
	 * Returns the meta object for class '{@link bootstrap.Background <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Background</em>'.
	 * @see bootstrap.Background
	 * @generated
	 */
	EClass getBackground();

	/**
	 * Returns the meta object for the attribute '{@link bootstrap.Background#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see bootstrap.Background#getColor()
	 * @see #getBackground()
	 * @generated
	 */
	EAttribute getBackground_Color();

	/**
	 * Returns the meta object for class '{@link bootstrap.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see bootstrap.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link bootstrap.Text#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see bootstrap.Text#getText()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Text();

	/**
	 * Returns the meta object for class '{@link bootstrap.HorizontalLine <em>Horizontal Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontal Line</em>'.
	 * @see bootstrap.HorizontalLine
	 * @generated
	 */
	EClass getHorizontalLine();

	/**
	 * Returns the meta object for class '{@link bootstrap.HorizontalList <em>Horizontal List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontal List</em>'.
	 * @see bootstrap.HorizontalList
	 * @generated
	 */
	EClass getHorizontalList();

	/**
	 * Returns the meta object for class '{@link bootstrap.Disabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disabled</em>'.
	 * @see bootstrap.Disabled
	 * @generated
	 */
	EClass getDisabled();

	/**
	 * Returns the meta object for class '{@link bootstrap.ContainableTextElement <em>Containable Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containable Text Element</em>'.
	 * @see bootstrap.ContainableTextElement
	 * @generated
	 */
	EClass getContainableTextElement();

	/**
	 * Returns the meta object for class '{@link bootstrap.BadgeStyle <em>Badge Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Badge Style</em>'.
	 * @see bootstrap.BadgeStyle
	 * @generated
	 */
	EClass getBadgeStyle();

	/**
	 * Returns the meta object for the attribute '{@link bootstrap.BadgeStyle#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see bootstrap.BadgeStyle#getColor()
	 * @see #getBadgeStyle()
	 * @generated
	 */
	EAttribute getBadgeStyle_Color();

	/**
	 * Returns the meta object for class '{@link bootstrap.Display2 <em>Display2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display2</em>'.
	 * @see bootstrap.Display2
	 * @generated
	 */
	EClass getDisplay2();

	/**
	 * Returns the meta object for class '{@link bootstrap.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see bootstrap.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link bootstrap.Page#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bootstrap.Page#getName()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link bootstrap.Page#getPagecontents <em>Pagecontents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pagecontents</em>'.
	 * @see bootstrap.Page#getPagecontents()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Pagecontents();

	/**
	 * Returns the meta object for class '{@link bootstrap.BadgeProperty <em>Badge Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Badge Property</em>'.
	 * @see bootstrap.BadgeProperty
	 * @generated
	 */
	EClass getBadgeProperty();

	/**
	 * Returns the meta object for class '{@link bootstrap.AlertProperty <em>Alert Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alert Property</em>'.
	 * @see bootstrap.AlertProperty
	 * @generated
	 */
	EClass getAlertProperty();

	/**
	 * Returns the meta object for class '{@link bootstrap.FluidContainer <em>Fluid Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fluid Container</em>'.
	 * @see bootstrap.FluidContainer
	 * @generated
	 */
	EClass getFluidContainer();

	/**
	 * Returns the meta object for class '{@link bootstrap.ListProperty <em>List Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Property</em>'.
	 * @see bootstrap.ListProperty
	 * @generated
	 */
	EClass getListProperty();

	/**
	 * Returns the meta object for class '{@link bootstrap.General <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General</em>'.
	 * @see bootstrap.General
	 * @generated
	 */
	EClass getGeneral();

	/**
	 * Returns the meta object for class '{@link bootstrap.Strong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong</em>'.
	 * @see bootstrap.Strong
	 * @generated
	 */
	EClass getStrong();

	/**
	 * Returns the meta object for class '{@link bootstrap.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see bootstrap.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link bootstrap.Container#getPagecontents <em>Pagecontents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pagecontents</em>'.
	 * @see bootstrap.Container#getPagecontents()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Pagecontents();

	/**
	 * Returns the meta object for class '{@link bootstrap.Display3 <em>Display3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display3</em>'.
	 * @see bootstrap.Display3
	 * @generated
	 */
	EClass getDisplay3();

	/**
	 * Returns the meta object for class '{@link bootstrap.ButtonSize <em>Button Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Size</em>'.
	 * @see bootstrap.ButtonSize
	 * @generated
	 */
	EClass getButtonSize();

	/**
	 * Returns the meta object for the attribute '{@link bootstrap.ButtonSize#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see bootstrap.ButtonSize#getSize()
	 * @see #getButtonSize()
	 * @generated
	 */
	EAttribute getButtonSize_Size();

	/**
	 * Returns the meta object for class '{@link bootstrap.DisplayProperty <em>Display Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Property</em>'.
	 * @see bootstrap.DisplayProperty
	 * @generated
	 */
	EClass getDisplayProperty();

	/**
	 * Returns the meta object for class '{@link bootstrap.Vertical <em>Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertical</em>'.
	 * @see bootstrap.Vertical
	 * @generated
	 */
	EClass getVertical();

	/**
	 * Returns the meta object for class '{@link bootstrap.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see bootstrap.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the containment reference list '{@link bootstrap.Link#getLinkproperties <em>Linkproperties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Linkproperties</em>'.
	 * @see bootstrap.Link#getLinkproperties()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Linkproperties();

	/**
	 * Returns the meta object for the containment reference list '{@link bootstrap.Link#getButtonproperties <em>Buttonproperties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buttonproperties</em>'.
	 * @see bootstrap.Link#getButtonproperties()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Buttonproperties();

	/**
	 * Returns the meta object for the containment reference list '{@link bootstrap.Link#getBadgeproperties <em>Badgeproperties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Badgeproperties</em>'.
	 * @see bootstrap.Link#getBadgeproperties()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Badgeproperties();

	/**
	 * Returns the meta object for class '{@link bootstrap.Paragraphe <em>Paragraphe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraphe</em>'.
	 * @see bootstrap.Paragraphe
	 * @generated
	 */
	EClass getParagraphe();

	/**
	 * Returns the meta object for class '{@link bootstrap.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see bootstrap.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for class '{@link bootstrap.TextPageContent <em>Text Page Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Page Content</em>'.
	 * @see bootstrap.TextPageContent
	 * @generated
	 */
	EClass getTextPageContent();

	/**
	 * Returns the meta object for class '{@link bootstrap.LinkBrand <em>Link Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Brand</em>'.
	 * @see bootstrap.LinkBrand
	 * @generated
	 */
	EClass getLinkBrand();

	/**
	 * Returns the meta object for class '{@link bootstrap.AlertAnimated <em>Alert Animated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alert Animated</em>'.
	 * @see bootstrap.AlertAnimated
	 * @generated
	 */
	EClass getAlertAnimated();

	/**
	 * Returns the meta object for class '{@link bootstrap.Active <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active</em>'.
	 * @see bootstrap.Active
	 * @generated
	 */
	EClass getActive();

	/**
	 * Returns the meta object for class '{@link bootstrap.PropertyClass <em>Property Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Class</em>'.
	 * @see bootstrap.PropertyClass
	 * @generated
	 */
	EClass getPropertyClass();

	/**
	 * Returns the meta object for class '{@link bootstrap.Tbody <em>Tbody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tbody</em>'.
	 * @see bootstrap.Tbody
	 * @generated
	 */
	EClass getTbody();

	/**
	 * Returns the meta object for class '{@link bootstrap.Tfoot <em>Tfoot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tfoot</em>'.
	 * @see bootstrap.Tfoot
	 * @generated
	 */
	EClass getTfoot();

	/**
	 * Returns the meta object for class '{@link bootstrap.ButtonProperty <em>Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Property</em>'.
	 * @see bootstrap.ButtonProperty
	 * @generated
	 */
	EClass getButtonProperty();

	/**
	 * Returns the meta object for class '{@link bootstrap.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see bootstrap.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link bootstrap.Table#getTablesections <em>Tablesections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tablesections</em>'.
	 * @see bootstrap.Table#getTablesections()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Tablesections();

	/**
	 * Returns the meta object for class '{@link bootstrap.TextContainer <em>Text Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Container</em>'.
	 * @see bootstrap.TextContainer
	 * @generated
	 */
	EClass getTextContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link bootstrap.TextContainer#getTextelements <em>Textelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Textelements</em>'.
	 * @see bootstrap.TextContainer#getTextelements()
	 * @see #getTextContainer()
	 * @generated
	 */
	EReference getTextContainer_Textelements();

	/**
	 * Returns the meta object for the attribute '{@link bootstrap.TextContainer#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see bootstrap.TextContainer#getColor()
	 * @see #getTextContainer()
	 * @generated
	 */
	EAttribute getTextContainer_Color();

	/**
	 * Returns the meta object for the containment reference list '{@link bootstrap.TextContainer#getEmphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emphasis</em>'.
	 * @see bootstrap.TextContainer#getEmphasis()
	 * @see #getTextContainer()
	 * @generated
	 */
	EReference getTextContainer_Emphasis();

	/**
	 * Returns the meta object for class '{@link bootstrap.BadgePill <em>Badge Pill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Badge Pill</em>'.
	 * @see bootstrap.BadgePill
	 * @generated
	 */
	EClass getBadgePill();

	/**
	 * Returns the meta object for class '{@link bootstrap.Navigation <em>Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation</em>'.
	 * @see bootstrap.Navigation
	 * @generated
	 */
	EClass getNavigation();

	/**
	 * Returns the meta object for the containment reference list '{@link bootstrap.Navigation#getListelement <em>Listelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listelement</em>'.
	 * @see bootstrap.Navigation#getListelement()
	 * @see #getNavigation()
	 * @generated
	 */
	EReference getNavigation_Listelement();

	/**
	 * Returns the meta object for the containment reference list '{@link bootstrap.Navigation#getNavbar <em>Navbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Navbar</em>'.
	 * @see bootstrap.Navigation#getNavbar()
	 * @see #getNavigation()
	 * @generated
	 */
	EReference getNavigation_Navbar();

	/**
	 * Returns the meta object for the containment reference list '{@link bootstrap.Navigation#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see bootstrap.Navigation#getLinks()
	 * @see #getNavigation()
	 * @generated
	 */
	EReference getNavigation_Links();

	/**
	 * Returns the meta object for class '{@link bootstrap.Basic <em>Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic</em>'.
	 * @see bootstrap.Basic
	 * @generated
	 */
	EClass getBasic();

	/**
	 * Returns the meta object for class '{@link bootstrap.ListItem <em>List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item</em>'.
	 * @see bootstrap.ListItem
	 * @generated
	 */
	EClass getListItem();

	/**
	 * Returns the meta object for the containment reference list '{@link bootstrap.ListItem#getListitemelements <em>Listitemelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listitemelements</em>'.
	 * @see bootstrap.ListItem#getListitemelements()
	 * @see #getListItem()
	 * @generated
	 */
	EReference getListItem_Listitemelements();

	/**
	 * Returns the meta object for the attribute '{@link bootstrap.ListItem#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see bootstrap.ListItem#isActive()
	 * @see #getListItem()
	 * @generated
	 */
	EAttribute getListItem_Active();

	/**
	 * Returns the meta object for class '{@link bootstrap.UnOrderedList <em>Un Ordered List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Un Ordered List</em>'.
	 * @see bootstrap.UnOrderedList
	 * @generated
	 */
	EClass getUnOrderedList();

	/**
	 * Returns the meta object for class '{@link bootstrap.AlertLink <em>Alert Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alert Link</em>'.
	 * @see bootstrap.AlertLink
	 * @generated
	 */
	EClass getAlertLink();

	/**
	 * Returns the meta object for class '{@link bootstrap.ListElement <em>List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Element</em>'.
	 * @see bootstrap.ListElement
	 * @generated
	 */
	EClass getListElement();

	/**
	 * Returns the meta object for the containment reference list '{@link bootstrap.ListElement#getListitems <em>Listitems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listitems</em>'.
	 * @see bootstrap.ListElement#getListitems()
	 * @see #getListElement()
	 * @generated
	 */
	EReference getListElement_Listitems();

	/**
	 * Returns the meta object for the containment reference list '{@link bootstrap.ListElement#getListproperty <em>Listproperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listproperty</em>'.
	 * @see bootstrap.ListElement#getListproperty()
	 * @see #getListElement()
	 * @generated
	 */
	EReference getListElement_Listproperty();

	/**
	 * Returns the meta object for class '{@link bootstrap.BorderProperty <em>Border Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border Property</em>'.
	 * @see bootstrap.BorderProperty
	 * @generated
	 */
	EClass getBorderProperty();

	/**
	 * Returns the meta object for class '{@link bootstrap.Border <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border</em>'.
	 * @see bootstrap.Border
	 * @generated
	 */
	EClass getBorder();

	/**
	 * Returns the meta object for class '{@link bootstrap.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see bootstrap.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the containment reference list '{@link bootstrap.Button#getButtonproperties <em>Buttonproperties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buttonproperties</em>'.
	 * @see bootstrap.Button#getButtonproperties()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_Buttonproperties();

	/**
	 * Returns the meta object for class '{@link bootstrap.TableCell <em>Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Cell</em>'.
	 * @see bootstrap.TableCell
	 * @generated
	 */
	EClass getTableCell();

	/**
	 * Returns the meta object for the attribute '{@link bootstrap.TableCell#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see bootstrap.TableCell#getAlignment()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_Alignment();

	/**
	 * Returns the meta object for the attribute '{@link bootstrap.TableCell#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span</em>'.
	 * @see bootstrap.TableCell#getSpan()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_Span();

	/**
	 * Returns the meta object for class '{@link bootstrap.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title</em>'.
	 * @see bootstrap.Title
	 * @generated
	 */
	EClass getTitle();

	/**
	 * Returns the meta object for the attribute '{@link bootstrap.Title#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see bootstrap.Title#getLevel()
	 * @see #getTitle()
	 * @generated
	 */
	EAttribute getTitle_Level();

	/**
	 * Returns the meta object for the containment reference list '{@link bootstrap.Title#getDisplayproperties <em>Displayproperties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Displayproperties</em>'.
	 * @see bootstrap.Title#getDisplayproperties()
	 * @see #getTitle()
	 * @generated
	 */
	EReference getTitle_Displayproperties();

	/**
	 * Returns the meta object for class '{@link bootstrap.ListItemElement <em>List Item Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item Element</em>'.
	 * @see bootstrap.ListItemElement
	 * @generated
	 */
	EClass getListItemElement();

	/**
	 * Returns the meta object for class '{@link bootstrap.Emphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emphasis</em>'.
	 * @see bootstrap.Emphasis
	 * @generated
	 */
	EClass getEmphasis();

	/**
	 * Returns the meta object for class '{@link bootstrap.Display4 <em>Display4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display4</em>'.
	 * @see bootstrap.Display4
	 * @generated
	 */
	EClass getDisplay4();

	/**
	 * Returns the meta object for class '{@link bootstrap.CompositeTextElement <em>Composite Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Text Element</em>'.
	 * @see bootstrap.CompositeTextElement
	 * @generated
	 */
	EClass getCompositeTextElement();

	/**
	 * Returns the meta object for class '{@link bootstrap.TextNested <em>Text Nested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Nested</em>'.
	 * @see bootstrap.TextNested
	 * @generated
	 */
	EClass getTextNested();

	/**
	 * Returns the meta object for class '{@link bootstrap.Thead <em>Thead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thead</em>'.
	 * @see bootstrap.Thead
	 * @generated
	 */
	EClass getThead();

	/**
	 * Returns the meta object for class '{@link bootstrap.OrderList <em>Order List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order List</em>'.
	 * @see bootstrap.OrderList
	 * @generated
	 */
	EClass getOrderList();

	/**
	 * Returns the meta object for class '{@link bootstrap.TextElements <em>Text Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Elements</em>'.
	 * @see bootstrap.TextElements
	 * @generated
	 */
	EClass getTextElements();

	/**
	 * Returns the meta object for class '{@link bootstrap.UrlBasedLink <em>Url Based Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url Based Link</em>'.
	 * @see bootstrap.UrlBasedLink
	 * @generated
	 */
	EClass getUrlBasedLink();

	/**
	 * Returns the meta object for the attribute '{@link bootstrap.UrlBasedLink#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see bootstrap.UrlBasedLink#getUrl()
	 * @see #getUrlBasedLink()
	 * @generated
	 */
	EAttribute getUrlBasedLink_Url();

	/**
	 * Returns the meta object for the attribute '{@link bootstrap.UrlBasedLink#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see bootstrap.UrlBasedLink#getTitle()
	 * @see #getUrlBasedLink()
	 * @generated
	 */
	EAttribute getUrlBasedLink_Title();

	/**
	 * Returns the meta object for class '{@link bootstrap.MargesProperty <em>Marges Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marges Property</em>'.
	 * @see bootstrap.MargesProperty
	 * @generated
	 */
	EClass getMargesProperty();

	/**
	 * Returns the meta object for the attribute '{@link bootstrap.MargesProperty#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see bootstrap.MargesProperty#getLevel()
	 * @see #getMargesProperty()
	 * @generated
	 */
	EAttribute getMargesProperty_Level();

	/**
	 * Returns the meta object for the attribute '{@link bootstrap.MargesProperty#getAlignement <em>Alignement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignement</em>'.
	 * @see bootstrap.MargesProperty#getAlignement()
	 * @see #getMargesProperty()
	 * @generated
	 */
	EAttribute getMargesProperty_Alignement();

	/**
	 * Returns the meta object for class '{@link bootstrap.BasicList <em>Basic List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic List</em>'.
	 * @see bootstrap.BasicList
	 * @generated
	 */
	EClass getBasicList();

	/**
	 * Returns the meta object for class '{@link bootstrap.AlertStyle <em>Alert Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alert Style</em>'.
	 * @see bootstrap.AlertStyle
	 * @generated
	 */
	EClass getAlertStyle();

	/**
	 * Returns the meta object for the attribute '{@link bootstrap.AlertStyle#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see bootstrap.AlertStyle#getColor()
	 * @see #getAlertStyle()
	 * @generated
	 */
	EAttribute getAlertStyle_Color();

	/**
	 * Returns the meta object for class '{@link bootstrap.Centered <em>Centered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Centered</em>'.
	 * @see bootstrap.Centered
	 * @generated
	 */
	EClass getCentered();

	/**
	 * Returns the meta object for class '{@link bootstrap.ButtonLink <em>Button Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Link</em>'.
	 * @see bootstrap.ButtonLink
	 * @generated
	 */
	EClass getButtonLink();

	/**
	 * Returns the meta object for class '{@link bootstrap.Brand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brand</em>'.
	 * @see bootstrap.Brand
	 * @generated
	 */
	EClass getBrand();

	/**
	 * Returns the meta object for class '{@link bootstrap.Display1 <em>Display1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display1</em>'.
	 * @see bootstrap.Display1
	 * @generated
	 */
	EClass getDisplay1();

	/**
	 * Returns the meta object for class '{@link bootstrap.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Row</em>'.
	 * @see bootstrap.TableRow
	 * @generated
	 */
	EClass getTableRow();

	/**
	 * Returns the meta object for the containment reference list '{@link bootstrap.TableRow#getTablecells <em>Tablecells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tablecells</em>'.
	 * @see bootstrap.TableRow#getTablecells()
	 * @see #getTableRow()
	 * @generated
	 */
	EReference getTableRow_Tablecells();

	/**
	 * Returns the meta object for the containment reference list '{@link bootstrap.TableRow#getGenerals <em>Generals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generals</em>'.
	 * @see bootstrap.TableRow#getGenerals()
	 * @see #getTableRow()
	 * @generated
	 */
	EReference getTableRow_Generals();

	/**
	 * Returns the meta object for class '{@link bootstrap.NavBarProperty <em>Nav Bar Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nav Bar Property</em>'.
	 * @see bootstrap.NavBarProperty
	 * @generated
	 */
	EClass getNavBarProperty();

	/**
	 * Returns the meta object for class '{@link bootstrap.Padding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Padding</em>'.
	 * @see bootstrap.Padding
	 * @generated
	 */
	EClass getPadding();

	/**
	 * Returns the meta object for class '{@link bootstrap.Margin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Margin</em>'.
	 * @see bootstrap.Margin
	 * @generated
	 */
	EClass getMargin();

	/**
	 * Returns the meta object for class '{@link bootstrap.ColoredBorder <em>Colored Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colored Border</em>'.
	 * @see bootstrap.ColoredBorder
	 * @generated
	 */
	EClass getColoredBorder();

	/**
	 * Returns the meta object for the attribute '{@link bootstrap.ColoredBorder#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see bootstrap.ColoredBorder#getColor()
	 * @see #getColoredBorder()
	 * @generated
	 */
	EAttribute getColoredBorder_Color();

	/**
	 * Returns the meta object for class '{@link bootstrap.ButtonState <em>Button State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button State</em>'.
	 * @see bootstrap.ButtonState
	 * @generated
	 */
	EClass getButtonState();

	/**
	 * Returns the meta object for class '{@link bootstrap.TextContainable <em>Text Containable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Containable</em>'.
	 * @see bootstrap.TextContainable
	 * @generated
	 */
	EClass getTextContainable();

	/**
	 * Returns the meta object for class '{@link bootstrap.LinkProperty <em>Link Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Property</em>'.
	 * @see bootstrap.LinkProperty
	 * @generated
	 */
	EClass getLinkProperty();

	/**
	 * Returns the meta object for class '{@link bootstrap.FixContainer <em>Fix Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fix Container</em>'.
	 * @see bootstrap.FixContainer
	 * @generated
	 */
	EClass getFixContainer();

	/**
	 * Returns the meta object for class '{@link bootstrap.PageContent <em>Page Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Content</em>'.
	 * @see bootstrap.PageContent
	 * @generated
	 */
	EClass getPageContent();

	/**
	 * Returns the meta object for the containment reference list '{@link bootstrap.PageContent#getGeneralProperties <em>General Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>General Properties</em>'.
	 * @see bootstrap.PageContent#getGeneralProperties()
	 * @see #getPageContent()
	 * @generated
	 */
	EReference getPageContent_GeneralProperties();

	/**
	 * Returns the meta object for class '{@link bootstrap.ButtonStyle <em>Button Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Style</em>'.
	 * @see bootstrap.ButtonStyle
	 * @generated
	 */
	EClass getButtonStyle();

	/**
	 * Returns the meta object for the attribute '{@link bootstrap.ButtonStyle#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see bootstrap.ButtonStyle#getColor()
	 * @see #getButtonStyle()
	 * @generated
	 */
	EAttribute getButtonStyle_Color();

	/**
	 * Returns the meta object for class '{@link bootstrap.TableSection <em>Table Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Section</em>'.
	 * @see bootstrap.TableSection
	 * @generated
	 */
	EClass getTableSection();

	/**
	 * Returns the meta object for the containment reference list '{@link bootstrap.TableSection#getTablerows <em>Tablerows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tablerows</em>'.
	 * @see bootstrap.TableSection#getTablerows()
	 * @see #getTableSection()
	 * @generated
	 */
	EReference getTableSection_Tablerows();

	/**
	 * Returns the meta object for the containment reference list '{@link bootstrap.TableSection#getGenerals <em>Generals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generals</em>'.
	 * @see bootstrap.TableSection#getGenerals()
	 * @see #getTableSection()
	 * @generated
	 */
	EReference getTableSection_Generals();

	/**
	 * Returns the meta object for enum '{@link bootstrap.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Size</em>'.
	 * @see bootstrap.Size
	 * @generated
	 */
	EEnum getSize();

	/**
	 * Returns the meta object for enum '{@link bootstrap.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see bootstrap.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the meta object for enum '{@link bootstrap.Alignement <em>Alignement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Alignement</em>'.
	 * @see bootstrap.Alignement
	 * @generated
	 */
	EEnum getAlignement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BootstrapFactory getBootstrapFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bootstrap.impl.ItalicImpl <em>Italic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.ItalicImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getItalic()
		 * @generated
		 */
		EClass ITALIC = eINSTANCE.getItalic();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.BackgroundImpl <em>Background</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.BackgroundImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getBackground()
		 * @generated
		 */
		EClass BACKGROUND = eINSTANCE.getBackground();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKGROUND__COLOR = eINSTANCE.getBackground_Color();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.TextImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT = eINSTANCE.getText_Text();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.HorizontalLineImpl <em>Horizontal Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.HorizontalLineImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getHorizontalLine()
		 * @generated
		 */
		EClass HORIZONTAL_LINE = eINSTANCE.getHorizontalLine();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.HorizontalListImpl <em>Horizontal List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.HorizontalListImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getHorizontalList()
		 * @generated
		 */
		EClass HORIZONTAL_LIST = eINSTANCE.getHorizontalList();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.DisabledImpl <em>Disabled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.DisabledImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getDisabled()
		 * @generated
		 */
		EClass DISABLED = eINSTANCE.getDisabled();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.ContainableTextElementImpl <em>Containable Text Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.ContainableTextElementImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getContainableTextElement()
		 * @generated
		 */
		EClass CONTAINABLE_TEXT_ELEMENT = eINSTANCE.getContainableTextElement();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.BadgeStyleImpl <em>Badge Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.BadgeStyleImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getBadgeStyle()
		 * @generated
		 */
		EClass BADGE_STYLE = eINSTANCE.getBadgeStyle();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BADGE_STYLE__COLOR = eINSTANCE.getBadgeStyle_Color();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.Display2Impl <em>Display2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.Display2Impl
		 * @see bootstrap.impl.BootstrapPackageImpl#getDisplay2()
		 * @generated
		 */
		EClass DISPLAY2 = eINSTANCE.getDisplay2();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.PageImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

		/**
		 * The meta object literal for the '<em><b>Pagecontents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PAGECONTENTS = eINSTANCE.getPage_Pagecontents();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.BadgePropertyImpl <em>Badge Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.BadgePropertyImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getBadgeProperty()
		 * @generated
		 */
		EClass BADGE_PROPERTY = eINSTANCE.getBadgeProperty();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.AlertPropertyImpl <em>Alert Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.AlertPropertyImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getAlertProperty()
		 * @generated
		 */
		EClass ALERT_PROPERTY = eINSTANCE.getAlertProperty();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.FluidContainerImpl <em>Fluid Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.FluidContainerImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getFluidContainer()
		 * @generated
		 */
		EClass FLUID_CONTAINER = eINSTANCE.getFluidContainer();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.ListPropertyImpl <em>List Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.ListPropertyImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getListProperty()
		 * @generated
		 */
		EClass LIST_PROPERTY = eINSTANCE.getListProperty();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.GeneralImpl <em>General</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.GeneralImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getGeneral()
		 * @generated
		 */
		EClass GENERAL = eINSTANCE.getGeneral();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.StrongImpl <em>Strong</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.StrongImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getStrong()
		 * @generated
		 */
		EClass STRONG = eINSTANCE.getStrong();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.ContainerImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Pagecontents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__PAGECONTENTS = eINSTANCE.getContainer_Pagecontents();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.Display3Impl <em>Display3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.Display3Impl
		 * @see bootstrap.impl.BootstrapPackageImpl#getDisplay3()
		 * @generated
		 */
		EClass DISPLAY3 = eINSTANCE.getDisplay3();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.ButtonSizeImpl <em>Button Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.ButtonSizeImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getButtonSize()
		 * @generated
		 */
		EClass BUTTON_SIZE = eINSTANCE.getButtonSize();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_SIZE__SIZE = eINSTANCE.getButtonSize_Size();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.DisplayPropertyImpl <em>Display Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.DisplayPropertyImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getDisplayProperty()
		 * @generated
		 */
		EClass DISPLAY_PROPERTY = eINSTANCE.getDisplayProperty();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.VerticalImpl <em>Vertical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.VerticalImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getVertical()
		 * @generated
		 */
		EClass VERTICAL = eINSTANCE.getVertical();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.LinkImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Linkproperties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__LINKPROPERTIES = eINSTANCE.getLink_Linkproperties();

		/**
		 * The meta object literal for the '<em><b>Buttonproperties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__BUTTONPROPERTIES = eINSTANCE.getLink_Buttonproperties();

		/**
		 * The meta object literal for the '<em><b>Badgeproperties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__BADGEPROPERTIES = eINSTANCE.getLink_Badgeproperties();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.ParagrapheImpl <em>Paragraphe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.ParagrapheImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getParagraphe()
		 * @generated
		 */
		EClass PARAGRAPHE = eINSTANCE.getParagraphe();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.ImageImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.TextPageContentImpl <em>Text Page Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.TextPageContentImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getTextPageContent()
		 * @generated
		 */
		EClass TEXT_PAGE_CONTENT = eINSTANCE.getTextPageContent();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.LinkBrandImpl <em>Link Brand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.LinkBrandImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getLinkBrand()
		 * @generated
		 */
		EClass LINK_BRAND = eINSTANCE.getLinkBrand();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.AlertAnimatedImpl <em>Alert Animated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.AlertAnimatedImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getAlertAnimated()
		 * @generated
		 */
		EClass ALERT_ANIMATED = eINSTANCE.getAlertAnimated();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.ActiveImpl <em>Active</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.ActiveImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getActive()
		 * @generated
		 */
		EClass ACTIVE = eINSTANCE.getActive();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.PropertyClassImpl <em>Property Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.PropertyClassImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getPropertyClass()
		 * @generated
		 */
		EClass PROPERTY_CLASS = eINSTANCE.getPropertyClass();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.TbodyImpl <em>Tbody</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.TbodyImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getTbody()
		 * @generated
		 */
		EClass TBODY = eINSTANCE.getTbody();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.TfootImpl <em>Tfoot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.TfootImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getTfoot()
		 * @generated
		 */
		EClass TFOOT = eINSTANCE.getTfoot();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.ButtonPropertyImpl <em>Button Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.ButtonPropertyImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getButtonProperty()
		 * @generated
		 */
		EClass BUTTON_PROPERTY = eINSTANCE.getButtonProperty();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.TableImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Tablesections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TABLESECTIONS = eINSTANCE.getTable_Tablesections();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.TextContainerImpl <em>Text Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.TextContainerImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getTextContainer()
		 * @generated
		 */
		EClass TEXT_CONTAINER = eINSTANCE.getTextContainer();

		/**
		 * The meta object literal for the '<em><b>Textelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_CONTAINER__TEXTELEMENTS = eINSTANCE.getTextContainer_Textelements();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_CONTAINER__COLOR = eINSTANCE.getTextContainer_Color();

		/**
		 * The meta object literal for the '<em><b>Emphasis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_CONTAINER__EMPHASIS = eINSTANCE.getTextContainer_Emphasis();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.BadgePillImpl <em>Badge Pill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.BadgePillImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getBadgePill()
		 * @generated
		 */
		EClass BADGE_PILL = eINSTANCE.getBadgePill();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.NavigationImpl <em>Navigation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.NavigationImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getNavigation()
		 * @generated
		 */
		EClass NAVIGATION = eINSTANCE.getNavigation();

		/**
		 * The meta object literal for the '<em><b>Listelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION__LISTELEMENT = eINSTANCE.getNavigation_Listelement();

		/**
		 * The meta object literal for the '<em><b>Navbar</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION__NAVBAR = eINSTANCE.getNavigation_Navbar();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION__LINKS = eINSTANCE.getNavigation_Links();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.BasicImpl <em>Basic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.BasicImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getBasic()
		 * @generated
		 */
		EClass BASIC = eINSTANCE.getBasic();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.ListItemImpl <em>List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.ListItemImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getListItem()
		 * @generated
		 */
		EClass LIST_ITEM = eINSTANCE.getListItem();

		/**
		 * The meta object literal for the '<em><b>Listitemelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_ITEM__LISTITEMELEMENTS = eINSTANCE.getListItem_Listitemelements();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_ITEM__ACTIVE = eINSTANCE.getListItem_Active();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.UnOrderedListImpl <em>Un Ordered List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.UnOrderedListImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getUnOrderedList()
		 * @generated
		 */
		EClass UN_ORDERED_LIST = eINSTANCE.getUnOrderedList();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.AlertLinkImpl <em>Alert Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.AlertLinkImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getAlertLink()
		 * @generated
		 */
		EClass ALERT_LINK = eINSTANCE.getAlertLink();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.ListElementImpl <em>List Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.ListElementImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getListElement()
		 * @generated
		 */
		EClass LIST_ELEMENT = eINSTANCE.getListElement();

		/**
		 * The meta object literal for the '<em><b>Listitems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_ELEMENT__LISTITEMS = eINSTANCE.getListElement_Listitems();

		/**
		 * The meta object literal for the '<em><b>Listproperty</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_ELEMENT__LISTPROPERTY = eINSTANCE.getListElement_Listproperty();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.BorderPropertyImpl <em>Border Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.BorderPropertyImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getBorderProperty()
		 * @generated
		 */
		EClass BORDER_PROPERTY = eINSTANCE.getBorderProperty();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.BorderImpl <em>Border</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.BorderImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getBorder()
		 * @generated
		 */
		EClass BORDER = eINSTANCE.getBorder();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.ButtonImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Buttonproperties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON__BUTTONPROPERTIES = eINSTANCE.getButton_Buttonproperties();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.TableCellImpl <em>Table Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.TableCellImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getTableCell()
		 * @generated
		 */
		EClass TABLE_CELL = eINSTANCE.getTableCell();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__ALIGNMENT = eINSTANCE.getTableCell_Alignment();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__SPAN = eINSTANCE.getTableCell_Span();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.TitleImpl <em>Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.TitleImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getTitle()
		 * @generated
		 */
		EClass TITLE = eINSTANCE.getTitle();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__LEVEL = eINSTANCE.getTitle_Level();

		/**
		 * The meta object literal for the '<em><b>Displayproperties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITLE__DISPLAYPROPERTIES = eINSTANCE.getTitle_Displayproperties();

		/**
		 * The meta object literal for the '{@link bootstrap.ListItemElement <em>List Item Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.ListItemElement
		 * @see bootstrap.impl.BootstrapPackageImpl#getListItemElement()
		 * @generated
		 */
		EClass LIST_ITEM_ELEMENT = eINSTANCE.getListItemElement();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.EmphasisImpl <em>Emphasis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.EmphasisImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getEmphasis()
		 * @generated
		 */
		EClass EMPHASIS = eINSTANCE.getEmphasis();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.Display4Impl <em>Display4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.Display4Impl
		 * @see bootstrap.impl.BootstrapPackageImpl#getDisplay4()
		 * @generated
		 */
		EClass DISPLAY4 = eINSTANCE.getDisplay4();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.CompositeTextElementImpl <em>Composite Text Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.CompositeTextElementImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getCompositeTextElement()
		 * @generated
		 */
		EClass COMPOSITE_TEXT_ELEMENT = eINSTANCE.getCompositeTextElement();

		/**
		 * The meta object literal for the '{@link bootstrap.TextNested <em>Text Nested</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.TextNested
		 * @see bootstrap.impl.BootstrapPackageImpl#getTextNested()
		 * @generated
		 */
		EClass TEXT_NESTED = eINSTANCE.getTextNested();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.TheadImpl <em>Thead</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.TheadImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getThead()
		 * @generated
		 */
		EClass THEAD = eINSTANCE.getThead();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.OrderListImpl <em>Order List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.OrderListImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getOrderList()
		 * @generated
		 */
		EClass ORDER_LIST = eINSTANCE.getOrderList();

		/**
		 * The meta object literal for the '{@link bootstrap.TextElements <em>Text Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.TextElements
		 * @see bootstrap.impl.BootstrapPackageImpl#getTextElements()
		 * @generated
		 */
		EClass TEXT_ELEMENTS = eINSTANCE.getTextElements();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.UrlBasedLinkImpl <em>Url Based Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.UrlBasedLinkImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getUrlBasedLink()
		 * @generated
		 */
		EClass URL_BASED_LINK = eINSTANCE.getUrlBasedLink();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_BASED_LINK__URL = eINSTANCE.getUrlBasedLink_Url();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_BASED_LINK__TITLE = eINSTANCE.getUrlBasedLink_Title();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.MargesPropertyImpl <em>Marges Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.MargesPropertyImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getMargesProperty()
		 * @generated
		 */
		EClass MARGES_PROPERTY = eINSTANCE.getMargesProperty();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARGES_PROPERTY__LEVEL = eINSTANCE.getMargesProperty_Level();

		/**
		 * The meta object literal for the '<em><b>Alignement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARGES_PROPERTY__ALIGNEMENT = eINSTANCE.getMargesProperty_Alignement();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.BasicListImpl <em>Basic List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.BasicListImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getBasicList()
		 * @generated
		 */
		EClass BASIC_LIST = eINSTANCE.getBasicList();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.AlertStyleImpl <em>Alert Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.AlertStyleImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getAlertStyle()
		 * @generated
		 */
		EClass ALERT_STYLE = eINSTANCE.getAlertStyle();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALERT_STYLE__COLOR = eINSTANCE.getAlertStyle_Color();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.CenteredImpl <em>Centered</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.CenteredImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getCentered()
		 * @generated
		 */
		EClass CENTERED = eINSTANCE.getCentered();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.ButtonLinkImpl <em>Button Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.ButtonLinkImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getButtonLink()
		 * @generated
		 */
		EClass BUTTON_LINK = eINSTANCE.getButtonLink();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.BrandImpl <em>Brand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.BrandImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getBrand()
		 * @generated
		 */
		EClass BRAND = eINSTANCE.getBrand();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.Display1Impl <em>Display1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.Display1Impl
		 * @see bootstrap.impl.BootstrapPackageImpl#getDisplay1()
		 * @generated
		 */
		EClass DISPLAY1 = eINSTANCE.getDisplay1();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.TableRowImpl <em>Table Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.TableRowImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getTableRow()
		 * @generated
		 */
		EClass TABLE_ROW = eINSTANCE.getTableRow();

		/**
		 * The meta object literal for the '<em><b>Tablecells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_ROW__TABLECELLS = eINSTANCE.getTableRow_Tablecells();

		/**
		 * The meta object literal for the '<em><b>Generals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_ROW__GENERALS = eINSTANCE.getTableRow_Generals();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.NavBarPropertyImpl <em>Nav Bar Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.NavBarPropertyImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getNavBarProperty()
		 * @generated
		 */
		EClass NAV_BAR_PROPERTY = eINSTANCE.getNavBarProperty();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.PaddingImpl <em>Padding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.PaddingImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getPadding()
		 * @generated
		 */
		EClass PADDING = eINSTANCE.getPadding();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.MarginImpl <em>Margin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.MarginImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getMargin()
		 * @generated
		 */
		EClass MARGIN = eINSTANCE.getMargin();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.ColoredBorderImpl <em>Colored Border</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.ColoredBorderImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getColoredBorder()
		 * @generated
		 */
		EClass COLORED_BORDER = eINSTANCE.getColoredBorder();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLORED_BORDER__COLOR = eINSTANCE.getColoredBorder_Color();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.ButtonStateImpl <em>Button State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.ButtonStateImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getButtonState()
		 * @generated
		 */
		EClass BUTTON_STATE = eINSTANCE.getButtonState();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.TextContainableImpl <em>Text Containable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.TextContainableImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getTextContainable()
		 * @generated
		 */
		EClass TEXT_CONTAINABLE = eINSTANCE.getTextContainable();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.LinkPropertyImpl <em>Link Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.LinkPropertyImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getLinkProperty()
		 * @generated
		 */
		EClass LINK_PROPERTY = eINSTANCE.getLinkProperty();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.FixContainerImpl <em>Fix Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.FixContainerImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getFixContainer()
		 * @generated
		 */
		EClass FIX_CONTAINER = eINSTANCE.getFixContainer();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.PageContentImpl <em>Page Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.PageContentImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getPageContent()
		 * @generated
		 */
		EClass PAGE_CONTENT = eINSTANCE.getPageContent();

		/**
		 * The meta object literal for the '<em><b>General Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_CONTENT__GENERAL_PROPERTIES = eINSTANCE.getPageContent_GeneralProperties();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.ButtonStyleImpl <em>Button Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.ButtonStyleImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getButtonStyle()
		 * @generated
		 */
		EClass BUTTON_STYLE = eINSTANCE.getButtonStyle();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_STYLE__COLOR = eINSTANCE.getButtonStyle_Color();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.TableSectionImpl <em>Table Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.TableSectionImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getTableSection()
		 * @generated
		 */
		EClass TABLE_SECTION = eINSTANCE.getTableSection();

		/**
		 * The meta object literal for the '<em><b>Tablerows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_SECTION__TABLEROWS = eINSTANCE.getTableSection_Tablerows();

		/**
		 * The meta object literal for the '<em><b>Generals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_SECTION__GENERALS = eINSTANCE.getTableSection_Generals();

		/**
		 * The meta object literal for the '{@link bootstrap.Size <em>Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.Size
		 * @see bootstrap.impl.BootstrapPackageImpl#getSize()
		 * @generated
		 */
		EEnum SIZE = eINSTANCE.getSize();

		/**
		 * The meta object literal for the '{@link bootstrap.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.Color
		 * @see bootstrap.impl.BootstrapPackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '{@link bootstrap.Alignement <em>Alignement</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.Alignement
		 * @see bootstrap.impl.BootstrapPackageImpl#getAlignement()
		 * @generated
		 */
		EEnum ALIGNEMENT = eINSTANCE.getAlignement();

	}

} //BootstrapPackage
