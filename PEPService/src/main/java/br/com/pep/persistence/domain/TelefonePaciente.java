package br.com.pep.persistence.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Entity
@Table(name="tb_fone_paciente")
@XStreamAlias(value="telefone")
public class TelefonePaciente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1107339784337548194L;
	@Id
	@GeneratedValue
	private int id;
	private int ddd;
	private String numero;
	private String tipo;
	
	@ManyToOne @JoinColumn(name="id_paciente")
	private Paciente paciente;	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}	
}
