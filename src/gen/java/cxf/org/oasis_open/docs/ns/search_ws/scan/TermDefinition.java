
package org.oasis_open.docs.ns.search_ws.scan;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for termDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="termDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/scan}value"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/scan}numberOfRecords" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/scan}displayTerm" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/scan}whereInList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/scan}requestURL" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/scan}extraTermData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "termDefinition", propOrder = {
    "value",
    "numberOfRecords",
    "displayTerm",
    "whereInList",
    "requestURL",
    "extraTermData"
})
public class TermDefinition {

    @XmlElement(required = true)
    protected String value;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfRecords;
    protected String displayTerm;
    @XmlSchemaType(name = "string")
    protected WhereInListDefinition whereInList;
    @XmlSchemaType(name = "anyURI")
    protected String requestURL;
    protected ExtraDataDefinition extraTermData;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the numberOfRecords property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfRecords() {
        return numberOfRecords;
    }

    /**
     * Sets the value of the numberOfRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfRecords(BigInteger value) {
        this.numberOfRecords = value;
    }

    /**
     * Gets the value of the displayTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayTerm() {
        return displayTerm;
    }

    /**
     * Sets the value of the displayTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayTerm(String value) {
        this.displayTerm = value;
    }

    /**
     * Gets the value of the whereInList property.
     * 
     * @return
     *     possible object is
     *     {@link WhereInListDefinition }
     *     
     */
    public WhereInListDefinition getWhereInList() {
        return whereInList;
    }

    /**
     * Sets the value of the whereInList property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhereInListDefinition }
     *     
     */
    public void setWhereInList(WhereInListDefinition value) {
        this.whereInList = value;
    }

    /**
     * Gets the value of the requestURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestURL() {
        return requestURL;
    }

    /**
     * Sets the value of the requestURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestURL(String value) {
        this.requestURL = value;
    }

    /**
     * Gets the value of the extraTermData property.
     * 
     * @return
     *     possible object is
     *     {@link ExtraDataDefinition }
     *     
     */
    public ExtraDataDefinition getExtraTermData() {
        return extraTermData;
    }

    /**
     * Sets the value of the extraTermData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraDataDefinition }
     *     
     */
    public void setExtraTermData(ExtraDataDefinition value) {
        this.extraTermData = value;
    }

}
