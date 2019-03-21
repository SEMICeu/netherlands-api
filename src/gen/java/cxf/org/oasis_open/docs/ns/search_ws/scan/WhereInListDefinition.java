
package org.oasis_open.docs.ns.search_ws.scan;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for whereInListDefinition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="whereInListDefinition"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="first"/&gt;
 *     &lt;enumeration value="last"/&gt;
 *     &lt;enumeration value="only"/&gt;
 *     &lt;enumeration value="inner"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "whereInListDefinition")
@XmlEnum
public enum WhereInListDefinition {

    @XmlEnumValue("first")
    FIRST("first"),
    @XmlEnumValue("last")
    LAST("last"),
    @XmlEnumValue("only")
    ONLY("only"),
    @XmlEnumValue("inner")
    INNER("inner");
    private final String value;

    WhereInListDefinition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WhereInListDefinition fromValue(String v) {
        for (WhereInListDefinition c: WhereInListDefinition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
