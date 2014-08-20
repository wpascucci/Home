package br.com.pep.persistence.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne @JoinColumn(name="id_cid")
	private PreescricaoMedica preescricao;
	
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
