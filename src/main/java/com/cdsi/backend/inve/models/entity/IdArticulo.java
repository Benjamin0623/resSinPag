package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class IdArticulo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "NO_CIA")
	private String cia;
	
	@Column(name = "NO_ARTI")
	private String noArti;

	public String getCia() {
		return cia;
	}

	public void setCia(String cia) {
		this.cia = cia;
	}

	public String getNoArti() {
		return noArti;
	}

	public void setNoArti(String noArti) {
		this.noArti = noArti;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
