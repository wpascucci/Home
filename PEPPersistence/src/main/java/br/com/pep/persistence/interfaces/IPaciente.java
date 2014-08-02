package br.com.pep.persistence.interfaces;

import br.com.pep.persistence.beans.Paciente;

public interface IPaciente extends IDao<Paciente, Integer> {
	Paciente findByCPF(String cpf);
	Paciente findByRegistro(String registro);	
}
