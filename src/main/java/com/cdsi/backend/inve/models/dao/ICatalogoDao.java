package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Catalogo;
import com.cdsi.backend.inve.models.entity.IdCatalogo;

@Repository
public interface ICatalogoDao extends PagingAndSortingRepository<Catalogo,IdCatalogo> {
	
	//METODO QUE NOS PERMITE TRAER UNA LISTA DE CATALOGOS SEGUN LA EMPRESA
	@Query("SELECT c FROM Catalogo c WHERE c.idCata.cia = :cia")
	List<Catalogo> findAll(@Param("cia") String cia);
	
	//VAMOS A TRAER UN CATALOGO
	Catalogo findByIdCata(IdCatalogo idCata);
	
}
