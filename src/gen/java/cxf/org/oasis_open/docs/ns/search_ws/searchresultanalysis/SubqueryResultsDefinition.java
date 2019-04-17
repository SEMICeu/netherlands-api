
package org.oasis_open.docs.ns.search_ws.searchresultanalysis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subqueryResultsDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subqueryResultsDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/searchResultAnalysis}subqueryResult" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subqueryResultsDefinition", propOrder = {
    "subqueryResult"
})
public class SubqueryResultsDefinition {

    @XmlElement(required = true)
    protected List<SubqueryResultDefinition> subqueryResult;

    /**
     * Gets the value of the subqueryResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subqueryResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubqueryResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubqueryResultDefinition }
     * 
     * 
     */
    public List<SubqueryResultDefinition> getSubqueryResult() {
        if (subqueryResult == null) {
            subqueryResult = new ArrayList<SubqueryResultDefinition>();
        }
        return this.subqueryResult;
    }

}
