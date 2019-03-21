
package org.oasis_open.docs.ns.search_ws.xcql;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operandDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operandDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/xcql}searchClause"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/xcql}triple"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operandDefinition", propOrder = {
    "searchClause",
    "triple"
})
public class OperandDefinition {

    protected SearchClauseDefinition searchClause;
    protected TripleDefinition triple;

    /**
     * Gets the value of the searchClause property.
     * 
     * @return
     *     possible object is
     *     {@link SearchClauseDefinition }
     *     
     */
    public SearchClauseDefinition getSearchClause() {
        return searchClause;
    }

    /**
     * Sets the value of the searchClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchClauseDefinition }
     *     
     */
    public void setSearchClause(SearchClauseDefinition value) {
        this.searchClause = value;
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

}
