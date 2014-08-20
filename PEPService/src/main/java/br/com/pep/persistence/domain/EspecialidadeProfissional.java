package br.com.pep.persistence.domain;

import java.io.Serializable;

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
@Table(name="tb_profissional_especialidade")
public class EspecialidadeProfissional implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6600978924822506569L;
	@Id
	@GeneratedValue
	private int id;
	private boolean fgAtiva;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval=true)
	@JoinColumn(name="id")
	private Especialidade especialidade;
	
	@ManyToOne @JoinColumn(name="id_profissional")
	private Profissional profissional;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isFgAtiva() {
		return fgAtiva;
	}
	public void setFgAtiva(boolean fgAtiva) {
		this.fgAtiva = fgAtiva;
	}
}
