//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.12.02 a las 05:55:35 PM ART 
//


package ar.edu.isistan.springsoap.gen;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="electronic-Id" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="fecha_nacimiento" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="ultima_fecha_parto" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="cantidad_partos" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
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
    "electronicId",
    "fechaNacimiento",
    "ultimaFechaParto",
    "cantidadPartos",
    "peso"
})
@XmlRootElement(name = "saveCowRequest")
public class SaveCowRequest {

    @XmlElement(name = "electronic-Id", required = true)
    protected BigInteger electronicId;
    @XmlElement(name = "fecha_nacimiento", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaNacimiento;
    @XmlElement(name = "ultima_fecha_parto", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ultimaFechaParto;
    @XmlElement(name = "cantidad_partos", required = true)
    protected BigInteger cantidadPartos;
    protected float peso;

    /**
     * Obtiene el valor de la propiedad electronicId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getElectronicId() {
        return electronicId;
    }

    /**
     * Define el valor de la propiedad electronicId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setElectronicId(BigInteger value) {
        this.electronicId = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaNacimiento(XMLGregorianCalendar value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad ultimaFechaParto.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUltimaFechaParto() {
        return ultimaFechaParto;
    }

    /**
     * Define el valor de la propiedad ultimaFechaParto.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUltimaFechaParto(XMLGregorianCalendar value) {
        this.ultimaFechaParto = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadPartos.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCantidadPartos() {
        return cantidadPartos;
    }

    /**
     * Define el valor de la propiedad cantidadPartos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCantidadPartos(BigInteger value) {
        this.cantidadPartos = value;
    }

    /**
     * Obtiene el valor de la propiedad peso.
     * 
     */
    public float getPeso() {
        return peso;
    }

    /**
     * Define el valor de la propiedad peso.
     * 
     */
    public void setPeso(float value) {
        this.peso = value;
    }

}
