package br.com.pep.integration;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

import br.com.pep.message.Paciente;


public class AddPacienteCommand {

	private String urlService;
	
	public Paciente Execute(Paciente paciente) throws ClientProtocolException, IOException {

		HttpClient client = HttpClientBuilder.create().build();
		HttpPost request = new HttpPost(getUrlService());
		
		List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
		urlParameters.add(new BasicNameValuePair("Paciente", ""));
		request.setEntity(new UrlEncodedFormEntity(urlParameters));		
		HttpResponse response = client.execute(request);
		InputStream content = response.getEntity().getContent();
		return null;
	}
	
	public String getUrlService() {
		return urlService;
	}

	public void setUrlService(String urlService) {
		this.urlService = urlService;
	}	
}
