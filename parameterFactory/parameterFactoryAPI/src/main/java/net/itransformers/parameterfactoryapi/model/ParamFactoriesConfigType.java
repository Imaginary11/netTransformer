//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.18 at 03:40:06 AM EET 
//


package net.itransformers.parameterfactoryapi.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for param-factories-configType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="param-factories-configType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="param-factory-element-types" type="{}param-factory-element-typesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "param-factories-configType", propOrder = {
    "paramFactoryElementTypes"
})
public class ParamFactoriesConfigType {

    @XmlElement(name = "param-factory-element-types", required = true)
    protected ParamFactoryElementTypesType paramFactoryElementTypes;

    /**
     * Gets the value of the paramFactoryElementTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ParamFactoryElementTypesType }
     *     
     */
    public ParamFactoryElementTypesType getParamFactoryElementTypes() {
        return paramFactoryElementTypes;
    }

    /**
     * Sets the value of the paramFactoryElementTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamFactoryElementTypesType }
     *     
     */
    public void setParamFactoryElementTypes(ParamFactoryElementTypesType value) {
        this.paramFactoryElementTypes = value;
    }

}