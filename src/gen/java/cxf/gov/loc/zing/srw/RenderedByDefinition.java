
package gov.loc.zing.srw;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for renderedByDefinition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="renderedByDefinition"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="client"/&gt;
 *     &lt;enumeration value="server"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "renderedByDefinition")
@XmlEnum
public enum RenderedByDefinition {

    @XmlEnumValue("client")
    CLIENT("client"),
    @XmlEnumValue("server")
    SERVER("server");
    private final String value;

    RenderedByDefinition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RenderedByDefinition fromValue(String v) {
        for (RenderedByDefinition c: RenderedByDefinition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
