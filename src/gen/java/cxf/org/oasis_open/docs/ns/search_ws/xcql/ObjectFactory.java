
package org.oasis_open.docs.ns.search_ws.xcql;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.oasis_open.docs.ns.search_ws.xcql package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Xcql_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/xcql", "xcql");
    private final static QName _Boolean_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/xcql", "Boolean");
    private final static QName _Comparison_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/xcql", "comparison");
    private final static QName _Identifier_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/xcql", "identifier");
    private final static QName _Index_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/xcql", "index");
    private final static QName _Key_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/xcql", "key");
    private final static QName _LeftOperand_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/xcql", "leftOperand");
    private final static QName _Modifier_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/xcql", "modifier");
    private final static QName _Modifiers_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/xcql", "modifiers");
    private final static QName _Name_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/xcql", "name");
    private final static QName _Prefix_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/xcql", "prefix");
    private final static QName _Prefixes_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/xcql", "prefixes");
    private final static QName _Relation_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/xcql", "relation");
    private final static QName _RightOperand_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/xcql", "rightOperand");
    private final static QName _SearchClause_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/xcql", "searchClause");
    private final static QName _SortKeys_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/xcql", "sortKeys");
    private final static QName _Term_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/xcql", "term");
    private final static QName _Type_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/xcql", "type");
    private final static QName _Triple_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/xcql", "triple");
    private final static QName _Value_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/xcql", "value");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.oasis_open.docs.ns.search_ws.xcql
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link XcqlDefinition }
     * 
     */
    public XcqlDefinition createXcqlDefinition() {
        return new XcqlDefinition();
    }

    /**
     * Create an instance of {@link BooleanPlusModifier }
     * 
     */
    public BooleanPlusModifier createBooleanPlusModifier() {
        return new BooleanPlusModifier();
    }

    /**
     * Create an instance of {@link KeyDefinition }
     * 
     */
    public KeyDefinition createKeyDefinition() {
        return new KeyDefinition();
    }

    /**
     * Create an instance of {@link OperandDefinition }
     * 
     */
    public OperandDefinition createOperandDefinition() {
        return new OperandDefinition();
    }

    /**
     * Create an instance of {@link ModifierDefinition }
     * 
     */
    public ModifierDefinition createModifierDefinition() {
        return new ModifierDefinition();
    }

    /**
     * Create an instance of {@link ModifiersDefinition }
     * 
     */
    public ModifiersDefinition createModifiersDefinition() {
        return new ModifiersDefinition();
    }

    /**
     * Create an instance of {@link PrefixDefinition }
     * 
     */
    public PrefixDefinition createPrefixDefinition() {
        return new PrefixDefinition();
    }

    /**
     * Create an instance of {@link PrefixesDefinition }
     * 
     */
    public PrefixesDefinition createPrefixesDefinition() {
        return new PrefixesDefinition();
    }

    /**
     * Create an instance of {@link ValuePlusModifier }
     * 
     */
    public ValuePlusModifier createValuePlusModifier() {
        return new ValuePlusModifier();
    }

    /**
     * Create an instance of {@link SearchClauseDefinition }
     * 
     */
    public SearchClauseDefinition createSearchClauseDefinition() {
        return new SearchClauseDefinition();
    }

    /**
     * Create an instance of {@link SortKeysDefinition }
     * 
     */
    public SortKeysDefinition createSortKeysDefinition() {
        return new SortKeysDefinition();
    }

    /**
     * Create an instance of {@link TripleDefinition }
     * 
     */
    public TripleDefinition createTripleDefinition() {
        return new TripleDefinition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XcqlDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/xcql", name = "xcql")
    public JAXBElement<XcqlDefinition> createXcql(XcqlDefinition value) {
        return new JAXBElement<XcqlDefinition>(_Xcql_QNAME, XcqlDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanPlusModifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/xcql", name = "Boolean")
    public JAXBElement<BooleanPlusModifier> createBoolean(BooleanPlusModifier value) {
        return new JAXBElement<BooleanPlusModifier>(_Boolean_QNAME, BooleanPlusModifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/xcql", name = "comparison")
    public JAXBElement<String> createComparison(String value) {
        return new JAXBElement<String>(_Comparison_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/xcql", name = "identifier")
    public JAXBElement<String> createIdentifier(String value) {
        return new JAXBElement<String>(_Identifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/xcql", name = "index")
    public JAXBElement<String> createIndex(String value) {
        return new JAXBElement<String>(_Index_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/xcql", name = "key")
    public JAXBElement<KeyDefinition> createKey(KeyDefinition value) {
        return new JAXBElement<KeyDefinition>(_Key_QNAME, KeyDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperandDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/xcql", name = "leftOperand")
    public JAXBElement<OperandDefinition> createLeftOperand(OperandDefinition value) {
        return new JAXBElement<OperandDefinition>(_LeftOperand_QNAME, OperandDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/xcql", name = "modifier")
    public JAXBElement<ModifierDefinition> createModifier(ModifierDefinition value) {
        return new JAXBElement<ModifierDefinition>(_Modifier_QNAME, ModifierDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifiersDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/xcql", name = "modifiers")
    public JAXBElement<ModifiersDefinition> createModifiers(ModifiersDefinition value) {
        return new JAXBElement<ModifiersDefinition>(_Modifiers_QNAME, ModifiersDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/xcql", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrefixDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/xcql", name = "prefix")
    public JAXBElement<PrefixDefinition> createPrefix(PrefixDefinition value) {
        return new JAXBElement<PrefixDefinition>(_Prefix_QNAME, PrefixDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrefixesDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/xcql", name = "prefixes")
    public JAXBElement<PrefixesDefinition> createPrefixes(PrefixesDefinition value) {
        return new JAXBElement<PrefixesDefinition>(_Prefixes_QNAME, PrefixesDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValuePlusModifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/xcql", name = "relation")
    public JAXBElement<ValuePlusModifier> createRelation(ValuePlusModifier value) {
        return new JAXBElement<ValuePlusModifier>(_Relation_QNAME, ValuePlusModifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperandDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/xcql", name = "rightOperand")
    public JAXBElement<OperandDefinition> createRightOperand(OperandDefinition value) {
        return new JAXBElement<OperandDefinition>(_RightOperand_QNAME, OperandDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchClauseDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/xcql", name = "searchClause")
    public JAXBElement<SearchClauseDefinition> createSearchClause(SearchClauseDefinition value) {
        return new JAXBElement<SearchClauseDefinition>(_SearchClause_QNAME, SearchClauseDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortKeysDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/xcql", name = "sortKeys")
    public JAXBElement<SortKeysDefinition> createSortKeys(SortKeysDefinition value) {
        return new JAXBElement<SortKeysDefinition>(_SortKeys_QNAME, SortKeysDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/xcql", name = "term")
    public JAXBElement<String> createTerm(String value) {
        return new JAXBElement<String>(_Term_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/xcql", name = "type")
    public JAXBElement<String> createType(String value) {
        return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripleDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/xcql", name = "triple")
    public JAXBElement<TripleDefinition> createTriple(TripleDefinition value) {
        return new JAXBElement<TripleDefinition>(_Triple_QNAME, TripleDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/xcql", name = "value")
    public JAXBElement<String> createValue(String value) {
        return new JAXBElement<String>(_Value_QNAME, String.class, null, value);
    }

}
