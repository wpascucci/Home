package br.com.pep.web.controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Post;
import br.com.pep.message.Pacientes.Paciente;

@Controller
public class PacienteController {
	//@Inject private Result result;

	@Post("/PacienteSave")
	public void save(Paciente paciente) {
		System.out.println("Nome: " + paciente.getNome());
		System.out.println("CPF: " + paciente.getCpf());
		System.out.println("Codigo Registro: " + paciente.getCodigoRegistro());
		System.out.println("Genero: " + paciente.getGenero());
		System.out.println("Tipo Sanguineo: " + paciente.getTipoSanguineo());
		//result.include("Teste", "string");
	}	
}
