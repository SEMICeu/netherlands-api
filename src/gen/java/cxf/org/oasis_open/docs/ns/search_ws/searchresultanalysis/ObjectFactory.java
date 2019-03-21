
package org.oasis_open.docs.ns.search_ws.searchresultanalysis;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.oasis_open.docs.ns.search_ws.searchresultanalysis package. 
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

    private final static QName _SearchResultAnalysis_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis", "searchResultAnalysis");
    private final static QName _BaseURL_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis", "baseURL");
    private final static QName _Count_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis", "count");
    private final static QName _Datasource_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis", "datasource");
    private final static QName _DatasourceDescription_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis", "datasourceDescription");
    private final static QName _DatasourceDisplayLabel_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis", "datasourceDisplayLabel");
    private final static QName _RequestUrl_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis", "requestUrl");
    private final static QName _Subquery_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis", "subquery");
    private final static QName _SubqueryDisplayLabel_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis", "subqueryDisplayLabel");
    private final static QName _SubqueryResult_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis", "subqueryResult");
    private final static QName _SubqueryResults_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis", "subqueryResults");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.oasis_open.docs.ns.search_ws.searchresultanalysis
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchResultAnalysisDefinition }
     * 
     */
    public SearchResultAnalysisDefinition createSearchResultAnalysisDefinition() {
        return new SearchResultAnalysisDefinition();
    }

    /**
     * Create an instance of {@link DatasourceDefinition }
     * 
     */
    public DatasourceDefinition createDatasourceDefinition() {
        return new DatasourceDefinition();
    }

    /**
     * Create an instance of {@link SubqueryResultDefinition }
     * 
     */
    public SubqueryResultDefinition createSubqueryResultDefinition() {
        return new SubqueryResultDefinition();
    }

    /**
     * Create an instance of {@link SubqueryResultsDefinition }
     * 
     */
    public SubqueryResultsDefinition createSubqueryResultsDefinition() {
        return new SubqueryResultsDefinition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResultAnalysisDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis", name = "searchResultAnalysis")
    public JAXBElement<SearchResultAnalysisDefinition> createSearchResultAnalysis(SearchResultAnalysisDefinition value) {
        return new JAXBElement<SearchResultAnalysisDefinition>(_SearchResultAnalysis_QNAME, SearchResultAnalysisDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis", name = "baseURL")
    public JAXBElement<String> createBaseURL(String value) {
        return new JAXBElement<String>(_BaseURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis", name = "count")
    public JAXBElement<BigInteger> createCount(BigInteger value) {
        return new JAXBElement<BigInteger>(_Count_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatasourceDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis", name = "datasource")
    public JAXBElement<DatasourceDefinition> createDatasource(DatasourceDefinition value) {
        return new JAXBElement<DatasourceDefinition>(_Datasource_QNAME, DatasourceDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis", name = "datasourceDescription")
    public JAXBElement<String> createDatasourceDescription(String value) {
        return new JAXBElement<String>(_DatasourceDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis", name = "datasourceDisplayLabel")
    public JAXBElement<String> createDatasourceDisplayLabel(String value) {
        return new JAXBElement<String>(_DatasourceDisplayLabel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis", name = "requestUrl")
    public JAXBElement<String> createRequestUrl(String value) {
        return new JAXBElement<String>(_RequestUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis", name = "subquery")
    public JAXBElement<String> createSubquery(String value) {
        return new JAXBElement<String>(_Subquery_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis", name = "subqueryDisplayLabel")
    public JAXBElement<String> createSubqueryDisplayLabel(String value) {
        return new JAXBElement<String>(_SubqueryDisplayLabel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubqueryResultDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis", name = "subqueryResult")
    public JAXBElement<SubqueryResultDefinition> createSubqueryResult(SubqueryResultDefinition value) {
        return new JAXBElement<SubqueryResultDefinition>(_SubqueryResult_QNAME, SubqueryResultDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubqueryResultsDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis", name = "subqueryResults")
    public JAXBElement<SubqueryResultsDefinition> createSubqueryResults(SubqueryResultsDefinition value) {
        return new JAXBElement<SubqueryResultsDefinition>(_SubqueryResults_QNAME, SubqueryResultsDefinition.class, null, value);
    }

}
