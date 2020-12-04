//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.12.02 a las 05:55:35 PM ART 
//


package ar.edu.isistan.springsoap.gen;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ar.edu.isistan.springsoap.gen package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ar.edu.isistan.springsoap.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetHerdResponse }
     * 
     */
    public GetHerdResponse createGetHerdResponse() {
        return new GetHerdResponse();
    }

    /**
     * Create an instance of {@link Herd }
     * 
     */
    public Herd createHerd() {
        return new Herd();
    }

    /**
     * Create an instance of {@link GetHerdRequest }
     * 
     */
    public GetHerdRequest createGetHerdRequest() {
        return new GetHerdRequest();
    }

    /**
     * Create an instance of {@link SaveCowRequest }
     * 
     */
    public SaveCowRequest createSaveCowRequest() {
        return new SaveCowRequest();
    }

    /**
     * Create an instance of {@link SaveCowResponse }
     * 
     */
    public SaveCowResponse createSaveCowResponse() {
        return new SaveCowResponse();
    }

    /**
     * Create an instance of {@link Cow }
     * 
     */
    public Cow createCow() {
        return new Cow();
    }

    /**
     * Create an instance of {@link GetCowByEIDResponse }
     * 
     */
    public GetCowByEIDResponse createGetCowByEIDResponse() {
        return new GetCowByEIDResponse();
    }

    /**
     * Create an instance of {@link GetCowByEIDRequest }
     * 
     */
    public GetCowByEIDRequest createGetCowByEIDRequest() {
        return new GetCowByEIDRequest();
    }

    /**
     * Create an instance of {@link CowBcs }
     * 
     */
    public CowBcs createCowBcs() {
        return new CowBcs();
    }

    /**
     * Create an instance of {@link CowAlert }
     * 
     */
    public CowAlert createCowAlert() {
        return new CowAlert();
    }

    /**
     * Create an instance of {@link HerdAlert }
     * 
     */
    public HerdAlert createHerdAlert() {
        return new HerdAlert();
    }

}
