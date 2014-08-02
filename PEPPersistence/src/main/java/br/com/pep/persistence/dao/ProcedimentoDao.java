package br.com.pep.persistence.dao;

import org.springframework.stereotype.Component;

import br.com.pep.persistence.beans.Procedimento;
import br.com.pep.persistence.interfaces.IProcedimento;

@Component
public class ProcedimentoDao extends AbstractDAO<Procedimento, Integer> implements IProcedimento {

	public ProcedimentoDao(Class<Procedimento> entityClass) {
		super(entityClass);
	}
}
