//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.12.15 a las 05:28:58 PM ART 
//


package ar.edu.isistan.springsoap.gen;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cowId" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="herdId" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cowId",
    "herdId"
})
@XmlRootElement(name = "addCowToHerdRequest")
public class AddCowToHerdRequest {

    @XmlElement(required = true)
    protected BigInteger cowId;
    @XmlElement(required = true)
    protected BigInteger herdId;

    /**
     * Obtiene el valor de la propiedad cowId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCowId() {
        return cowId;
    }

    /**
     * Define el valor de la propiedad cowId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCowId(BigInteger value) {
        this.cowId = value;
    }

    /**
     * Obtiene el valor de la propiedad herdId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHerdId() {
        return herdId;
    }

    /**
     * Define el valor de la propiedad herdId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHerdId(BigInteger value) {
        this.herdId = value;
    }

}
