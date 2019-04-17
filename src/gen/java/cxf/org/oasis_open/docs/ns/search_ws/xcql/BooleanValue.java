
package org.oasis_open.docs.ns.search_ws.xcql;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BooleanValue.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BooleanValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="and"/&gt;
 *     &lt;enumeration value="or"/&gt;
 *     &lt;enumeration value="not"/&gt;
 *     &lt;enumeration value="prox"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BooleanValue")
@XmlEnum
public enum BooleanValue {

    @XmlEnumValue("and")
    AND("and"),
    @XmlEnumValue("or")
    OR("or"),
    @XmlEnumValue("not")
    NOT("not"),
    @XmlEnumValue("prox")
    PROX("prox");
    private final String value;

    BooleanValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BooleanValue fromValue(String v) {
        for (BooleanValue c: BooleanValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
