
package org.oasis_open.docs.ns.search_ws.searchresultanalysis;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subqueryResultDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subqueryResultDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis}subqueryDisplayLabel" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis}subquery"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis}count"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis}requestUrl" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="full" type="{http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis}fullDefinition" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subqueryResultDefinition", propOrder = {
    "subqueryDisplayLabel",
    "subquery",
    "count",
    "requestUrl"
})
public class SubqueryResultDefinition {

    protected String subqueryDisplayLabel;
    @XmlElement(required = true)
    protected String subquery;
    @XmlElement(required = true)
    protected BigInteger count;
    @XmlSchemaType(name = "anyURI")
    protected String requestUrl;
    @XmlAttribute(name = "full")
    protected FullDefinition full;

    /**
     * Gets the value of the subqueryDisplayLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubqueryDisplayLabel() {
        return subqueryDisplayLabel;
    }

    /**
     * Sets the value of the subqueryDisplayLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubqueryDisplayLabel(String value) {
        this.subqueryDisplayLabel = value;
    }

    /**
     * Gets the value of the subquery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubquery() {
        return subquery;
    }

    /**
     * Sets the value of the subquery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubquery(String value) {
        this.subquery = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    /**
     * Gets the value of the requestUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestUrl() {
        return requestUrl;
    }

    /**
     * Sets the value of the requestUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestUrl(String value) {
        this.requestUrl = value;
    }

    /**
     * Gets the value of the full property.
     * 
     * @return
     *     possible object is
     *     {@link FullDefinition }
     *     
     */
    public FullDefinition getFull() {
        return full;
    }

    /**
     * Sets the value of the full property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullDefinition }
     *     
     */
    public void setFull(FullDefinition value) {
        this.full = value;
    }

}
