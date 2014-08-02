package br.com.pep.service.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.pep.persistence.beans.Paciente;
import br.com.pep.persistence.interfaces.IPaciente;

@Controller
public class PacienteController {
		
	private IPaciente pacienteDao = (IPaciente)getContext().getBean("pacienteRepository");
		
	@Get
	@Path("/paciente")
	public Paciente getPaciente(Paciente paciente) {		
		return pacienteDao.findByRegistro(paciente.getCodigoRegistro());
	}
	
	@Post
	@Path("/addPaciente")
	public void addPaciente(Paciente paciente) {
		pacienteDao.save(paciente);				
	}
	
	@Put
	@Path("/updatePaciente")
	public void updatePaciente(Paciente paciente) {
		pacienteDao.saveOrUpdate(paciente);
	}
	
	@Get
	@Path("/getAll")
	public List<Paciente> getAll() {
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		pacientes.add(pacienteDao.findById(1));
		return pacientes;		
	}
	
	private ApplicationContext getContext() {
		return new ClassPathXmlApplicationContext("springconfig.xml");
	}
}
