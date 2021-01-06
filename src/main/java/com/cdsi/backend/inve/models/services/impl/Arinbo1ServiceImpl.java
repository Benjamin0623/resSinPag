package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IArinbo1Dao;
import com.cdsi.backend.inve.models.entity.Arinbo1;
import com.cdsi.backend.inve.models.services.IArinbo1Service;

@Service
public class Arinbo1ServiceImpl implements IArinbo1Service {

	@Autowired
	private IArinbo1Dao arbDao;

	@Override
	public List<Arinbo1> findAll(String cia) {
		// TODO Auto-generated method stub
		return arbDao.findAll(cia);
	}

	

}
