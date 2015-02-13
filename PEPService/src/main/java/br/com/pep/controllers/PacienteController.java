package br.com.pep.controllers;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.com.pep.persistence.dao.PacienteDao;
import br.com.pep.persistence.domain.Paciente;
import br.com.pep.persistence.interfaces.IPaciente;

@Controller
public class PacienteController {
		
	private IPaciente pacienteDao;
	@Inject private Result result;
	
	public PacienteController(){
		this(null);
	}
	
	@Inject
	public PacienteController(PacienteDao pacienteDao) {
		this.pacienteDao = pacienteDao;
	}
		
	@Get("/GetPaciente")
	@Consumes("application/xml")
	@Produces	
	public void getPaciente(Paciente paciente) {		
		Paciente pacienteFound = pacienteDao.findByRegistro(paciente.getCodigoRegistro());
		result.use(Results.xml()).from(pacienteFound).recursive().serialize();
	}
	
	@Post("/AddPaciente")
	@Consumes("application/xml")
	@Produces	
	public void addPaciente(Paciente paciente) {
		Paciente pacienteSaved = pacienteDao.save(paciente);
		result.use(Results.xml()).from(pacienteSaved).recursive().serialize();
	}
	
	@Put("/UpdatePaciente")
	@Consumes("application/xml")
	@Produces
	public void updatePaciente(Paciente paciente) {
		Paciente pacienteUpdated = pacienteDao.update(paciente);
		result.use(Results.xml()).from(pacienteUpdated).recursive().serialize();
	}
	
	@Post("/getTeste")
	@Consumes("application/xml")
	@Produces	
	public void getTeste(Paciente paciente) {
		System.out.println("Nome: " + paciente.getNome());
		System.out.println("Código do Registro: " + paciente.getCodigoRegistro());
		System.out.println("CPF: " + paciente.getCpf());
		System.out.println("Gênero: " + paciente.getGenero());
		System.out.println("Tipo: " + paciente.getTipoSanguineo());		
		Paciente output = pacienteDao.findById(1);
		result.use(Results.xml()).from(output).recursive().serialize();
	}
	
	@Get("/getTeste2")
	public void getTeste2() {
		/*Paciente paciente =new Paciente();

		System.out.println("Paciente: "+paciente.getCpf());
		Endereco endereco = new Endereco();
		TelefonePaciente telefone = new TelefonePaciente();
		
		endereco.setCidade("Sao Paulo");
		telefone.setDdd(11);
		
		
		System.out.println("Paciente: "+paciente.getCpf());

		paciente.setCpf("888888888");
		paciente.getTelefones().add(telefone);
		paciente.getEnderecos().add(endereco);		*/
		
		Paciente paciente = pacienteDao.findById(1);
		System.out.println(paciente.getNome());
		result.use(Results.xml()).from(paciente).recursive().serialize();
	}	
}
