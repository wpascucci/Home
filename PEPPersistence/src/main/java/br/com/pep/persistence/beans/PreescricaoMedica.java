package br.com.pep.persistence.beans;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	
	@OneToMany(mappedBy="id_cid",targetEntity=Cid.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Set<Cid> cids;
	@OneToMany(mappedBy="id_itempreescricao",targetEntity=ItemPreescricaoMedica.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Set<ItemPreescricaoMedica> preescricoes;
	private Date dataPreescricao;
	
	public int getId() {
		return id;
	}
	public Set<Cid> getCids() {
		return cids;
	}
	public void setCids(Set<Cid> cids) {
		this.cids = cids;
	}
	public Set<ItemPreescricaoMedica> getPreescricoes() {
		return preescricoes;
	}
	public void setPreescricoes(Set<ItemPreescricaoMedica> preescricoes) {
		this.preescricoes = preescricoes;
	}
	public Date getDataPreescricao() {
		return dataPreescricao;
	}
	public void setDataPreescricao(Date dataPreescricao) {
		this.dataPreescricao = dataPreescricao;
	}	
}
