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
@Table(name="tb_paciente")
public class Paciente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1771172015990877661L;
	@Id
	@GeneratedValue
	private int id;
	private String cpf;
	private String nome;
	private char genero;
	private String codigoRegistro;
	private String tipoSanguineo;
	
	@OneToMany(mappedBy = "id_paciente", targetEntity = Endereco.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Endereco> endereco;
	
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
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public String getCodigoRegistro() {
		return codigoRegistro;
	}
	public void setCodigoRegistro(String codigoRegistro) {
		this.codigoRegistro = codigoRegistro;
	}
	public String getTipoSanguineo() {
		return tipoSanguineo;
	}
	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	public Set<Endereco> getEndereco() {
		return endereco;
	}
	public void setEndereco(Set<Endereco> endereco) {
		this.endereco = endereco;
	}
}
