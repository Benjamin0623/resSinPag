package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdsi.backend.inve.dto.DatosClienteDTO;
import com.cdsi.backend.inve.models.dao.IArccmcDao;
import com.cdsi.backend.inve.models.entity.Arccmc;
import com.cdsi.backend.inve.models.entity.IdArccmc;
import com.cdsi.backend.inve.models.services.IArccmcService;

@Service
public class ArccmcServiceImple implements IArccmcService  {
	@Autowired
	private IArccmcDao arccDao;
	
	@Override
	@Transactional
	public Arccmc createArccmc(Arccmc articulo) {
		return arccDao.save(articulo);
	}

	@Override
	@Transactional
	public Arccmc updateArccmc(IdArccmc objIdArc, Arccmc objA) {
		Arccmc newArcc = findArccmc(objIdArc);
		newArcc.setActivo(objA.getActivo());
		newArcc.setCelular(objA.getCelular());
		newArcc.setDireccion(objA.getDireccion());
		newArcc.setDocumento(objA.getDocumento());
		newArcc.setEmail(objA.getEmail());
		newArcc.setExtranjero(objA.getExtranjero());
		newArcc.setNombre(objA.getNombre());
		newArcc.setPais(objA.getPais());
		newArcc.setRuc(objA.getRuc());
		newArcc.setTelefono(objA.getTelefono());
		newArcc.setTipo(objA.getTipo());
		newArcc.setWeb(objA.getWeb());
		
		return arccDao.save(newArcc);
	}

	@Override
	@Transactional
	public void deleteArccmc(IdArccmc objIdArc) {
		arccDao.delete(findArccmc(objIdArc));
	}

	@Override
	@Transactional(readOnly = true)
	public Arccmc findArccmc(IdArccmc objIdArc) {
		return arccDao.findByObjIdArc(objIdArc);
	}

	@Override
	public List<Arccmc> findPagByCia( String cia) {
		return arccDao.findPagByCia(cia);
	}

	@Override
	public List<Arccmc> buscaClienteNombre(DatosClienteDTO dto) {
		return arccDao.buscaClienteNombre(dto.getCia(), dto.getDescri());
	}

	@Override
	public Arccmc buscaClienteDocumento(DatosClienteDTO dto) {
		// TODO Auto-generated method stub
		return arccDao.buscaClienteDocumento(dto.getCia(), dto.getDocumento());
	}

}
