
package org.oasis_open.docs.ns.search_ws.facetedresults;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for facetsDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="facetsDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/facetedResults}facet" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "facetsDefinition", propOrder = {
    "facet"
})
public class FacetsDefinition {

    @XmlElement(required = true)
    protected List<FacetDefinition> facet;

    /**
     * Gets the value of the facet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacetDefinition }
     * 
     * 
     */
    public List<FacetDefinition> getFacet() {
        if (facet == null) {
            facet = new ArrayList<FacetDefinition>();
        }
        return this.facet;
    }

}
