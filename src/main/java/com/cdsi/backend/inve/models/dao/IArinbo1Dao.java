package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arinbo1;
import com.cdsi.backend.inve.models.entity.Arinfa;
import com.cdsi.backend.inve.models.entity.IdArinbo1;
import com.cdsi.backend.inve.models.entity.IdArinfa;

@Repository
public interface IArinbo1Dao extends PagingAndSortingRepository<Arinbo1,IdArinbo1> {
	
	//VAMOS A TRAER TODAS LAS SUB LINEAS DE UN ARTICULO
	@Query("SELECT a FROM Arinbo1 a WHERE a.idArinb.cia = :cia")
	List<Arinbo1> findAll(@Param("cia") String cia);

	
}
