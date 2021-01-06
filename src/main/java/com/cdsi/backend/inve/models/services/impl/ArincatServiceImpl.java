package com.cdsi.backend.inve.models.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IArincatDao;
import com.cdsi.backend.inve.models.entity.Arincat;
import com.cdsi.backend.inve.models.entity.IdArincat;
import com.cdsi.backend.inve.models.services.IArincatService;

@Service
public class ArincatServiceImpl implements IArincatService {
	
	@Autowired
	private IArincatDao arinDao;

	@Override
	public List<Arincat> getAllArincats() {
		List<Arincat> objAs = new ArrayList<Arincat>();
		arinDao.findAll().iterator().forEachRemaining(objAs::add);
		return objAs;
	}

	@Override
	public Arincat createArincat(Arincat objAri) {
		// TODO Auto-generated method stub
		return arinDao.save(objAri);
	}

	@Override
	public Arincat updateArincat(IdArincat objIdArin, Arincat objArin) {
		Arincat objA = findArincat(objIdArin);
		objA.setIdArinc(objArin.getIdArinc());
		objA.setDescripcion(objArin.getDescripcion());
		objA.setEstado(objArin.getEstado());
		return arinDao.save(objA);
	}

	@Override
	public void deleteArincat(IdArincat objIdArin) {
		arinDao.delete(findArincat(objIdArin));
	}

	@Override
	public Arincat findArincat(IdArincat objIdArin) {
		return arinDao.findByIdArinc(objIdArin);
	}

	@Override
	public List<Arincat> findAll(String cia,String tipo,String clase) {
		// TODO Auto-generated method stub
		return arinDao.findAll(cia, tipo, clase);
	}

}
