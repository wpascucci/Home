package br.com.pep.persistence.dao;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Paciente findByRegistro(String registro) {
		// TODO Auto-generated method stub
		return null;
	}

//	public Paciente findByCPF(String cpf) {
//		
//		CriteriaBuilder builder = em.getCriteriaBuilder();
//		CriteriaQuery<Paciente> criteria = builder.createQuery(Paciente.class);
//		Root<Paciente> objRoot = criteria.from(Paciente.class);		
//		Predicate predicate = builder.equal(objRoot.get("cpf"), cpf);		
//		Paciente paciente = getUniqueByCriteria(predicate);
//		return paciente;
//	}
//
//	public Paciente findByRegistro(String registro) {
//		
//		CriteriaBuilder builder = em.getCriteriaBuilder();
//		CriteriaQuery<Paciente> criteria = builder.createQuery(Paciente.class);
//		Root<Paciente> objRoot = criteria.from(Paciente.class);		
//		Predicate predicate = builder.equal(objRoot.get("codigoRegistro"), registro);			
//		Paciente paciente = getUniqueByCriteria(predicate);
//		return paciente;
//	}
}
