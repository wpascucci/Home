package br.com.pep.persistence.dao;

import org.springframework.stereotype.Component;

import br.com.pep.persistence.beans.Cid;
import br.com.pep.persistence.interfaces.ICid;

@Component
public class CidDao extends AbstractDAO<Cid, Integer> implements ICid {

	public CidDao(Class<Cid> entityClass) {
		super(entityClass);
	}
}
