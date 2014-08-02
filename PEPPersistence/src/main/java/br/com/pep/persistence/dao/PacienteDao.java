package br.com.pep.persistence.dao;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import br.com.pep.persistence.beans.Paciente;
import br.com.pep.persistence.interfaces.IPaciente;

@Component
public class PacienteDao extends AbstractDAO<Paciente, Integer> implements IPaciente {

	public PacienteDao(Class<Paciente> entityClass) {
		super(entityClass);
	}

	public Paciente findByCPF(String cpf) {
		Paciente paciente = getUniqueByCriteria(Restrictions.eq("cpf", cpf));
		return paciente;
	}

	public Paciente findByRegistro(String registro) {
		Paciente paciente = getUniqueByCriteria(Restrictions.eq("codigoRegistro", registro));
		return paciente;
	}

}
