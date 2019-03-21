
package org.oasis_open.docs.ns.search_ws.facetedresults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for facetDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="facetDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/facetedResults}facetDisplayLabel" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/facetedResults}facetDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/facetedResults}index" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/facetedResults}relation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/facetedResults}terms"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "facetDefinition", propOrder = {
    "facetDisplayLabel",
    "facetDescription",
    "index",
    "relation",
    "terms"
})
public class FacetDefinition {

    protected String facetDisplayLabel;
    protected String facetDescription;
    protected String index;
    protected String relation;
    @XmlElement(required = true)
    protected TermsDefinition terms;

    /**
     * Gets the value of the facetDisplayLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacetDisplayLabel() {
        return facetDisplayLabel;
    }

    /**
     * Sets the value of the facetDisplayLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacetDisplayLabel(String value) {
        this.facetDisplayLabel = value;
    }

    /**
     * Gets the value of the facetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacetDescription() {
        return facetDescription;
    }

    /**
     * Sets the value of the facetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacetDescription(String value) {
        this.facetDescription = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

    /**
     * Gets the value of the relation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelation() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelation(String value) {
        this.relation = value;
    }

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

}
