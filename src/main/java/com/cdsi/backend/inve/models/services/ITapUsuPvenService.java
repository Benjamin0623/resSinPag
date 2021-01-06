package com.cdsi.backend.inve.models.services;

import com.cdsi.backend.inve.models.entity.TapUsuPven;


public interface ITapUsuPvenService {

	TapUsuPven listarPorId(String cia, String emp);
	
}
