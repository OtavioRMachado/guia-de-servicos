//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.06 at 04:52:01 PM BRST 
//


package br.gov.servicos.legado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for linhaDaVidaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="linhaDaVidaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eventoslinhaDaVida" type="{}eventoslinhaDaVidaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "linhaDaVidaType", propOrder = {
    "titulo",
    "eventoslinhaDaVida"
})
class LinhaDaVidaType {

    @XmlElement(required = true)
    protected String titulo;
    @XmlElement(required = true)
    protected EventoslinhaDaVidaType eventoslinhaDaVida;

    /**
     * Gets the value of the titulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Sets the value of the titulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

    /**
     * Gets the value of the eventoslinhaDaVida property.
     * 
     * @return
     *     possible object is
     *     {@link EventoslinhaDaVidaType }
     *     
     */
    public EventoslinhaDaVidaType getEventoslinhaDaVida() {
        return eventoslinhaDaVida;
    }

    /**
     * Sets the value of the eventoslinhaDaVida property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventoslinhaDaVidaType }
     *     
     */
    public void setEventoslinhaDaVida(EventoslinhaDaVidaType value) {
        this.eventoslinhaDaVida = value;
    }

}
