package co.com.ordenes.servicio.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import co.com.ordenes.servicio.cancelacion.CancelacionOrdenRequest;
import co.com.ordenes.servicio.cancelacion.CancelacionOrdenResponse;

@Endpoint
public class CancelacionOrdenEndpoint {
	private static final String NAMESPACE_URI = "http://servicio.ordenes.com.co/cancelacion";
	private OrdenRepositorio repositorio;

	@Autowired
	public CancelacionOrdenEndpoint(OrdenRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "cancelacionOrdenRequest")
	@ResponsePayload
	public CancelacionOrdenResponse cancelar(@RequestPayload CancelacionOrdenRequest request) {
		CancelacionOrdenResponse response = repositorio.cancelar(request.getOrden());
		return response;
	}
}