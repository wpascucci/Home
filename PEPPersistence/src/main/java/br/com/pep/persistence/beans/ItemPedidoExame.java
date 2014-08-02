package br.com.pep.persistence.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_itemexame")
public class ItemPedidoExame implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 353904024590851086L;
	@Id
	@GeneratedValue
	private int id;
	private String codigo;
	private String descricao;
	private String observacao;
	
	@OneToOne(mappedBy="id_procedimento",targetEntity=Procedimento.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Procedimento procedimento;
	
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
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Procedimento getProcedimento() {
		return procedimento;
	}
	public void setProcedimento(Procedimento procedimento) {
		this.procedimento = procedimento;
	}	
}
