
package org.oasis_open.docs.ns.search_ws.sruresponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for echoedExplainRequestDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="echoedExplainRequestDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruResponse}version" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruResponse}recordXMLEscaping" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruResponse}recordPacking" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruResponse}stylesheet" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruResponse}extraRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "echoedExplainRequestDefinition", propOrder = {
    "version",
    "recordXMLEscaping",
    "recordPacking",
    "stylesheet",
    "extraRequestData"
})
public class EchoedExplainRequestDefinition {

    protected String version;
    @XmlSchemaType(name = "string")
    protected RecordXMLEscapingDefinition recordXMLEscaping;
    protected String recordPacking;
    @XmlSchemaType(name = "anyURI")
    protected String stylesheet;
    protected ExtensionDefinition extraRequestData;

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
     * Gets the value of the recordXMLEscaping property.
     * 
     * @return
     *     possible object is
     *     {@link RecordXMLEscapingDefinition }
     *     
     */
    public RecordXMLEscapingDefinition getRecordXMLEscaping() {
        return recordXMLEscaping;
    }

    /**
     * Sets the value of the recordXMLEscaping property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordXMLEscapingDefinition }
     *     
     */
    public void setRecordXMLEscaping(RecordXMLEscapingDefinition value) {
        this.recordXMLEscaping = value;
    }

    /**
     * Gets the value of the recordPacking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordPacking() {
        return recordPacking;
    }

    /**
     * Sets the value of the recordPacking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordPacking(String value) {
        this.recordPacking = value;
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
     *     {@link ExtensionDefinition }
     *     
     */
    public ExtensionDefinition getExtraRequestData() {
        return extraRequestData;
    }

    /**
     * Sets the value of the extraRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionDefinition }
     *     
     */
    public void setExtraRequestData(ExtensionDefinition value) {
        this.extraRequestData = value;
    }

}
