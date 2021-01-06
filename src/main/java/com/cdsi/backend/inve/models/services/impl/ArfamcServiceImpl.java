package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IArfamcDao;
import com.cdsi.backend.inve.models.entity.Arfamc;
import com.cdsi.backend.inve.models.services.IArfamcService;

@Service
public class ArfamcServiceImpl implements IArfamcService {
	
	@Autowired
	private IArfamcDao arfamcDao;

	@Override
	public List<Arfamc> findAll() {
		// TODO Auto-generated method stub
		return arfamcDao.findAll();
	}

	@Override
	public Arfamc finById(String cia) {
		// TODO Auto-generated method stub
		return arfamcDao.findById(cia).orElse(null);
	}

}
