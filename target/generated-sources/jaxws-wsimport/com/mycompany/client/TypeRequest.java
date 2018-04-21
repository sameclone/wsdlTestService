
package com.mycompany.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeRequest.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeRequest">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RSalary"/>
 *     &lt;enumeration value="RAge"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeRequest")
@XmlEnum
public enum TypeRequest {

    @XmlEnumValue("RSalary")
    R_SALARY("RSalary"),
    @XmlEnumValue("RAge")
    R_AGE("RAge");
    private final String value;

    TypeRequest(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeRequest fromValue(String v) {
        for (TypeRequest c: TypeRequest.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
