package com.cdsi.backend.inve.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IArccvcDao;
import com.cdsi.backend.inve.models.entity.Arccvc;
@Service
public class ArccvcServiceImpl implements IArccvcService {
	
	@Autowired
	private IArccvcDao dao;

	@Override
	public List<Arccvc> findAll(String cia) {
		// TODO Auto-generated method stub
		return dao.findAll(cia);
	}

	@Override
	public Arccvc obtener(String cia, String cod, String pas) {
		// TODO Auto-generated method stub
		return dao.ObtenerVende(cia, cod, pas);
	}

}
