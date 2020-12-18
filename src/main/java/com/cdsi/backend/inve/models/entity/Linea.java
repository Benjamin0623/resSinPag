package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ARINCA")
public class Linea implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private IdLinea idLinea;
	
	private String descripcion;
	
	private String estado;
	
	@OneToMany(mappedBy = "linea")
	private List<Articulo> articulos;

	public IdLinea getIdLinea() {
		return idLinea;
	}

	public void setIdLinea(IdLinea idLinea) {
		this.idLinea = idLinea;
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
