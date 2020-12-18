package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arincat;
import com.cdsi.backend.inve.models.entity.IdArincat;

@Repository
public interface IArincatDao extends PagingAndSortingRepository<Arincat,IdArincat> {

	//VAMOS A TRAER TODAS LAS SUB LINEAS DE UN ARTICULO
	@Query("SELECT a FROM Arincat a WHERE a.idArinc.cia = :cia and a.idArinc.tipo = :tipo and a.idArinc.clase = :clase")
	List<Arincat> findAll(@Param("cia") String cia,@Param("tipo") String tipo,@Param("clase") String clase);
	
	//VAMOS A TRAER UNA SUB LINEA
	Arincat findByIdArinc(IdArincat idArinc);
	
}
