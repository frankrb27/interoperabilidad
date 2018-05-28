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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Cliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Cliente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombres" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apellidos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identificacion" type="{http://servicio.clientes.com.co/objetos}Identificacion"/>
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="direcciones" type="{http://servicio.clientes.com.co/objetos}Direccion" maxOccurs="unbounded"/>
 *         &lt;element name="tarjeta" type="{http://servicio.clientes.com.co/objetos}Tarjeta"/>
 *         &lt;element name="categoria" type="{http://servicio.clientes.com.co/objetos}Categoria"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Cliente", propOrder = {
    "id",
    "nombres",
    "apellidos",
    "identificacion",
    "telefono",
    "email",
    "direcciones",
    "tarjeta",
    "categoria",
    "estado",
    "canalActualizacion",
    "usuarioActualizacion",
    "fechaActualizacion",
    "ipActualizacion"
})
public class Cliente {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String nombres;
    @XmlElement(required = true)
    protected String apellidos;
    @XmlElement(required = true)
    protected Identificacion identificacion;
    @XmlElement(required = true)
    protected String telefono;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected List<Direccion> direcciones;
    @XmlElement(required = true)
    protected Tarjeta tarjeta;
    @XmlElement(required = true)
    protected Categoria categoria;
    @XmlElement(required = true)
    protected String estado;
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad nombres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Define el valor de la propiedad nombres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombres(String value) {
        this.nombres = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Define el valor de la propiedad apellidos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidos(String value) {
        this.apellidos = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacion.
     * 
     * @return
     *     possible object is
     *     {@link Identificacion }
     *     
     */
    public Identificacion getIdentificacion() {
        return identificacion;
    }

    /**
     * Define el valor de la propiedad identificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Identificacion }
     *     
     */
    public void setIdentificacion(Identificacion value) {
        this.identificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the direcciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the direcciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirecciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Direccion }
     * 
     * 
     */
    public List<Direccion> getDirecciones() {
        if (direcciones == null) {
            direcciones = new ArrayList<Direccion>();
        }
        return this.direcciones;
    }

    /**
     * Obtiene el valor de la propiedad tarjeta.
     * 
     * @return
     *     possible object is
     *     {@link Tarjeta }
     *     
     */
    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    /**
     * Define el valor de la propiedad tarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link Tarjeta }
     *     
     */
    public void setTarjeta(Tarjeta value) {
        this.tarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad categoria.
     * 
     * @return
     *     possible object is
     *     {@link Categoria }
     *     
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * Define el valor de la propiedad categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link Categoria }
     *     
     */
    public void setCategoria(Categoria value) {
        this.categoria = value;
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
