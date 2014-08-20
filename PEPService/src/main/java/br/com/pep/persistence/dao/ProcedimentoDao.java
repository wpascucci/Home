package br.com.pep.persistence.dao;

import br.com.pep.persistence.domain.Procedimento;
import br.com.pep.persistence.interfaces.IProcedimento;

public class ProcedimentoDao extends Dao<Procedimento> implements IProcedimento {

	public ProcedimentoDao(Class<Procedimento> entityClass) {
		super(entityClass);
	}
}
