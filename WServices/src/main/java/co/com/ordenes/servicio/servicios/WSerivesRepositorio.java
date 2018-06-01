package co.com.ordenes.servicio.servicios;

import org.springframework.stereotype.Component;


@Component
public class WSerivesRepositorio {
//
//	Orden orden = new Orden();
//	ConnectionManager connection = new ConnectionManager();
//
//	@PostConstruct
//	public void initData() {
//		Cliente cliente = new Cliente();
//		cliente.setId("AS123");
//		cliente.setNombres("Frank");
//		cliente.setApellidos("Rodriguez");
//		cliente.setIdentificacion(new Identificacion());
//		cliente.getIdentificacion().setNumero("10365987");
//		cliente.getIdentificacion().setTipo("CC");
//		cliente.setTelefono("3206549874");
//		cliente.setEmail("frank@hotmail.com");
//		cliente.setCategoria(new Categoria());
//		cliente.getCategoria().setId("1");
//		cliente.getCategoria().setNombre("Gold");
//		cliente.setTarjeta(new Tarjeta());
//		cliente.getTarjeta().setTipo("VISA");
//		cliente.getTarjeta().setNumero("647846532103");
//		Direccion direccion = new Direccion();
//		direccion.setDireccion("Cra 34 34 34");
//		direccion.setZip("2145");
//		direccion.setCiudad(new Ciudad());
//		direccion.getCiudad().setId("32");
//		direccion.getCiudad().setNombre("BOGOTA");
//		direccion.getCiudad().setPais(new Pais());
//		direccion.getCiudad().getPais().setId("3");
//		direccion.getCiudad().getPais().setNombre("COLOMBIA");
//		direccion.getCiudad().getPais().setEstado(new Estado());
//		direccion.getCiudad().getPais().getEstado().setId("5678");
//		direccion.getCiudad().getPais().getEstado().setNombre("ESTADO NOR");
//		cliente.getDirecciones().add(direccion);
//		cliente.getDirecciones().add(new Direccion());
//
//		DetalleOrden detalle = new DetalleOrden();
//		detalle.setId(654);
//		detalle.setCantidad(1);
//		detalle.setNumeroParte("02");
//		detalle.setPrecio(3256);
//		detalle.setProducto(new Producto());
//		detalle.getProducto().setId("1");
//		detalle.getProducto().setNombre("Acompaña a Colombia Rusia 2018");
//
//		orden.setId(5);
//		orden.setFecha(null);
//		orden.setPrecio(2500000);
//		orden.setEstado("ORDER");
//		orden.setComentarios("Prueba del objeto orden");
//		orden.getDetalle().add(detalle);
//
//		orden.setCliente(cliente);
//	}
//
//	/**
//	 * 
//	 * @param ordenReq
//	 * @return
//	 */
//	public CrearOrdenResponse crear(Orden ordenReq) {
//		CrearOrdenResponse response = new CrearOrdenResponse();
//		int count = 0;
//		try {
//			List<Object> objectList = connection.crearOrdenes(
//					(ordenReq.getId()==0?null:"0"),
//					FechaUtils.getFechaString(ordenReq.getFecha().toGregorianCalendar().getTime()),
//					String.valueOf(ordenReq.getPrecio()),
//					ordenReq.getEstado(),
//					ordenReq.getComentarios(),
//					ordenReq.getCliente().getIdentificacion().getNumero(),
//					ordenReq.getCliente().getIdentificacion().getTipo(),
//					ordenReq.getCanalActualizacion(),
//					ordenReq.getUsuarioActualizacion(),
//					ordenReq.getFechaActualizacion(),
//					ordenReq.getIpActualizacion()
//					);
//			if(objectList.size()>0 && ((Response)objectList.get(0)).getCODE().equals("00")) {
//				ordenReq.setId(((BigDecimal)objectList.get(1)).intValue());
//				response.setOrden(ordenReq);
//				for(DetalleOrden detalle : ordenReq.getDetalle()) {
//					List<Object> objectList2 = connection.crearDetalleOrden(
//							"0",
//							detalle.getProducto().getId(),
//							detalle.getProducto().getNombre(),
//							detalle.getNumeroParte(),
//							String.valueOf(detalle.getPrecio()),
//							String.valueOf(detalle.getCantidad()),
//							String.valueOf(ordenReq.getId()),
//							detalle.getCanalActualizacion(),
//							detalle.getUsuarioActualizacion(),
//							detalle.getFechaActualizacion(),
//							detalle.getIpActualizacion()
//							);
//					if(objectList2.size()>0 && ((Response)objectList2.get(0)).getCODE().equals("00")) {
//						detalle.setId(((BigDecimal)objectList2.get(1)).intValue());
//						response.getOrden().getDetalle().set(count, detalle);
//					}
//					count++;
//				}
//				return response;
//			}else{
//				response.setCodigo(((Response)objectList.get(0)).getCODE());
//				response.setMensaje(((Response)objectList.get(0)).getMESSAGE());
//				return response;
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//			response.setCodigo("FAIL");
//			response.setMensaje("Ocurred exception");			
//			return response;
//		}		
//	}
//
//	/**
//	 * 
//	 * @param ordenReq
//	 * @return
//	 */
//	public ConsultarOrdenResponse consultar(Orden ordenReq) {
//		ConsultarOrdenResponse response = new ConsultarOrdenResponse();
//		try {
//			List<Object> objectList = connection.consultarOrdenes(
//					ordenReq.getId()==0?null:String.valueOf(ordenReq.getId()),
//					ordenReq.getFecha()==null?null:FechaUtils.getFechaString(ordenReq.getFecha().toGregorianCalendar().getTime()),
//							ordenReq.getPrecio()==0?null:String.valueOf(ordenReq.getPrecio()),
//							ordenReq.getEstado(),
//							ordenReq.getComentarios(),
//							ordenReq.getCliente()==null?null:ordenReq.getCliente().getIdentificacion().getNumero(),
//									ordenReq.getCliente()==null?null:ordenReq.getCliente().getIdentificacion().getTipo(),
//											ordenReq.getDetalle()==null?null:(ordenReq.getDetalle().size()==0?null:(ordenReq.getDetalle().get(0).getProducto()==null?null:ordenReq.getDetalle().get(0).getProducto().getId())),
//													ordenReq.getDetalle()==null?null:(ordenReq.getDetalle().size()==0?null:(ordenReq.getDetalle().get(0).getProducto()==null?null:ordenReq.getDetalle().get(0).getProducto().getNombre())),
//															ordenReq.getDetalle()==null?null:ordenReq.getDetalle().size()==0?null:ordenReq.getDetalle().get(0).getNumeroParte(),
//																	ordenReq.getDetalle()==null?null:String.valueOf(ordenReq.getDetalle().size()==0?null:ordenReq.getDetalle().get(0).getPrecio()),
//																			ordenReq.getDetalle()==null?null:String.valueOf(ordenReq.getDetalle().size()==0?null:ordenReq.getDetalle().get(0).getCantidad())
//					);
//			if(objectList.size()>0 && ((Response)objectList.get(0)).getCODE().equals("00")) {
//				List list = TransformarObjeto.getListOrdenes(objectList);
//				System.out.println(list);
//				response.getOrden().addAll(list);
//				response.getOrden().add(orden);
//				return response;
//			}else{
//				response.getOrden().add(orden);
//				return response;
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//			return response;
//		}
//	}
//
//	/**
//	 * 
//	 * @param ordenReq
//	 * @return
//	 */
//	public CancelacionOrdenResponse cancelar(Orden ordenReq) {
//		CancelacionOrdenResponse response = new CancelacionOrdenResponse();
//		try {
//			List<Object> objectList = connection.cancelarOrden(
//					String.valueOf(ordenReq.getId()),
//					ordenReq.getCliente().getIdentificacion().getNumero(),
//					ordenReq.getCliente().getIdentificacion().getTipo(),
//					ordenReq.getEstado(),
//					ordenReq.getCanalActualizacion(),
//					ordenReq.getUsuarioActualizacion(),
//					ordenReq.getFechaActualizacion(),
//					ordenReq.getIpActualizacion()
//					);
//			response.setCodigo(((Response)objectList.get(0)).getCODE());
//			response.setMensaje(((Response)objectList.get(0)).getMESSAGE());
//			return response;
//		}catch(Exception e) {
//			e.printStackTrace();
//			response.setCodigo("FAIL");
//			response.setMensaje("Ocurred exception");
//			return response;
//		}
//
//	}	

}

