package com.cdsi.backend.inve.models.services;

import com.cdsi.backend.inve.dto.DatosCajaDTO;
import com.cdsi.backend.inve.models.entity.Arcaaccaj;
public interface IArcaaccajService {

	Arcaaccaj aperturaCaja(Arcaaccaj caja) throws Exception;
	
	Arcaaccaj buscarCaja(DatosCajaDTO dto);
	
	String codCaja(String cia, String fecha);
}
