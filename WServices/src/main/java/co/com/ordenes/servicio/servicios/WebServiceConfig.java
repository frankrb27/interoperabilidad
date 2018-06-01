package co.com.ordenes.servicio.servicios;

import java.util.List;
import java.util.Properties;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.soap.security.wss4j.Wss4jSecurityInterceptor;
import org.springframework.ws.soap.security.wss4j.callback.SimplePasswordValidationCallbackHandler;
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
		return new ServletRegistrationBean(servlet, "/ws/credito/*");
	}

	@Bean(name = "creacion-formulario")
	public DefaultWsdl11Definition defaultWsdl11DefinitionCreacion(XsdSchema creacionFormularioCreditoSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("ServicePortCrearFormulario");
		wsdl11Definition.setLocationUri("/ws/credito/creacion/formulario");
		wsdl11Definition.setTargetNamespace("http://servicio.credito.com.co/creacion/formulario");
		wsdl11Definition.setSchema(creacionFormularioCreditoSchema);
		return wsdl11Definition;
	}

	@Bean(name = "creacion-prospecto")
	public DefaultWsdl11Definition defaultWsdl11DefinitionConsulta(XsdSchema creacionProspectoSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("ServicePortCrearFormulario");
		wsdl11Definition.setLocationUri("/ws/credito/creacion/prospecto");
		wsdl11Definition.setTargetNamespace("http://servicio.credito.com.co/creacion/prospecto");
		wsdl11Definition.setSchema(creacionProspectoSchema);
		return wsdl11Definition;
	}

	@Bean
    public SimplePasswordValidationCallbackHandler securityCallbackHandler(){
        SimplePasswordValidationCallbackHandler callbackHandler = new SimplePasswordValidationCallbackHandler();
        Properties users = new Properties();
        users.setProperty("admin", "secret");
        callbackHandler.setUsers(users);
        return callbackHandler;
    }

    @Bean
    public Wss4jSecurityInterceptor securityInterceptor(){
        Wss4jSecurityInterceptor securityInterceptor = new Wss4jSecurityInterceptor();
        securityInterceptor.setValidationActions("Timestamp UsernameToken");
        securityInterceptor.setValidationCallbackHandler(securityCallbackHandler());
        return securityInterceptor;
    }

    @Override
    public void addInterceptors(List interceptors) {
        interceptors.add(securityInterceptor());
    }

	@Bean
	public XsdSchema creacionFormularioCreditoSchema() {
		return new SimpleXsdSchema(new ClassPathResource("wsdl/CreacionFormularioCredito.xsd"));
	}

	@Bean
	public XsdSchema creacionProspectoSchema() {
		return new SimpleXsdSchema(new ClassPathResource("wsdl/CreacionProspecto.xsd"));
	}

}