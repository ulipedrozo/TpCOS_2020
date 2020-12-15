//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.12.15 a las 05:28:58 PM ART 
//


package ar.edu.isistan.springsoap.gen;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Cow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Cow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="electronic_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="last_delivery" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="delivery_quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cow", propOrder = {
    "id",
    "weight",
    "electronicId",
    "birthday",
    "lastDelivery",
    "deliveryQuantity"
})
public class Cow {

    protected int id;
    @XmlElement(required = true)
    protected BigDecimal weight;
    @XmlElement(name = "electronic_id")
    protected int electronicId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "last_delivery", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastDelivery;
    @XmlElement(name = "delivery_quantity")
    protected int deliveryQuantity;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad weight.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * Define el valor de la propiedad weight.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeight(BigDecimal value) {
        this.weight = value;
    }

    /**
     * Obtiene el valor de la propiedad electronicId.
     * 
     */
    public int getElectronicId() {
        return electronicId;
    }

    /**
     * Define el valor de la propiedad electronicId.
     * 
     */
    public void setElectronicId(int value) {
        this.electronicId = value;
    }

    /**
     * Obtiene el valor de la propiedad birthday.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * Define el valor de la propiedad birthday.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * Obtiene el valor de la propiedad lastDelivery.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDelivery() {
        return lastDelivery;
    }

    /**
     * Define el valor de la propiedad lastDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDelivery(XMLGregorianCalendar value) {
        this.lastDelivery = value;
    }

    /**
     * Obtiene el valor de la propiedad deliveryQuantity.
     * 
     */
    public int getDeliveryQuantity() {
        return deliveryQuantity;
    }

    /**
     * Define el valor de la propiedad deliveryQuantity.
     * 
     */
    public void setDeliveryQuantity(int value) {
        this.deliveryQuantity = value;
    }

}
