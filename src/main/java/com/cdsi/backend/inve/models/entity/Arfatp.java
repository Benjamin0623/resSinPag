package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Arfatp implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private IdArfatp idArfa;
	private String descripcion;
	private String moneda;
	
	
	
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
