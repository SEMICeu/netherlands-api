
package gov.loc.zing.srw;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recordXMLEscapingDefinition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="recordXMLEscapingDefinition"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="string"/&gt;
 *     &lt;enumeration value="xml"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "recordXMLEscapingDefinition")
@XmlEnum
public enum RecordXMLEscapingDefinition {

    @XmlEnumValue("string")
    STRING("string"),
    @XmlEnumValue("xml")
    XML("xml");
    private final String value;

    RecordXMLEscapingDefinition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecordXMLEscapingDefinition fromValue(String v) {
        for (RecordXMLEscapingDefinition c: RecordXMLEscapingDefinition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
