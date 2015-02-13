package br.com.teste;

import br.com.pep.integration.AddPacienteCommand;
import br.com.pep.message.PacienteVO;

public class Teste {
	
	public static void main(String[] args) {
		
		String url = "http://localhost:8080/PEPService/getTeste";
		
		PacienteVO paciente = new PacienteVO();
		paciente.setNome("Maria Aparecida");
		paciente.setGenero('M');
		paciente.setCpf("123456789");
		paciente.setCodigoRegistro("123");
		paciente.setTipoSanguineo("O+");
		
		AddPacienteCommand cmd = new AddPacienteCommand();
		cmd.setUrlService(url);
		try {
			PacienteVO output = cmd.Execute(paciente);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
	}
	
}
