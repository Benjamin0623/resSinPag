package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Arfatp implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private IdArfatp idArfa;
	private String descripcion;
	private String moneda;
	
	@Column(name = "CODI_CAMP", length = 4)
	private String codCamp;
	
	@Column(name = "IND_AUTO", length = 1)
	private String indAuto;
	
	@Column(name = "IND_GENERAL", length = 1)
	private String indGeneral;
	
	@Column(name = "IND_PTOVTA", length = 1)
	private String indPTota;
	
	public String getCodCamp() {
		return codCamp;
	}
	public void setCodCamp(String codCamp) {
		this.codCamp = codCamp;
	}
	public String getIndAuto() {
		return indAuto;
	}
	public void setIndAuto(String indAuto) {
		this.indAuto = indAuto;
	}
	public String getIndGeneral() {
		return indGeneral;
	}
	public void setIndGeneral(String indGeneral) {
		this.indGeneral = indGeneral;
	}
	public String getIndPTota() {
		return indPTota;
	}
	public void setIndPTota(String indPTota) {
		this.indPTota = indPTota;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public IdArfatp getIdArfa() {
		return idArfa;
	}
	public void setIdArfa(IdArfatp idArfa) {
		this.idArfa = idArfa;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	
	
}
