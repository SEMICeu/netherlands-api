
package org.oasis_open.docs.ns.search_ws.xcql;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BooleanPlusModifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BooleanPlusModifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="value" type="{http://docs.oasis-open.org/ns/search-ws/xcql}BooleanValue"/&gt;
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
@XmlType(name = "BooleanPlusModifier", propOrder = {
    "value",
    "modifiers"
})
public class BooleanPlusModifier {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected BooleanValue value;
    protected ModifiersDefinition modifiers;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanValue }
     *     
     */
    public BooleanValue getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanValue }
     *     
     */
    public void setValue(BooleanValue value) {
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
