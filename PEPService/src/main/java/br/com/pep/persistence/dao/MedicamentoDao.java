package br.com.pep.persistence.dao;

import br.com.pep.persistence.domain.Medicamento;
import br.com.pep.persistence.interfaces.IMedicamento;

public class MedicamentoDao extends Dao<Medicamento> implements IMedicamento {

	public MedicamentoDao(Class<Medicamento> entityClass) {
		super(entityClass);
	}
}
