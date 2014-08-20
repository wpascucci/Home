package br.com.pep.persistence.dao;

import br.com.pep.persistence.domain.PreescricaoMedica;
import br.com.pep.persistence.interfaces.IPreescricaoMedica;

public class PreescricaoMedicaDao extends Dao<PreescricaoMedica> implements IPreescricaoMedica {

	public PreescricaoMedicaDao(Class<PreescricaoMedica> entityClass) {
		super(entityClass);
	}
}
