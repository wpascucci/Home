package br.com.pep.persistence.dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.pep.persistence.beans.Paciente;
import br.com.pep.persistence.interfaces.IPaciente;

public class PacienteDao extends AbstractDAO<Paciente, Integer> implements IPaciente {

	public PacienteDao(Class<Paciente> entityClass) {
		super(entityClass);
	}

	public Paciente findByCPF(String cpf) {
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Paciente> criteria = builder.createQuery(Paciente.class);
		Root<Paciente> objRoot = criteria.from(Paciente.class);		
		Predicate predicate = builder.equal(objRoot.get("cpf"), cpf);		
		Paciente paciente = getUniqueByCriteria(predicate);
		return paciente;
	}

	public Paciente findByRegistro(String registro) {
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Paciente> criteria = builder.createQuery(Paciente.class);
		Root<Paciente> objRoot = criteria.from(Paciente.class);		
		Predicate predicate = builder.equal(objRoot.get("codigoRegistro"), registro);			
		Paciente paciente = getUniqueByCriteria(predicate);
		return paciente;
	}
}
