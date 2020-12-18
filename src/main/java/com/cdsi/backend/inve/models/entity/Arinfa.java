package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Arinfa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private IdArinfa idArfa;
	
	private String descripcion;
	private String estado;
	
	@OneToMany(mappedBy = "arinfa")
	private List<Articulo> articulos;
	
	public IdArinfa getIdArfa() {
		return idArfa;
	}
	public void setIdArfa(IdArinfa idArfa) {
		this.idArfa = idArfa;
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
