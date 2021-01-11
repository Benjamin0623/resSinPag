package com.cdsi.backend.inve.dto;

import java.time.LocalDateTime;

public class DatosCajaDTO {

	private String cia;
	private String centro;
	private String caja;
	private String cajera;
	private LocalDateTime fecha;
	private LocalDateTime fechaSgte;
	
	public String getCia() {
		return cia;
	}
	public void setCia(String cia) {
		this.cia = cia;
	}
	public String getCentro() {
		return centro;
	}
	public void setCentro(String centro) {
		this.centro = centro;
	}
	public String getCaja() {
		return caja;
	}
	public void setCaja(String caja) {
		this.caja = caja;
	}
	public String getCajera() {
		return cajera;
	}
	public void setCajera(String cajera) {
		this.cajera = cajera;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public LocalDateTime getFechaSgte() {
		return fechaSgte;
	}
	public void setFechaSgte(LocalDateTime fechaSgte) {
		this.fechaSgte = fechaSgte;
	}
	
	 
	
	
}
