
package org.oasis_open.docs.ns.search_ws.scan;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.ns.search_ws.xcql.SearchClauseDefinition;


/**
 * <p>Java class for echoedScanRequestDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="echoedScanRequestDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/scan}scanClause"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/scan}xScanClause" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/scan}responsePosition" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/scan}maximumTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/scan}httpAccept" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/scan}stylesheet" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/scan}extraRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "echoedScanRequestDefinition", propOrder = {
    "scanClause",
    "xScanClause",
    "responsePosition",
    "maximumTerms",
    "httpAccept",
    "stylesheet",
    "extraRequestData"
})
public class EchoedScanRequestDefinition {

    @XmlElement(required = true)
    protected String scanClause;
    protected SearchClauseDefinition xScanClause;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger responsePosition;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumTerms;
    protected String httpAccept;
    @XmlSchemaType(name = "anyURI")
    protected String stylesheet;
    protected ExtraDataDefinition extraRequestData;

    /**
     * Gets the value of the scanClause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanClause() {
        return scanClause;
    }

    /**
     * Sets the value of the scanClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanClause(String value) {
        this.scanClause = value;
    }

    /**
     * Gets the value of the xScanClause property.
     * 
     * @return
     *     possible object is
     *     {@link SearchClauseDefinition }
     *     
     */
    public SearchClauseDefinition getXScanClause() {
        return xScanClause;
    }

    /**
     * Sets the value of the xScanClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchClauseDefinition }
     *     
     */
    public void setXScanClause(SearchClauseDefinition value) {
        this.xScanClause = value;
    }

    /**
     * Gets the value of the responsePosition property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResponsePosition() {
        return responsePosition;
    }

    /**
     * Sets the value of the responsePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResponsePosition(BigInteger value) {
        this.responsePosition = value;
    }

    /**
     * Gets the value of the maximumTerms property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumTerms() {
        return maximumTerms;
    }

    /**
     * Sets the value of the maximumTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumTerms(BigInteger value) {
        this.maximumTerms = value;
    }

    /**
     * Gets the value of the httpAccept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpAccept() {
        return httpAccept;
    }

    /**
     * Sets the value of the httpAccept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpAccept(String value) {
        this.httpAccept = value;
    }

    /**
     * Gets the value of the stylesheet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStylesheet() {
        return stylesheet;
    }

    /**
     * Sets the value of the stylesheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStylesheet(String value) {
        this.stylesheet = value;
    }

    /**
     * Gets the value of the extraRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link ExtraDataDefinition }
     *     
     */
    public ExtraDataDefinition getExtraRequestData() {
        return extraRequestData;
    }

    /**
     * Sets the value of the extraRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraDataDefinition }
     *     
     */
    public void setExtraRequestData(ExtraDataDefinition value) {
        this.extraRequestData = value;
    }

}
