//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.01 at 09:17:10 AM GMT 
//


package net.itransformers.ideas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stepType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stepType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessConstraints" type="{}businessConstraintsType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stepType", propOrder = {
    "businessConstraints"
})
public class StepType {

    @XmlElement(required = true)
    protected BusinessConstraintsType businessConstraints;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the businessConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessConstraintsType }
     *     
     */
    public BusinessConstraintsType getBusinessConstraints() {
        return businessConstraints;
    }

    /**
     * Sets the value of the businessConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessConstraintsType }
     *     
     */
    public void setBusinessConstraints(BusinessConstraintsType value) {
        this.businessConstraints = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
