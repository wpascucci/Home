package br.com.pep.persistence.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
		
	@OneToMany(mappedBy="profissional",targetEntity=EspecialidadeProfissional.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval=true)
	private List<EspecialidadeProfissional> especialidades;
	
	@OneToOne(mappedBy="profissional")
	private Prontuario prontuario;
	
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
	public List<EspecialidadeProfissional> getEspecialidades() {
		return especialidades;
	}
	public void setEspecialidades(List<EspecialidadeProfissional> especialidades) {
		this.especialidades = especialidades;
	}		
}
