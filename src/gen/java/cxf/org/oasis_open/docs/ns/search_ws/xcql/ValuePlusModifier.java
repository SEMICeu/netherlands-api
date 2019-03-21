
package org.oasis_open.docs.ns.search_ws.xcql;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for valuePlusModifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="valuePlusModifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/xcql}value"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/xcql}modifiers" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valuePlusModifier", propOrder = {
    "value",
    "modifiers"
})
public class ValuePlusModifier {

    @XmlElement(required = true)
    protected String value;
    protected ModifiersDefinition modifiers;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the modifiers property.
     * 
     * @return
     *     possible object is
     *     {@link ModifiersDefinition }
     *     
     */
    public ModifiersDefinition getModifiers() {
        return modifiers;
    }

    /**
     * Sets the value of the modifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifiersDefinition }
     *     
     */
    public void setModifiers(ModifiersDefinition value) {
        this.modifiers = value;
    }

}
