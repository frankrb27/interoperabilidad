//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.05.31 a las 10:18:37 PM COT 
//


package co.com.credito.servicio.objetos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Direccion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Direccion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ciudad" type="{http://servicio.credito.com.co/objetos}Ciudad"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="canalActualizacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usuarioActualizacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaActualizacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ipActualizacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Direccion", propOrder = {
    "direccion",
    "estado",
    "ciudad",
    "tipo",
    "canalActualizacion",
    "usuarioActualizacion",
    "fechaActualizacion",
    "ipActualizacion"
})
public class Direccion {

    @XmlElement(required = true)
    protected String direccion;
    @XmlElement(required = true)
    protected String estado;
    @XmlElement(required = true)
    protected Ciudad ciudad;
    @XmlElement(required = true)
    protected String tipo;
    @XmlElement(required = true)
    protected String canalActualizacion;
    @XmlElement(required = true)
    protected String usuarioActualizacion;
    @XmlElement(required = true)
    protected String fechaActualizacion;
    @XmlElement(required = true)
    protected String ipActualizacion;

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudad.
     * 
     * @return
     *     possible object is
     *     {@link Ciudad }
     *     
     */
    public Ciudad getCiudad() {
        return ciudad;
    }

    /**
     * Define el valor de la propiedad ciudad.
     * 
     * @param value
     *     allowed object is
     *     {@link Ciudad }
     *     
     */
    public void setCiudad(Ciudad value) {
        this.ciudad = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad canalActualizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanalActualizacion() {
        return canalActualizacion;
    }

    /**
     * Define el valor de la propiedad canalActualizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanalActualizacion(String value) {
        this.canalActualizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioActualizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioActualizacion() {
        return usuarioActualizacion;
    }

    /**
     * Define el valor de la propiedad usuarioActualizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioActualizacion(String value) {
        this.usuarioActualizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaActualizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaActualizacion() {
        return fechaActualizacion;
    }

    /**
     * Define el valor de la propiedad fechaActualizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaActualizacion(String value) {
        this.fechaActualizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad ipActualizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpActualizacion() {
        return ipActualizacion;
    }

    /**
     * Define el valor de la propiedad ipActualizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpActualizacion(String value) {
        this.ipActualizacion = value;
    }

}
