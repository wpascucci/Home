package br.com.pep.persistence.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_cid")
public class Cid implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6188629268186760311L;
	
	@Id
	@GeneratedValue
	private int id;
	private String codigo;
	private String descricao;
	
	public int getId() {
		return id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
}
