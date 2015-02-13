package br.com.pep.persistence.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Entity
@Table(name="tb_paciente")
@XStreamAlias(value="paciente")
public class Paciente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1771172015990877661L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String cpf;
	private String nome;
	private char genero;
	private String codigoRegistro;
	private String tipoSanguineo;
		
	@OneToMany(mappedBy="paciente",targetEntity=Endereco.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL,orphanRemoval=true)
	@XStreamAlias(value="enderecos")
	private List<Endereco> enderecos = new ArrayList<Endereco>();
	
	@OneToMany(mappedBy="paciente",targetEntity=TelefonePaciente.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL,orphanRemoval=true)
	@XStreamAlias("telefones")
	private List<TelefonePaciente> telefones = new ArrayList<TelefonePaciente>();
	
	@OneToOne(mappedBy="paciente")
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
	public List<Endereco> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	public List<TelefonePaciente> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<TelefonePaciente> telefones) {
		this.telefones = telefones;
	}
}
