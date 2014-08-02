package br.com.pep.persistence.dao;

import org.springframework.stereotype.Component;

import br.com.pep.persistence.beans.Prontuario;
import br.com.pep.persistence.interfaces.IProntuario;

@Component
public class ProntuarioDao extends AbstractDAO<Prontuario, Integer> implements IProntuario {

	public ProntuarioDao(Class<Prontuario> entityClass) {
		super(entityClass);
	}
}
