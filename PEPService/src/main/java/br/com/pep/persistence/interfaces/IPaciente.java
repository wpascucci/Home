package br.com.pep.persistence.interfaces;

import br.com.pep.persistence.domain.Paciente;

public interface IPaciente extends IDao<Paciente> {
	Paciente findByCPF(String cpf);
	Paciente findByRegistro(String registro);	
}
