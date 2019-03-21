
package org.oasis_open.docs.ns.search_ws.sruresponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sortKeyDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sortKeyDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruResponse}path"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruResponse}schema" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruResponse}ascending" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruResponse}caseSensitive" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruResponse}missingValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sortKeyDefinition", propOrder = {
    "path",
    "schema",
    "ascending",
    "caseSensitive",
    "missingValue"
})
public class SortKeyDefinition {

    @XmlElement(required = true)
    protected String path;
    protected String schema;
    protected Boolean ascending;
    protected Boolean caseSensitive;
    protected String missingValue;

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the schema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchema(String value) {
        this.schema = value;
    }

    /**
     * Gets the value of the ascending property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAscending() {
        return ascending;
    }

    /**
     * Sets the value of the ascending property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAscending(Boolean value) {
        this.ascending = value;
    }

    /**
     * Gets the value of the caseSensitive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCaseSensitive() {
        return caseSensitive;
    }

    /**
     * Sets the value of the caseSensitive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCaseSensitive(Boolean value) {
        this.caseSensitive = value;
    }

    /**
     * Gets the value of the missingValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMissingValue() {
        return missingValue;
    }

    /**
     * Sets the value of the missingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMissingValue(String value) {
        this.missingValue = value;
    }

}
