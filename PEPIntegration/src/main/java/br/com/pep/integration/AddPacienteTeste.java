package br.com.pep.integration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import br.com.pep.message.Pacientes;

public class AddPacienteTeste {

	private String urlService;
	
	public Pacientes Execute(Pacientes paciente) throws IOException, JAXBException {
		URL url = new URL(urlService);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		
		if (con.getResponseCode() != 200) { 
			throw new RuntimeException("HTTP error code : "+ con.getResponseCode()); 
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));
		
		String line;
	    while ((line = br.readLine()) != null) {
	        System.out.println(line);
	    }
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Pacientes.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Pacientes pacientes = (Pacientes) jaxbUnmarshaller.unmarshal(br);
		return pacientes;
	}
	
	public String getUrlService() {
		return urlService;
	}

	public void setUrlService(String urlService) {
		this.urlService = urlService;
	}		
}
