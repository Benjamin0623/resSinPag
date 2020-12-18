package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Arincat implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private IdArincat idArinc;
	
	private String descripcion;
	private String estado;
	/*
	@OneToMany(mappedBy = "arincat")
	private List<Articulo> articulos;
	*/
	public IdArincat getIdArinc() {
		return idArinc;
	}
	public void setIdArinc(IdArincat idArinc) {
		this.idArinc = idArinc;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
