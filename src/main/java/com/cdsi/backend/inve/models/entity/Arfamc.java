package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Arfamc implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="NO_CIA")
	private String cia;
	
	@Size(min=1, max=30, message="La longuitud del nombre de la compañia es 30.")
	private String nombre;
	
	@Column(name="NOMBRE_ANO")
	private String nombreAno;
	
	@Column(name="NO_CLIENTE_ONLINE")
	private String ruc;
	/*
	@Column(name="RAZON_SOCIAL")
	private String razonSocial;
	
	@Column(name="CUENTA_SOL")
	private String cuentaSol;
	
	@Column(name = "CUENTA_DOL")
	private String cuentaDol;
    */
	public String getCia() {
		return cia;
	}

	public void setCia(String cia) {
		this.cia = cia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreAno() {
		return nombreAno;
	}

	public void setNombreAno(String nombreAno) {
		this.nombreAno = nombreAno;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
    /*
	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getCuentaSol() {
		return cuentaSol;
	}

	public void setCuentaSol(String cuentaSol) {
		this.cuentaSol = cuentaSol;
	}

	public String getCuentaDol() {
		return cuentaDol;
	}

	public void setCuentaDol(String cuentaDol) {
		this.cuentaDol = cuentaDol;
	}
	*/
	
}
