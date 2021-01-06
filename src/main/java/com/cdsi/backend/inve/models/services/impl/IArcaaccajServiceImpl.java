package com.cdsi.backend.inve.models.services.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

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

		SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
		String date = DATE_FORMAT.format(caja.getFecha());

		caja.getIdArcaja().setCod_aper(caj.codCaja(caja.getIdArcaja().getCia(), date));

		return caj.save(caja);
	}

	@Override
	public Arcaaccaj buscarCaja(DatosCajaDTO dto) {
		// TODO Auto-generated method stub
		return caj.buscarCaja(dto.getCia(), dto.getCentro(), dto.getCaja(), dto.getCajera());
	}

	@Override
	public String codCaja(String cia, String fecha) {
		// TODO Auto-generated method stub
		Date today = new Date();
		SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
		String date = DATE_FORMAT.format(today);

		return caj.codCaja(cia, date);
	}
}
