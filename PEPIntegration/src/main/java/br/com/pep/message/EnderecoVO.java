package br.com.pep.message;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "endereco")
public class EnderecoVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8717033646155935175L;
	private int id;
	private String cep;
	private String cidade;
	private String estado;
	private String endereco;

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
