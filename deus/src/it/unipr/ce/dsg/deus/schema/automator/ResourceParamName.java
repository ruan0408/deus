//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.01.08 at 05:21:35 PM CET 
//


package it.unipr.ce.dsg.deus.schema.automator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resourceParamName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resourceParamName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="initialValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="finalValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="stepValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *       &lt;attribute name="handlerName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="resParamValue" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resourceParamName", propOrder = {
    "initialValue",
    "finalValue",
    "stepValue"
})
public class ResourceParamName {

    protected float initialValue;
    protected float finalValue;
    protected float stepValue;
    @XmlAttribute(required = true)
    protected String handlerName;
    @XmlAttribute(required = true)
    protected String resParamValue;

    /**
     * Gets the value of the initialValue property.
     * 
     */
    public float getInitialValue() {
        return initialValue;
    }

    /**
     * Sets the value of the initialValue property.
     * 
     */
    public void setInitialValue(float value) {
        this.initialValue = value;
    }

    /**
     * Gets the value of the finalValue property.
     * 
     */
    public float getFinalValue() {
        return finalValue;
    }

    /**
     * Sets the value of the finalValue property.
     * 
     */
    public void setFinalValue(float value) {
        this.finalValue = value;
    }

    /**
     * Gets the value of the stepValue property.
     * 
     */
    public float getStepValue() {
        return stepValue;
    }

    /**
     * Sets the value of the stepValue property.
     * 
     */
    public void setStepValue(float value) {
        this.stepValue = value;
    }

    /**
     * Gets the value of the handlerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlerName() {
        return handlerName;
    }

    /**
     * Sets the value of the handlerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlerName(String value) {
        this.handlerName = value;
    }

    /**
     * Gets the value of the resParamValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResParamValue() {
        return resParamValue;
    }

    /**
     * Sets the value of the resParamValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResParamValue(String value) {
        this.resParamValue = value;
    }

}
