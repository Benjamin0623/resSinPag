package com.cdsi.backend.inve.models.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.ICatalogoDao;
import com.cdsi.backend.inve.models.entity.Catalogo;
import com.cdsi.backend.inve.models.entity.IdCatalogo;
import com.cdsi.backend.inve.models.services.ICatalogoService;

@Service
public class CatalogoServiceImpl implements ICatalogoService {

	@Autowired
	private ICatalogoDao cataDao;

	@Override
	public List<Catalogo> getAllCatalogos() {
		List<Catalogo> objAs = new ArrayList<Catalogo>();
		cataDao.findAll().iterator().forEachRemaining(objAs::add);
		return objAs;
	}

	@Override
	public Catalogo addCatalogo(Catalogo objC) {
		// TODO Auto-generated method stub
		return cataDao.save(objC);
	}

	@Override
	public Catalogo updateCatalogo(IdCatalogo objIdCat, Catalogo objC) {
		Catalogo objCata = findCatalogo(objIdCat);
		objCata.setIdCata(objC.getIdCata());
		objCata.setDescripcion(objC.getDescripcion());
		objCata.setEstado(objC.getEstado());
		return cataDao.save(objCata);
	}

	@Override
	public void deleteCatalogo(IdCatalogo objIdCat) {
		// TODO Auto-generated method stub
		cataDao.delete(findCatalogo(objIdCat));
	}

	@Override
	public Catalogo findCatalogo(IdCatalogo objIdCat) {
		return cataDao.findByIdCata(objIdCat);
	}

	/*
	 * @Override public Page<Catalogo> findAll(Pageable pageable, String cia) { //
	 * TODO Auto-generated method stub return cataDao.findAll(pageable,cia); }
	 */
	@Override
	public List<Catalogo> findAllCatalogos(String cia) {
		// TODO Auto-generated method stub
		return cataDao.findAll(cia);
	}

}
