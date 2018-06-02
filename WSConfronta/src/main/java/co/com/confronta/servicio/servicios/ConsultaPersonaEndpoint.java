package co.com.confronta.servicio.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import co.com.confronta.servicio.consulta.ValidarPersonaRequest;
import co.com.confronta.servicio.consulta.ValidarPersonaResponse;

@Endpoint
public class ConsultaPersonaEndpoint {
	private static final String NAMESPACE_URI = "http://servicio.confronta.com.co/consulta";
	private WSerivesRepositorio repositorio;

	@Autowired
	public ConsultaPersonaEndpoint(WSerivesRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "validarPersonaRequest")
	@ResponsePayload
	public ValidarPersonaResponse validar(@RequestPayload ValidarPersonaRequest request) {
		ValidarPersonaResponse response = new ValidarPersonaResponse();
		response.setCodigo("00");
		response.setMensaje("Persona validada correctamente");
		return response;
	}
}