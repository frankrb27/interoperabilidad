//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.05.31 a las 10:18:37 PM COT 
//


package co.com.credito.servicio.objetos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InformacionFinanciera complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InformacionFinanciera">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ingresos" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="otrosIngresos" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="egresos" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="otrosEgresos" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionFinanciera", propOrder = {
    "ingresos",
    "otrosIngresos",
    "egresos",
    "otrosEgresos"
})
public class InformacionFinanciera {

    protected double ingresos;
    protected double otrosIngresos;
    protected double egresos;
    protected double otrosEgresos;

    /**
     * Obtiene el valor de la propiedad ingresos.
     * 
     */
    public double getIngresos() {
        return ingresos;
    }

    /**
     * Define el valor de la propiedad ingresos.
     * 
     */
    public void setIngresos(double value) {
        this.ingresos = value;
    }

    /**
     * Obtiene el valor de la propiedad otrosIngresos.
     * 
     */
    public double getOtrosIngresos() {
        return otrosIngresos;
    }

    /**
     * Define el valor de la propiedad otrosIngresos.
     * 
     */
    public void setOtrosIngresos(double value) {
        this.otrosIngresos = value;
    }

    /**
     * Obtiene el valor de la propiedad egresos.
     * 
     */
    public double getEgresos() {
        return egresos;
    }

    /**
     * Define el valor de la propiedad egresos.
     * 
     */
    public void setEgresos(double value) {
        this.egresos = value;
    }

    /**
     * Obtiene el valor de la propiedad otrosEgresos.
     * 
     */
    public double getOtrosEgresos() {
        return otrosEgresos;
    }

    /**
     * Define el valor de la propiedad otrosEgresos.
     * 
     */
    public void setOtrosEgresos(double value) {
        this.otrosEgresos = value;
    }

}
