
package org.oasis_open.docs.ns.search_ws.facetedresults;

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
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/facetedResults}actualTerm"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/facetedResults}query" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/facetedResults}requestUrl" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/facetedResults}count"/&gt;
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
    "actualTerm",
    "query",
    "requestUrl",
    "count"
})
public class TermDefinition {

    @XmlElement(required = true)
    protected String actualTerm;
    protected String query;
    @XmlSchemaType(name = "anyURI")
    protected String requestUrl;
    @XmlElement(required = true)
    protected BigInteger count;

    /**
     * Gets the value of the actualTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualTerm() {
        return actualTerm;
    }

    /**
     * Sets the value of the actualTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualTerm(String value) {
        this.actualTerm = value;
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

}
