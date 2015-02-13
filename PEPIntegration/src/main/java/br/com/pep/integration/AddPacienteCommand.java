package br.com.pep.integration;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import br.com.pep.message.PacienteVO;

public class AddPacienteCommand {

	private String urlService;

	public PacienteVO Execute(PacienteVO paciente) {
		
		PacienteVO newPaciente = new PacienteVO();
		
		ResteasyClient client = new ResteasyClientBuilder().build();
		ResteasyWebTarget target = client.target(getUrlService());
		Response response = target.request().post(Entity.entity(paciente, "application/xml"));
		
		if (response.getStatus() != 200) {
			newPaciente = response.readEntity(PacienteVO.class);
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatus() +"\n" );
		}		
		
		newPaciente = response.readEntity(PacienteVO.class);		
		return newPaciente;
	}
	
	public String getUrlService() {
		return urlService;
	}

	public void setUrlService(String urlService) {
		this.urlService = urlService;
	}		
}
