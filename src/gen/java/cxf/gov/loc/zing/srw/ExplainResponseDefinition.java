
package gov.loc.zing.srw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for explainResponseDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="explainResponseDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}version" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}record"/&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}echoedExplainRequest" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}diagnostics" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}extraResponseData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "explainResponseDefinition", propOrder = {
    "version",
    "record",
    "echoedExplainRequest",
    "diagnostics",
    "extraResponseData"
})
public class ExplainResponseDefinition {

    protected String version;
    @XmlElement(required = true)
    protected RecordDefinition record;
    protected EchoedExplainRequestDefinition echoedExplainRequest;
    protected DiagnosticsDefinition diagnostics;
    protected ExtensionDefinition extraResponseData;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the record property.
     * 
     * @return
     *     possible object is
     *     {@link RecordDefinition }
     *     
     */
    public RecordDefinition getRecord() {
        return record;
    }

    /**
     * Sets the value of the record property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordDefinition }
     *     
     */
    public void setRecord(RecordDefinition value) {
        this.record = value;
    }

    /**
     * Gets the value of the echoedExplainRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EchoedExplainRequestDefinition }
     *     
     */
    public EchoedExplainRequestDefinition getEchoedExplainRequest() {
        return echoedExplainRequest;
    }

    /**
     * Sets the value of the echoedExplainRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EchoedExplainRequestDefinition }
     *     
     */
    public void setEchoedExplainRequest(EchoedExplainRequestDefinition value) {
        this.echoedExplainRequest = value;
    }

    /**
     * Gets the value of the diagnostics property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticsDefinition }
     *     
     */
    public DiagnosticsDefinition getDiagnostics() {
        return diagnostics;
    }

    /**
     * Sets the value of the diagnostics property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticsDefinition }
     *     
     */
    public void setDiagnostics(DiagnosticsDefinition value) {
        this.diagnostics = value;
    }

    /**
     * Gets the value of the extraResponseData property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionDefinition }
     *     
     */
    public ExtensionDefinition getExtraResponseData() {
        return extraResponseData;
    }

    /**
     * Sets the value of the extraResponseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionDefinition }
     *     
     */
    public void setExtraResponseData(ExtensionDefinition value) {
        this.extraResponseData = value;
    }

}
