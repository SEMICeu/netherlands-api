
package org.oasis_open.docs.ns.search_ws.srurequest;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.oasis_open.docs.ns.search_ws.srurequest package. 
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

    private final static QName _SearchRetrieveRequest_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/sruRequest", "searchRetrieveRequest");
    private final static QName _FacetCount_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/sruRequest", "facetCount");
    private final static QName _Query_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/sruRequest", "query");
    private final static QName _StartRecord_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/sruRequest", "startRecord");
    private final static QName _MaximumRecords_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/sruRequest", "maximumRecords");
    private final static QName _RecordXMLEscaping_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/sruRequest", "recordXMLEscaping");
    private final static QName _RecordSchema_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/sruRequest", "recordSchema");
    private final static QName _ResultSetTTL_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/sruRequest", "resultSetTTL");
    private final static QName _Stylesheet_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/sruRequest", "Stylesheet");
    private final static QName _QueryType_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/sruRequest", "queryType");
    private final static QName _SortKeys_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/sruRequest", "sortKeys");
    private final static QName _RenderedBy_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/sruRequest", "renderedBy");
    private final static QName _HttpAccept_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/sruRequest", "httpAccept");
    private final static QName _ResponseType_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/sruRequest", "responseType");
    private final static QName _RecordPacking_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/sruRequest", "recordPacking");
    private final static QName _FacetLimit_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/sruRequest", "facetLimit");
    private final static QName _FacetStart_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/sruRequest", "facetStart");
    private final static QName _FacetSort_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/sruRequest", "facetSort");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.oasis_open.docs.ns.search_ws.srurequest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchRetrieveRequestType }
     * 
     */
    public SearchRetrieveRequestType createSearchRetrieveRequestType() {
        return new SearchRetrieveRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRetrieveRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/sruRequest", name = "searchRetrieveRequest")
    public JAXBElement<SearchRetrieveRequestType> createSearchRetrieveRequest(SearchRetrieveRequestType value) {
        return new JAXBElement<SearchRetrieveRequestType>(_SearchRetrieveRequest_QNAME, SearchRetrieveRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/sruRequest", name = "facetCount")
    public JAXBElement<String> createFacetCount(String value) {
        return new JAXBElement<String>(_FacetCount_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/sruRequest", name = "query")
    public JAXBElement<String> createQuery(String value) {
        return new JAXBElement<String>(_Query_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/sruRequest", name = "startRecord", defaultValue = "1")
    public JAXBElement<BigInteger> createStartRecord(BigInteger value) {
        return new JAXBElement<BigInteger>(_StartRecord_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/sruRequest", name = "maximumRecords")
    public JAXBElement<BigInteger> createMaximumRecords(BigInteger value) {
        return new JAXBElement<BigInteger>(_MaximumRecords_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/sruRequest", name = "recordXMLEscaping", defaultValue = "xml")
    public JAXBElement<String> createRecordXMLEscaping(String value) {
        return new JAXBElement<String>(_RecordXMLEscaping_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/sruRequest", name = "recordSchema")
    public JAXBElement<String> createRecordSchema(String value) {
        return new JAXBElement<String>(_RecordSchema_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/sruRequest", name = "resultSetTTL")
    public JAXBElement<BigInteger> createResultSetTTL(BigInteger value) {
        return new JAXBElement<BigInteger>(_ResultSetTTL_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/sruRequest", name = "Stylesheet")
    public JAXBElement<String> createStylesheet(String value) {
        return new JAXBElement<String>(_Stylesheet_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/sruRequest", name = "queryType", defaultValue = "cql")
    public JAXBElement<String> createQueryType(String value) {
        return new JAXBElement<String>(_QueryType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/sruRequest", name = "sortKeys")
    public JAXBElement<String> createSortKeys(String value) {
        return new JAXBElement<String>(_SortKeys_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/sruRequest", name = "renderedBy", defaultValue = "client")
    public JAXBElement<String> createRenderedBy(String value) {
        return new JAXBElement<String>(_RenderedBy_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/sruRequest", name = "httpAccept", defaultValue = "application/soap+xml")
    public JAXBElement<String> createHttpAccept(String value) {
        return new JAXBElement<String>(_HttpAccept_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/sruRequest", name = "responseType")
    public JAXBElement<String> createResponseType(String value) {
        return new JAXBElement<String>(_ResponseType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/sruRequest", name = "recordPacking", defaultValue = "packed")
    public JAXBElement<String> createRecordPacking(String value) {
        return new JAXBElement<String>(_RecordPacking_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/sruRequest", name = "facetLimit")
    public JAXBElement<String> createFacetLimit(String value) {
        return new JAXBElement<String>(_FacetLimit_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/sruRequest", name = "facetStart", defaultValue = "1")
    public JAXBElement<BigInteger> createFacetStart(BigInteger value) {
        return new JAXBElement<BigInteger>(_FacetStart_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/sruRequest", name = "facetSort")
    public JAXBElement<String> createFacetSort(String value) {
        return new JAXBElement<String>(_FacetSort_QNAME, String.class, null, value);
    }

}
