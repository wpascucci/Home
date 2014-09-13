package br.com.pep.integration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamResult;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import br.com.pep.message.Pacientes;


public class AddPacienteCommand {

	private String urlService;
	
	public Pacientes Execute(Pacientes paciente) throws ClientProtocolException, IOException {

		HttpClient client = HttpClientBuilder.create().build();
		HttpPost request = new HttpPost(getUrlService());
		StringEntity input = new StringEntity(ConvertToXml(paciente), ContentType.APPLICATION_XML);
		request.setEntity(input);		
		HttpResponse response = client.execute(request);
		InputStream content = response.getEntity().getContent();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(content));
		
		String line;
	    while ((line = br.readLine()) != null) {
	        System.out.println(line);
	    }
		
		Pacientes output = ConvertToObject(content);
		return output;
	}
	
	private String ConvertToXml(Pacientes paciente) {
		
		StringWriter out = new StringWriter();		
		JAXBContext context;
		try {			
			context = JAXBContext.newInstance(Pacientes.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);		
			marshaller.marshal(paciente, new StreamResult(out));			
		} 
		catch (JAXBException e) {
			e.printStackTrace();
		}
		return out.toString();
	}
	
	private Pacientes ConvertToObject(InputStream stream) {
		
		Pacientes paciente = null;
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(Pacientes.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			//paciente = (Pacientes)unmarshaller.unmarshal(stream);
			Object ojb = unmarshaller.unmarshal(stream);
		} 
		catch (JAXBException e) {
			e.printStackTrace();
		}
		return paciente;
	}
		
	public String getUrlService() {
		return urlService;
	}

	public void setUrlService(String urlService) {
		this.urlService = urlService;
	}	
}
