
package org.oasis_open.docs.ns.search_ws.facetedresults;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.oasis_open.docs.ns.search_ws.facetedresults package. 
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

    private final static QName _FacetedResults_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/facetedResults", "facetedResults");
    private final static QName _ActualTerm_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/facetedResults", "actualTerm");
    private final static QName _BaseURL_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/facetedResults", "baseURL");
    private final static QName _Count_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/facetedResults", "count");
    private final static QName _Datasource_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/facetedResults", "datasource");
    private final static QName _DatasourceDescription_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/facetedResults", "datasourceDescription");
    private final static QName _DatasourceDisplayLabel_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/facetedResults", "datasourceDisplayLabel");
    private final static QName _Facet_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/facetedResults", "facet");
    private final static QName _FacetBaseURL_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/facetedResults", "facetBaseURL");
    private final static QName _FacetDisplayLabel_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/facetedResults", "facetDisplayLabel");
    private final static QName _FacetDescription_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/facetedResults", "facetDescription");
    private final static QName _Facets_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/facetedResults", "facets");
    private final static QName _Index_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/facetedResults", "index");
    private final static QName _Term_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/facetedResults", "term");
    private final static QName _Terms_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/facetedResults", "terms");
    private final static QName _Query_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/facetedResults", "query");
    private final static QName _Relation_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/facetedResults", "relation");
    private final static QName _RequestUrl_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/facetedResults", "requestUrl");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.oasis_open.docs.ns.search_ws.facetedresults
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FacetedResultsDefinition }
     * 
     */
    public FacetedResultsDefinition createFacetedResultsDefinition() {
        return new FacetedResultsDefinition();
    }

    /**
     * Create an instance of {@link DatasourceDefinition }
     * 
     */
    public DatasourceDefinition createDatasourceDefinition() {
        return new DatasourceDefinition();
    }

    /**
     * Create an instance of {@link FacetDefinition }
     * 
     */
    public FacetDefinition createFacetDefinition() {
        return new FacetDefinition();
    }

    /**
     * Create an instance of {@link FacetsDefinition }
     * 
     */
    public FacetsDefinition createFacetsDefinition() {
        return new FacetsDefinition();
    }

    /**
     * Create an instance of {@link TermDefinition }
     * 
     */
    public TermDefinition createTermDefinition() {
        return new TermDefinition();
    }

    /**
     * Create an instance of {@link TermsDefinition }
     * 
     */
    public TermsDefinition createTermsDefinition() {
        return new TermsDefinition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacetedResultsDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/facetedResults", name = "facetedResults")
    public JAXBElement<FacetedResultsDefinition> createFacetedResults(FacetedResultsDefinition value) {
        return new JAXBElement<FacetedResultsDefinition>(_FacetedResults_QNAME, FacetedResultsDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/facetedResults", name = "actualTerm")
    public JAXBElement<String> createActualTerm(String value) {
        return new JAXBElement<String>(_ActualTerm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/facetedResults", name = "baseURL")
    public JAXBElement<String> createBaseURL(String value) {
        return new JAXBElement<String>(_BaseURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/facetedResults", name = "count")
    public JAXBElement<BigInteger> createCount(BigInteger value) {
        return new JAXBElement<BigInteger>(_Count_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatasourceDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/facetedResults", name = "datasource")
    public JAXBElement<DatasourceDefinition> createDatasource(DatasourceDefinition value) {
        return new JAXBElement<DatasourceDefinition>(_Datasource_QNAME, DatasourceDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/facetedResults", name = "datasourceDescription")
    public JAXBElement<String> createDatasourceDescription(String value) {
        return new JAXBElement<String>(_DatasourceDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/facetedResults", name = "datasourceDisplayLabel")
    public JAXBElement<String> createDatasourceDisplayLabel(String value) {
        return new JAXBElement<String>(_DatasourceDisplayLabel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacetDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/facetedResults", name = "facet")
    public JAXBElement<FacetDefinition> createFacet(FacetDefinition value) {
        return new JAXBElement<FacetDefinition>(_Facet_QNAME, FacetDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/facetedResults", name = "facetBaseURL")
    public JAXBElement<String> createFacetBaseURL(String value) {
        return new JAXBElement<String>(_FacetBaseURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/facetedResults", name = "facetDisplayLabel")
    public JAXBElement<String> createFacetDisplayLabel(String value) {
        return new JAXBElement<String>(_FacetDisplayLabel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/facetedResults", name = "facetDescription")
    public JAXBElement<String> createFacetDescription(String value) {
        return new JAXBElement<String>(_FacetDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacetsDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/facetedResults", name = "facets")
    public JAXBElement<FacetsDefinition> createFacets(FacetsDefinition value) {
        return new JAXBElement<FacetsDefinition>(_Facets_QNAME, FacetsDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/facetedResults", name = "index")
    public JAXBElement<String> createIndex(String value) {
        return new JAXBElement<String>(_Index_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TermDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/facetedResults", name = "term")
    public JAXBElement<TermDefinition> createTerm(TermDefinition value) {
        return new JAXBElement<TermDefinition>(_Term_QNAME, TermDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TermsDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/facetedResults", name = "terms")
    public JAXBElement<TermsDefinition> createTerms(TermsDefinition value) {
        return new JAXBElement<TermsDefinition>(_Terms_QNAME, TermsDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/facetedResults", name = "query")
    public JAXBElement<String> createQuery(String value) {
        return new JAXBElement<String>(_Query_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/facetedResults", name = "relation")
    public JAXBElement<String> createRelation(String value) {
        return new JAXBElement<String>(_Relation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/facetedResults", name = "requestUrl")
    public JAXBElement<String> createRequestUrl(String value) {
        return new JAXBElement<String>(_RequestUrl_QNAME, String.class, null, value);
    }

}
