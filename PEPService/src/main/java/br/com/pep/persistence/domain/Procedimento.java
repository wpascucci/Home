package br.com.pep.persistence.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_procedimento")
public class Procedimento implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3033206856288182623L;
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private String descricao;
	
	@OneToOne(mappedBy="procedimento")
	private ItemPedidoExame item;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
}
