
package gov.loc.zing.srw;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.ns.search_ws.diagnostic.DiagnosticComplexType;


/**
 * <p>Java class for diagnosticsDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="diagnosticsDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/diagnostic}diagnostic" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "diagnosticsDefinition", propOrder = {
    "diagnostic"
})
public class DiagnosticsDefinition {

    @XmlElement(namespace = "http://docs.oasis-open.org/ns/search-ws/diagnostic", required = true)
    protected List<DiagnosticComplexType> diagnostic;

    /**
     * Gets the value of the diagnostic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diagnostic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagnostic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiagnosticComplexType }
     * 
     * 
     */
    public List<DiagnosticComplexType> getDiagnostic() {
        if (diagnostic == null) {
            diagnostic = new ArrayList<DiagnosticComplexType>();
        }
        return this.diagnostic;
    }

}
