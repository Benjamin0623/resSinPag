package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.IdLinea;
import com.cdsi.backend.inve.models.entity.Linea;

@Repository
public interface ILineaDao extends PagingAndSortingRepository<Linea,IdLinea> {
    //VAMOS A TRAER TODAS LAS LINEAS DE UNA COMPAÑIA
	@Query("SELECT l FROM Linea l WHERE l.idLinea.cia = :cia and l.idLinea.tipo=:tipo")
	List<Linea> findAll(@Param("cia") String cia,@Param("tipo") String tipo);
	
	//VAMOS A TRAER UNA LINEA
	Linea findByIdLinea(IdLinea idLine);
}
