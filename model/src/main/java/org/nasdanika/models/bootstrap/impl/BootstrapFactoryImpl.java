/**
 */
package org.nasdanika.models.bootstrap.impl;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.html.bootstrap.Breakpoint;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.Size;
import org.nasdanika.html.bootstrap.Text.Alignment;
import org.nasdanika.html.bootstrap.Text.Transform;
import org.nasdanika.html.bootstrap.Text.Weight;
import org.nasdanika.models.bootstrap.Accordion;
import org.nasdanika.models.bootstrap.ActionGroup;
import org.nasdanika.models.bootstrap.Alert;
import org.nasdanika.models.bootstrap.Appearance;
import org.nasdanika.models.bootstrap.Badge;
import org.nasdanika.models.bootstrap.BootstrapElement;
import org.nasdanika.models.bootstrap.BootstrapFactory;
import org.nasdanika.models.bootstrap.BootstrapPackage;
import org.nasdanika.models.bootstrap.Border;
import org.nasdanika.models.bootstrap.Breadcrumb;
import org.nasdanika.models.bootstrap.Button;
import org.nasdanika.models.bootstrap.ButtonGroup;
import org.nasdanika.models.bootstrap.ButtonToolbar;
import org.nasdanika.models.bootstrap.Card;
import org.nasdanika.models.bootstrap.Carousel;
import org.nasdanika.models.bootstrap.Collapse;
import org.nasdanika.models.bootstrap.Column;
import org.nasdanika.models.bootstrap.ColumnWidth;
import org.nasdanika.models.bootstrap.ContentActionGroupItem;
import org.nasdanika.models.bootstrap.Div;
import org.nasdanika.models.bootstrap.Dropdown;
import org.nasdanika.models.bootstrap.Form;
import org.nasdanika.models.bootstrap.FormGroup;
import org.nasdanika.models.bootstrap.InputGroup;
import org.nasdanika.models.bootstrap.LinkActionGroupItem;
import org.nasdanika.models.bootstrap.ListGroup;
import org.nasdanika.models.bootstrap.Modal;
import org.nasdanika.models.bootstrap.Navbar;
import org.nasdanika.models.bootstrap.Navs;
import org.nasdanika.models.bootstrap.Page;
import org.nasdanika.models.bootstrap.Row;
import org.nasdanika.models.bootstrap.Slide;
import org.nasdanika.models.bootstrap.Spacing;
import org.nasdanika.models.bootstrap.Table;
import org.nasdanika.models.bootstrap.TableCell;
import org.nasdanika.models.bootstrap.TableHeader;
import org.nasdanika.models.bootstrap.TableRow;
import org.nasdanika.models.bootstrap.TableSection;
import org.nasdanika.models.bootstrap.Tag;
import org.nasdanika.models.bootstrap.Text;
import org.nasdanika.models.bootstrap.Tooltip;
import org.nasdanika.html.bootstrap.Theme;

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
			case BootstrapPackage.BOOTSTRAP_ELEMENT: return createBootstrapElement();
			case BootstrapPackage.PAGE: return createPage();
			case BootstrapPackage.APPEARANCE: return createAppearance();
			case BootstrapPackage.APPEARANCE_ENTRY: return (EObject)createAppearanceEntry();
			case BootstrapPackage.BORDER: return createBorder();
			case BootstrapPackage.SPACING: return createSpacing();
			case BootstrapPackage.TEXT: return createText();
			case BootstrapPackage.FLOAT: return createFloat();
			case BootstrapPackage.TAG: return createTag();
			case BootstrapPackage.MODAL: return createModal();
			case BootstrapPackage.DIV: return createDiv();
			case BootstrapPackage.LINK_ACTION_GROUP_ITEM: return createLinkActionGroupItem();
			case BootstrapPackage.CONTENT_ACTION_GROUP_ITEM: return createContentActionGroupItem();
			case BootstrapPackage.ACTION_GROUP: return createActionGroup();
			case BootstrapPackage.CONTAINER: return createContainer();
			case BootstrapPackage.ROW: return createRow();
			case BootstrapPackage.COLUMN_WIDTH: return createColumnWidth();
			case BootstrapPackage.COLUMN: return createColumn();
			case BootstrapPackage.TABLE_SECTION: return createTableSection();
			case BootstrapPackage.TABLE_HEADER: return createTableHeader();
			case BootstrapPackage.TABLE: return createTable();
			case BootstrapPackage.TABLE_ROW: return createTableRow();
			case BootstrapPackage.TABLE_CELL: return createTableCell();
			case BootstrapPackage.CARD: return createCard();
			case BootstrapPackage.ALERT: return createAlert();
			case BootstrapPackage.BADGE: return createBadge();
			case BootstrapPackage.BREADCRUMB: return createBreadcrumb();
			case BootstrapPackage.BUTTON: return createButton();
			case BootstrapPackage.BUTTON_GROUP: return createButtonGroup();
			case BootstrapPackage.BUTTON_TOOLBAR: return createButtonToolbar();
			case BootstrapPackage.DROPDOWN: return createDropdown();
			case BootstrapPackage.FORM: return createForm();
			case BootstrapPackage.LIST_GROUP: return createListGroup();
			case BootstrapPackage.NAVS: return createNavs();
			case BootstrapPackage.NAVBAR: return createNavbar();
			case BootstrapPackage.TOOLTIP: return createTooltip();
			case BootstrapPackage.INPUT_GROUP: return createInputGroup();
			case BootstrapPackage.FORM_GROUP: return createFormGroup();
			case BootstrapPackage.COLLAPSE: return createCollapse();
			case BootstrapPackage.ACCORDION: return createAccordion();
			case BootstrapPackage.CAROUSEL: return createCarousel();
			case BootstrapPackage.SLIDE: return createSlide();
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
			case BootstrapPackage.THEME:
				return createThemeFromString(eDataType, initialValue);
			case BootstrapPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case BootstrapPackage.SIZE:
				return createSizeFromString(eDataType, initialValue);
			case BootstrapPackage.BREAKPOINT:
				return createBreakpointFromString(eDataType, initialValue);
			case BootstrapPackage.TEXT_ALIGNMENT:
				return createTextAlignmentFromString(eDataType, initialValue);
			case BootstrapPackage.TEXT_TRANSFORM:
				return createTextTransformFromString(eDataType, initialValue);
			case BootstrapPackage.TEXT_WEIGHT:
				return createTextWeightFromString(eDataType, initialValue);
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
			case BootstrapPackage.THEME:
				return convertThemeToString(eDataType, instanceValue);
			case BootstrapPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case BootstrapPackage.SIZE:
				return convertSizeToString(eDataType, instanceValue);
			case BootstrapPackage.BREAKPOINT:
				return convertBreakpointToString(eDataType, instanceValue);
			case BootstrapPackage.TEXT_ALIGNMENT:
				return convertTextAlignmentToString(eDataType, instanceValue);
			case BootstrapPackage.TEXT_TRANSFORM:
				return convertTextTransformToString(eDataType, instanceValue);
			case BootstrapPackage.TEXT_WEIGHT:
				return convertTextWeightToString(eDataType, instanceValue);
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
	public BootstrapElement createBootstrapElement() {
		BootstrapElementImpl bootstrapElement = new BootstrapElementImpl();
		return bootstrapElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Appearance createAppearance() {
		AppearanceImpl appearance = new AppearanceImpl();
		return appearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Appearance> createAppearanceEntry() {
		AppearanceEntryImpl appearanceEntry = new AppearanceEntryImpl();
		return appearanceEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Border createBorder() {
		BorderImpl border = new BorderImpl();
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Spacing createSpacing() {
		SpacingImpl spacing = new SpacingImpl();
		return spacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.nasdanika.models.bootstrap.Float createFloat() {
		FloatImpl float_ = new FloatImpl();
		return float_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Div createDiv() {
		DivImpl div = new DivImpl();
		return div;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkActionGroupItem createLinkActionGroupItem() {
		LinkActionGroupItemImpl linkActionGroupItem = new LinkActionGroupItemImpl();
		return linkActionGroupItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentActionGroupItem createContentActionGroupItem() {
		ContentActionGroupItemImpl contentActionGroupItem = new ContentActionGroupItemImpl();
		return contentActionGroupItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionGroup createActionGroup() {
		ActionGroupImpl actionGroup = new ActionGroupImpl();
		return actionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.nasdanika.models.bootstrap.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Row createRow() {
		RowImpl row = new RowImpl();
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColumnWidth createColumnWidth() {
		ColumnWidthImpl columnWidth = new ColumnWidthImpl();
		return columnWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableSection createTableSection() {
		TableSectionImpl tableSection = new TableSectionImpl();
		return tableSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableHeader createTableHeader() {
		TableHeaderImpl tableHeader = new TableHeaderImpl();
		return tableHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableRow createTableRow() {
		TableRowImpl tableRow = new TableRowImpl();
		return tableRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableCell createTableCell() {
		TableCellImpl tableCell = new TableCellImpl();
		return tableCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Card createCard() {
		CardImpl card = new CardImpl();
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Alert createAlert() {
		AlertImpl alert = new AlertImpl();
		return alert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Badge createBadge() {
		BadgeImpl badge = new BadgeImpl();
		return badge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Breadcrumb createBreadcrumb() {
		BreadcrumbImpl breadcrumb = new BreadcrumbImpl();
		return breadcrumb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ButtonGroup createButtonGroup() {
		ButtonGroupImpl buttonGroup = new ButtonGroupImpl();
		return buttonGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ButtonToolbar createButtonToolbar() {
		ButtonToolbarImpl buttonToolbar = new ButtonToolbarImpl();
		return buttonToolbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dropdown createDropdown() {
		DropdownImpl dropdown = new DropdownImpl();
		return dropdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListGroup createListGroup() {
		ListGroupImpl listGroup = new ListGroupImpl();
		return listGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Navs createNavs() {
		NavsImpl navs = new NavsImpl();
		return navs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Navbar createNavbar() {
		NavbarImpl navbar = new NavbarImpl();
		return navbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tooltip createTooltip() {
		TooltipImpl tooltip = new TooltipImpl();
		return tooltip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputGroup createInputGroup() {
		InputGroupImpl inputGroup = new InputGroupImpl();
		return inputGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormGroup createFormGroup() {
		FormGroupImpl formGroup = new FormGroupImpl();
		return formGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collapse createCollapse() {
		CollapseImpl collapse = new CollapseImpl();
		return collapse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modal createModal() {
		ModalImpl modal = new ModalImpl();
		return modal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Accordion createAccordion() {
		AccordionImpl accordion = new AccordionImpl();
		return accordion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Carousel createCarousel() {
		CarouselImpl carousel = new CarouselImpl();
		return carousel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Slide createSlide() {
		SlideImpl slide = new SlideImpl();
		return slide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Theme createThemeFromString(EDataType eDataType, String initialValue) {
		return (Theme)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThemeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColorFromString(EDataType eDataType, String initialValue) {
		return (Color)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size createSizeFromString(EDataType eDataType, String initialValue) {
		return (Size)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSizeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Breakpoint createBreakpointFromString(EDataType eDataType, String initialValue) {
		return (Breakpoint)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBreakpointToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alignment createTextAlignmentFromString(EDataType eDataType, String initialValue) {
		return (Alignment)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextAlignmentToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transform createTextTransformFromString(EDataType eDataType, String initialValue) {
		return (Transform)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextTransformToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Weight createTextWeightFromString(EDataType eDataType, String initialValue) {
		return (Weight)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextWeightToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
