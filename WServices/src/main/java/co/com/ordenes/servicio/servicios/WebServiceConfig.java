package co.com.ordenes.servicio.servicios;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/ws/ordenes/*");
	}
	
	@Bean(name = "creacion")
	public DefaultWsdl11Definition defaultWsdl11DefinitionCreacion(XsdSchema creacionSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("ServicePortCrear");
		wsdl11Definition.setLocationUri("/ws/ordenes/creacion");
		wsdl11Definition.setTargetNamespace("http://servicio.clientes.com.co/creacion");
		wsdl11Definition.setSchema(creacionSchema);
		return wsdl11Definition;
	}
	
	@Bean(name = "consulta")
	public DefaultWsdl11Definition defaultWsdl11DefinitionConsulta(XsdSchema consultaSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("ServicePortConsultar");
		wsdl11Definition.setLocationUri("/ws/ordenes/consulta");
		wsdl11Definition.setTargetNamespace("http://servicio.clientes.com.co/consulta");
		wsdl11Definition.setSchema(consultaSchema);
		return wsdl11Definition;
	}
	
	@Bean(name = "cancelacion")
	public DefaultWsdl11Definition defaultWsdl11DefinitionModificacion(XsdSchema cancelacionSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("ServicePortModificar");
		wsdl11Definition.setLocationUri("/ws/ordenes/cancelacion");
		wsdl11Definition.setTargetNamespace("http://servicio.clientes.com.co/cancelacion");
		wsdl11Definition.setSchema(cancelacionSchema);
		return wsdl11Definition;
	}	
	
	@Bean
	public XsdSchema creacionSchema() {
		return new SimpleXsdSchema(new ClassPathResource("wsdl/CreacionOrden.xsd"));
	}
	
	@Bean
	public XsdSchema consultaSchema() {
		return new SimpleXsdSchema(new ClassPathResource("wsdl/ConsultaOrden.xsd"));
	}
	
	@Bean
	public XsdSchema cancelacionSchema() {
		return new SimpleXsdSchema(new ClassPathResource("wsdl/CancelacionOrden.xsd"));
	}	
}