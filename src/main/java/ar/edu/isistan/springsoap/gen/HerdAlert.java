//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.12.02 a las 05:55:35 PM ART 
//


package ar.edu.isistan.springsoap.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HerdAlert complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HerdAlert"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="herd_id" type="{http://www.isistan.edu.ar/springsoap/gen}Herd"/&gt;
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
@XmlType(name = "HerdAlert", propOrder = {
    "id",
    "herdId",
    "bcsThreshold"
})
public class HerdAlert {

    protected int id;
    @XmlElement(name = "herd_id", required = true)
    protected Herd herdId;
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
     * Obtiene el valor de la propiedad herdId.
     * 
     * @return
     *     possible object is
     *     {@link Herd }
     *     
     */
    public Herd getHerdId() {
        return herdId;
    }

    /**
     * Define el valor de la propiedad herdId.
     * 
     * @param value
     *     allowed object is
     *     {@link Herd }
     *     
     */
    public void setHerdId(Herd value) {
        this.herdId = value;
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
