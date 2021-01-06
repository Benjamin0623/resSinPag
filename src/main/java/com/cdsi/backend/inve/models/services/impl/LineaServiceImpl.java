package com.cdsi.backend.inve.models.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.ILineaDao;
import com.cdsi.backend.inve.models.entity.IdLinea;
import com.cdsi.backend.inve.models.entity.Linea;
import com.cdsi.backend.inve.models.services.ILineaService;


@Service
public class LineaServiceImpl implements ILineaService {
	
	@Autowired
	private ILineaDao lineaDao;

	@Override
	public List<Linea> getAllLineas() {
		List<Linea> objLs = new ArrayList<Linea>();
		lineaDao.findAll().iterator().forEachRemaining(objLs::add);
		return objLs;
	}

	@Override
	public Linea addLinea(Linea objL) {
		return lineaDao.save(objL);
	}

	@Override
	public Linea updateLinea(IdLinea objIdLi, Linea objL) {
		Linea objLine = findLinea(objIdLi);
		// objL.setIdLinea(objLine.getIdLinea());
		objLine.setDescripcion(objL.getDescripcion());
		objLine.setEstado(objL.getEstado());
		return lineaDao.save(objLine);
	}

	@Override
	public void deleteLinea(IdLinea objIdLi) {
		lineaDao.delete(findLinea(objIdLi));
	}

	@Override
	public Linea findLinea(IdLinea objIdLi) {
		return lineaDao.findByIdLinea(objIdLi);
	}

	@Override
	public List<Linea> findLineas(String cia,String tipo) {
		// TODO Auto-generated method stub
		return lineaDao.findAll(cia,tipo);
	}

	


}
