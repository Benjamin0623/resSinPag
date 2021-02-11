package com.cdsi.backend.inve.models.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ARFAFE")
public class Arfafe {

	@EmbeddedId
	private IdArfafe idArfafe;
	
	 
}
