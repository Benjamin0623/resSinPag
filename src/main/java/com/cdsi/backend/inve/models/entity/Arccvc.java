package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Arccvc implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private IdArccvc idArc;
	
	private String descripcion;
	
	@Column(name = "PASSWORD")
	private String pass;
	
	public IdArccvc getIdArc() {
		return idArc;
	}
	public void setIdArc(IdArccvc idArc) {
		this.idArc = idArc;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	

}
