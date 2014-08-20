package br.com.pep.persistence.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_medicamento")
public class Medicamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5139960717879344971L;
	@Id
	@GeneratedValue
	private int id;
	private String codigo;
	private String nome;
	private String principio_ativo;
	private String descricao;
	
	@OneToOne(mappedBy="medicamento")
	private ItemPreescricaoMedica item;
	
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
	public String getPrincipio_ativo() {
		return principio_ativo;
	}
	public void setPrincipio_ativo(String principio_ativo) {
		this.principio_ativo = principio_ativo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
}
