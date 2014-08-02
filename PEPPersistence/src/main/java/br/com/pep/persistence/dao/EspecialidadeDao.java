package br.com.pep.persistence.dao;

import org.springframework.stereotype.Component;

import br.com.pep.persistence.beans.Especialidade;
import br.com.pep.persistence.interfaces.IEspecialidade;

@Component
public class EspecialidadeDao extends AbstractDAO<Especialidade, Integer> implements IEspecialidade{

	public EspecialidadeDao(Class<Especialidade> entityClass) {
		super(entityClass);
	}
}
