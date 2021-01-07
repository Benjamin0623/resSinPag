package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class IdArcaaccaj implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "NO_CIA")
	private String cia;
	@Column(name = "CENTRO")
	private String centro;
	@Column(name = "COD_CAJA")
	private String codCaja;
	@Column(name = "COD_APER")
	private String cod_aper;
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
	public String getCodCaja() {
		return codCaja;
	}
	public void setCodCaja(String codCaja) {
		this.codCaja = codCaja;
	}
	public String getCod_aper() {
		return cod_aper;
	}
	public void setCod_aper(String cod_aper) {
		this.cod_aper = cod_aper;
	}


}
