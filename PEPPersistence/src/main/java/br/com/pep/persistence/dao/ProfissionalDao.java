package br.com.pep.persistence.dao;

import org.springframework.stereotype.Component;

import br.com.pep.persistence.beans.Profissional;
import br.com.pep.persistence.interfaces.IProfissional;

@Component
public class ProfissionalDao extends AbstractDAO<Profissional, Integer> implements IProfissional {

	public ProfissionalDao(Class<Profissional> entityClass) {
		super(entityClass);
	}

}
