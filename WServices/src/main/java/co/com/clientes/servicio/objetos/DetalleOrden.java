//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.11 a las 02:03:37 PM COT 
//


package co.com.clientes.servicio.objetos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DetalleOrden complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetalleOrden">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="producto" type="{http://servicio.clientes.com.co/objetos}Producto"/>
 *         &lt;element name="numeroParte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "DetalleOrden", propOrder = {
    "id",
    "producto",
    "numeroParte",
    "precio",
    "cantidad",
    "canalActualizacion",
    "usuarioActualizacion",
    "fechaActualizacion",
    "ipActualizacion"
})
public class DetalleOrden {

    protected int id;
    @XmlElement(required = true)
    protected Producto producto;
    @XmlElement(required = true)
    protected String numeroParte;
    protected double precio;
    protected int cantidad;
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
     * Obtiene el valor de la propiedad producto.
     * 
     * @return
     *     possible object is
     *     {@link Producto }
     *     
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * Define el valor de la propiedad producto.
     * 
     * @param value
     *     allowed object is
     *     {@link Producto }
     *     
     */
    public void setProducto(Producto value) {
        this.producto = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroParte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroParte() {
        return numeroParte;
    }

    /**
     * Define el valor de la propiedad numeroParte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroParte(String value) {
        this.numeroParte = value;
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
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
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
