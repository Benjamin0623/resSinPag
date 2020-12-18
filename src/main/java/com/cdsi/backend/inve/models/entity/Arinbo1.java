package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Arinbo1 implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private IdArinbo1 idArinb;
	private String descripcion;
	
	public IdArinbo1 getIdArinb() {
		return idArinb;
	}
	public void setIdArinb(IdArinbo1 idArinb) {
		this.idArinb = idArinb;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
