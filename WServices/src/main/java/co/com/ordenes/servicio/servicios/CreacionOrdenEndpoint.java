package co.com.ordenes.servicio.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import co.com.ordenes.servicio.creacion.CrearOrdenRequest;
import co.com.ordenes.servicio.creacion.CrearOrdenResponse;

@Endpoint
public class CreacionOrdenEndpoint {
	private static final String NAMESPACE_URI = "http://servicio.ordenes.com.co/creacion";
	private OrdenRepositorio repositorio;

	@Autowired
	public CreacionOrdenEndpoint(OrdenRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "crearOrdenRequest")
	@ResponsePayload
	public CrearOrdenResponse crear(@RequestPayload CrearOrdenRequest request) {
		CrearOrdenResponse response =repositorio.crear(request.getOrden());
		return response;
	}
}