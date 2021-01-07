package com.cdsi.backend.inve.models.services.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.dto.VendedorDTO;
import com.cdsi.backend.inve.models.dao.ITapUsuPvenDao;
import com.cdsi.backend.inve.models.entity.TapUsuPven;
import com.cdsi.backend.inve.models.services.ITapUsuPvenService;

@Service
public class ITapUsuPvenServiceImpl implements ITapUsuPvenService {

	@Autowired
	private ITapUsuPvenDao usu;
	
	@Override
	public List<TapUsuPven> listarPorId(String cia, String emp) {
		// TODO Auto-generated method stub
		
		return usu.listarPorId(cia, emp);
	}

}