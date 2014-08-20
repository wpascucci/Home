package br.com.pep.persistence.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

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
@Table(name="tb_preescricaomedica")
public class PreescricaoMedica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6984234872254469540L;
	
	@Id
	@GeneratedValue
	private int id;
	
	@OneToMany(mappedBy="preescricao",targetEntity=Cid.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL,orphanRemoval=true)
	private List<Cid> cids;
	
	@OneToMany(mappedBy="preescricao",targetEntity=ItemPreescricaoMedica.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL,orphanRemoval=true)
	private List<ItemPreescricaoMedica> preescricoes;
	
	@ManyToOne @JoinColumn(name="id_preescricao")
	private Prontuario prontuario;	
	
	private Date dataPreescricao;
	
	public int getId() {
		return id;
	}
	public List<Cid> getCids() {
		return cids;
	}
	public void setCids(List<Cid> cids) {
		this.cids = cids;
	}
	public List<ItemPreescricaoMedica> getPreescricoes() {
		return preescricoes;
	}
	public void setPreescricoes(List<ItemPreescricaoMedica> preescricoes) {
		this.preescricoes = preescricoes;
	}
	public Date getDataPreescricao() {
		return dataPreescricao;
	}
	public void setDataPreescricao(Date dataPreescricao) {
		this.dataPreescricao = dataPreescricao;
	}	
}
