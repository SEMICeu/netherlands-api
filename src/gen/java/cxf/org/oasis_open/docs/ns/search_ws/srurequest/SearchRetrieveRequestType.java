
package org.oasis_open.docs.ns.search_ws.srurequest;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchRetrieveRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchRetrieveRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruRequest}query" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruRequest}startRecord" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruRequest}maximumRecords" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruRequest}recordXMLEscaping" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruRequest}recordSchema" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruRequest}resultSetTTL" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruRequest}Stylesheet" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruRequest}queryType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruRequest}sortKeys" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruRequest}renderedBy" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruRequest}httpAccept" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruRequest}responseType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruRequest}recordPacking" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruRequest}facetLimit" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruRequest}facetStart" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruRequest}facetSort" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruRequest}facetCount" minOccurs="0"/&gt;
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchRetrieveRequestType", propOrder = {
    "query",
    "startRecord",
    "maximumRecords",
    "recordXMLEscaping",
    "recordSchema",
    "resultSetTTL",
    "stylesheet",
    "queryType",
    "sortKeys",
    "renderedBy",
    "httpAccept",
    "responseType",
    "recordPacking",
    "facetLimit",
    "facetStart",
    "facetSort",
    "facetCount",
    "any"
})
public class SearchRetrieveRequestType {

    protected String query;
    @XmlElement(defaultValue = "1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger startRecord;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumRecords;
    @XmlElement(defaultValue = "xml")
    protected String recordXMLEscaping;
    protected String recordSchema;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger resultSetTTL;
    @XmlElement(name = "Stylesheet")
    @XmlSchemaType(name = "anyURI")
    protected String stylesheet;
    @XmlElement(defaultValue = "cql")
    protected String queryType;
    protected String sortKeys;
    @XmlElement(defaultValue = "client")
    protected String renderedBy;
    @XmlElement(defaultValue = "application/soap+xml")
    protected String httpAccept;
    protected String responseType;
    @XmlElement(defaultValue = "packed")
    protected String recordPacking;
    protected String facetLimit;
    @XmlElement(defaultValue = "1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger facetStart;
    protected String facetSort;
    protected String facetCount;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Gets the value of the startRecord property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartRecord() {
        return startRecord;
    }

    /**
     * Sets the value of the startRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartRecord(BigInteger value) {
        this.startRecord = value;
    }

    /**
     * Gets the value of the maximumRecords property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumRecords() {
        return maximumRecords;
    }

    /**
     * Sets the value of the maximumRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumRecords(BigInteger value) {
        this.maximumRecords = value;
    }

    /**
     * Gets the value of the recordXMLEscaping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordXMLEscaping() {
        return recordXMLEscaping;
    }

    /**
     * Sets the value of the recordXMLEscaping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordXMLEscaping(String value) {
        this.recordXMLEscaping = value;
    }

    /**
     * Gets the value of the recordSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordSchema() {
        return recordSchema;
    }

    /**
     * Sets the value of the recordSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordSchema(String value) {
        this.recordSchema = value;
    }

    /**
     * Gets the value of the resultSetTTL property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResultSetTTL() {
        return resultSetTTL;
    }

    /**
     * Sets the value of the resultSetTTL property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResultSetTTL(BigInteger value) {
        this.resultSetTTL = value;
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
     * Gets the value of the queryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryType() {
        return queryType;
    }

    /**
     * Sets the value of the queryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryType(String value) {
        this.queryType = value;
    }

    /**
     * Gets the value of the sortKeys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortKeys() {
        return sortKeys;
    }

    /**
     * Sets the value of the sortKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortKeys(String value) {
        this.sortKeys = value;
    }

    /**
     * Gets the value of the renderedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderedBy() {
        return renderedBy;
    }

    /**
     * Sets the value of the renderedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenderedBy(String value) {
        this.renderedBy = value;
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
     * Gets the value of the responseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseType() {
        return responseType;
    }

    /**
     * Sets the value of the responseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseType(String value) {
        this.responseType = value;
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
     * Gets the value of the facetLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacetLimit() {
        return facetLimit;
    }

    /**
     * Sets the value of the facetLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacetLimit(String value) {
        this.facetLimit = value;
    }

    /**
     * Gets the value of the facetStart property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFacetStart() {
        return facetStart;
    }

    /**
     * Sets the value of the facetStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFacetStart(BigInteger value) {
        this.facetStart = value;
    }

    /**
     * Gets the value of the facetSort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacetSort() {
        return facetSort;
    }

    /**
     * Sets the value of the facetSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacetSort(String value) {
        this.facetSort = value;
    }

    /**
     * Gets the value of the facetCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacetCount() {
        return facetCount;
    }

    /**
     * Sets the value of the facetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacetCount(String value) {
        this.facetCount = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
