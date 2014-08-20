package br.com.pep.persistence.dao;

import br.com.pep.persistence.domain.Cid;
import br.com.pep.persistence.interfaces.ICid;

public class CidDao extends Dao<Cid> implements ICid {

	public CidDao(Class<Cid> entityClass) {
		super(entityClass);
	}
}
