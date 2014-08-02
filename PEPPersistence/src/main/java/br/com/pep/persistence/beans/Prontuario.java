package br.com.pep.persistence.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	
	@OneToOne(mappedBy="id_paciente",targetEntity=Paciente.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Paciente paciente;
	@OneToOne(mappedBy="id_profissional",targetEntity=Profissional.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Profissional profissional;
	@OneToMany(mappedBy="id_preescricao",targetEntity=PreescricaoMedica.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Set<PreescricaoMedica> preescricoes;
	@OneToMany(mappedBy="id_pedido_exame",targetEntity=PedidoExame.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Set<PedidoExame> exames;
	
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
	public Set<PreescricaoMedica> getPreescricoes() {
		return preescricoes;
	}
	public void setPreescricoes(Set<PreescricaoMedica> preescricoes) {
		this.preescricoes = preescricoes;
	}
	public Set<PedidoExame> getExames() {
		return exames;
	}
	public void setExames(Set<PedidoExame> exames) {
		this.exames = exames;
	}		
}
