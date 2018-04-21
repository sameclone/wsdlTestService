
package com.mycompany.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPersonInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPersonInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestParams" type="{http://testperson.mycompany.com/}personRequest" minOccurs="0"/>
 *         &lt;element name="requestType" type="{http://testperson.mycompany.com/}typeRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonInfo", propOrder = {
    "requestParams",
    "requestType"
})
public class GetPersonInfo {

    protected PersonRequest requestParams;
    protected TypeRequest requestType;

    /**
     * Gets the value of the requestParams property.
     * 
     * @return
     *     possible object is
     *     {@link PersonRequest }
     *     
     */
    public PersonRequest getRequestParams() {
        return requestParams;
    }

    /**
     * Sets the value of the requestParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonRequest }
     *     
     */
    public void setRequestParams(PersonRequest value) {
        this.requestParams = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRequest }
     *     
     */
    public TypeRequest getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRequest }
     *     
     */
    public void setRequestType(TypeRequest value) {
        this.requestType = value;
    }

}
