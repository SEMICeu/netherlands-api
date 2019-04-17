
package org.oasis_open.docs.ns.search_ws.searchresultanalysis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis}datasourceDisplayLabel" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis}datasourceDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis}baseURL" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis}subqueryResults"/&gt;
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
@XmlType(name = "datasourceDefinition", propOrder = {
    "datasourceDisplayLabel",
    "datasourceDescription",
    "baseURL",
    "subqueryResults"
})
public class DatasourceDefinition {

    protected String datasourceDisplayLabel;
    protected String datasourceDescription;
    protected String baseURL;
    @XmlElement(required = true)
    protected SubqueryResultsDefinition subqueryResults;
    @XmlAttribute(name = "full")
    protected FullDefinition full;

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
     * Gets the value of the subqueryResults property.
     * 
     * @return
     *     possible object is
     *     {@link SubqueryResultsDefinition }
     *     
     */
    public SubqueryResultsDefinition getSubqueryResults() {
        return subqueryResults;
    }

    /**
     * Sets the value of the subqueryResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubqueryResultsDefinition }
     *     
     */
    public void setSubqueryResults(SubqueryResultsDefinition value) {
        this.subqueryResults = value;
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
