//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.21 at 11:02:21 AM CET 
//


package nl.overheid.standaarden.owms.terms;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.overheid.standaarden.owms.terms package. 
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

    private final static QName _Abbreviation_QNAME = new QName("http://standaarden.overheid.nl/owms/terms/", "abbreviation");
    private final static QName _IsRatifiedBy_QNAME = new QName("http://standaarden.overheid.nl/owms/terms/", "isRatifiedBy");
    private final static QName _Authority_QNAME = new QName("http://standaarden.overheid.nl/owms/terms/", "authority");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.overheid.standaarden.owms.terms
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FreeText }
     * 
     */
    public FreeText createFreeText() {
        return new FreeText();
    }

    /**
     * Create an instance of {@link BeslissendOrgaan }
     * 
     */
    public BeslissendOrgaan createBeslissendOrgaan() {
        return new BeslissendOrgaan();
    }

    /**
     * Create an instance of {@link Agent }
     * 
     */
    public Agent createAgent() {
        return new Agent();
    }

    /**
     * Create an instance of {@link AgentClassOrFreeText }
     * 
     */
    public AgentClassOrFreeText createAgentClassOrFreeText() {
        return new AgentClassOrFreeText();
    }

    /**
     * Create an instance of {@link AgentOrFreeText }
     * 
     */
    public AgentOrFreeText createAgentOrFreeText() {
        return new AgentOrFreeText();
    }

    /**
     * Create an instance of {@link InformationObject }
     * 
     */
    public InformationObject createInformationObject() {
        return new InformationObject();
    }

    /**
     * Create an instance of {@link InformationType }
     * 
     */
    public InformationType createInformationType() {
        return new InformationType();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link PeriodOfTime }
     * 
     */
    public PeriodOfTime createPeriodOfTime() {
        return new PeriodOfTime();
    }

    /**
     * Create an instance of {@link TripleType }
     * 
     */
    public TripleType createTripleType() {
        return new TripleType();
    }

    /**
     * Create an instance of {@link OriginalAgent }
     * 
     */
    public OriginalAgent createOriginalAgent() {
        return new OriginalAgent();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreeText }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FreeText }{@code >}
     */
    @XmlElementDecl(namespace = "http://standaarden.overheid.nl/owms/terms/", name = "abbreviation")
    public JAXBElement<FreeText> createAbbreviation(FreeText value) {
        return new JAXBElement<FreeText>(_Abbreviation_QNAME, FreeText.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BeslissendOrgaan }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BeslissendOrgaan }{@code >}
     */
    @XmlElementDecl(namespace = "http://standaarden.overheid.nl/owms/terms/", name = "isRatifiedBy")
    public JAXBElement<BeslissendOrgaan> createIsRatifiedBy(BeslissendOrgaan value) {
        return new JAXBElement<BeslissendOrgaan>(_IsRatifiedBy_QNAME, BeslissendOrgaan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Agent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Agent }{@code >}
     */
    @XmlElementDecl(namespace = "http://standaarden.overheid.nl/owms/terms/", name = "authority")
    public JAXBElement<Agent> createAuthority(Agent value) {
        return new JAXBElement<Agent>(_Authority_QNAME, Agent.class, null, value);
    }

}