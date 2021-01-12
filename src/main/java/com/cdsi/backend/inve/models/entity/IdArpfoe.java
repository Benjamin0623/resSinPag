package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class IdArpfoe implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "NO_CIA")
	private String cia;
	@Column(name = "NO_ORDEN")
	private String noOrden;
	public String getCia() {
		return cia;
	}
	public void setCia(String cia) {
		this.cia = cia;
	}
	public String getNoOrden() {
		return noOrden;
	}
	public void setNoOrden(String noOrden) {
		this.noOrden = noOrden;
	}

}
