package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.dto.VendedorDTO;
import com.cdsi.backend.inve.models.entity.Arccvc;

public interface IArccvcService {

	List<Arccvc> listaVende(String cia);
	
	Arccvc traeVendedor(VendedorDTO dto);
	
	VendedorDTO traeEmpelado(String cia, String emp);
}
