
package org.oasis_open.docs.ns.search_ws.facetedresults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datasourceDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datasourceDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/facetedResults}datasourceDisplayLabel" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/facetedResults}datasourceDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/facetedResults}baseURL" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/facetedResults}facets"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datasourceDefinition", propOrder = {
    "datasourceDisplayLabel",
    "datasourceDescription",
    "baseURL",
    "facets"
})
public class DatasourceDefinition {

    protected String datasourceDisplayLabel;
    protected String datasourceDescription;
    protected String baseURL;
    @XmlElement(required = true)
    protected FacetsDefinition facets;

    /**
     * Gets the value of the datasourceDisplayLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasourceDisplayLabel() {
        return datasourceDisplayLabel;
    }

    /**
     * Sets the value of the datasourceDisplayLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasourceDisplayLabel(String value) {
        this.datasourceDisplayLabel = value;
    }

    /**
     * Gets the value of the datasourceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasourceDescription() {
        return datasourceDescription;
    }

    /**
     * Sets the value of the datasourceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasourceDescription(String value) {
        this.datasourceDescription = value;
    }

    /**
     * Gets the value of the baseURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseURL() {
        return baseURL;
    }

    /**
     * Sets the value of the baseURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseURL(String value) {
        this.baseURL = value;
    }

    /**
     * Gets the value of the facets property.
     * 
     * @return
     *     possible object is
     *     {@link FacetsDefinition }
     *     
     */
    public FacetsDefinition getFacets() {
        return facets;
    }

    /**
     * Sets the value of the facets property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacetsDefinition }
     *     
     */
    public void setFacets(FacetsDefinition value) {
        this.facets = value;
    }

}
