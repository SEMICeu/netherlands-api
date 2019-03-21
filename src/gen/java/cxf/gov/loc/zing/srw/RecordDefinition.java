
package gov.loc.zing.srw;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for recordDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recordDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}recordSchema"/&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}recordPacking" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}recordXMLEscaping" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}recordData"/&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}recordPosition" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}extraRecordData" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recordDefinition", propOrder = {
    "recordSchema",
    "recordPacking",
    "recordXMLEscaping",
    "recordData",
    "recordPosition",
    "extraRecordData",
    "any"
})
public class RecordDefinition {

    @XmlElement(required = true)
    protected String recordSchema;
    protected String recordPacking;
    @XmlSchemaType(name = "string")
    protected RecordXMLEscapingDefinition recordXMLEscaping;
    @XmlElement(required = true)
    protected StringOrXmlFragmentDefinition recordData;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger recordPosition;
    protected ExtensionDefinition extraRecordData;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the recordSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordSchema() {
        return recordSchema;
    }

    /**
     * Sets the value of the recordSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordSchema(String value) {
        this.recordSchema = value;
    }

    /**
     * Gets the value of the recordPacking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordPacking() {
        return recordPacking;
    }

    /**
     * Sets the value of the recordPacking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordPacking(String value) {
        this.recordPacking = value;
    }

    /**
     * Gets the value of the recordXMLEscaping property.
     * 
     * @return
     *     possible object is
     *     {@link RecordXMLEscapingDefinition }
     *     
     */
    public RecordXMLEscapingDefinition getRecordXMLEscaping() {
        return recordXMLEscaping;
    }

    /**
     * Sets the value of the recordXMLEscaping property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordXMLEscapingDefinition }
     *     
     */
    public void setRecordXMLEscaping(RecordXMLEscapingDefinition value) {
        this.recordXMLEscaping = value;
    }

    /**
     * Gets the value of the recordData property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrXmlFragmentDefinition }
     *     
     */
    public StringOrXmlFragmentDefinition getRecordData() {
        return recordData;
    }

    /**
     * Sets the value of the recordData property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrXmlFragmentDefinition }
     *     
     */
    public void setRecordData(StringOrXmlFragmentDefinition value) {
        this.recordData = value;
    }

    /**
     * Gets the value of the recordPosition property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordPosition() {
        return recordPosition;
    }

    /**
     * Sets the value of the recordPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordPosition(BigInteger value) {
        this.recordPosition = value;
    }

    /**
     * Gets the value of the extraRecordData property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionDefinition }
     *     
     */
    public ExtensionDefinition getExtraRecordData() {
        return extraRecordData;
    }

    /**
     * Sets the value of the extraRecordData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionDefinition }
     *     
     */
    public void setExtraRecordData(ExtensionDefinition value) {
        this.extraRecordData = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
