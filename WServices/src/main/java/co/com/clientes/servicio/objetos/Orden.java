//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.11 a las 02:03:37 PM COT 
//


package co.com.clientes.servicio.objetos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Orden complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Orden">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comentarios" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cliente" type="{http://servicio.clientes.com.co/objetos}Cliente"/>
 *         &lt;element name="detalle" type="{http://servicio.clientes.com.co/objetos}DetalleOrden" maxOccurs="unbounded"/>
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
@XmlType(name = "Orden", propOrder = {
    "id",
    "fecha",
    "precio",
    "estado",
    "comentarios",
    "cliente",
    "detalle",
    "canalActualizacion",
    "usuarioActualizacion",
    "fechaActualizacion",
    "ipActualizacion"
})
public class Orden {

    protected int id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fecha;
    protected double precio;
    @XmlElement(required = true)
    protected String estado;
    @XmlElement(required = true)
    protected String comentarios;
    @XmlElement(required = true)
    protected Cliente cliente;
    @XmlElement(required = true)
    protected List<DetalleOrden> detalle;
    @XmlElement(required = true)
    protected String canalActualizacion;
    @XmlElement(required = true)
    protected String usuarioActualizacion;
    @XmlElement(required = true)
    protected String fechaActualizacion;
    @XmlElement(required = true)
    protected String ipActualizacion;

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
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     */
    public void setPrecio(double value) {
        this.precio = value;
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
     * Obtiene el valor de la propiedad comentarios.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentarios() {
        return comentarios;
    }

    /**
     * Define el valor de la propiedad comentarios.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentarios(String value) {
        this.comentarios = value;
    }

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link Cliente }
     *     
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Cliente }
     *     
     */
    public void setCliente(Cliente value) {
        this.cliente = value;
    }

    /**
     * Gets the value of the detalle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetalle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetalleOrden }
     * 
     * 
     */
    public List<DetalleOrden> getDetalle() {
        if (detalle == null) {
            detalle = new ArrayList<DetalleOrden>();
        }
        return this.detalle;
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
