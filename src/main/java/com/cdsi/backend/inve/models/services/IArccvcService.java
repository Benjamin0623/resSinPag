package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.models.entity.Arccvc;

public interface IArccvcService {

	List<Arccvc> findAll(String cia);
	
	Arccvc obtener(String cia, String cod, String pas);
}
