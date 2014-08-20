package br.com.pep.persistence.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_pedidoexame")
public class PedidoExame implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7554347010670844837L;
	@Id
	@GeneratedValue
	private int id;
	private Date data;
	private Date validade;
	
	@OneToMany(mappedBy="pedidoExame",targetEntity=ItemPedidoExame.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Set<ItemPedidoExame> exames;
	
	@ManyToOne @JoinColumn(name="id_pedido_exame")
	private Prontuario prontuario;	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	public Set<ItemPedidoExame> getExames() {
		return exames;
	}
	public void setExames(Set<ItemPedidoExame> exames) {
		this.exames = exames;
	}	
}
