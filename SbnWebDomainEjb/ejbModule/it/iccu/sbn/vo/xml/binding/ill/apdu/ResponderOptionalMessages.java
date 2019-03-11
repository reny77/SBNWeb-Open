/*******************************************************************************
 * Copyright (C) 2019 ICCU - Istituto Centrale per il Catalogo Unico
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.10.01 at 01:17:47 PM CEST
//


package it.iccu.sbn.vo.xml.binding.ill.apdu;

import it.iccu.sbn.ejb.vo.SerializableVO;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="CanSendSHIPPED">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;enumeration value="0"/>
 *             &lt;enumeration value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="CanSendCHECKEDIN">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;enumeration value="0"/>
 *             &lt;enumeration value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="responderRECEIVED">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="requires"/>
 *             &lt;enumeration value="desires"/>
 *             &lt;enumeration value="neither"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="responderRETURNED">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="requires"/>
 *             &lt;enumeration value="desires"/>
 *             &lt;enumeration value="neither"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "Responder-optional-messages")
public class ResponderOptionalMessages
    extends SerializableVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlValue
    protected String value;
    @XmlAttribute(name = "CanSendSHIPPED")
    protected Integer canSendSHIPPED;
    @XmlAttribute(name = "CanSendCHECKEDIN")
    protected Integer canSendCHECKEDIN;
    @XmlAttribute(name = "responderRECEIVED")
    protected String responderRECEIVED;
    @XmlAttribute(name = "responderRETURNED")
    protected String responderRETURNED;

    /**
     * Gets the value of the value property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the canSendSHIPPED property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getCanSendSHIPPED() {
        return canSendSHIPPED;
    }

    /**
     * Sets the value of the canSendSHIPPED property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setCanSendSHIPPED(Integer value) {
        this.canSendSHIPPED = value;
    }

    /**
     * Gets the value of the canSendCHECKEDIN property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getCanSendCHECKEDIN() {
        return canSendCHECKEDIN;
    }

    /**
     * Sets the value of the canSendCHECKEDIN property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setCanSendCHECKEDIN(Integer value) {
        this.canSendCHECKEDIN = value;
    }

    /**
     * Gets the value of the responderRECEIVED property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResponderRECEIVED() {
        return responderRECEIVED;
    }

    /**
     * Sets the value of the responderRECEIVED property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResponderRECEIVED(String value) {
        this.responderRECEIVED = value;
    }

    /**
     * Gets the value of the responderRETURNED property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResponderRETURNED() {
        return responderRETURNED;
    }

    /**
     * Sets the value of the responderRETURNED property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResponderRETURNED(String value) {
        this.responderRETURNED = value;
    }

}