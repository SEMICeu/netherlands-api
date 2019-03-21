
package org.oasis_open.docs.ns.search_ws.searchresultanalysis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fullDefinition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fullDefinition"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="true"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "fullDefinition")
@XmlEnum
public enum FullDefinition {

    @XmlEnumValue("true")
    TRUE("true");
    private final String value;

    FullDefinition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FullDefinition fromValue(String v) {
        for (FullDefinition c: FullDefinition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
