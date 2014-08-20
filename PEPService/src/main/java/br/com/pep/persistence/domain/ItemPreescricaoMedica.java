package br.com.pep.persistence.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_itempreescricao")
public class ItemPreescricaoMedica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4922788536676370087L;
	@Id
	@GeneratedValue
	private int id;
	private Date dataInicio;
	private Date dataFim;
	private String observacao;
	private String anotacaoEnfermagem;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval=true)
	@JoinColumn(name="id")
	private Medicamento medicamento;
	
	@ManyToOne @JoinColumn(name="id_itempreescricao")
	private PreescricaoMedica preescricao;
	
	public int getId() {
		return id;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getAnotacaoEnfermagem() {
		return anotacaoEnfermagem;
	}
	public void setAnotacaoEnfermagem(String anotacaoEnfermagem) {
		this.anotacaoEnfermagem = anotacaoEnfermagem;
	}
	public Medicamento getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}		
}
