package br.com.pep.persistence.dao;

import br.com.pep.persistence.domain.Prontuario;
import br.com.pep.persistence.interfaces.IProntuario;

public class ProntuarioDao extends Dao<Prontuario> implements IProntuario {

	public ProntuarioDao(Class<Prontuario> entityClass) {
		super(entityClass);
	}
}
