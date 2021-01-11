package com.cdsi.backend.inve.models.services.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.dto.CajaDTO;
import com.cdsi.backend.inve.dto.DatosCajaDTO;
import com.cdsi.backend.inve.models.dao.IArcaaccajDao;
import com.cdsi.backend.inve.models.entity.Arcaaccaj;
import com.cdsi.backend.inve.models.entity.IdArcaaccaj;
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
	public Arcaaccaj actualizaCaja(Arcaaccaj caja) throws Exception {
		// TODO Auto-generated method stub
		return caj.save(caja);
	}
	@Override
	public Arcaaccaj buscarCaja(DatosCajaDTO dto) {
		// TODO Auto-generated method stub
		return caj.buscarCaja(dto.getCia(), dto.getCentro(), dto.getCaja(), dto.getCajera());
	}
	
	@Override
	public List<Arcaaccaj> totalCajas(DatosCajaDTO dto) {
		// TODO Auto-generated method stub
		return caj.totalCajas(dto.getCia(), dto.getCentro(),dto.getFecha(),dto.getFecha().plusDays(1));
	}

	@Override
	public String codCaja(String cia, LocalDateTime fecha) {

		return caj.codCaja(cia, fecha);
	}

	@Override
	public List<Arcaaccaj> caja(DatosCajaDTO dto) {
		// TODO Auto-generated method stub
		return caj.caja(dto.getCia(), dto.getCentro(), dto.getCajera());
	}

	@Override
	public Arcaaccaj findById(IdArcaaccaj id) {
		// TODO Auto-generated method stub
		return caj.findById(id).orElse(null);
	}

	@Override
	public void eliminar(IdArcaaccaj id) throws Exception {
		// TODO Auto-generated method stub
		caj.deleteById(id);
	}

	@Override
	public List<CajaDTO> listaCajas(String cia, String centro) {
		// TODO Auto-generated method stub
		List<CajaDTO> dto = new ArrayList<>();
		caj.listaCajas(cia, centro).forEach(x->{
			CajaDTO caja = new CajaDTO();
			caja.setCodigo(String.valueOf(x[0]));
			caja.setNombre(String.valueOf(x[1]));
			caja.setMoneda(String.valueOf(x[2]));
			dto.add(caja);
		});
		
		return dto;
	}

	


	
}
