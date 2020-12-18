package com.cdsi.backend.inve.models.entity;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "TAPUSU_PVEN")
public class TapUsuPven implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private IdTapUsuPven idUsuario;
	
	private String nombre;
	private String tipusua;
	private String centro;
	private String estado;
	private String cod_emp;
	private String centro_costo;
	private String password;
	
	public IdTapUsuPven getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(IdTapUsuPven idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipusua() {
		return tipusua;
	}
	public void setTipusua(String tipusua) {
		this.tipusua = tipusua;
	}
	public String getCentro() {
		return centro;
	}
	public void setCentro(String centro) {
		this.centro = centro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCod_emp() {
		return cod_emp;
	}
	public void setCod_emp(String cod_emp) {
		this.cod_emp = cod_emp;
	}
	public String getCentro_costo() {
		return centro_costo;
	}
	public void setCentro_costo(String centro_costo) {
		this.centro_costo = centro_costo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
