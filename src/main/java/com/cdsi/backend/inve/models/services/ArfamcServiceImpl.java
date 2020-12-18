package com.cdsi.backend.inve.models.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IArfamcDao;
import com.cdsi.backend.inve.models.entity.Arfamc;

@Service
public class ArfamcServiceImpl implements IArfamcService {
	
	@Autowired
	private IArfamcDao arfamcDao;

	@Override
	public List<Arfamc> getAllArfamc() {
		List<Arfamc> objArs = new ArrayList<Arfamc>();
		arfamcDao.findAll().iterator().forEachRemaining(objArs::add);
		return objArs;
	}

	@Override
	public Arfamc createArfamc(Arfamc objArfamc) {
		// TODO Auto-generated method stub
		return arfamcDao.save(objArfamc);
	}

	@Override
	public void deleteArfamc(String cia) {
		// TODO Auto-generated method stub
		arfamcDao.delete(findArfamc(cia));
	}

	@Override
	public Arfamc findArfamc(String cia) {
		return arfamcDao.findByCia(cia);
	}

	@Override
	public Page<Arfamc> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return arfamcDao.findAll(pageable);
	}

	@Override
	public Arfamc updateArfamct(String cia, Arfamc objArfa) {
		Arfamc objA = findArfamc(cia);
		// objA.setCuentaDol(objArfa.getCuentaDol());
		// objA.setCuentaSol(objArfa.getCuentaSol());
		objA.setNombre(objArfa.getNombre());
		objA.setNombreAno(objArfa.getNombreAno());
		// objA.setRazonSocial(objArfa.getRazonSocial());
		objA.setRuc(objArfa.getRuc());
		return arfamcDao.save(objA);
	}

}
