
package org.oasis_open.docs.ns.search_ws.xcql;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tripleDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tripleDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/xcql}searchClause"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/xcql}Boolean"/&gt;
 *           &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/xcql}leftOperand"/&gt;
 *           &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/xcql}rightOperand"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tripleDefinition", propOrder = {
    "searchClause",
    "_boolean",
    "leftOperand",
    "rightOperand"
})
public class TripleDefinition {

    protected SearchClauseDefinition searchClause;
    @XmlElement(name = "Boolean")
    protected BooleanPlusModifier _boolean;
    protected OperandDefinition leftOperand;
    protected OperandDefinition rightOperand;

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
     * Gets the value of the boolean property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPlusModifier }
     *     
     */
    public BooleanPlusModifier getBoolean() {
        return _boolean;
    }

    /**
     * Sets the value of the boolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPlusModifier }
     *     
     */
    public void setBoolean(BooleanPlusModifier value) {
        this._boolean = value;
    }

    /**
     * Gets the value of the leftOperand property.
     * 
     * @return
     *     possible object is
     *     {@link OperandDefinition }
     *     
     */
    public OperandDefinition getLeftOperand() {
        return leftOperand;
    }

    /**
     * Sets the value of the leftOperand property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperandDefinition }
     *     
     */
    public void setLeftOperand(OperandDefinition value) {
        this.leftOperand = value;
    }

    /**
     * Gets the value of the rightOperand property.
     * 
     * @return
     *     possible object is
     *     {@link OperandDefinition }
     *     
     */
    public OperandDefinition getRightOperand() {
        return rightOperand;
    }

    /**
     * Sets the value of the rightOperand property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperandDefinition }
     *     
     */
    public void setRightOperand(OperandDefinition value) {
        this.rightOperand = value;
    }

}
