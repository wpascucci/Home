package br.com.pep.PEPIntegration;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import br.com.pep.integration.AddPacienteCommand;
import br.com.pep.message.Pacientes;
import br.com.pep.message.Pacientes.Paciente;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		String url = "http://127.0.0.1:8080/PEPService/getTeste";
		
		Pacientes pacientes = new Pacientes();
		Paciente paciente = new Paciente();
		paciente.setNome("Maria Aparecida");
		paciente.setGenero("M");
		paciente.setCpf(123456789);
		paciente.setCodigoRegistro(123);
		paciente.setTipoSanguineo("O+");
		
		AddPacienteCommand cmd = new AddPacienteCommand();
		cmd.setUrlService(url);
		try {
			Pacientes output = cmd.Execute(pacientes);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
