package br.com.pep.persistence.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_prontuario")
public class Prontuario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1840941725099732712L;
	@Id
	@GeneratedValue
	private int id;
	private Date data;
	private Date dataInternacao;
	private Date dataAlta;
	private String anamense;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval=true)
	@JoinColumn(name="id")
	private Paciente paciente;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval=true)
	@JoinColumn(name="id")
	private Profissional profissional;
	
	@OneToMany(mappedBy="prontuario",targetEntity=PreescricaoMedica.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL,orphanRemoval=true)
	private List<PreescricaoMedica> preescricoes;
	
	@OneToMany(mappedBy="prontuario",targetEntity=PedidoExame.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL,orphanRemoval=true)
	private List<PedidoExame> exames;
	
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
	public Date getDataInternacao() {
		return dataInternacao;
	}
	public void setDataInternacao(Date dataInternacao) {
		this.dataInternacao = dataInternacao;
	}
	public Date getDataAlta() {
		return dataAlta;
	}
	public void setDataAlta(Date dataAlta) {
		this.dataAlta = dataAlta;
	}
	public String getAnamense() {
		return anamense;
	}
	public void setAnamense(String anamense) {
		this.anamense = anamense;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Profissional getProfissional() {
		return profissional;
	}
	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}
	public List<PreescricaoMedica> getPreescricoes() {
		return preescricoes;
	}
	public void setPreescricoes(List<PreescricaoMedica> preescricoes) {
		this.preescricoes = preescricoes;
	}
	public List<PedidoExame> getExames() {
		return exames;
	}
	public void setExames(List<PedidoExame> exames) {
		this.exames = exames;
	}		
}
