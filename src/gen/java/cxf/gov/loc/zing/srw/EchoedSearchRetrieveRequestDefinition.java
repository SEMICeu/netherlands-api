
package gov.loc.zing.srw;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.ns.search_ws.xcql.XcqlDefinition;


/**
 * <p>Java class for echoedSearchRetrieveRequestDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="echoedSearchRetrieveRequestDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}version" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}queryType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}query" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}xQuery" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}startRecord" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}maximumRecords" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}recordXMLEscaping" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}recordPacking" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}recordSchema" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}facetParameters" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}resultSetTTL" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}sortKeys" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}xSortKeys" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}stylesheet" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}renderedBy" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}extraRequestParameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}httpAccept" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}responseType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "echoedSearchRetrieveRequestDefinition", propOrder = {
    "version",
    "queryType",
    "query",
    "xQuery",
    "startRecord",
    "maximumRecords",
    "recordXMLEscaping",
    "recordPacking",
    "recordSchema",
    "facetParameters",
    "resultSetTTL",
    "sortKeys",
    "xSortKeys",
    "stylesheet",
    "renderedBy",
    "extraRequestParameter",
    "httpAccept",
    "responseType"
})
public class EchoedSearchRetrieveRequestDefinition {

    protected String version;
    protected String queryType;
    protected String query;
    protected List<XcqlDefinition> xQuery;
    @XmlElement(defaultValue = "1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger startRecord;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumRecords;
    @XmlSchemaType(name = "string")
    protected RecordXMLEscapingDefinition recordXMLEscaping;
    protected String recordPacking;
    protected String recordSchema;
    protected String facetParameters;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger resultSetTTL;
    protected String sortKeys;
    protected List<XSortKeysDefinition> xSortKeys;
    @XmlSchemaType(name = "anyURI")
    protected String stylesheet;
    @XmlSchemaType(name = "string")
    protected RenderedByDefinition renderedBy;
    protected List<String> extraRequestParameter;
    protected List<String> httpAccept;
    protected String responseType;

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
     * Gets the value of the xQuery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xQuery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XcqlDefinition }
     * 
     * 
     */
    public List<XcqlDefinition> getXQuery() {
        if (xQuery == null) {
            xQuery = new ArrayList<XcqlDefinition>();
        }
        return this.xQuery;
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
     * Gets the value of the facetParameters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacetParameters() {
        return facetParameters;
    }

    /**
     * Sets the value of the facetParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacetParameters(String value) {
        this.facetParameters = value;
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
     * Gets the value of the xSortKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xSortKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXSortKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XSortKeysDefinition }
     * 
     * 
     */
    public List<XSortKeysDefinition> getXSortKeys() {
        if (xSortKeys == null) {
            xSortKeys = new ArrayList<XSortKeysDefinition>();
        }
        return this.xSortKeys;
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
     * Gets the value of the renderedBy property.
     * 
     * @return
     *     possible object is
     *     {@link RenderedByDefinition }
     *     
     */
    public RenderedByDefinition getRenderedBy() {
        return renderedBy;
    }

    /**
     * Sets the value of the renderedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenderedByDefinition }
     *     
     */
    public void setRenderedBy(RenderedByDefinition value) {
        this.renderedBy = value;
    }

    /**
     * Gets the value of the extraRequestParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraRequestParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraRequestParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExtraRequestParameter() {
        if (extraRequestParameter == null) {
            extraRequestParameter = new ArrayList<String>();
        }
        return this.extraRequestParameter;
    }

    /**
     * Gets the value of the httpAccept property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the httpAccept property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHttpAccept().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHttpAccept() {
        if (httpAccept == null) {
            httpAccept = new ArrayList<String>();
        }
        return this.httpAccept;
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

}
