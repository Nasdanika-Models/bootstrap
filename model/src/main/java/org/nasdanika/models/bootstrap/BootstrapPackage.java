/**
 */
package org.nasdanika.models.bootstrap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.models.html.HtmlPackage;
import org.nasdanika.ncore.NcorePackage;

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
 * <!-- begin-model-doc -->
 * Model of Bootstrap elements.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.bootstrap.BootstrapFactory
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
	String eNS_URI = "ecore://bootstrap.models.nasdanika.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.bootstrap";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BootstrapPackage eINSTANCE = org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.BootstrapElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapElementImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getBootstrapElement()
	 * @generated
	 */
	int BOOTSTRAP_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_ELEMENT__MARKERS = HtmlPackage.HTML_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_ELEMENT__URIS = HtmlPackage.HTML_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_ELEMENT__DESCRIPTION = HtmlPackage.HTML_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_ELEMENT__UUID = HtmlPackage.HTML_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_ELEMENT__LABEL_PROTOTYPE = HtmlPackage.HTML_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_ELEMENT__REPRESENTATIONS = HtmlPackage.HTML_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_ELEMENT__ANNOTATIONS = HtmlPackage.HTML_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_ELEMENT__ATTRIBUTES = HtmlPackage.HTML_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_ELEMENT__CONTENT = HtmlPackage.HTML_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_ELEMENT__APPEARANCE = HtmlPackage.HTML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_ELEMENT_FEATURE_COUNT = HtmlPackage.HTML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_ELEMENT_OPERATION_COUNT = HtmlPackage.HTML_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.PageImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__MARKERS = HtmlPackage.PAGE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__URIS = HtmlPackage.PAGE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DESCRIPTION = HtmlPackage.PAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__UUID = HtmlPackage.PAGE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__LABEL_PROTOTYPE = HtmlPackage.PAGE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__REPRESENTATIONS = HtmlPackage.PAGE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ANNOTATIONS = HtmlPackage.PAGE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Prolog</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PROLOG = HtmlPackage.PAGE__PROLOG;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__HEAD = HtmlPackage.PAGE__HEAD;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__BODY = HtmlPackage.PAGE__BODY;

	/**
	 * The feature id for the '<em><b>Epilog</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__EPILOG = HtmlPackage.PAGE__EPILOG;

	/**
	 * The feature id for the '<em><b>Builders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__BUILDERS = HtmlPackage.PAGE__BUILDERS;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__LANGUAGE = HtmlPackage.PAGE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = HtmlPackage.PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Stylesheets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__STYLESHEETS = HtmlPackage.PAGE__STYLESHEETS;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__SCRIPTS = HtmlPackage.PAGE__SCRIPTS;

	/**
	 * The feature id for the '<em><b>Cdn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CDN = HtmlPackage.PAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Theme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__THEME = HtmlPackage.PAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = HtmlPackage.PAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = HtmlPackage.PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.AppearanceImpl <em>Appearance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.AppearanceImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getAppearance()
	 * @generated
	 */
	int APPEARANCE = 2;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE__BACKGROUND = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE__BORDER = 2;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE__MARGIN = 3;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE__PADDING = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE__TEXT = 5;

	/**
	 * The feature id for the '<em><b>Float</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE__FLOAT = 6;

	/**
	 * The feature id for the '<em><b>Children</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE__CHILDREN = 7;

	/**
	 * The number of structural features of the '<em>Appearance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Effective Appearance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE___EFFECTIVE_APPEARANCE__STRING = 0;

	/**
	 * The number of operations of the '<em>Appearance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.AppearanceEntryImpl <em>Appearance Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.AppearanceEntryImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getAppearanceEntry()
	 * @generated
	 */
	int APPEARANCE_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Appearance Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Appearance Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.BorderImpl <em>Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.BorderImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getBorder()
	 * @generated
	 */
	int BORDER = 4;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER__TOP = 1;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER__BOTTOM = 2;

	/**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER__LEFT = 3;

	/**
	 * The feature id for the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER__RIGHT = 4;

	/**
	 * The number of structural features of the '<em>Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.SpacingImpl <em>Spacing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.SpacingImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getSpacing()
	 * @generated
	 */
	int SPACING = 5;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACING__SIZE = 0;

	/**
	 * The feature id for the '<em><b>Breakpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACING__BREAKPOINT = 1;

	/**
	 * The feature id for the '<em><b>Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACING__TOP = 2;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACING__BOTTOM = 3;

	/**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACING__LEFT = 4;

	/**
	 * The feature id for the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACING__RIGHT = 5;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACING__X = 6;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACING__Y = 7;

	/**
	 * The number of structural features of the '<em>Spacing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACING_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Spacing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.TextImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 6;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ALIGNMENT = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__COLOR = 1;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TRANSFORM = 2;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__WEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Monospace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__MONOSPACE = 4;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ITALIC = 5;

	/**
	 * The feature id for the '<em><b>Nowrap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__NOWRAP = 6;

	/**
	 * The feature id for the '<em><b>Truncate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TRUNCATE = 7;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.FloatImpl <em>Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.FloatImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 7;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__SIDE = 0;

	/**
	 * The feature id for the '<em><b>Breakpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__BREAKPOINT = 1;

	/**
	 * The number of structural features of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.TagImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 8;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__MARKERS = HtmlPackage.TAG__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__URIS = HtmlPackage.TAG__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__DESCRIPTION = HtmlPackage.TAG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__UUID = HtmlPackage.TAG__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__LABEL_PROTOTYPE = HtmlPackage.TAG__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__REPRESENTATIONS = HtmlPackage.TAG__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__ANNOTATIONS = HtmlPackage.TAG__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__ATTRIBUTES = HtmlPackage.TAG__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__CONTENT = HtmlPackage.TAG__CONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = HtmlPackage.TAG__NAME;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__APPEARANCE = HtmlPackage.TAG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = HtmlPackage.TAG_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = HtmlPackage.TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.DivImpl <em>Div</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.DivImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getDiv()
	 * @generated
	 */
	int DIV = 10;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.ItemImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 11;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.ActionGroupItemImpl <em>Action Group Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.ActionGroupItemImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getActionGroupItem()
	 * @generated
	 */
	int ACTION_GROUP_ITEM = 12;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.LinkActionGroupItemImpl <em>Link Action Group Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.LinkActionGroupItemImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getLinkActionGroupItem()
	 * @generated
	 */
	int LINK_ACTION_GROUP_ITEM = 13;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.ContentActionGroupItemImpl <em>Content Action Group Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.ContentActionGroupItemImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getContentActionGroupItem()
	 * @generated
	 */
	int CONTENT_ACTION_GROUP_ITEM = 14;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.ActionGroupImpl <em>Action Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.ActionGroupImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getActionGroup()
	 * @generated
	 */
	int ACTION_GROUP = 15;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.ContainerImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 16;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.RowImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 17;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.ColumnWidthImpl <em>Column Width</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.ColumnWidthImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getColumnWidth()
	 * @generated
	 */
	int COLUMN_WIDTH = 18;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.ColumnImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 19;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.TableRowContainerImpl <em>Table Row Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.TableRowContainerImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getTableRowContainer()
	 * @generated
	 */
	int TABLE_ROW_CONTAINER = 20;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.TableSectionImpl <em>Table Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.TableSectionImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getTableSection()
	 * @generated
	 */
	int TABLE_SECTION = 21;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.TableHeaderImpl <em>Table Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.TableHeaderImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getTableHeader()
	 * @generated
	 */
	int TABLE_HEADER = 22;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.TableConfiguration <em>Table Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.TableConfiguration
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getTableConfiguration()
	 * @generated
	 */
	int TABLE_CONFIGURATION = 23;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.TableImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 24;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.TableRowImpl <em>Table Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.TableRowImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getTableRow()
	 * @generated
	 */
	int TABLE_ROW = 25;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.TableCellImpl <em>Table Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.TableCellImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getTableCell()
	 * @generated
	 */
	int TABLE_CELL = 26;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.CardImpl <em>Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.CardImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getCard()
	 * @generated
	 */
	int CARD = 27;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.AlertImpl <em>Alert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.AlertImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getAlert()
	 * @generated
	 */
	int ALERT = 28;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.BadgeImpl <em>Badge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.BadgeImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getBadge()
	 * @generated
	 */
	int BADGE = 29;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.BreadcrumbImpl <em>Breadcrumb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.BreadcrumbImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getBreadcrumb()
	 * @generated
	 */
	int BREADCRUMB = 30;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.ButtonImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 31;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.ButtonGroupImpl <em>Button Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.ButtonGroupImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getButtonGroup()
	 * @generated
	 */
	int BUTTON_GROUP = 32;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.ButtonToolbarImpl <em>Button Toolbar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.ButtonToolbarImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getButtonToolbar()
	 * @generated
	 */
	int BUTTON_TOOLBAR = 33;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.DropdownImpl <em>Dropdown</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.DropdownImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getDropdown()
	 * @generated
	 */
	int DROPDOWN = 34;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.FormImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 35;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.ListGroupImpl <em>List Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.ListGroupImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getListGroup()
	 * @generated
	 */
	int LIST_GROUP = 36;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.NavsImpl <em>Navs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.NavsImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getNavs()
	 * @generated
	 */
	int NAVS = 37;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.NavbarImpl <em>Navbar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.NavbarImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getNavbar()
	 * @generated
	 */
	int NAVBAR = 38;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.TooltipImpl <em>Tooltip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.TooltipImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getTooltip()
	 * @generated
	 */
	int TOOLTIP = 39;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.InputGroupImpl <em>Input Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.InputGroupImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getInputGroup()
	 * @generated
	 */
	int INPUT_GROUP = 40;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.FormGroupImpl <em>Form Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.FormGroupImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getFormGroup()
	 * @generated
	 */
	int FORM_GROUP = 41;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.CollapseImpl <em>Collapse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.CollapseImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getCollapse()
	 * @generated
	 */
	int COLLAPSE = 42;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.ModalImpl <em>Modal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.ModalImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getModal()
	 * @generated
	 */
	int MODAL = 9;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__MARKERS = BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__URIS = BOOTSTRAP_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__DESCRIPTION = BOOTSTRAP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__UUID = BOOTSTRAP_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__LABEL_PROTOTYPE = BOOTSTRAP_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__REPRESENTATIONS = BOOTSTRAP_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__ANNOTATIONS = BOOTSTRAP_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__ATTRIBUTES = BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__CONTENT = BOOTSTRAP_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__APPEARANCE = BOOTSTRAP_ELEMENT__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__HEADER = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__BODY = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__FOOTER = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dismisser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__DISMISSER = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scrollable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__SCROLLABLE = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__CENTERED = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__SIZE = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Modal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_FEATURE_COUNT = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Modal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_OPERATION_COUNT = BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__MARKERS = TAG__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__URIS = TAG__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__DESCRIPTION = TAG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__UUID = TAG__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__LABEL_PROTOTYPE = TAG__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__REPRESENTATIONS = TAG__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__ANNOTATIONS = TAG__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__ATTRIBUTES = TAG__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__CONTENT = TAG__CONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__NAME = TAG__NAME;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__APPEARANCE = TAG__APPEARANCE;

	/**
	 * The number of structural features of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_FEATURE_COUNT = TAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_OPERATION_COUNT = TAG_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__MARKERS = NcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__URIS = NcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__DESCRIPTION = NcorePackage.MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__UUID = NcorePackage.MODEL_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__LABEL_PROTOTYPE = NcorePackage.MODEL_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__REPRESENTATIONS = NcorePackage.MODEL_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ANNOTATIONS = NcorePackage.MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ACTIVE = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__DISABLED = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__COLOR = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = NcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_ITEM__MARKERS = ITEM__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_ITEM__URIS = ITEM__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_ITEM__DESCRIPTION = ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_ITEM__UUID = ITEM__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_ITEM__LABEL_PROTOTYPE = ITEM__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_ITEM__REPRESENTATIONS = ITEM__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_ITEM__ANNOTATIONS = ITEM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_ITEM__ACTIVE = ITEM__ACTIVE;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_ITEM__DISABLED = ITEM__DISABLED;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_ITEM__COLOR = ITEM__COLOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_ITEM__NAME = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Group Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action Group Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_GROUP_ITEM__MARKERS = ACTION_GROUP_ITEM__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_GROUP_ITEM__URIS = ACTION_GROUP_ITEM__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_GROUP_ITEM__DESCRIPTION = ACTION_GROUP_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_GROUP_ITEM__UUID = ACTION_GROUP_ITEM__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_GROUP_ITEM__LABEL_PROTOTYPE = ACTION_GROUP_ITEM__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_GROUP_ITEM__REPRESENTATIONS = ACTION_GROUP_ITEM__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_GROUP_ITEM__ANNOTATIONS = ACTION_GROUP_ITEM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_GROUP_ITEM__ACTIVE = ACTION_GROUP_ITEM__ACTIVE;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_GROUP_ITEM__DISABLED = ACTION_GROUP_ITEM__DISABLED;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_GROUP_ITEM__COLOR = ACTION_GROUP_ITEM__COLOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_GROUP_ITEM__NAME = ACTION_GROUP_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_GROUP_ITEM__URL = ACTION_GROUP_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link Action Group Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_GROUP_ITEM_FEATURE_COUNT = ACTION_GROUP_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Link Action Group Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_GROUP_ITEM_OPERATION_COUNT = ACTION_GROUP_ITEM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ACTION_GROUP_ITEM__MARKERS = ACTION_GROUP_ITEM__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ACTION_GROUP_ITEM__URIS = ACTION_GROUP_ITEM__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ACTION_GROUP_ITEM__DESCRIPTION = ACTION_GROUP_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ACTION_GROUP_ITEM__UUID = ACTION_GROUP_ITEM__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ACTION_GROUP_ITEM__LABEL_PROTOTYPE = ACTION_GROUP_ITEM__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ACTION_GROUP_ITEM__REPRESENTATIONS = ACTION_GROUP_ITEM__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ACTION_GROUP_ITEM__ANNOTATIONS = ACTION_GROUP_ITEM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ACTION_GROUP_ITEM__ACTIVE = ACTION_GROUP_ITEM__ACTIVE;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ACTION_GROUP_ITEM__DISABLED = ACTION_GROUP_ITEM__DISABLED;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ACTION_GROUP_ITEM__COLOR = ACTION_GROUP_ITEM__COLOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ACTION_GROUP_ITEM__NAME = ACTION_GROUP_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ACTION_GROUP_ITEM__CONTENT = ACTION_GROUP_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Content Action Group Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ACTION_GROUP_ITEM_FEATURE_COUNT = ACTION_GROUP_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Content Action Group Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ACTION_GROUP_ITEM_OPERATION_COUNT = ACTION_GROUP_ITEM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__MARKERS = DIV__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__URIS = DIV__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__DESCRIPTION = DIV__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__UUID = DIV__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__LABEL_PROTOTYPE = DIV__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__REPRESENTATIONS = DIV__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__ANNOTATIONS = DIV__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__ATTRIBUTES = DIV__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__CONTENT = DIV__CONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__NAME = DIV__NAME;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__APPEARANCE = DIV__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Flush</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__FLUSH = DIV_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__ITEMS = DIV_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_FEATURE_COUNT = DIV_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Action Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_OPERATION_COUNT = DIV_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MARKERS = BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__URIS = BOOTSTRAP_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DESCRIPTION = BOOTSTRAP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__UUID = BOOTSTRAP_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__LABEL_PROTOTYPE = BOOTSTRAP_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__REPRESENTATIONS = BOOTSTRAP_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ANNOTATIONS = BOOTSTRAP_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ATTRIBUTES = BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTENT = BOOTSTRAP_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__APPEARANCE = BOOTSTRAP_ELEMENT__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ROWS = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fluid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__FLUID = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__MARKERS = BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__URIS = BOOTSTRAP_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__DESCRIPTION = BOOTSTRAP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__UUID = BOOTSTRAP_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__LABEL_PROTOTYPE = BOOTSTRAP_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__REPRESENTATIONS = BOOTSTRAP_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__ANNOTATIONS = BOOTSTRAP_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__ATTRIBUTES = BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__CONTENT = BOOTSTRAP_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__APPEARANCE = BOOTSTRAP_ELEMENT__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__COLUMNS = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Breakpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_WIDTH__BREAKPOINT = 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_WIDTH__WIDTH = 1;

	/**
	 * The number of structural features of the '<em>Column Width</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_WIDTH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Column Width</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_WIDTH_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__MARKERS = BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__URIS = BOOTSTRAP_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__DESCRIPTION = BOOTSTRAP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__UUID = BOOTSTRAP_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__LABEL_PROTOTYPE = BOOTSTRAP_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__REPRESENTATIONS = BOOTSTRAP_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ANNOTATIONS = BOOTSTRAP_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ATTRIBUTES = BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CONTENT = BOOTSTRAP_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__APPEARANCE = BOOTSTRAP_ELEMENT__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Width</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__WIDTH = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_CONTAINER__MARKERS = BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_CONTAINER__URIS = BOOTSTRAP_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_CONTAINER__DESCRIPTION = BOOTSTRAP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_CONTAINER__UUID = BOOTSTRAP_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_CONTAINER__LABEL_PROTOTYPE = BOOTSTRAP_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_CONTAINER__REPRESENTATIONS = BOOTSTRAP_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_CONTAINER__ANNOTATIONS = BOOTSTRAP_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_CONTAINER__ATTRIBUTES = BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_CONTAINER__CONTENT = BOOTSTRAP_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_CONTAINER__APPEARANCE = BOOTSTRAP_ELEMENT__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_CONTAINER__ROWS = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Row Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_CONTAINER_FEATURE_COUNT = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table Row Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_CONTAINER_OPERATION_COUNT = BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__MARKERS = TABLE_ROW_CONTAINER__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__URIS = TABLE_ROW_CONTAINER__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__DESCRIPTION = TABLE_ROW_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__UUID = TABLE_ROW_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__LABEL_PROTOTYPE = TABLE_ROW_CONTAINER__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__REPRESENTATIONS = TABLE_ROW_CONTAINER__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__ANNOTATIONS = TABLE_ROW_CONTAINER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__ATTRIBUTES = TABLE_ROW_CONTAINER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__CONTENT = TABLE_ROW_CONTAINER__CONTENT;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__APPEARANCE = TABLE_ROW_CONTAINER__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__ROWS = TABLE_ROW_CONTAINER__ROWS;

	/**
	 * The number of structural features of the '<em>Table Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION_FEATURE_COUNT = TABLE_ROW_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION_OPERATION_COUNT = TABLE_ROW_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER__MARKERS = TABLE_SECTION__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER__URIS = TABLE_SECTION__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER__DESCRIPTION = TABLE_SECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER__UUID = TABLE_SECTION__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER__LABEL_PROTOTYPE = TABLE_SECTION__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER__REPRESENTATIONS = TABLE_SECTION__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER__ANNOTATIONS = TABLE_SECTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER__ATTRIBUTES = TABLE_SECTION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER__CONTENT = TABLE_SECTION__CONTENT;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER__APPEARANCE = TABLE_SECTION__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER__ROWS = TABLE_SECTION__ROWS;

	/**
	 * The feature id for the '<em><b>Dark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER__DARK = TABLE_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER__LIGHT = TABLE_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Table Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER_FEATURE_COUNT = TABLE_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Table Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER_OPERATION_COUNT = TABLE_SECTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONFIGURATION__DARK = 0;

	/**
	 * The feature id for the '<em><b>Striped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONFIGURATION__STRIPED = 1;

	/**
	 * The feature id for the '<em><b>Bordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONFIGURATION__BORDERED = 2;

	/**
	 * The feature id for the '<em><b>Borderless</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONFIGURATION__BORDERLESS = 3;

	/**
	 * The feature id for the '<em><b>Hover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONFIGURATION__HOVER = 4;

	/**
	 * The feature id for the '<em><b>Small</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONFIGURATION__SMALL = 5;

	/**
	 * The number of structural features of the '<em>Table Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONFIGURATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Table Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__MARKERS = TABLE_ROW_CONTAINER__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__URIS = TABLE_ROW_CONTAINER__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DESCRIPTION = TABLE_ROW_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__UUID = TABLE_ROW_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LABEL_PROTOTYPE = TABLE_ROW_CONTAINER__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__REPRESENTATIONS = TABLE_ROW_CONTAINER__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ANNOTATIONS = TABLE_ROW_CONTAINER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ATTRIBUTES = TABLE_ROW_CONTAINER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CONTENT = TABLE_ROW_CONTAINER__CONTENT;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__APPEARANCE = TABLE_ROW_CONTAINER__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ROWS = TABLE_ROW_CONTAINER__ROWS;

	/**
	 * The feature id for the '<em><b>Dark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DARK = TABLE_ROW_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Striped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__STRIPED = TABLE_ROW_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BORDERED = TABLE_ROW_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Borderless</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BORDERLESS = TABLE_ROW_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__HOVER = TABLE_ROW_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Small</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SMALL = TABLE_ROW_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__HEADER = TABLE_ROW_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BODY = TABLE_ROW_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__FOOTER = TABLE_ROW_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = TABLE_ROW_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = TABLE_ROW_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__MARKERS = BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__URIS = BOOTSTRAP_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__DESCRIPTION = BOOTSTRAP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__UUID = BOOTSTRAP_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__LABEL_PROTOTYPE = BOOTSTRAP_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__REPRESENTATIONS = BOOTSTRAP_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__ANNOTATIONS = BOOTSTRAP_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__ATTRIBUTES = BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__CONTENT = BOOTSTRAP_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__APPEARANCE = BOOTSTRAP_ELEMENT__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__CELLS = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__COLOR = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__BACKGROUND = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_FEATURE_COUNT = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_OPERATION_COUNT = BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__MARKERS = BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__URIS = BOOTSTRAP_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__DESCRIPTION = BOOTSTRAP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__UUID = BOOTSTRAP_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__LABEL_PROTOTYPE = BOOTSTRAP_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__REPRESENTATIONS = BOOTSTRAP_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__ANNOTATIONS = BOOTSTRAP_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__ATTRIBUTES = BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__CONTENT = BOOTSTRAP_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__APPEARANCE = BOOTSTRAP_ELEMENT__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__HEADER = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__COL_SPAN = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Row Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__ROW_SPAN = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__COLOR = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__BACKGROUND = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_FEATURE_COUNT = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_OPERATION_COUNT = BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__MARKERS = DIV__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__URIS = DIV__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__DESCRIPTION = DIV__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__UUID = DIV__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__LABEL_PROTOTYPE = DIV__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__REPRESENTATIONS = DIV__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__ANNOTATIONS = DIV__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__ATTRIBUTES = DIV__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__CONTENT = DIV__CONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__NAME = DIV__NAME;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__APPEARANCE = DIV__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__HEADER = DIV_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__BODY = DIV_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__FOOTER = DIV_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FEATURE_COUNT = DIV_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_OPERATION_COUNT = DIV_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__MARKERS = DIV__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__URIS = DIV__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__DESCRIPTION = DIV__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__UUID = DIV__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__LABEL_PROTOTYPE = DIV__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__REPRESENTATIONS = DIV__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__ANNOTATIONS = DIV__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__ATTRIBUTES = DIV__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__CONTENT = DIV__CONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__NAME = DIV__NAME;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__APPEARANCE = DIV__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__COLOR = DIV_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_FEATURE_COUNT = DIV_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Alert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_OPERATION_COUNT = DIV_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__MARKERS = DIV__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__URIS = DIV__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__DESCRIPTION = DIV__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__UUID = DIV__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__LABEL_PROTOTYPE = DIV__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__REPRESENTATIONS = DIV__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__ANNOTATIONS = DIV__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__ATTRIBUTES = DIV__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__CONTENT = DIV__CONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__NAME = DIV__NAME;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__APPEARANCE = DIV__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__COLOR = DIV_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Badge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_FEATURE_COUNT = DIV_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Badge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_OPERATION_COUNT = DIV_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Breadcrumb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Breadcrumb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__MARKERS = DIV__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__URIS = DIV__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__DESCRIPTION = DIV__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__UUID = DIV__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LABEL_PROTOTYPE = DIV__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__REPRESENTATIONS = DIV__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ANNOTATIONS = DIV__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ATTRIBUTES = DIV__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__CONTENT = DIV__CONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = DIV__NAME;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__APPEARANCE = DIV__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__COLOR = DIV_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__OUTLINE = DIV_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = DIV_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = DIV_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Button Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Button Toolbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TOOLBAR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Button Toolbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TOOLBAR_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Dropdown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dropdown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>List Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>List Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Navs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Navs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVS_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Navbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Navbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Tooltip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Tooltip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Input Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Input Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Form Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Form Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Collapse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLAPSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Collapse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLAPSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.AccordionImpl <em>Accordion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.AccordionImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getAccordion()
	 * @generated
	 */
	int ACCORDION = 43;

	/**
	 * The number of structural features of the '<em>Accordion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Accordion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.CarouselImpl <em>Carousel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.CarouselImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getCarousel()
	 * @generated
	 */
	int CAROUSEL = 44;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__MARKERS = DIV__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__URIS = DIV__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__DESCRIPTION = DIV__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__UUID = DIV__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__LABEL_PROTOTYPE = DIV__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__REPRESENTATIONS = DIV__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__ANNOTATIONS = DIV__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__ATTRIBUTES = DIV__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__CONTENT = DIV__CONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__NAME = DIV__NAME;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__APPEARANCE = DIV__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Slides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__SLIDES = DIV_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__CONTROLS = DIV_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__INDICATOR = DIV_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cross Fade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__CROSS_FADE = DIV_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ride</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__RIDE = DIV_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__INTERVAL = DIV_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Carousel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_FEATURE_COUNT = DIV_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Carousel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_OPERATION_COUNT = DIV_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bootstrap.impl.SlideImpl <em>Slide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bootstrap.impl.SlideImpl
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getSlide()
	 * @generated
	 */
	int SLIDE = 45;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__MARKERS = DIV__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__URIS = DIV__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__DESCRIPTION = DIV__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__UUID = DIV__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__LABEL_PROTOTYPE = DIV__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__REPRESENTATIONS = DIV__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__ANNOTATIONS = DIV__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__ATTRIBUTES = DIV__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__CONTENT = DIV__CONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__NAME = DIV__NAME;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__APPEARANCE = DIV__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__INTERVAL = DIV_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Captions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__CAPTIONS = DIV_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Slide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE_FEATURE_COUNT = DIV_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Slide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE_OPERATION_COUNT = DIV_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Theme</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.html.bootstrap.Theme
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getTheme()
	 * @generated
	 */
	int THEME = 46;

	/**
	 * The meta object id for the '<em>Color</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.html.bootstrap.Color
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 47;

	/**
	 * The meta object id for the '<em>Size</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.html.bootstrap.Size
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getSize()
	 * @generated
	 */
	int SIZE = 48;

	/**
	 * The meta object id for the '<em>Breakpoint</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.html.bootstrap.Breakpoint
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getBreakpoint()
	 * @generated
	 */
	int BREAKPOINT = 49;

	/**
	 * The meta object id for the '<em>Text Alignment</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.html.bootstrap.Text.Alignment
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getTextAlignment()
	 * @generated
	 */
	int TEXT_ALIGNMENT = 50;

	/**
	 * The meta object id for the '<em>Text Transform</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.html.bootstrap.Text.Transform
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getTextTransform()
	 * @generated
	 */
	int TEXT_TRANSFORM = 51;

	/**
	 * The meta object id for the '<em>Text Weight</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.html.bootstrap.Text.Weight
	 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getTextWeight()
	 * @generated
	 */
	int TEXT_WEIGHT = 52;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.BootstrapElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.nasdanika.models.bootstrap.BootstrapElement
	 * @generated
	 */
	EClass getBootstrapElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.bootstrap.BootstrapElement#getAppearance <em>Appearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Appearance</em>'.
	 * @see org.nasdanika.models.bootstrap.BootstrapElement#getAppearance()
	 * @see #getBootstrapElement()
	 * @generated
	 */
	EReference getBootstrapElement_Appearance();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see org.nasdanika.models.bootstrap.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Page#isCdn <em>Cdn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cdn</em>'.
	 * @see org.nasdanika.models.bootstrap.Page#isCdn()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Cdn();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Page#getTheme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Theme</em>'.
	 * @see org.nasdanika.models.bootstrap.Page#getTheme()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Theme();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Appearance <em>Appearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appearance</em>'.
	 * @see org.nasdanika.models.bootstrap.Appearance
	 * @generated
	 */
	EClass getAppearance();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Appearance#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see org.nasdanika.models.bootstrap.Appearance#getBackground()
	 * @see #getAppearance()
	 * @generated
	 */
	EAttribute getAppearance_Background();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.models.bootstrap.Appearance#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Attributes</em>'.
	 * @see org.nasdanika.models.bootstrap.Appearance#getAttributes()
	 * @see #getAppearance()
	 * @generated
	 */
	EReference getAppearance_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bootstrap.Appearance#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Border</em>'.
	 * @see org.nasdanika.models.bootstrap.Appearance#getBorder()
	 * @see #getAppearance()
	 * @generated
	 */
	EReference getAppearance_Border();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bootstrap.Appearance#getMargin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Margin</em>'.
	 * @see org.nasdanika.models.bootstrap.Appearance#getMargin()
	 * @see #getAppearance()
	 * @generated
	 */
	EReference getAppearance_Margin();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bootstrap.Appearance#getPadding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Padding</em>'.
	 * @see org.nasdanika.models.bootstrap.Appearance#getPadding()
	 * @see #getAppearance()
	 * @generated
	 */
	EReference getAppearance_Padding();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.bootstrap.Appearance#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.nasdanika.models.bootstrap.Appearance#getText()
	 * @see #getAppearance()
	 * @generated
	 */
	EReference getAppearance_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bootstrap.Appearance#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Float</em>'.
	 * @see org.nasdanika.models.bootstrap.Appearance#getFloat()
	 * @see #getAppearance()
	 * @generated
	 */
	EReference getAppearance_Float();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.models.bootstrap.Appearance#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Children</em>'.
	 * @see org.nasdanika.models.bootstrap.Appearance#getChildren()
	 * @see #getAppearance()
	 * @generated
	 */
	EReference getAppearance_Children();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.bootstrap.Appearance#effectiveAppearance(java.lang.String) <em>Effective Appearance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Effective Appearance</em>' operation.
	 * @see org.nasdanika.models.bootstrap.Appearance#effectiveAppearance(java.lang.String)
	 * @generated
	 */
	EOperation getAppearance__EffectiveAppearance__String();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Appearance Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appearance Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="org.nasdanika.models.bootstrap.Appearance" valueContainment="true" valueRequired="true"
	 *        annotation="urn:org.nasdanika documentation-reference='doc/appearance-entry.md'"
	 * @generated
	 */
	EClass getAppearanceEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getAppearanceEntry()
	 * @generated
	 */
	EAttribute getAppearanceEntry_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getAppearanceEntry()
	 * @generated
	 */
	EReference getAppearanceEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Border <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border</em>'.
	 * @see org.nasdanika.models.bootstrap.Border
	 * @generated
	 */
	EClass getBorder();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Border#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.models.bootstrap.Border#getColor()
	 * @see #getBorder()
	 * @generated
	 */
	EAttribute getBorder_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Border#isTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top</em>'.
	 * @see org.nasdanika.models.bootstrap.Border#isTop()
	 * @see #getBorder()
	 * @generated
	 */
	EAttribute getBorder_Top();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Border#isBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom</em>'.
	 * @see org.nasdanika.models.bootstrap.Border#isBottom()
	 * @see #getBorder()
	 * @generated
	 */
	EAttribute getBorder_Bottom();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Border#isLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see org.nasdanika.models.bootstrap.Border#isLeft()
	 * @see #getBorder()
	 * @generated
	 */
	EAttribute getBorder_Left();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Border#isRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see org.nasdanika.models.bootstrap.Border#isRight()
	 * @see #getBorder()
	 * @generated
	 */
	EAttribute getBorder_Right();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Spacing <em>Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spacing</em>'.
	 * @see org.nasdanika.models.bootstrap.Spacing
	 * @generated
	 */
	EClass getSpacing();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Spacing#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.models.bootstrap.Spacing#getSize()
	 * @see #getSpacing()
	 * @generated
	 */
	EAttribute getSpacing_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Spacing#getBreakpoint <em>Breakpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Breakpoint</em>'.
	 * @see org.nasdanika.models.bootstrap.Spacing#getBreakpoint()
	 * @see #getSpacing()
	 * @generated
	 */
	EAttribute getSpacing_Breakpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Spacing#isTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top</em>'.
	 * @see org.nasdanika.models.bootstrap.Spacing#isTop()
	 * @see #getSpacing()
	 * @generated
	 */
	EAttribute getSpacing_Top();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Spacing#isBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom</em>'.
	 * @see org.nasdanika.models.bootstrap.Spacing#isBottom()
	 * @see #getSpacing()
	 * @generated
	 */
	EAttribute getSpacing_Bottom();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Spacing#isLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see org.nasdanika.models.bootstrap.Spacing#isLeft()
	 * @see #getSpacing()
	 * @generated
	 */
	EAttribute getSpacing_Left();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Spacing#isRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see org.nasdanika.models.bootstrap.Spacing#isRight()
	 * @see #getSpacing()
	 * @generated
	 */
	EAttribute getSpacing_Right();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Spacing#isX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.nasdanika.models.bootstrap.Spacing#isX()
	 * @see #getSpacing()
	 * @generated
	 */
	EAttribute getSpacing_X();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Spacing#isY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.nasdanika.models.bootstrap.Spacing#isY()
	 * @see #getSpacing()
	 * @generated
	 */
	EAttribute getSpacing_Y();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see org.nasdanika.models.bootstrap.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Text#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.nasdanika.models.bootstrap.Text#getAlignment()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Alignment();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Text#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.models.bootstrap.Text#getColor()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Text#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.nasdanika.models.bootstrap.Text#getTransform()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Text#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.nasdanika.models.bootstrap.Text#getWeight()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Weight();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Text#isMonospace <em>Monospace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monospace</em>'.
	 * @see org.nasdanika.models.bootstrap.Text#isMonospace()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Monospace();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Text#isItalic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Italic</em>'.
	 * @see org.nasdanika.models.bootstrap.Text#isItalic()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Italic();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Text#isNowrap <em>Nowrap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nowrap</em>'.
	 * @see org.nasdanika.models.bootstrap.Text#isNowrap()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Nowrap();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Text#isTruncate <em>Truncate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Truncate</em>'.
	 * @see org.nasdanika.models.bootstrap.Text#isTruncate()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Truncate();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float</em>'.
	 * @see org.nasdanika.models.bootstrap.Float
	 * @generated
	 */
	EClass getFloat();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Float#getSide <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side</em>'.
	 * @see org.nasdanika.models.bootstrap.Float#getSide()
	 * @see #getFloat()
	 * @generated
	 */
	EAttribute getFloat_Side();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Float#getBreakpoint <em>Breakpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Breakpoint</em>'.
	 * @see org.nasdanika.models.bootstrap.Float#getBreakpoint()
	 * @see #getFloat()
	 * @generated
	 */
	EAttribute getFloat_Breakpoint();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see org.nasdanika.models.bootstrap.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Div</em>'.
	 * @see org.nasdanika.models.bootstrap.Div
	 * @generated
	 */
	EClass getDiv();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.nasdanika.models.bootstrap.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Item#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.nasdanika.models.bootstrap.Item#isActive()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Active();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Item#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.nasdanika.models.bootstrap.Item#isDisabled()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Item#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.models.bootstrap.Item#getColor()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Color();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.ActionGroupItem <em>Action Group Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Group Item</em>'.
	 * @see org.nasdanika.models.bootstrap.ActionGroupItem
	 * @generated
	 */
	EClass getActionGroupItem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bootstrap.ActionGroupItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name</em>'.
	 * @see org.nasdanika.models.bootstrap.ActionGroupItem#getName()
	 * @see #getActionGroupItem()
	 * @generated
	 */
	EReference getActionGroupItem_Name();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.LinkActionGroupItem <em>Link Action Group Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Action Group Item</em>'.
	 * @see org.nasdanika.models.bootstrap.LinkActionGroupItem
	 * @generated
	 */
	EClass getLinkActionGroupItem();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.LinkActionGroupItem#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.nasdanika.models.bootstrap.LinkActionGroupItem#getUrl()
	 * @see #getLinkActionGroupItem()
	 * @generated
	 */
	EAttribute getLinkActionGroupItem_Url();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.ContentActionGroupItem <em>Content Action Group Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Action Group Item</em>'.
	 * @see org.nasdanika.models.bootstrap.ContentActionGroupItem
	 * @generated
	 */
	EClass getContentActionGroupItem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bootstrap.ContentActionGroupItem#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see org.nasdanika.models.bootstrap.ContentActionGroupItem#getContent()
	 * @see #getContentActionGroupItem()
	 * @generated
	 */
	EReference getContentActionGroupItem_Content();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.ActionGroup <em>Action Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Group</em>'.
	 * @see org.nasdanika.models.bootstrap.ActionGroup
	 * @generated
	 */
	EClass getActionGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.ActionGroup#isFlush <em>Flush</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flush</em>'.
	 * @see org.nasdanika.models.bootstrap.ActionGroup#isFlush()
	 * @see #getActionGroup()
	 * @generated
	 */
	EAttribute getActionGroup_Flush();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bootstrap.ActionGroup#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.nasdanika.models.bootstrap.ActionGroup#getItems()
	 * @see #getActionGroup()
	 * @generated
	 */
	EReference getActionGroup_Items();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.nasdanika.models.bootstrap.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bootstrap.Container#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see org.nasdanika.models.bootstrap.Container#getRows()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Rows();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Container#isFluid <em>Fluid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fluid</em>'.
	 * @see org.nasdanika.models.bootstrap.Container#isFluid()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Fluid();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see org.nasdanika.models.bootstrap.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bootstrap.Row#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.nasdanika.models.bootstrap.Row#getColumns()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Columns();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.ColumnWidth <em>Column Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Width</em>'.
	 * @see org.nasdanika.models.bootstrap.ColumnWidth
	 * @generated
	 */
	EClass getColumnWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.ColumnWidth#getBreakpoint <em>Breakpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Breakpoint</em>'.
	 * @see org.nasdanika.models.bootstrap.ColumnWidth#getBreakpoint()
	 * @see #getColumnWidth()
	 * @generated
	 */
	EAttribute getColumnWidth_Breakpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.ColumnWidth#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.nasdanika.models.bootstrap.ColumnWidth#getWidth()
	 * @see #getColumnWidth()
	 * @generated
	 */
	EAttribute getColumnWidth_Width();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see org.nasdanika.models.bootstrap.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bootstrap.Column#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Width</em>'.
	 * @see org.nasdanika.models.bootstrap.Column#getWidth()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Width();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.TableRowContainer <em>Table Row Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Row Container</em>'.
	 * @see org.nasdanika.models.bootstrap.TableRowContainer
	 * @generated
	 */
	EClass getTableRowContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bootstrap.TableRowContainer#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see org.nasdanika.models.bootstrap.TableRowContainer#getRows()
	 * @see #getTableRowContainer()
	 * @generated
	 */
	EReference getTableRowContainer_Rows();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.TableSection <em>Table Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Section</em>'.
	 * @see org.nasdanika.models.bootstrap.TableSection
	 * @generated
	 */
	EClass getTableSection();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.TableHeader <em>Table Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Header</em>'.
	 * @see org.nasdanika.models.bootstrap.TableHeader
	 * @generated
	 */
	EClass getTableHeader();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.TableHeader#isDark <em>Dark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dark</em>'.
	 * @see org.nasdanika.models.bootstrap.TableHeader#isDark()
	 * @see #getTableHeader()
	 * @generated
	 */
	EAttribute getTableHeader_Dark();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.TableHeader#isLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Light</em>'.
	 * @see org.nasdanika.models.bootstrap.TableHeader#isLight()
	 * @see #getTableHeader()
	 * @generated
	 */
	EAttribute getTableHeader_Light();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.TableConfiguration <em>Table Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Configuration</em>'.
	 * @see org.nasdanika.models.bootstrap.TableConfiguration
	 * @generated
	 */
	EClass getTableConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.TableConfiguration#isDark <em>Dark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dark</em>'.
	 * @see org.nasdanika.models.bootstrap.TableConfiguration#isDark()
	 * @see #getTableConfiguration()
	 * @generated
	 */
	EAttribute getTableConfiguration_Dark();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.TableConfiguration#isStriped <em>Striped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Striped</em>'.
	 * @see org.nasdanika.models.bootstrap.TableConfiguration#isStriped()
	 * @see #getTableConfiguration()
	 * @generated
	 */
	EAttribute getTableConfiguration_Striped();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.TableConfiguration#isBordered <em>Bordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bordered</em>'.
	 * @see org.nasdanika.models.bootstrap.TableConfiguration#isBordered()
	 * @see #getTableConfiguration()
	 * @generated
	 */
	EAttribute getTableConfiguration_Bordered();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.TableConfiguration#isBorderless <em>Borderless</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Borderless</em>'.
	 * @see org.nasdanika.models.bootstrap.TableConfiguration#isBorderless()
	 * @see #getTableConfiguration()
	 * @generated
	 */
	EAttribute getTableConfiguration_Borderless();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.TableConfiguration#isHover <em>Hover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hover</em>'.
	 * @see org.nasdanika.models.bootstrap.TableConfiguration#isHover()
	 * @see #getTableConfiguration()
	 * @generated
	 */
	EAttribute getTableConfiguration_Hover();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.TableConfiguration#isSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Small</em>'.
	 * @see org.nasdanika.models.bootstrap.TableConfiguration#isSmall()
	 * @see #getTableConfiguration()
	 * @generated
	 */
	EAttribute getTableConfiguration_Small();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see org.nasdanika.models.bootstrap.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.bootstrap.Table#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see org.nasdanika.models.bootstrap.Table#getHeader()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Header();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.bootstrap.Table#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.nasdanika.models.bootstrap.Table#getBody()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Body();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.bootstrap.Table#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Footer</em>'.
	 * @see org.nasdanika.models.bootstrap.Table#getFooter()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Footer();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Row</em>'.
	 * @see org.nasdanika.models.bootstrap.TableRow
	 * @generated
	 */
	EClass getTableRow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bootstrap.TableRow#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see org.nasdanika.models.bootstrap.TableRow#getCells()
	 * @see #getTableRow()
	 * @generated
	 */
	EReference getTableRow_Cells();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.TableRow#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.models.bootstrap.TableRow#getColor()
	 * @see #getTableRow()
	 * @generated
	 */
	EAttribute getTableRow_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.TableRow#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see org.nasdanika.models.bootstrap.TableRow#getBackground()
	 * @see #getTableRow()
	 * @generated
	 */
	EAttribute getTableRow_Background();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.TableCell <em>Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Cell</em>'.
	 * @see org.nasdanika.models.bootstrap.TableCell
	 * @generated
	 */
	EClass getTableCell();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.TableCell#isHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see org.nasdanika.models.bootstrap.TableCell#isHeader()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_Header();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.TableCell#getColSpan <em>Col Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col Span</em>'.
	 * @see org.nasdanika.models.bootstrap.TableCell#getColSpan()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_ColSpan();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.TableCell#getRowSpan <em>Row Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Span</em>'.
	 * @see org.nasdanika.models.bootstrap.TableCell#getRowSpan()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_RowSpan();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.TableCell#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.models.bootstrap.TableCell#getColor()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.TableCell#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see org.nasdanika.models.bootstrap.TableCell#getBackground()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_Background();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Card <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card</em>'.
	 * @see org.nasdanika.models.bootstrap.Card
	 * @generated
	 */
	EClass getCard();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.bootstrap.Card#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see org.nasdanika.models.bootstrap.Card#getHeader()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Header();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.bootstrap.Card#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.nasdanika.models.bootstrap.Card#getBody()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Body();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.bootstrap.Card#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Footer</em>'.
	 * @see org.nasdanika.models.bootstrap.Card#getFooter()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Footer();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Alert <em>Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alert</em>'.
	 * @see org.nasdanika.models.bootstrap.Alert
	 * @generated
	 */
	EClass getAlert();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Alert#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.models.bootstrap.Alert#getColor()
	 * @see #getAlert()
	 * @generated
	 */
	EAttribute getAlert_Color();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Badge <em>Badge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Badge</em>'.
	 * @see org.nasdanika.models.bootstrap.Badge
	 * @generated
	 */
	EClass getBadge();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Badge#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.models.bootstrap.Badge#getColor()
	 * @see #getBadge()
	 * @generated
	 */
	EAttribute getBadge_Color();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Breadcrumb <em>Breadcrumb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Breadcrumb</em>'.
	 * @see org.nasdanika.models.bootstrap.Breadcrumb
	 * @generated
	 */
	EClass getBreadcrumb();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see org.nasdanika.models.bootstrap.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Button#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.models.bootstrap.Button#getColor()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Button#isOutline <em>Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline</em>'.
	 * @see org.nasdanika.models.bootstrap.Button#isOutline()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Outline();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.ButtonGroup <em>Button Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Group</em>'.
	 * @see org.nasdanika.models.bootstrap.ButtonGroup
	 * @generated
	 */
	EClass getButtonGroup();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.ButtonToolbar <em>Button Toolbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Toolbar</em>'.
	 * @see org.nasdanika.models.bootstrap.ButtonToolbar
	 * @generated
	 */
	EClass getButtonToolbar();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Dropdown <em>Dropdown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dropdown</em>'.
	 * @see org.nasdanika.models.bootstrap.Dropdown
	 * @generated
	 */
	EClass getDropdown();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see org.nasdanika.models.bootstrap.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.ListGroup <em>List Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Group</em>'.
	 * @see org.nasdanika.models.bootstrap.ListGroup
	 * @generated
	 */
	EClass getListGroup();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Navs <em>Navs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navs</em>'.
	 * @see org.nasdanika.models.bootstrap.Navs
	 * @generated
	 */
	EClass getNavs();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Navbar <em>Navbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navbar</em>'.
	 * @see org.nasdanika.models.bootstrap.Navbar
	 * @generated
	 */
	EClass getNavbar();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Tooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tooltip</em>'.
	 * @see org.nasdanika.models.bootstrap.Tooltip
	 * @generated
	 */
	EClass getTooltip();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.InputGroup <em>Input Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Group</em>'.
	 * @see org.nasdanika.models.bootstrap.InputGroup
	 * @generated
	 */
	EClass getInputGroup();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.FormGroup <em>Form Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Group</em>'.
	 * @see org.nasdanika.models.bootstrap.FormGroup
	 * @generated
	 */
	EClass getFormGroup();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Collapse <em>Collapse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collapse</em>'.
	 * @see org.nasdanika.models.bootstrap.Collapse
	 * @generated
	 */
	EClass getCollapse();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Modal <em>Modal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modal</em>'.
	 * @see org.nasdanika.models.bootstrap.Modal
	 * @generated
	 */
	EClass getModal();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.bootstrap.Modal#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see org.nasdanika.models.bootstrap.Modal#getHeader()
	 * @see #getModal()
	 * @generated
	 */
	EReference getModal_Header();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.bootstrap.Modal#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.nasdanika.models.bootstrap.Modal#getBody()
	 * @see #getModal()
	 * @generated
	 */
	EReference getModal_Body();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.bootstrap.Modal#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Footer</em>'.
	 * @see org.nasdanika.models.bootstrap.Modal#getFooter()
	 * @see #getModal()
	 * @generated
	 */
	EReference getModal_Footer();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Modal#isDismisser <em>Dismisser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dismisser</em>'.
	 * @see org.nasdanika.models.bootstrap.Modal#isDismisser()
	 * @see #getModal()
	 * @generated
	 */
	EAttribute getModal_Dismisser();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Modal#isScrollable <em>Scrollable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scrollable</em>'.
	 * @see org.nasdanika.models.bootstrap.Modal#isScrollable()
	 * @see #getModal()
	 * @generated
	 */
	EAttribute getModal_Scrollable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Modal#isCentered <em>Centered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Centered</em>'.
	 * @see org.nasdanika.models.bootstrap.Modal#isCentered()
	 * @see #getModal()
	 * @generated
	 */
	EAttribute getModal_Centered();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Modal#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.models.bootstrap.Modal#getSize()
	 * @see #getModal()
	 * @generated
	 */
	EAttribute getModal_Size();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Accordion <em>Accordion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accordion</em>'.
	 * @see org.nasdanika.models.bootstrap.Accordion
	 * @generated
	 */
	EClass getAccordion();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Carousel <em>Carousel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carousel</em>'.
	 * @see org.nasdanika.models.bootstrap.Carousel
	 * @generated
	 */
	EClass getCarousel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bootstrap.Carousel#getSlides <em>Slides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slides</em>'.
	 * @see org.nasdanika.models.bootstrap.Carousel#getSlides()
	 * @see #getCarousel()
	 * @generated
	 */
	EReference getCarousel_Slides();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Carousel#isControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controls</em>'.
	 * @see org.nasdanika.models.bootstrap.Carousel#isControls()
	 * @see #getCarousel()
	 * @generated
	 */
	EAttribute getCarousel_Controls();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Carousel#isIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see org.nasdanika.models.bootstrap.Carousel#isIndicator()
	 * @see #getCarousel()
	 * @generated
	 */
	EAttribute getCarousel_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Carousel#isCrossFade <em>Cross Fade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cross Fade</em>'.
	 * @see org.nasdanika.models.bootstrap.Carousel#isCrossFade()
	 * @see #getCarousel()
	 * @generated
	 */
	EAttribute getCarousel_CrossFade();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Carousel#isRide <em>Ride</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ride</em>'.
	 * @see org.nasdanika.models.bootstrap.Carousel#isRide()
	 * @see #getCarousel()
	 * @generated
	 */
	EAttribute getCarousel_Ride();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Carousel#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see org.nasdanika.models.bootstrap.Carousel#getInterval()
	 * @see #getCarousel()
	 * @generated
	 */
	EAttribute getCarousel_Interval();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bootstrap.Slide <em>Slide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slide</em>'.
	 * @see org.nasdanika.models.bootstrap.Slide
	 * @generated
	 */
	EClass getSlide();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bootstrap.Slide#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see org.nasdanika.models.bootstrap.Slide#getInterval()
	 * @see #getSlide()
	 * @generated
	 */
	EAttribute getSlide_Interval();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bootstrap.Slide#getCaptions <em>Captions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Captions</em>'.
	 * @see org.nasdanika.models.bootstrap.Slide#getCaptions()
	 * @see #getSlide()
	 * @generated
	 */
	EReference getSlide_Captions();

	/**
	 * Returns the meta object for data type '{@link org.nasdanika.html.bootstrap.Theme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Theme</em>'.
	 * @see org.nasdanika.html.bootstrap.Theme
	 * @model instanceClass="org.nasdanika.html.bootstrap.Theme"
	 * @generated
	 */
	EDataType getTheme();

	/**
	 * Returns the meta object for data type '{@link org.nasdanika.html.bootstrap.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color</em>'.
	 * @see org.nasdanika.html.bootstrap.Color
	 * @model instanceClass="org.nasdanika.html.bootstrap.Color"
	 * @generated
	 */
	EDataType getColor();

	/**
	 * Returns the meta object for data type '{@link org.nasdanika.html.bootstrap.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Size</em>'.
	 * @see org.nasdanika.html.bootstrap.Size
	 * @model instanceClass="org.nasdanika.html.bootstrap.Size"
	 * @generated
	 */
	EDataType getSize();

	/**
	 * Returns the meta object for data type '{@link org.nasdanika.html.bootstrap.Breakpoint <em>Breakpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Breakpoint</em>'.
	 * @see org.nasdanika.html.bootstrap.Breakpoint
	 * @model instanceClass="org.nasdanika.html.bootstrap.Breakpoint"
	 * @generated
	 */
	EDataType getBreakpoint();

	/**
	 * Returns the meta object for data type '{@link org.nasdanika.html.bootstrap.Text.Alignment <em>Text Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Alignment</em>'.
	 * @see org.nasdanika.html.bootstrap.Text.Alignment
	 * @model instanceClass="org.nasdanika.html.bootstrap.Text.Alignment"
	 * @generated
	 */
	EDataType getTextAlignment();

	/**
	 * Returns the meta object for data type '{@link org.nasdanika.html.bootstrap.Text.Transform <em>Text Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Transform</em>'.
	 * @see org.nasdanika.html.bootstrap.Text.Transform
	 * @model instanceClass="org.nasdanika.html.bootstrap.Text.Transform"
	 * @generated
	 */
	EDataType getTextTransform();

	/**
	 * Returns the meta object for data type '{@link org.nasdanika.html.bootstrap.Text.Weight <em>Text Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Weight</em>'.
	 * @see org.nasdanika.html.bootstrap.Text.Weight
	 * @model instanceClass="org.nasdanika.html.bootstrap.Text.Weight"
	 * @generated
	 */
	EDataType getTextWeight();

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
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.BootstrapElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapElementImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getBootstrapElement()
		 * @generated
		 */
		EClass BOOTSTRAP_ELEMENT = eINSTANCE.getBootstrapElement();

		/**
		 * The meta object literal for the '<em><b>Appearance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOTSTRAP_ELEMENT__APPEARANCE = eINSTANCE.getBootstrapElement_Appearance();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.PageImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Cdn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__CDN = eINSTANCE.getPage_Cdn();

		/**
		 * The meta object literal for the '<em><b>Theme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__THEME = eINSTANCE.getPage_Theme();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.AppearanceImpl <em>Appearance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.AppearanceImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getAppearance()
		 * @generated
		 */
		EClass APPEARANCE = eINSTANCE.getAppearance();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEARANCE__BACKGROUND = eINSTANCE.getAppearance_Background();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEARANCE__ATTRIBUTES = eINSTANCE.getAppearance_Attributes();

		/**
		 * The meta object literal for the '<em><b>Border</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEARANCE__BORDER = eINSTANCE.getAppearance_Border();

		/**
		 * The meta object literal for the '<em><b>Margin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEARANCE__MARGIN = eINSTANCE.getAppearance_Margin();

		/**
		 * The meta object literal for the '<em><b>Padding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEARANCE__PADDING = eINSTANCE.getAppearance_Padding();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEARANCE__TEXT = eINSTANCE.getAppearance_Text();

		/**
		 * The meta object literal for the '<em><b>Float</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEARANCE__FLOAT = eINSTANCE.getAppearance_Float();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEARANCE__CHILDREN = eINSTANCE.getAppearance_Children();

		/**
		 * The meta object literal for the '<em><b>Effective Appearance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPEARANCE___EFFECTIVE_APPEARANCE__STRING = eINSTANCE.getAppearance__EffectiveAppearance__String();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.AppearanceEntryImpl <em>Appearance Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.AppearanceEntryImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getAppearanceEntry()
		 * @generated
		 */
		EClass APPEARANCE_ENTRY = eINSTANCE.getAppearanceEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEARANCE_ENTRY__KEY = eINSTANCE.getAppearanceEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEARANCE_ENTRY__VALUE = eINSTANCE.getAppearanceEntry_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.BorderImpl <em>Border</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.BorderImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getBorder()
		 * @generated
		 */
		EClass BORDER = eINSTANCE.getBorder();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER__COLOR = eINSTANCE.getBorder_Color();

		/**
		 * The meta object literal for the '<em><b>Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER__TOP = eINSTANCE.getBorder_Top();

		/**
		 * The meta object literal for the '<em><b>Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER__BOTTOM = eINSTANCE.getBorder_Bottom();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER__LEFT = eINSTANCE.getBorder_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER__RIGHT = eINSTANCE.getBorder_Right();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.SpacingImpl <em>Spacing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.SpacingImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getSpacing()
		 * @generated
		 */
		EClass SPACING = eINSTANCE.getSpacing();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACING__SIZE = eINSTANCE.getSpacing_Size();

		/**
		 * The meta object literal for the '<em><b>Breakpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACING__BREAKPOINT = eINSTANCE.getSpacing_Breakpoint();

		/**
		 * The meta object literal for the '<em><b>Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACING__TOP = eINSTANCE.getSpacing_Top();

		/**
		 * The meta object literal for the '<em><b>Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACING__BOTTOM = eINSTANCE.getSpacing_Bottom();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACING__LEFT = eINSTANCE.getSpacing_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACING__RIGHT = eINSTANCE.getSpacing_Right();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACING__X = eINSTANCE.getSpacing_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACING__Y = eINSTANCE.getSpacing_Y();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.TextImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__ALIGNMENT = eINSTANCE.getText_Alignment();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__COLOR = eINSTANCE.getText_Color();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TRANSFORM = eINSTANCE.getText_Transform();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__WEIGHT = eINSTANCE.getText_Weight();

		/**
		 * The meta object literal for the '<em><b>Monospace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__MONOSPACE = eINSTANCE.getText_Monospace();

		/**
		 * The meta object literal for the '<em><b>Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__ITALIC = eINSTANCE.getText_Italic();

		/**
		 * The meta object literal for the '<em><b>Nowrap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__NOWRAP = eINSTANCE.getText_Nowrap();

		/**
		 * The meta object literal for the '<em><b>Truncate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TRUNCATE = eINSTANCE.getText_Truncate();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.FloatImpl <em>Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.FloatImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getFloat()
		 * @generated
		 */
		EClass FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '<em><b>Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT__SIDE = eINSTANCE.getFloat_Side();

		/**
		 * The meta object literal for the '<em><b>Breakpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT__BREAKPOINT = eINSTANCE.getFloat_Breakpoint();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.TagImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.DivImpl <em>Div</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.DivImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getDiv()
		 * @generated
		 */
		EClass DIV = eINSTANCE.getDiv();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.ItemImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ACTIVE = eINSTANCE.getItem_Active();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__DISABLED = eINSTANCE.getItem_Disabled();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__COLOR = eINSTANCE.getItem_Color();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.ActionGroupItemImpl <em>Action Group Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.ActionGroupItemImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getActionGroupItem()
		 * @generated
		 */
		EClass ACTION_GROUP_ITEM = eINSTANCE.getActionGroupItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_GROUP_ITEM__NAME = eINSTANCE.getActionGroupItem_Name();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.LinkActionGroupItemImpl <em>Link Action Group Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.LinkActionGroupItemImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getLinkActionGroupItem()
		 * @generated
		 */
		EClass LINK_ACTION_GROUP_ITEM = eINSTANCE.getLinkActionGroupItem();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_ACTION_GROUP_ITEM__URL = eINSTANCE.getLinkActionGroupItem_Url();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.ContentActionGroupItemImpl <em>Content Action Group Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.ContentActionGroupItemImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getContentActionGroupItem()
		 * @generated
		 */
		EClass CONTENT_ACTION_GROUP_ITEM = eINSTANCE.getContentActionGroupItem();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_ACTION_GROUP_ITEM__CONTENT = eINSTANCE.getContentActionGroupItem_Content();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.ActionGroupImpl <em>Action Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.ActionGroupImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getActionGroup()
		 * @generated
		 */
		EClass ACTION_GROUP = eINSTANCE.getActionGroup();

		/**
		 * The meta object literal for the '<em><b>Flush</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_GROUP__FLUSH = eINSTANCE.getActionGroup_Flush();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_GROUP__ITEMS = eINSTANCE.getActionGroup_Items();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.ContainerImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__ROWS = eINSTANCE.getContainer_Rows();

		/**
		 * The meta object literal for the '<em><b>Fluid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__FLUID = eINSTANCE.getContainer_Fluid();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.RowImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__COLUMNS = eINSTANCE.getRow_Columns();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.ColumnWidthImpl <em>Column Width</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.ColumnWidthImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getColumnWidth()
		 * @generated
		 */
		EClass COLUMN_WIDTH = eINSTANCE.getColumnWidth();

		/**
		 * The meta object literal for the '<em><b>Breakpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_WIDTH__BREAKPOINT = eINSTANCE.getColumnWidth_Breakpoint();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_WIDTH__WIDTH = eINSTANCE.getColumnWidth_Width();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.ColumnImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__WIDTH = eINSTANCE.getColumn_Width();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.TableRowContainerImpl <em>Table Row Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.TableRowContainerImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getTableRowContainer()
		 * @generated
		 */
		EClass TABLE_ROW_CONTAINER = eINSTANCE.getTableRowContainer();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_ROW_CONTAINER__ROWS = eINSTANCE.getTableRowContainer_Rows();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.TableSectionImpl <em>Table Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.TableSectionImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getTableSection()
		 * @generated
		 */
		EClass TABLE_SECTION = eINSTANCE.getTableSection();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.TableHeaderImpl <em>Table Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.TableHeaderImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getTableHeader()
		 * @generated
		 */
		EClass TABLE_HEADER = eINSTANCE.getTableHeader();

		/**
		 * The meta object literal for the '<em><b>Dark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_HEADER__DARK = eINSTANCE.getTableHeader_Dark();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_HEADER__LIGHT = eINSTANCE.getTableHeader_Light();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.TableConfiguration <em>Table Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.TableConfiguration
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getTableConfiguration()
		 * @generated
		 */
		EClass TABLE_CONFIGURATION = eINSTANCE.getTableConfiguration();

		/**
		 * The meta object literal for the '<em><b>Dark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CONFIGURATION__DARK = eINSTANCE.getTableConfiguration_Dark();

		/**
		 * The meta object literal for the '<em><b>Striped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CONFIGURATION__STRIPED = eINSTANCE.getTableConfiguration_Striped();

		/**
		 * The meta object literal for the '<em><b>Bordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CONFIGURATION__BORDERED = eINSTANCE.getTableConfiguration_Bordered();

		/**
		 * The meta object literal for the '<em><b>Borderless</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CONFIGURATION__BORDERLESS = eINSTANCE.getTableConfiguration_Borderless();

		/**
		 * The meta object literal for the '<em><b>Hover</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CONFIGURATION__HOVER = eINSTANCE.getTableConfiguration_Hover();

		/**
		 * The meta object literal for the '<em><b>Small</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CONFIGURATION__SMALL = eINSTANCE.getTableConfiguration_Small();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.TableImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__HEADER = eINSTANCE.getTable_Header();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__BODY = eINSTANCE.getTable_Body();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__FOOTER = eINSTANCE.getTable_Footer();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.TableRowImpl <em>Table Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.TableRowImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getTableRow()
		 * @generated
		 */
		EClass TABLE_ROW = eINSTANCE.getTableRow();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_ROW__CELLS = eINSTANCE.getTableRow_Cells();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ROW__COLOR = eINSTANCE.getTableRow_Color();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ROW__BACKGROUND = eINSTANCE.getTableRow_Background();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.TableCellImpl <em>Table Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.TableCellImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getTableCell()
		 * @generated
		 */
		EClass TABLE_CELL = eINSTANCE.getTableCell();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__HEADER = eINSTANCE.getTableCell_Header();

		/**
		 * The meta object literal for the '<em><b>Col Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__COL_SPAN = eINSTANCE.getTableCell_ColSpan();

		/**
		 * The meta object literal for the '<em><b>Row Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__ROW_SPAN = eINSTANCE.getTableCell_RowSpan();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__COLOR = eINSTANCE.getTableCell_Color();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__BACKGROUND = eINSTANCE.getTableCell_Background();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.CardImpl <em>Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.CardImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getCard()
		 * @generated
		 */
		EClass CARD = eINSTANCE.getCard();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__HEADER = eINSTANCE.getCard_Header();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__BODY = eINSTANCE.getCard_Body();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__FOOTER = eINSTANCE.getCard_Footer();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.AlertImpl <em>Alert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.AlertImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getAlert()
		 * @generated
		 */
		EClass ALERT = eINSTANCE.getAlert();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALERT__COLOR = eINSTANCE.getAlert_Color();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.BadgeImpl <em>Badge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.BadgeImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getBadge()
		 * @generated
		 */
		EClass BADGE = eINSTANCE.getBadge();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BADGE__COLOR = eINSTANCE.getBadge_Color();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.BreadcrumbImpl <em>Breadcrumb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.BreadcrumbImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getBreadcrumb()
		 * @generated
		 */
		EClass BREADCRUMB = eINSTANCE.getBreadcrumb();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.ButtonImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__COLOR = eINSTANCE.getButton_Color();

		/**
		 * The meta object literal for the '<em><b>Outline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__OUTLINE = eINSTANCE.getButton_Outline();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.ButtonGroupImpl <em>Button Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.ButtonGroupImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getButtonGroup()
		 * @generated
		 */
		EClass BUTTON_GROUP = eINSTANCE.getButtonGroup();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.ButtonToolbarImpl <em>Button Toolbar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.ButtonToolbarImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getButtonToolbar()
		 * @generated
		 */
		EClass BUTTON_TOOLBAR = eINSTANCE.getButtonToolbar();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.DropdownImpl <em>Dropdown</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.DropdownImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getDropdown()
		 * @generated
		 */
		EClass DROPDOWN = eINSTANCE.getDropdown();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.FormImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.ListGroupImpl <em>List Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.ListGroupImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getListGroup()
		 * @generated
		 */
		EClass LIST_GROUP = eINSTANCE.getListGroup();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.NavsImpl <em>Navs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.NavsImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getNavs()
		 * @generated
		 */
		EClass NAVS = eINSTANCE.getNavs();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.NavbarImpl <em>Navbar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.NavbarImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getNavbar()
		 * @generated
		 */
		EClass NAVBAR = eINSTANCE.getNavbar();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.TooltipImpl <em>Tooltip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.TooltipImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getTooltip()
		 * @generated
		 */
		EClass TOOLTIP = eINSTANCE.getTooltip();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.InputGroupImpl <em>Input Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.InputGroupImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getInputGroup()
		 * @generated
		 */
		EClass INPUT_GROUP = eINSTANCE.getInputGroup();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.FormGroupImpl <em>Form Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.FormGroupImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getFormGroup()
		 * @generated
		 */
		EClass FORM_GROUP = eINSTANCE.getFormGroup();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.CollapseImpl <em>Collapse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.CollapseImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getCollapse()
		 * @generated
		 */
		EClass COLLAPSE = eINSTANCE.getCollapse();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.ModalImpl <em>Modal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.ModalImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getModal()
		 * @generated
		 */
		EClass MODAL = eINSTANCE.getModal();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODAL__HEADER = eINSTANCE.getModal_Header();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODAL__BODY = eINSTANCE.getModal_Body();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODAL__FOOTER = eINSTANCE.getModal_Footer();

		/**
		 * The meta object literal for the '<em><b>Dismisser</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODAL__DISMISSER = eINSTANCE.getModal_Dismisser();

		/**
		 * The meta object literal for the '<em><b>Scrollable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODAL__SCROLLABLE = eINSTANCE.getModal_Scrollable();

		/**
		 * The meta object literal for the '<em><b>Centered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODAL__CENTERED = eINSTANCE.getModal_Centered();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODAL__SIZE = eINSTANCE.getModal_Size();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.AccordionImpl <em>Accordion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.AccordionImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getAccordion()
		 * @generated
		 */
		EClass ACCORDION = eINSTANCE.getAccordion();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.CarouselImpl <em>Carousel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.CarouselImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getCarousel()
		 * @generated
		 */
		EClass CAROUSEL = eINSTANCE.getCarousel();

		/**
		 * The meta object literal for the '<em><b>Slides</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAROUSEL__SLIDES = eINSTANCE.getCarousel_Slides();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAROUSEL__CONTROLS = eINSTANCE.getCarousel_Controls();

		/**
		 * The meta object literal for the '<em><b>Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAROUSEL__INDICATOR = eINSTANCE.getCarousel_Indicator();

		/**
		 * The meta object literal for the '<em><b>Cross Fade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAROUSEL__CROSS_FADE = eINSTANCE.getCarousel_CrossFade();

		/**
		 * The meta object literal for the '<em><b>Ride</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAROUSEL__RIDE = eINSTANCE.getCarousel_Ride();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAROUSEL__INTERVAL = eINSTANCE.getCarousel_Interval();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bootstrap.impl.SlideImpl <em>Slide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bootstrap.impl.SlideImpl
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getSlide()
		 * @generated
		 */
		EClass SLIDE = eINSTANCE.getSlide();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDE__INTERVAL = eINSTANCE.getSlide_Interval();

		/**
		 * The meta object literal for the '<em><b>Captions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLIDE__CAPTIONS = eINSTANCE.getSlide_Captions();

		/**
		 * The meta object literal for the '<em>Theme</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.html.bootstrap.Theme
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getTheme()
		 * @generated
		 */
		EDataType THEME = eINSTANCE.getTheme();

		/**
		 * The meta object literal for the '<em>Color</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.html.bootstrap.Color
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getColor()
		 * @generated
		 */
		EDataType COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em>Size</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.html.bootstrap.Size
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getSize()
		 * @generated
		 */
		EDataType SIZE = eINSTANCE.getSize();

		/**
		 * The meta object literal for the '<em>Breakpoint</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.html.bootstrap.Breakpoint
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getBreakpoint()
		 * @generated
		 */
		EDataType BREAKPOINT = eINSTANCE.getBreakpoint();

		/**
		 * The meta object literal for the '<em>Text Alignment</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.html.bootstrap.Text.Alignment
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getTextAlignment()
		 * @generated
		 */
		EDataType TEXT_ALIGNMENT = eINSTANCE.getTextAlignment();

		/**
		 * The meta object literal for the '<em>Text Transform</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.html.bootstrap.Text.Transform
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getTextTransform()
		 * @generated
		 */
		EDataType TEXT_TRANSFORM = eINSTANCE.getTextTransform();

		/**
		 * The meta object literal for the '<em>Text Weight</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.html.bootstrap.Text.Weight
		 * @see org.nasdanika.models.bootstrap.impl.BootstrapPackageImpl#getTextWeight()
		 * @generated
		 */
		EDataType TEXT_WEIGHT = eINSTANCE.getTextWeight();

	}

} //BootstrapPackage
