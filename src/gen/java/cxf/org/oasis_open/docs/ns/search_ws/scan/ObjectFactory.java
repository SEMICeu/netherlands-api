
package org.oasis_open.docs.ns.search_ws.scan;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.oasis_open.docs.ns.search_ws.xcql.SearchClauseDefinition;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.oasis_open.docs.ns.search_ws.scan package. 
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

    private final static QName _ScanResponse_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/scan", "scanResponse");
    private final static QName _Diagnostics_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/scan", "diagnostics");
    private final static QName _DisplayTerm_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/scan", "displayTerm");
    private final static QName _ExtraResponseData_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/scan", "extraResponseData");
    private final static QName _EchoedScanRequest_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/scan", "echoedScanRequest");
    private final static QName _ExtraRequestData_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/scan", "extraRequestData");
    private final static QName _ExtraTermData_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/scan", "extraTermData");
    private final static QName _HttpAccept_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/scan", "httpAccept");
    private final static QName _MaximumTerms_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/scan", "maximumTerms");
    private final static QName _NumberOfRecords_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/scan", "numberOfRecords");
    private final static QName _ResponsePosition_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/scan", "responsePosition");
    private final static QName _RequestURL_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/scan", "requestURL");
    private final static QName _ScanClause_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/scan", "scanClause");
    private final static QName _Stylesheet_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/scan", "stylesheet");
    private final static QName _Terms_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/scan", "terms");
    private final static QName _Term_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/scan", "term");
    private final static QName _Value_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/scan", "value");
    private final static QName _WhereInList_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/scan", "whereInList");
    private final static QName _XScanClause_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/scan", "xScanClause");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.oasis_open.docs.ns.search_ws.scan
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ScanResponseDefinition }
     * 
     */
    public ScanResponseDefinition createScanResponseDefinition() {
        return new ScanResponseDefinition();
    }

    /**
     * Create an instance of {@link DiagnosticsDefinition }
     * 
     */
    public DiagnosticsDefinition createDiagnosticsDefinition() {
        return new DiagnosticsDefinition();
    }

    /**
     * Create an instance of {@link ExtraDataDefinition }
     * 
     */
    public ExtraDataDefinition createExtraDataDefinition() {
        return new ExtraDataDefinition();
    }

    /**
     * Create an instance of {@link EchoedScanRequestDefinition }
     * 
     */
    public EchoedScanRequestDefinition createEchoedScanRequestDefinition() {
        return new EchoedScanRequestDefinition();
    }

    /**
     * Create an instance of {@link TermsDefinition }
     * 
     */
    public TermsDefinition createTermsDefinition() {
        return new TermsDefinition();
    }

    /**
     * Create an instance of {@link TermDefinition }
     * 
     */
    public TermDefinition createTermDefinition() {
        return new TermDefinition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScanResponseDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/scan", name = "scanResponse")
    public JAXBElement<ScanResponseDefinition> createScanResponse(ScanResponseDefinition value) {
        return new JAXBElement<ScanResponseDefinition>(_ScanResponse_QNAME, ScanResponseDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiagnosticsDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/scan", name = "diagnostics")
    public JAXBElement<DiagnosticsDefinition> createDiagnostics(DiagnosticsDefinition value) {
        return new JAXBElement<DiagnosticsDefinition>(_Diagnostics_QNAME, DiagnosticsDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/scan", name = "displayTerm")
    public JAXBElement<String> createDisplayTerm(String value) {
        return new JAXBElement<String>(_DisplayTerm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtraDataDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/scan", name = "extraResponseData")
    public JAXBElement<ExtraDataDefinition> createExtraResponseData(ExtraDataDefinition value) {
        return new JAXBElement<ExtraDataDefinition>(_ExtraResponseData_QNAME, ExtraDataDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EchoedScanRequestDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/scan", name = "echoedScanRequest")
    public JAXBElement<EchoedScanRequestDefinition> createEchoedScanRequest(EchoedScanRequestDefinition value) {
        return new JAXBElement<EchoedScanRequestDefinition>(_EchoedScanRequest_QNAME, EchoedScanRequestDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtraDataDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/scan", name = "extraRequestData")
    public JAXBElement<ExtraDataDefinition> createExtraRequestData(ExtraDataDefinition value) {
        return new JAXBElement<ExtraDataDefinition>(_ExtraRequestData_QNAME, ExtraDataDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtraDataDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/scan", name = "extraTermData")
    public JAXBElement<ExtraDataDefinition> createExtraTermData(ExtraDataDefinition value) {
        return new JAXBElement<ExtraDataDefinition>(_ExtraTermData_QNAME, ExtraDataDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/scan", name = "httpAccept")
    public JAXBElement<String> createHttpAccept(String value) {
        return new JAXBElement<String>(_HttpAccept_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/scan", name = "maximumTerms")
    public JAXBElement<BigInteger> createMaximumTerms(BigInteger value) {
        return new JAXBElement<BigInteger>(_MaximumTerms_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/scan", name = "numberOfRecords")
    public JAXBElement<BigInteger> createNumberOfRecords(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfRecords_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/scan", name = "responsePosition")
    public JAXBElement<BigInteger> createResponsePosition(BigInteger value) {
        return new JAXBElement<BigInteger>(_ResponsePosition_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/scan", name = "requestURL")
    public JAXBElement<String> createRequestURL(String value) {
        return new JAXBElement<String>(_RequestURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/scan", name = "scanClause")
    public JAXBElement<String> createScanClause(String value) {
        return new JAXBElement<String>(_ScanClause_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/scan", name = "stylesheet")
    public JAXBElement<String> createStylesheet(String value) {
        return new JAXBElement<String>(_Stylesheet_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TermsDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/scan", name = "terms")
    public JAXBElement<TermsDefinition> createTerms(TermsDefinition value) {
        return new JAXBElement<TermsDefinition>(_Terms_QNAME, TermsDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TermDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/scan", name = "term")
    public JAXBElement<TermDefinition> createTerm(TermDefinition value) {
        return new JAXBElement<TermDefinition>(_Term_QNAME, TermDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/scan", name = "value")
    public JAXBElement<String> createValue(String value) {
        return new JAXBElement<String>(_Value_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WhereInListDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/scan", name = "whereInList")
    public JAXBElement<WhereInListDefinition> createWhereInList(WhereInListDefinition value) {
        return new JAXBElement<WhereInListDefinition>(_WhereInList_QNAME, WhereInListDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchClauseDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/scan", name = "xScanClause")
    public JAXBElement<SearchClauseDefinition> createXScanClause(SearchClauseDefinition value) {
        return new JAXBElement<SearchClauseDefinition>(_XScanClause_QNAME, SearchClauseDefinition.class, null, value);
    }

}
