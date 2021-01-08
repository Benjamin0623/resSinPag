package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IArfatpeDao;
import com.cdsi.backend.inve.models.entity.Arfatpe;
import com.cdsi.backend.inve.models.entity.IdArfatpe;
import com.cdsi.backend.inve.models.services.IArfatpeService;

@Service
public class ArfatpeServiceImple implements IArfatpeService {
	
	@Autowired
	private IArfatpeDao dao;
	
	@Override
	public Arfatpe findByIdArfatpe(IdArfatpe objIdArfa) {
		// TODO Auto-generated method stub
		return dao.findByIdArfatpe(objIdArfa);
	}

	@Override
	public List<Arfatpe> listarTransacXCia(String cia) {
		// TODO Auto-generated method stub
		return dao.listaTrasaccion(cia);
	}

}
