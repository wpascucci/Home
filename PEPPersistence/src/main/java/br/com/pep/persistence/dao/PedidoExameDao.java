package br.com.pep.persistence.dao;

import org.springframework.stereotype.Component;

import br.com.pep.persistence.beans.PedidoExame;
import br.com.pep.persistence.interfaces.IPedidoExame;

@Component
public class PedidoExameDao extends AbstractDAO<PedidoExame, Integer> implements IPedidoExame {

	public PedidoExameDao(Class<PedidoExame> entityClass) {
		super(entityClass);
	}
}
