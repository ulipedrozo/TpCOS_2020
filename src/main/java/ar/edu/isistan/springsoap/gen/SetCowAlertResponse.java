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
 *         &lt;element name="cowAlert" type="{http://www.isistan.edu.ar/springsoap/gen}CowAlert"/&gt;
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
    "cowAlert"
})
@XmlRootElement(name = "setCowAlertResponse")
public class SetCowAlertResponse {

    @XmlElement(required = true)
    protected CowAlert cowAlert;

    /**
     * Obtiene el valor de la propiedad cowAlert.
     * 
     * @return
     *     possible object is
     *     {@link CowAlert }
     *     
     */
    public CowAlert getCowAlert() {
        return cowAlert;
    }

    /**
     * Define el valor de la propiedad cowAlert.
     * 
     * @param value
     *     allowed object is
     *     {@link CowAlert }
     *     
     */
    public void setCowAlert(CowAlert value) {
        this.cowAlert = value;
    }

}
