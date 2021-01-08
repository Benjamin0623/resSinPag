package com.cdsi.backend.inve.models.services.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.dto.DatosCajaDTO;
import com.cdsi.backend.inve.models.dao.IArcaaccajDao;
import com.cdsi.backend.inve.models.entity.Arcaaccaj;
import com.cdsi.backend.inve.models.services.IArcaaccajService;

@Service
public class IArcaaccajServiceImpl implements IArcaaccajService {

	@Autowired
	private IArcaaccajDao caj;

	@Override
	public Arcaaccaj aperturaCaja(Arcaaccaj caja) throws Exception {


		caja.getIdArcaja().setCod_aper(caj.codCaja(caja.getIdArcaja().getCia(), caja.getFecha()));

		return caj.save(caja);
	}

	@Override
	public Arcaaccaj buscarCaja(DatosCajaDTO dto) {
		// TODO Auto-generated method stub
		return caj.buscarCaja(dto.getCia(), dto.getCentro(), dto.getCaja(), dto.getCajera());
	}

	@Override
	public String codCaja(String cia, LocalDateTime fecha) {

		return caj.codCaja(cia, fecha);
	}
}
