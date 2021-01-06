package com.cdsi.backend.inve.models.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IArinfaDao;
import com.cdsi.backend.inve.models.entity.Arinfa;
import com.cdsi.backend.inve.models.entity.IdArinfa;
import com.cdsi.backend.inve.models.services.IArinfaService;

@Service
public class ArinfaServiceImpl implements IArinfaService {

	@Autowired
	private IArinfaDao afDao;

	@Override
	public List<Arinfa> getAllArinfas() {
		// TODO Auto-generated method stub
		List<Arinfa> objAfs = new ArrayList<Arinfa>();
		afDao.findAll().iterator().forEachRemaining(objAfs::add);
		return objAfs;
	}

	@Override
	public Arinfa createArinfa(Arinfa objAf) {
		// TODO Auto-generated method stub
		return afDao.save(objAf);
	}

	@Override
	public Arinfa updateArinfa(IdArinfa objIdAf, Arinfa objAf) {
		// TODO Auto-generated method stub
		Arinfa objA = findArinfa(objIdAf);
		objA.setIdArfa(objAf.getIdArfa());
		objA.setDescripcion(objAf.getDescripcion());
		objA.setEstado(objAf.getEstado());
		
		return afDao.save(objA);
	}

	@Override
	public void deleteArinfa(IdArinfa objIdAf) {
		// TODO Auto-generated method stub
		afDao.delete(findArinfa(objIdAf));
	}

	@Override
	public Arinfa findArinfa(IdArinfa objIdAf) {		
		return  afDao.findByIdArfa(objIdAf);
	}


	@Override
	public List<Arinfa> findAll(String cia, String tipo, String clase, String cate) {
		// TODO Auto-generated method stub
		return afDao.findAll(cia, tipo, clase, cate);
	}
	

}
