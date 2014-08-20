package br.com.pep.persistence.dao;

import br.com.pep.persistence.domain.Profissional;
import br.com.pep.persistence.interfaces.IProfissional;

public class ProfissionalDao extends Dao<Profissional> implements IProfissional {

	public ProfissionalDao(Class<Profissional> entityClass) {
		super(entityClass);
	}
}
