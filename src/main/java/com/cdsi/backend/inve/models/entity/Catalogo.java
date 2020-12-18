package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ARINCLA")
public class Catalogo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private IdCatalogo idCata;
	
	private String descripcion;
	
	private String estado;
	
	@OneToMany(mappedBy = "catalogo")
	private List<Articulo> articulos;

	public IdCatalogo getIdCata() {
		return idCata;
	}

	public void setIdCata(IdCatalogo idCata) {
		this.idCata = idCata;
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
