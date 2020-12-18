package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arinmr;
import com.cdsi.backend.inve.models.entity.IdArinmr;

@Repository
public interface IArinmrDao extends PagingAndSortingRepository<Arinmr,IdArinmr> {
	
	//VAMOS A TRAER TODAS LAS SUB LINEAS DE UN ARTICULO
	@Query("SELECT a FROM Arinmr a WHERE a.idMar.cia = :cia")
	List<Arinmr> findAll(@Param("cia") String cia);

	
}
