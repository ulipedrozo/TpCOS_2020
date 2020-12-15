//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.12.15 a las 05:28:58 PM ART 
//


package ar.edu.isistan.springsoap.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CowAlert complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CowAlert"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cow_id" type="{http://www.isistan.edu.ar/springsoap/gen}Cow"/&gt;
 *         &lt;element name="bcs_threshold" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CowAlert", propOrder = {
    "id",
    "cowId",
    "bcsThreshold"
})
public class CowAlert {

    protected int id;
    @XmlElement(name = "cow_id", required = true)
    protected Cow cowId;
    @XmlElement(name = "bcs_threshold")
    protected float bcsThreshold;

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
     * Obtiene el valor de la propiedad cowId.
     * 
     * @return
     *     possible object is
     *     {@link Cow }
     *     
     */
    public Cow getCowId() {
        return cowId;
    }

    /**
     * Define el valor de la propiedad cowId.
     * 
     * @param value
     *     allowed object is
     *     {@link Cow }
     *     
     */
    public void setCowId(Cow value) {
        this.cowId = value;
    }

    /**
     * Obtiene el valor de la propiedad bcsThreshold.
     * 
     */
    public float getBcsThreshold() {
        return bcsThreshold;
    }

    /**
     * Define el valor de la propiedad bcsThreshold.
     * 
     */
    public void setBcsThreshold(float value) {
        this.bcsThreshold = value;
    }

}
