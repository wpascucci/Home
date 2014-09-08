package br.com.pep.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

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
	public Paciente getPaciente(Paciente paciente) {		
		return pacienteDao.findByRegistro(paciente.getCodigoRegistro());
	}
	
	@Post("/AddPaciente")
	public void addPaciente(Paciente paciente) {
		pacienteDao.save(paciente);
	}
	
	@Put("/UpdatePaciente")
	public void updatePaciente(Paciente paciente) {
		pacienteDao.update(paciente);
	}
	
	@Get("/getPacientes")
	public List<Paciente> getAll() {
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		pacientes.add(pacienteDao.findById(1));
		//result.include("message", "Vai que Vai.");
		return pacientes;		
	}
	
	@Get("/getTeste")
	public void getTeste() {
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		pacientes.add(pacienteDao.findById(1));
		//result.include("pacientes", pacientes);
		result.use(Results.xml()).from(pacientes, "pacientes");
	}
}
