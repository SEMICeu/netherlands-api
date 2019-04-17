
package org.oasis_open.docs.ns.search_ws.scan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scanResponseDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scanResponseDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/scan}terms" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/scan}echoedScanRequest" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/scan}diagnostics" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/scan}extraResponseData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scanResponseDefinition", propOrder = {
    "terms",
    "echoedScanRequest",
    "diagnostics",
    "extraResponseData"
})
public class ScanResponseDefinition {

    protected TermsDefinition terms;
    protected EchoedScanRequestDefinition echoedScanRequest;
    protected DiagnosticsDefinition diagnostics;
    protected ExtraDataDefinition extraResponseData;

    /**
     * Gets the value of the terms property.
     * 
     * @return
     *     possible object is
     *     {@link TermsDefinition }
     *     
     */
    public TermsDefinition getTerms() {
        return terms;
    }

    /**
     * Sets the value of the terms property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermsDefinition }
     *     
     */
    public void setTerms(TermsDefinition value) {
        this.terms = value;
    }

    /**
     * Gets the value of the echoedScanRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EchoedScanRequestDefinition }
     *     
     */
    public EchoedScanRequestDefinition getEchoedScanRequest() {
        return echoedScanRequest;
    }

    /**
     * Sets the value of the echoedScanRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EchoedScanRequestDefinition }
     *     
     */
    public void setEchoedScanRequest(EchoedScanRequestDefinition value) {
        this.echoedScanRequest = value;
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
     *     {@link ExtraDataDefinition }
     *     
     */
    public ExtraDataDefinition getExtraResponseData() {
        return extraResponseData;
    }

    /**
     * Sets the value of the extraResponseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraDataDefinition }
     *     
     */
    public void setExtraResponseData(ExtraDataDefinition value) {
        this.extraResponseData = value;
    }

}
