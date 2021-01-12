package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class IdArfatpe implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "NO_CIA")
	private String cia;
	@Column(name = "COD_T_PED")
	private String codPed;
	
	public String getCia() {
		return cia;
	}
	public void setCia(String cia) {
		this.cia = cia;
	}
	public String getCodPed() {
		return codPed;
	}
	public void setCodPed(String codPed) {
		this.codPed = codPed;
	}
	
	
}
