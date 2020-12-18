package com.cdsi.backend.inve.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cdsi.backend.inve.models.entity.Catalogo;
import com.cdsi.backend.inve.models.entity.IdCatalogo;

public interface ICatalogoService {

	List<Catalogo> getAllCatalogos();
	Catalogo addCatalogo(Catalogo objC);
	Catalogo updateCatalogo(IdCatalogo objIdCat,Catalogo objC);
	void deleteCatalogo(IdCatalogo objIdCat);
	Catalogo findCatalogo(IdCatalogo objIdCat);
	//Page<Catalogo> findAll(Pageable pageable,String cia);
	List<Catalogo> findAllCatalogos(String cia);
}
