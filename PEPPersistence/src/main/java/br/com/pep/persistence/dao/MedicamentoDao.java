package br.com.pep.persistence.dao;

import org.springframework.stereotype.Component;

import br.com.pep.persistence.beans.Medicamento;
import br.com.pep.persistence.interfaces.IMedicamento;

@Component
public class MedicamentoDao extends AbstractDAO<Medicamento, Integer> implements IMedicamento {

	public MedicamentoDao(Class<Medicamento> entityClass) {
		super(entityClass);
	}
}
