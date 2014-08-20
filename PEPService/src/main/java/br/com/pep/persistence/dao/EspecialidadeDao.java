package br.com.pep.persistence.dao;

import br.com.pep.persistence.domain.Especialidade;
import br.com.pep.persistence.interfaces.IEspecialidade;

public class EspecialidadeDao extends Dao<Especialidade> implements IEspecialidade{

	public EspecialidadeDao(Class<Especialidade> entityClass) {
		super(entityClass);
	}
}
