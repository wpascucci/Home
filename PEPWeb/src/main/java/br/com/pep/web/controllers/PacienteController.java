package br.com.pep.web.controllers;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Post;
import br.com.pep.integration.AddPacienteCommand;
import br.com.pep.message.PacienteVO;


@Controller
public class PacienteController {
	//@Inject private Result result;

	@Post("/AddPaciente")
	public void save(PacienteVO paciente) {
			
		/*AddPacienteCommand pacienteCommand = new AddPacienteCommand();
		GetPacienteCommand getPacienteCommand = new GetPacienteCommand();
		try {			
			Paciente pacienteFound = getPacienteCommand.Execute(paciente);
			
			if(pacienteFound.getId() != 0)
				System.out.println("redirecionar para página de erro");
			
			Paciente pacienteSaved = pacienteCommand.Execute(paciente);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}	
}
