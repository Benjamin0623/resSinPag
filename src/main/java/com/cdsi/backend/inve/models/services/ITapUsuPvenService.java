package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.dto.VendedorDTO;
import com.cdsi.backend.inve.models.entity.TapUsuPven;


public interface ITapUsuPvenService {

	List<TapUsuPven> listarPorId(String cia, String emp);
	
}
