package com.cdsi.backend.inve.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cdsi.backend.inve.models.dao.IArccvcDao;
import com.cdsi.backend.inve.models.entity.Arccvc;

public class ArccvcServiceImpl implements IArccvcService {
	
	@Autowired
	private IArccvcDao dao;

	@Override
	public List<Arccvc> findAll(String cia) {
		// TODO Auto-generated method stub
		return dao.findAll(cia);
	}

}
