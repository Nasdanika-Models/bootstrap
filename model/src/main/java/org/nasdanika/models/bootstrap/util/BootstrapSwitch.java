/**
 */
package org.nasdanika.models.bootstrap.util;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import org.nasdanika.common.Adaptable;
import org.nasdanika.models.bootstrap.Accordion;
import org.nasdanika.models.bootstrap.ActionGroup;
import org.nasdanika.models.bootstrap.ActionGroupItem;
import org.nasdanika.models.bootstrap.Alert;
import org.nasdanika.models.bootstrap.Appearance;
import org.nasdanika.models.bootstrap.Badge;
import org.nasdanika.models.bootstrap.BootstrapElement;
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
import org.nasdanika.models.bootstrap.Container;
import org.nasdanika.models.bootstrap.ContentActionGroupItem;
import org.nasdanika.models.bootstrap.Div;
import org.nasdanika.models.bootstrap.Dropdown;
import org.nasdanika.models.bootstrap.Form;
import org.nasdanika.models.bootstrap.FormGroup;
import org.nasdanika.models.bootstrap.InputGroup;
import org.nasdanika.models.bootstrap.Item;
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
import org.nasdanika.models.bootstrap.TableConfiguration;
import org.nasdanika.models.bootstrap.TableHeader;
import org.nasdanika.models.bootstrap.TableRow;
import org.nasdanika.models.bootstrap.TableRowContainer;
import org.nasdanika.models.bootstrap.TableSection;
import org.nasdanika.models.bootstrap.Tag;
import org.nasdanika.models.bootstrap.Text;
import org.nasdanika.models.bootstrap.Tooltip;
import org.nasdanika.models.html.HtmlElement;
import org.nasdanika.ncore.Marked;
import org.nasdanika.ncore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.bootstrap.BootstrapPackage
 * @generated
 */
public class BootstrapSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BootstrapPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BootstrapSwitch() {
		if (modelPackage == null) {
			modelPackage = BootstrapPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BootstrapPackage.BOOTSTRAP_ELEMENT: {
				BootstrapElement bootstrapElement = (BootstrapElement)theEObject;
				T result = caseBootstrapElement(bootstrapElement);
				if (result == null) result = caseHtmlElement(bootstrapElement);
				if (result == null) result = caseModelElement(bootstrapElement);
				if (result == null) result = caseMarked(bootstrapElement);
				if (result == null) result = caseAdaptable(bootstrapElement);
				if (result == null) result = caseIMarked(bootstrapElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.PAGE: {
				Page page = (Page)theEObject;
				T result = casePage(page);
				if (result == null) result = caseHtml_Page(page);
				if (result == null) result = caseModelElement(page);
				if (result == null) result = caseMarked(page);
				if (result == null) result = caseAdaptable(page);
				if (result == null) result = caseIMarked(page);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.APPEARANCE: {
				Appearance appearance = (Appearance)theEObject;
				T result = caseAppearance(appearance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.APPEARANCE_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, Appearance> appearanceEntry = (Map.Entry<String, Appearance>)theEObject;
				T result = caseAppearanceEntry(appearanceEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.BORDER: {
				Border border = (Border)theEObject;
				T result = caseBorder(border);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.SPACING: {
				Spacing spacing = (Spacing)theEObject;
				T result = caseSpacing(spacing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.FLOAT: {
				org.nasdanika.models.bootstrap.Float float_ = (org.nasdanika.models.bootstrap.Float)theEObject;
				T result = caseFloat(float_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = caseHtml_Tag(tag);
				if (result == null) result = caseBootstrapElement(tag);
				if (result == null) result = caseHtmlElement(tag);
				if (result == null) result = caseModelElement(tag);
				if (result == null) result = caseMarked(tag);
				if (result == null) result = caseAdaptable(tag);
				if (result == null) result = caseIMarked(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.MODAL: {
				Modal modal = (Modal)theEObject;
				T result = caseModal(modal);
				if (result == null) result = caseBootstrapElement(modal);
				if (result == null) result = caseHtmlElement(modal);
				if (result == null) result = caseModelElement(modal);
				if (result == null) result = caseMarked(modal);
				if (result == null) result = caseAdaptable(modal);
				if (result == null) result = caseIMarked(modal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.DIV: {
				Div div = (Div)theEObject;
				T result = caseDiv(div);
				if (result == null) result = caseTag(div);
				if (result == null) result = caseHtml_Tag(div);
				if (result == null) result = caseBootstrapElement(div);
				if (result == null) result = caseHtmlElement(div);
				if (result == null) result = caseModelElement(div);
				if (result == null) result = caseMarked(div);
				if (result == null) result = caseAdaptable(div);
				if (result == null) result = caseIMarked(div);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.ITEM: {
				Item item = (Item)theEObject;
				T result = caseItem(item);
				if (result == null) result = caseModelElement(item);
				if (result == null) result = caseMarked(item);
				if (result == null) result = caseAdaptable(item);
				if (result == null) result = caseIMarked(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.ACTION_GROUP_ITEM: {
				ActionGroupItem actionGroupItem = (ActionGroupItem)theEObject;
				T result = caseActionGroupItem(actionGroupItem);
				if (result == null) result = caseItem(actionGroupItem);
				if (result == null) result = caseModelElement(actionGroupItem);
				if (result == null) result = caseMarked(actionGroupItem);
				if (result == null) result = caseAdaptable(actionGroupItem);
				if (result == null) result = caseIMarked(actionGroupItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.LINK_ACTION_GROUP_ITEM: {
				LinkActionGroupItem linkActionGroupItem = (LinkActionGroupItem)theEObject;
				T result = caseLinkActionGroupItem(linkActionGroupItem);
				if (result == null) result = caseActionGroupItem(linkActionGroupItem);
				if (result == null) result = caseItem(linkActionGroupItem);
				if (result == null) result = caseModelElement(linkActionGroupItem);
				if (result == null) result = caseMarked(linkActionGroupItem);
				if (result == null) result = caseAdaptable(linkActionGroupItem);
				if (result == null) result = caseIMarked(linkActionGroupItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.CONTENT_ACTION_GROUP_ITEM: {
				ContentActionGroupItem contentActionGroupItem = (ContentActionGroupItem)theEObject;
				T result = caseContentActionGroupItem(contentActionGroupItem);
				if (result == null) result = caseActionGroupItem(contentActionGroupItem);
				if (result == null) result = caseItem(contentActionGroupItem);
				if (result == null) result = caseModelElement(contentActionGroupItem);
				if (result == null) result = caseMarked(contentActionGroupItem);
				if (result == null) result = caseAdaptable(contentActionGroupItem);
				if (result == null) result = caseIMarked(contentActionGroupItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.ACTION_GROUP: {
				ActionGroup actionGroup = (ActionGroup)theEObject;
				T result = caseActionGroup(actionGroup);
				if (result == null) result = caseDiv(actionGroup);
				if (result == null) result = caseTag(actionGroup);
				if (result == null) result = caseHtml_Tag(actionGroup);
				if (result == null) result = caseBootstrapElement(actionGroup);
				if (result == null) result = caseHtmlElement(actionGroup);
				if (result == null) result = caseModelElement(actionGroup);
				if (result == null) result = caseMarked(actionGroup);
				if (result == null) result = caseAdaptable(actionGroup);
				if (result == null) result = caseIMarked(actionGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = caseBootstrapElement(container);
				if (result == null) result = caseHtmlElement(container);
				if (result == null) result = caseModelElement(container);
				if (result == null) result = caseMarked(container);
				if (result == null) result = caseAdaptable(container);
				if (result == null) result = caseIMarked(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.ROW: {
				Row row = (Row)theEObject;
				T result = caseRow(row);
				if (result == null) result = caseBootstrapElement(row);
				if (result == null) result = caseHtmlElement(row);
				if (result == null) result = caseModelElement(row);
				if (result == null) result = caseMarked(row);
				if (result == null) result = caseAdaptable(row);
				if (result == null) result = caseIMarked(row);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.COLUMN_WIDTH: {
				ColumnWidth columnWidth = (ColumnWidth)theEObject;
				T result = caseColumnWidth(columnWidth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.COLUMN: {
				Column column = (Column)theEObject;
				T result = caseColumn(column);
				if (result == null) result = caseBootstrapElement(column);
				if (result == null) result = caseHtmlElement(column);
				if (result == null) result = caseModelElement(column);
				if (result == null) result = caseMarked(column);
				if (result == null) result = caseAdaptable(column);
				if (result == null) result = caseIMarked(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.TABLE_ROW_CONTAINER: {
				TableRowContainer tableRowContainer = (TableRowContainer)theEObject;
				T result = caseTableRowContainer(tableRowContainer);
				if (result == null) result = caseBootstrapElement(tableRowContainer);
				if (result == null) result = caseHtmlElement(tableRowContainer);
				if (result == null) result = caseModelElement(tableRowContainer);
				if (result == null) result = caseMarked(tableRowContainer);
				if (result == null) result = caseAdaptable(tableRowContainer);
				if (result == null) result = caseIMarked(tableRowContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.TABLE_SECTION: {
				TableSection tableSection = (TableSection)theEObject;
				T result = caseTableSection(tableSection);
				if (result == null) result = caseTableRowContainer(tableSection);
				if (result == null) result = caseBootstrapElement(tableSection);
				if (result == null) result = caseHtmlElement(tableSection);
				if (result == null) result = caseModelElement(tableSection);
				if (result == null) result = caseMarked(tableSection);
				if (result == null) result = caseAdaptable(tableSection);
				if (result == null) result = caseIMarked(tableSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.TABLE_HEADER: {
				TableHeader tableHeader = (TableHeader)theEObject;
				T result = caseTableHeader(tableHeader);
				if (result == null) result = caseTableSection(tableHeader);
				if (result == null) result = caseTableRowContainer(tableHeader);
				if (result == null) result = caseBootstrapElement(tableHeader);
				if (result == null) result = caseHtmlElement(tableHeader);
				if (result == null) result = caseModelElement(tableHeader);
				if (result == null) result = caseMarked(tableHeader);
				if (result == null) result = caseAdaptable(tableHeader);
				if (result == null) result = caseIMarked(tableHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.TABLE_CONFIGURATION: {
				TableConfiguration tableConfiguration = (TableConfiguration)theEObject;
				T result = caseTableConfiguration(tableConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = caseTableRowContainer(table);
				if (result == null) result = caseTableConfiguration(table);
				if (result == null) result = caseBootstrapElement(table);
				if (result == null) result = caseHtmlElement(table);
				if (result == null) result = caseModelElement(table);
				if (result == null) result = caseMarked(table);
				if (result == null) result = caseAdaptable(table);
				if (result == null) result = caseIMarked(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.TABLE_ROW: {
				TableRow tableRow = (TableRow)theEObject;
				T result = caseTableRow(tableRow);
				if (result == null) result = caseBootstrapElement(tableRow);
				if (result == null) result = caseHtmlElement(tableRow);
				if (result == null) result = caseModelElement(tableRow);
				if (result == null) result = caseMarked(tableRow);
				if (result == null) result = caseAdaptable(tableRow);
				if (result == null) result = caseIMarked(tableRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.TABLE_CELL: {
				TableCell tableCell = (TableCell)theEObject;
				T result = caseTableCell(tableCell);
				if (result == null) result = caseBootstrapElement(tableCell);
				if (result == null) result = caseHtmlElement(tableCell);
				if (result == null) result = caseModelElement(tableCell);
				if (result == null) result = caseMarked(tableCell);
				if (result == null) result = caseAdaptable(tableCell);
				if (result == null) result = caseIMarked(tableCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.CARD: {
				Card card = (Card)theEObject;
				T result = caseCard(card);
				if (result == null) result = caseDiv(card);
				if (result == null) result = caseTag(card);
				if (result == null) result = caseHtml_Tag(card);
				if (result == null) result = caseBootstrapElement(card);
				if (result == null) result = caseHtmlElement(card);
				if (result == null) result = caseModelElement(card);
				if (result == null) result = caseMarked(card);
				if (result == null) result = caseAdaptable(card);
				if (result == null) result = caseIMarked(card);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.ALERT: {
				Alert alert = (Alert)theEObject;
				T result = caseAlert(alert);
				if (result == null) result = caseDiv(alert);
				if (result == null) result = caseTag(alert);
				if (result == null) result = caseHtml_Tag(alert);
				if (result == null) result = caseBootstrapElement(alert);
				if (result == null) result = caseHtmlElement(alert);
				if (result == null) result = caseModelElement(alert);
				if (result == null) result = caseMarked(alert);
				if (result == null) result = caseAdaptable(alert);
				if (result == null) result = caseIMarked(alert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.BADGE: {
				Badge badge = (Badge)theEObject;
				T result = caseBadge(badge);
				if (result == null) result = caseDiv(badge);
				if (result == null) result = caseTag(badge);
				if (result == null) result = caseHtml_Tag(badge);
				if (result == null) result = caseBootstrapElement(badge);
				if (result == null) result = caseHtmlElement(badge);
				if (result == null) result = caseModelElement(badge);
				if (result == null) result = caseMarked(badge);
				if (result == null) result = caseAdaptable(badge);
				if (result == null) result = caseIMarked(badge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.BREADCRUMB: {
				Breadcrumb breadcrumb = (Breadcrumb)theEObject;
				T result = caseBreadcrumb(breadcrumb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.BUTTON: {
				Button button = (Button)theEObject;
				T result = caseButton(button);
				if (result == null) result = caseDiv(button);
				if (result == null) result = caseTag(button);
				if (result == null) result = caseHtml_Tag(button);
				if (result == null) result = caseBootstrapElement(button);
				if (result == null) result = caseHtmlElement(button);
				if (result == null) result = caseModelElement(button);
				if (result == null) result = caseMarked(button);
				if (result == null) result = caseAdaptable(button);
				if (result == null) result = caseIMarked(button);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.BUTTON_GROUP: {
				ButtonGroup buttonGroup = (ButtonGroup)theEObject;
				T result = caseButtonGroup(buttonGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.BUTTON_TOOLBAR: {
				ButtonToolbar buttonToolbar = (ButtonToolbar)theEObject;
				T result = caseButtonToolbar(buttonToolbar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.DROPDOWN: {
				Dropdown dropdown = (Dropdown)theEObject;
				T result = caseDropdown(dropdown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.FORM: {
				Form form = (Form)theEObject;
				T result = caseForm(form);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.LIST_GROUP: {
				ListGroup listGroup = (ListGroup)theEObject;
				T result = caseListGroup(listGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.NAVS: {
				Navs navs = (Navs)theEObject;
				T result = caseNavs(navs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.NAVBAR: {
				Navbar navbar = (Navbar)theEObject;
				T result = caseNavbar(navbar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.TOOLTIP: {
				Tooltip tooltip = (Tooltip)theEObject;
				T result = caseTooltip(tooltip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.INPUT_GROUP: {
				InputGroup inputGroup = (InputGroup)theEObject;
				T result = caseInputGroup(inputGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.FORM_GROUP: {
				FormGroup formGroup = (FormGroup)theEObject;
				T result = caseFormGroup(formGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.COLLAPSE: {
				Collapse collapse = (Collapse)theEObject;
				T result = caseCollapse(collapse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.ACCORDION: {
				Accordion accordion = (Accordion)theEObject;
				T result = caseAccordion(accordion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.CAROUSEL: {
				Carousel carousel = (Carousel)theEObject;
				T result = caseCarousel(carousel);
				if (result == null) result = caseDiv(carousel);
				if (result == null) result = caseTag(carousel);
				if (result == null) result = caseHtml_Tag(carousel);
				if (result == null) result = caseBootstrapElement(carousel);
				if (result == null) result = caseHtmlElement(carousel);
				if (result == null) result = caseModelElement(carousel);
				if (result == null) result = caseMarked(carousel);
				if (result == null) result = caseAdaptable(carousel);
				if (result == null) result = caseIMarked(carousel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.SLIDE: {
				Slide slide = (Slide)theEObject;
				T result = caseSlide(slide);
				if (result == null) result = caseDiv(slide);
				if (result == null) result = caseTag(slide);
				if (result == null) result = caseHtml_Tag(slide);
				if (result == null) result = caseBootstrapElement(slide);
				if (result == null) result = caseHtmlElement(slide);
				if (result == null) result = caseModelElement(slide);
				if (result == null) result = caseMarked(slide);
				if (result == null) result = caseAdaptable(slide);
				if (result == null) result = caseIMarked(slide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBootstrapElement(BootstrapElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appearance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appearance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppearance(Appearance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appearance Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appearance Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppearanceEntry(Map.Entry<String, Appearance> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Border</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Border</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBorder(Border object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spacing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spacing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpacing(Spacing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat(org.nasdanika.models.bootstrap.Float object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Div</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Div</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiv(Div object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Group Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Group Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionGroupItem(ActionGroupItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Action Group Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Action Group Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkActionGroupItem(LinkActionGroupItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Action Group Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Action Group Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentActionGroupItem(ContentActionGroupItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionGroup(ActionGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRow(Row object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Width</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Width</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnWidth(ColumnWidth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Row Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Row Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableRowContainer(TableRowContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableSection(TableSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableHeader(TableHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableConfiguration(TableConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableRow(TableRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableCell(TableCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCard(Card object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlert(Alert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Badge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Badge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBadge(Badge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breadcrumb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breadcrumb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreadcrumb(Breadcrumb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonGroup(ButtonGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Toolbar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Toolbar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonToolbar(ButtonToolbar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dropdown</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dropdown</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropdown(Dropdown object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForm(Form object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListGroup(ListGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavs(Navs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navbar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navbar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavbar(Navbar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tooltip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tooltip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTooltip(Tooltip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputGroup(InputGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormGroup(FormGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collapse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collapse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollapse(Collapse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModal(Modal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accordion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accordion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccordion(Accordion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carousel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carousel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarousel(Carousel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlide(Slide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IMarked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IMarked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIMarked(org.nasdanika.persistence.Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarked(Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptable(Adaptable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHtmlElement(HtmlElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHtml_Page(org.nasdanika.models.html.Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHtml_Tag(org.nasdanika.models.html.Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BootstrapSwitch
