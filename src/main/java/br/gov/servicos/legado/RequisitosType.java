//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.06 at 04:52:01 PM BRST 
//


package br.gov.servicos.legado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requisitosType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requisitosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requisito" type="{}requisitoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requisitosType", propOrder = {
    "requisito"
})
class RequisitosType {

    protected RequisitoType requisito;

    /**
     * Gets the value of the requisito property.
     * 
     * @return
     *     possible object is
     *     {@link RequisitoType }
     *     
     */
    public RequisitoType getRequisito() {
        return requisito;
    }

    /**
     * Sets the value of the requisito property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequisitoType }
     *     
     */
    public void setRequisito(RequisitoType value) {
        this.requisito = value;
    }

}
