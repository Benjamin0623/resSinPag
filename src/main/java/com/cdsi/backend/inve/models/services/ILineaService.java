package com.cdsi.backend.inve.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cdsi.backend.inve.models.entity.IdLinea;
import com.cdsi.backend.inve.models.entity.Linea;

public interface ILineaService {
	
	List<Linea> getAllLineas();
	Linea addLinea(Linea objL);
	Linea updateLinea(IdLinea objIdLi,Linea objL);
	void deleteLinea(IdLinea objIdLi);
	Linea findLinea(IdLinea objIdLi);
	//Page<Linea> findAll(Pageable pageable,String cia);
	List<Linea> findLineas(String cia,String tipo);

}
