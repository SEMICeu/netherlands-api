
package org.oasis_open.docs.ns.search_ws.diagnostic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.oasis_open.docs.ns.search_ws.diagnostic package. 
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

    private final static QName _Diagnostic_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/diagnostic", "diagnostic");
    private final static QName _Details_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/diagnostic", "details");
    private final static QName _Message_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/diagnostic", "message");
    private final static QName _Uri_QNAME = new QName("http://docs.oasis-open.org/ns/search-ws/diagnostic", "uri");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.oasis_open.docs.ns.search_ws.diagnostic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DiagnosticComplexType }
     * 
     */
    public DiagnosticComplexType createDiagnosticComplexType() {
        return new DiagnosticComplexType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiagnosticComplexType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/diagnostic", name = "diagnostic")
    public JAXBElement<DiagnosticComplexType> createDiagnostic(DiagnosticComplexType value) {
        return new JAXBElement<DiagnosticComplexType>(_Diagnostic_QNAME, DiagnosticComplexType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/diagnostic", name = "details")
    public JAXBElement<String> createDetails(String value) {
        return new JAXBElement<String>(_Details_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/diagnostic", name = "message")
    public JAXBElement<String> createMessage(String value) {
        return new JAXBElement<String>(_Message_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/search-ws/diagnostic", name = "uri")
    public JAXBElement<String> createUri(String value) {
        return new JAXBElement<String>(_Uri_QNAME, String.class, null, value);
    }

}
