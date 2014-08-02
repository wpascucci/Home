package br.com.pep.persistence.beans;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_profissional")
public class Profissional implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -648950881103878261L;
	@Id
	@GeneratedValue
	private int id;
	private String cpf;
	private String nome;
	private String registro;
		
	@OneToMany(mappedBy="id_profissional_especialidades",targetEntity=EspecialidadeProfissional.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Set<EspecialidadeProfissional> especialidades;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public Set<EspecialidadeProfissional> getEspecialidades() {
		return especialidades;
	}
	public void setEspecialidades(Set<EspecialidadeProfissional> especialidades) {
		this.especialidades = especialidades;
	}		
}
