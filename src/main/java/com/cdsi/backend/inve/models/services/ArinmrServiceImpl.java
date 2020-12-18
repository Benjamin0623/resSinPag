package com.cdsi.backend.inve.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IArinmrDao;
import com.cdsi.backend.inve.models.entity.Arinmr;

@Service
public class ArinmrServiceImpl implements IArinmrService {

	@Autowired
	private IArinmrDao arDao;

	@Override
	public List<Arinmr> findAll(String cia) {
		// TODO Auto-generated method stub
		return arDao.findAll(cia);
	}

	

}
