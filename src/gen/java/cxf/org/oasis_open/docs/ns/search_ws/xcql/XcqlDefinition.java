
package org.oasis_open.docs.ns.search_ws.xcql;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xcqlDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xcqlDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/xcql}prefixes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/xcql}triple"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/xcql}sortKeys" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xcqlDefinition", propOrder = {
    "prefixes",
    "triple",
    "sortKeys"
})
public class XcqlDefinition {

    protected PrefixesDefinition prefixes;
    @XmlElement(required = true)
    protected TripleDefinition triple;
    protected SortKeysDefinition sortKeys;

    /**
     * Gets the value of the prefixes property.
     * 
     * @return
     *     possible object is
     *     {@link PrefixesDefinition }
     *     
     */
    public PrefixesDefinition getPrefixes() {
        return prefixes;
    }

    /**
     * Sets the value of the prefixes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixesDefinition }
     *     
     */
    public void setPrefixes(PrefixesDefinition value) {
        this.prefixes = value;
    }

    /**
     * Gets the value of the triple property.
     * 
     * @return
     *     possible object is
     *     {@link TripleDefinition }
     *     
     */
    public TripleDefinition getTriple() {
        return triple;
    }

    /**
     * Sets the value of the triple property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripleDefinition }
     *     
     */
    public void setTriple(TripleDefinition value) {
        this.triple = value;
    }

    /**
     * Gets the value of the sortKeys property.
     * 
     * @return
     *     possible object is
     *     {@link SortKeysDefinition }
     *     
     */
    public SortKeysDefinition getSortKeys() {
        return sortKeys;
    }

    /**
     * Sets the value of the sortKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortKeysDefinition }
     *     
     */
    public void setSortKeys(SortKeysDefinition value) {
        this.sortKeys = value;
    }

}
