package br.com.pep.persistence.dao;

import br.com.pep.persistence.domain.PedidoExame;
import br.com.pep.persistence.interfaces.IPedidoExame;

public class PedidoExameDao extends Dao<PedidoExame> implements IPedidoExame {

	public PedidoExameDao(Class<PedidoExame> entityClass) {
		super(entityClass);
	}
}
