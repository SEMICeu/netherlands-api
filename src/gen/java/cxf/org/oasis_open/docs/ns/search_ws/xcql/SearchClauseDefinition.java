
package org.oasis_open.docs.ns.search_ws.xcql;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchClauseDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchClauseDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/xcql}term"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/xcql}index"/&gt;
 *           &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/xcql}relation"/&gt;
 *           &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/xcql}term"/&gt;
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
@XmlType(name = "searchClauseDefinition", propOrder = {
    "content"
})
public class SearchClauseDefinition {

    @XmlElementRefs({
        @XmlElementRef(name = "index", namespace = "http://docs.oasis-open.org/ns/search-ws/xcql", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "term", namespace = "http://docs.oasis-open.org/ns/search-ws/xcql", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "relation", namespace = "http://docs.oasis-open.org/ns/search-ws/xcql", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Term" is used by two different parts of a schema. See: 
     * line 132 of file:/C:/Users/stanie/git/netherlands-api/src/main/resources/wsdl/xcql.xsd
     * line 128 of file:/C:/Users/stanie/git/netherlands-api/src/main/resources/wsdl/xcql.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link ValuePlusModifier }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
