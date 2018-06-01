package co.com.ordenes.servicio.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import co.com.credito.servicio.creacion.formulario.CreacionFormularioCreditoRequest;
import co.com.credito.servicio.creacion.formulario.CreacionFormularioCreditoResponse;

@Endpoint
public class CreacionFormularioEndpoint {
	private static final String NAMESPACE_URI = "http://servicio.credito.com.co/creacion/formulario";
	private WSerivesRepositorio repositorio;

	@Autowired
	public CreacionFormularioEndpoint(WSerivesRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "creacionFormularioCreditoRequest")
	@ResponsePayload
	public CreacionFormularioCreditoResponse consultar(@RequestPayload CreacionFormularioCreditoRequest request) {
		CreacionFormularioCreditoResponse response = new CreacionFormularioCreditoResponse();
		response.setCodigo("00");
		response.setMensaje("Solicitud enviada, número de solicitud: " + Integer.valueOf("123"));
		return response;
	}
}