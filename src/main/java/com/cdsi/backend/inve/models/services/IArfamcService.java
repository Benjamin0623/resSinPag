package com.cdsi.backend.inve.models.services;

import java.util.List;


import com.cdsi.backend.inve.models.entity.Arfamc;

public interface IArfamcService {
	
	List<Arfamc> findAll();
	
	Arfamc finById(String cia);
}
