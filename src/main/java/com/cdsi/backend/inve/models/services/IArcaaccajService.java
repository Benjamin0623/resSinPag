package com.cdsi.backend.inve.models.services;

import java.time.LocalDateTime;
import java.util.List;

import com.cdsi.backend.inve.dto.CajaDTO;
import com.cdsi.backend.inve.dto.DatosCajaDTO;
import com.cdsi.backend.inve.models.entity.Arcaaccaj;
import com.cdsi.backend.inve.models.entity.IdArcaaccaj;
public interface IArcaaccajService {

	Arcaaccaj aperturaCaja(Arcaaccaj caja) throws Exception;
	
	Arcaaccaj actualizaCaja(Arcaaccaj caja) throws Exception;
	
	Arcaaccaj buscarCaja(DatosCajaDTO dto);
	
	List<Arcaaccaj> caja(DatosCajaDTO dto);
	
	List<Arcaaccaj> totalCajas(DatosCajaDTO dto);
	
	String codCaja(String cia, LocalDateTime fecha);
	
	Arcaaccaj findById(IdArcaaccaj id) throws Exception;
	
	void eliminar(IdArcaaccaj id) throws Exception;
	
	List<CajaDTO> listaCajas(String cia, String centro);
}
