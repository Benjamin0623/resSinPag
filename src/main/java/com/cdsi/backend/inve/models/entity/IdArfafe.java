package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class IdArfafe implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "NO_CIA")
	public Integer cia;
	@Column(name = "TIPO_DOC")
	public String tipoDoc;
	@Column(name = "NO_FACTU")
	public String noFactu;
	public Integer getCia() {
		return cia;
	}
	public void setCia(Integer cia) {
		this.cia = cia;
	}
	public String getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	public String getNoFactu() {
		return noFactu;
	}
	public void setNoFactu(String noFactu) {
		this.noFactu = noFactu;
	}
	
	
}
