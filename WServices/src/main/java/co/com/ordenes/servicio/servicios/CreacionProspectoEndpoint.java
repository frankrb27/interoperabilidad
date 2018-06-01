package co.com.ordenes.servicio.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import co.com.credito.servicio.creacion.prospecto.CreacionProspectoRequest;
import co.com.credito.servicio.creacion.prospecto.CreacionProspectoResponse;

@Endpoint
public class CreacionProspectoEndpoint {
	private static final String NAMESPACE_URI = "http://servicio.credito.com.co/creacion/prospecto";
	private WSerivesRepositorio repositorio;

	@Autowired
	public CreacionProspectoEndpoint(WSerivesRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "creacionProspectoRequest")
	@ResponsePayload
	public CreacionProspectoResponse crear(@RequestPayload CreacionProspectoRequest request) {
		CreacionProspectoResponse response = new CreacionProspectoResponse();
		response.setCodigo("00");
		response.setMensaje("Prospecto creado, id: " + Integer.valueOf(""+Math.random()));
		return response;
	}
}