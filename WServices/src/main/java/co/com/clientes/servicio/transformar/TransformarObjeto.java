package co.com.clientes.servicio.transformar;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import co.com.clientes.servicio.objetos.Categoria;
import co.com.clientes.servicio.objetos.Ciudad;
import co.com.clientes.servicio.objetos.Cliente;
import co.com.clientes.servicio.objetos.DetalleOrden;
import co.com.clientes.servicio.objetos.Direccion;
import co.com.clientes.servicio.objetos.Estado;
import co.com.clientes.servicio.objetos.Identificacion;
import co.com.clientes.servicio.objetos.Orden;
import co.com.clientes.servicio.objetos.Pais;
import co.com.clientes.servicio.objetos.Producto;
import co.com.clientes.servicio.objetos.Tarjeta;
import co.com.dal.b2c.Address;
import co.com.dal.b2c.Customer;
import co.com.dal.b2c.OrderItem;
import co.com.dal.b2c.SalesOrder;

public class TransformarObjeto {

	/**
	 * 
	 * @param objectList
	 * @return
	 */
	public static Cliente getCliente(List<Object> objectList) {
		Cliente cliente = getCliente((Customer) objectList.get(1));
		List<Direccion> listaDirecciones = getDireccion((List<Address>) objectList.get(2));
		cliente.getDirecciones().addAll(listaDirecciones);
		return cliente;
	} 

	/**
	 * 
	 * @param objectList
	 * @return
	 */
	public static List<Cliente> getListCliente(List<Object> objectList) {
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		for(Object object : objectList) {
			if(object instanceof Customer) {
				Customer customer = (Customer) object;
				Cliente cliente = getCliente(customer);
				List<Direccion> listaDirecciones = getDireccion(customer.getAddress());
				cliente.getDirecciones().addAll(listaDirecciones);
				listaClientes.add(cliente);
			}
		}
		listaClientes.add(new Cliente());
		return listaClientes;
	} 

	public static List<Orden> getListOrdenes(List<Object> objectList) {
		List<Orden> listaOrden = new ArrayList<Orden>();
		System.out.println("inicio");
		for(Object object : objectList) {
			if(object instanceof SalesOrder) {
				SalesOrder salesOrder = (SalesOrder) object;
				Orden orden = getOrden(salesOrder);
				System.out.println(orden.getId());
				listaOrden.add(orden);
			}
		}
		System.out.println("fin");
		return listaOrden;
	} 

	/**
	 * 
	 * @param customer
	 * @return
	 */
	private static Cliente getCliente(Customer customer) {
		Cliente cliente = new Cliente();
		cliente.setId(customer.getID());
		cliente.setNombres(customer.getFIRST_NAME());
		cliente.setApellidos(customer.getLAST_NAME());
		cliente.setIdentificacion(new Identificacion());
		cliente.getIdentificacion().setTipo(""+customer.getDOC_TYPE());
		cliente.getIdentificacion().setNumero(""+customer.getDOC_NUMBER());
		cliente.setTelefono(customer.getPHONE_NUMBER());
		cliente.setEmail(customer.getEMAIL());
		cliente.setTarjeta(new Tarjeta());
		cliente.getTarjeta().setNumero(customer.getCREDITCARD_NUMBER());
		cliente.getTarjeta().setTipo(customer.getCREDITCARD_TYPE());
		cliente.setCategoria(new Categoria());
		cliente.getCategoria().setId(customer.getCATEGORY());
		cliente.getCategoria().setNombre(customer.getCATEGORY());
		cliente.setCanalActualizacion(customer.getCHANNEL_UPD());
		cliente.setUsuarioActualizacion(customer.getUSER_UPD());
		cliente.setFechaActualizacion(customer.getLAST_UPD());
		cliente.setIpActualizacion(customer.getIP_UPD());
		return cliente;
	}

	/**
	 * 
	 * @param addressList
	 * @return
	 */
	private static List<Direccion> getDireccion(List<Address> addressList) {
		List<Direccion> listaDirecciones = new ArrayList<Direccion>();
		for(Address address : addressList) {
			Direccion direccion = new Direccion();
			direccion.setDireccion(address.getSTREET());
			direccion.setCiudad(new Ciudad());
			direccion.getCiudad().setId(address.getCITY());
			direccion.getCiudad().setNombre(address.getCITY());
			direccion.getCiudad().setPais(new Pais());
			direccion.getCiudad().getPais().setId(address.getCOUNTRY());
			direccion.getCiudad().getPais().setNombre(address.getCOUNTRY());
			direccion.getCiudad().getPais().setEstado(new Estado());
			direccion.getCiudad().getPais().getEstado().setId(address.getSTATE());
			direccion.getCiudad().getPais().getEstado().setNombre(address.getSTATE());
			direccion.setZip(address.getZIP());
			direccion.setCanalActualizacion(address.getCHANNEL_UPD());
			direccion.setUsuarioActualizacion(address.getUSER_UPD());
			direccion.setFechaActualizacion(address.getLAST_UPD());
			direccion.setIpActualizacion(address.getIP_UPD());
			listaDirecciones.add(direccion);
		}
		return listaDirecciones;
	}

	/**
	 * 
	 * @param salesOrder
	 * @return
	 */
	public static Orden getOrden(SalesOrder salesOrder) {
		Orden orden = new Orden();
		orden.setId(salesOrder.getID());
		orden.setFecha(getFecha(salesOrder.getORDER_DATE()));
		orden.setPrecio(salesOrder.getPRICE());
		orden.setEstado(salesOrder.getSTATUS());
		orden.setComentarios(salesOrder.getCOMMENTS());		
		orden.setCanalActualizacion(salesOrder.getCHANNEL_UPD());
		orden.setUsuarioActualizacion(salesOrder.getUSER_UPD());
		orden.setFechaActualizacion(salesOrder.getLAST_UPD());
		orden.setIpActualizacion(salesOrder.getIP_UPD());
		//Cliente
		orden.setCliente(getCliente(salesOrder.getCustomer()));
		//Detalle
		orden.getDetalle().addAll(getDetalleOrden(salesOrder.getItems()));
		return orden;
	}

	/**
	 * 
	 * @param salesOrder
	 * @return
	 */
	public static List<DetalleOrden> getDetalleOrden(List<OrderItem> listItems) {
		List<DetalleOrden> listDetalle = new ArrayList<DetalleOrden>();
		for(OrderItem orderItems : listItems) {
			DetalleOrden detalle = new DetalleOrden();
			detalle.setId(orderItems.getID());
			detalle.setProducto(new Producto());
			detalle.getProducto().setId(orderItems.getPRODUCT_ID().toString());
			detalle.getProducto().setNombre(orderItems.getPRODUCT_NAME());
			detalle.setNumeroParte(orderItems.getPARTNUM());
			detalle.setPrecio(orderItems.getPRICE());
			detalle.setCantidad(orderItems.getQUANTITY());
			detalle.setCanalActualizacion(orderItems.getCHANNEL_UPD());
			detalle.setUsuarioActualizacion(orderItems.getUSER_UPD());
			detalle.setFechaActualizacion(orderItems.getLAST_UPD());
			detalle.setIpActualizacion(orderItems.getIP_UPD());
			listDetalle.add(detalle);
		}
		return listDetalle;
	}
	/**
	 * 
	 * @param fecha
	 * @return
	 */
	private static XMLGregorianCalendar getFecha(Date fecha) {
		try {
			GregorianCalendar c = new GregorianCalendar();
			c.setTime(fecha);
			XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			return date2;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
