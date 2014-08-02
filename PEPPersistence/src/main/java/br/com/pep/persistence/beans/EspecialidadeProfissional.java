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
	
	@OneToOne(mappedBy="id_especialidade",targetEntity=Especialidade.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Especialidade especialidade;
	
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
	public Especialidade getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}	
}
