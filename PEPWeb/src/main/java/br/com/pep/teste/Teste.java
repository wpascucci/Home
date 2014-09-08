package br.com.pep.teste;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Teste {
	
	public static void main(String[] args) {
		
		try {
			
			URL url = new URL("http://127.0.0.1:8080/PEPService/getPacientes");
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			
			if (con.getResponseCode() != 200) { 
				throw new RuntimeException("HTTP error code : "+ con.getResponseCode()); 
			}
			
			BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));
			while(br.read() > 0) {
				System.out.println(br.readLine());				
			}			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
