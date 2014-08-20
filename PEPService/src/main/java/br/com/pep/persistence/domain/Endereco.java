package br.com.pep.persistence.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_endereco_paciente")
public class Endereco implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8717033646155935175L;
	@Id
	@GeneratedValue
	private int id;
	private String cep;
	private String cidade;
	private String estado;
	private String endereco;
	
	@ManyToOne @JoinColumn(name="id_paciente")
	private Paciente paciente;
	
	public int getId() {
		return id;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
