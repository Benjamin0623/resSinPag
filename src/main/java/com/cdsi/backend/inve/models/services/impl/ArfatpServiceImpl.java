package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cdsi.backend.inve.models.dao.IArfatpDao;
import com.cdsi.backend.inve.models.entity.Arfatp;
import com.cdsi.backend.inve.models.services.IArfatpService;

@Service
public class ArfatpServiceImpl implements IArfatpService {

	@Autowired
	private IArfatpDao arfDao;

	@Override
	public List<Arfatp> findAll(String cia) {
		// TODO Auto-generated method stub
		return arfDao.findAll(cia);
	}

	

}
