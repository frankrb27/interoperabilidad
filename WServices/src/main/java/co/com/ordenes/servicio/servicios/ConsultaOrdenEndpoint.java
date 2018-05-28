package co.com.ordenes.servicio.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import co.com.ordenes.servicio.consulta.ConsultarOrdenRequest;
import co.com.ordenes.servicio.consulta.ConsultarOrdenResponse;

@Endpoint
public class ConsultaOrdenEndpoint {
	private static final String NAMESPACE_URI = "http://servicio.ordenes.com.co/consulta";
	private OrdenRepositorio repositorio;

	@Autowired
	public ConsultaOrdenEndpoint(OrdenRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "consultarOrdenRequest")
	@ResponsePayload
	public ConsultarOrdenResponse consultar(@RequestPayload ConsultarOrdenRequest request) {
		ConsultarOrdenResponse response = repositorio.consultar(request.getOrden());
		return response;
	}
}