package br.com.pep.message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "paciente")
public class PacienteVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1771172015990877661L;
	private int id;
	private String cpf;
	private String nome;
	private char genero;
	private String codigoRegistro;
	private String tipoSanguineo;

	private List<EnderecoVO> enderecos = new ArrayList<EnderecoVO>();
	private List<TelefoneVO> telefones = new ArrayList<TelefoneVO>();

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

	@XmlElement(name = "enderecos")
	public List<EnderecoVO> getEnderecos() {
		return enderecos;
	}

	public void setEndereco(List<EnderecoVO> enderecos) {
		this.enderecos = enderecos;
	}

	@XmlElement(name = "telefones")
	public List<TelefoneVO> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<TelefoneVO> telefones) {
		this.telefones = telefones;
	}
}
