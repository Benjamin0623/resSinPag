package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Arccmc implements Serializable {
	
	@EmbeddedId
	private IdArccmc objIdArc;
	
	@Size(min = 1, max=200)
	private String nombre;
	
	@Size(min = 1, max=200)
	private String direccion;
	
	@Size(min = 1, max=12)
	private String ruc;
	
	@Column(name ="TELEFONO1")
	private String telefono;
	
	@Column(name ="TELEFONO2")
	private String celular;
	
	@Size(min = 1, max=1)
	private String extranjero;
	
	@Column(name="TIPO_PERSONA")
	@Size(min = 1, max=1)
	private String tipo;
	
	@Size(min = 1, max=1)
	private String activo;
	
	@Size(min = 1, max=100)
	private String web;
	
	@Column(name="COD_PAIS")
	@Size(min = 1, max=3)
	private String pais;
	
	@Column(name="TIPO_DOCUMENTO")
	@Size(min = 1, max=10)
	private String documento;
	
	@Size(min = 1, max=100)
	private String email;
	
    public IdArccmc getObjIdArc() {
		return objIdArc;
	}

	public void setObjIdArc(IdArccmc objIdArc) {
		this.objIdArc = objIdArc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getExtranjero() {
		return extranjero;
	}

	public void setExtranjero(String extranjero) {
		this.extranjero = extranjero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private static final long serialVersionUID = 1L;

}
