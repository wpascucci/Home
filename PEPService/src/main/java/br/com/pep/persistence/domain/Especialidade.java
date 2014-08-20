package br.com.pep.persistence.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_especialidade")
public class Especialidade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4033744612426333023L;
	@Id
	@GeneratedValue
	private int id;
	private String codigo;
	private String nome;
	@OneToOne(mappedBy="especialidade")
	private EspecialidadeProfissional especialidadeProfissional;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
