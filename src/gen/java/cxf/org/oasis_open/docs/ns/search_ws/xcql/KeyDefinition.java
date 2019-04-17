
package org.oasis_open.docs.ns.search_ws.xcql;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for keyDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="keyDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/xcql}index"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/xcql}modifiers"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "keyDefinition", propOrder = {
    "index",
    "modifiers"
})
public class KeyDefinition {

    @XmlElement(required = true)
    protected String index;
    @XmlElement(required = true)
    protected ModifiersDefinition modifiers;

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
