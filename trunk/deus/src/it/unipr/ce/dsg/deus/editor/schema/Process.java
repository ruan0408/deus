//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.21 at 11:21:04 PM CEST 
//


package it.unipr.ce.dsg.deus.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for process complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="process">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="logger" type="{http://dsg.ce.unipr.it/software/deus/schema/automator}logger" minOccurs="0"/>
 *         &lt;element name="params" type="{http://dsg.ce.unipr.it/software/deus/schema/automator}params" minOccurs="0"/>
 *         &lt;element name="nodes" type="{http://dsg.ce.unipr.it/software/deus/schema/automator}references" minOccurs="0"/>
 *         &lt;element name="events" type="{http://dsg.ce.unipr.it/software/deus/schema/automator}references"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="handler" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "process", propOrder = {
    "logger",
    "params",
    "nodes",
    "events"
})
public class Process {

    protected Logger logger;
    protected Params params;
    protected References nodes;
    @XmlElement(required = true)
    protected References events;
    @XmlAttribute(required = true)
    protected String id;
    @XmlAttribute(required = true)
    protected String handler;

    /**
     * Gets the value of the logger property.
     * 
     * @return
     *     possible object is
     *     {@link Logger }
     *     
     */
    public Logger getLogger() {
        return logger;
    }

    /**
     * Sets the value of the logger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Logger }
     *     
     */
    public void setLogger(Logger value) {
        this.logger = value;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link Params }
     *     
     */
    public Params getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link Params }
     *     
     */
    public void setParams(Params value) {
        this.params = value;
    }

    /**
     * Gets the value of the nodes property.
     * 
     * @return
     *     possible object is
     *     {@link References }
     *     
     */
    public References getNodes() {
        return nodes;
    }

    /**
     * Sets the value of the nodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link References }
     *     
     */
    public void setNodes(References value) {
        this.nodes = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link References }
     *     
     */
    public References getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link References }
     *     
     */
    public void setEvents(References value) {
        this.events = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the handler property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandler() {
        return handler;
    }

    /**
     * Sets the value of the handler property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandler(String value) {
        this.handler = value;
    }

}
