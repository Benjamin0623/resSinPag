package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class IdArccvc implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "NO_CIA")
	private String cia;
	@Column(name = "COD_VEN_COB")
	private String codigo;

	public String getCia() {
		return cia;
	}

	public void setCia(String cia) {
		this.cia = cia;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
