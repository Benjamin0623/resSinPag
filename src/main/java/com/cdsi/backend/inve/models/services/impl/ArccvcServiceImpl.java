package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.dto.VendedorDTO;
import com.cdsi.backend.inve.models.dao.IArccvcDao;
import com.cdsi.backend.inve.models.entity.Arccvc;
import com.cdsi.backend.inve.models.services.IArccvcService;
@Service
public class ArccvcServiceImpl implements IArccvcService {
	
	@Autowired
	private IArccvcDao dao;

	@Override
	public List<Arccvc> listaVende(String cia) {
		// TODO Auto-generated method stub
		return dao.listaVende(cia);
	}

	@Override
	public Arccvc traeVendedor(VendedorDTO dto) {
		// TODO Auto-generated method stub
		return dao.traeVendedor(dto.getCia(),dto.getCodigo(),dto.getPass());
	}





}
