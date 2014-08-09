package br.com.pep.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.pep.persistence.beans.Paciente;
import br.com.pep.persistence.interfaces.IPaciente;

@Controller
public class PacienteController {
		
	@Inject
	private IPaciente pacienteDao;
	
	public PacienteController(){
	}
	
	public PacienteController(IPaciente pacienteDao) {
		this.pacienteDao = pacienteDao;
	}
		
	@Get("/getPaciente")
	public Paciente getPaciente(Paciente paciente) {		
		return pacienteDao.findByRegistro(paciente.getCodigoRegistro());
	}
	
	@Post("/addPaciente")
	public void addPaciente(Paciente paciente) {
		pacienteDao.save(paciente);				
	}
	
	@Put("/updatePaciente")
	public void updatePaciente(Paciente paciente) {
		pacienteDao.save(paciente);
	}
	
	@Get("/getPacientes")
	public List<Paciente> getAll() {
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		pacientes.add(pacienteDao.findById(1));
		return pacientes;		
	}

}
