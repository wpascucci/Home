package br.com.pep.persistence.dao;

import java.util.HashMap;
import java.util.Map;

import br.com.pep.persistence.domain.Paciente;
import br.com.pep.persistence.interfaces.IPaciente;

public class PacienteDao extends Dao<Paciente> implements IPaciente {
	
	public PacienteDao() {
		this(Paciente.class);
	}
	
	public PacienteDao(Class<Paciente> entityClass) {
		super(entityClass);
	}

	@Override
	public Paciente findByCPF(String cpf) {
		
		Map<String, String> predicates = new HashMap<String, String>();
		predicates.put("cpf", cpf);		
		return getUniqueByCriteria(predicates);
	}

	@Override
	public Paciente findByRegistro(String registro) {
		Map<String, String> predicates = new HashMap<String, String>();
		predicates.put("registro", registro);		
		return getUniqueByCriteria(predicates);
	}
}
