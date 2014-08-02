package br.com.pep.persistence.dao;

import org.springframework.stereotype.Component;

import br.com.pep.persistence.beans.PreescricaoMedica;
import br.com.pep.persistence.interfaces.IPreescricaoMedica;

@Component
public class PreescricaoMedicaDao extends AbstractDAO<PreescricaoMedica, Integer> implements IPreescricaoMedica {

	public PreescricaoMedicaDao(Class<PreescricaoMedica> entityClass) {
		super(entityClass);
	}
}
