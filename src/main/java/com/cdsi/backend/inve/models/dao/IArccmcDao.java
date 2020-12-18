package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arccmc;
import com.cdsi.backend.inve.models.entity.IdArccmc;

@Repository
public interface IArccmcDao extends PagingAndSortingRepository<Arccmc,IdArccmc> {
	
	//METODO QUE NOS PERMITE TRAER TODOS LOS CLIENTE CON COMPAÑIA
	@Query("SELECT a FROM Arccmc a WHERE a.objIdArc.cia = :cia")
	Page<Arccmc> findPagByCia(Pageable pageable,@Param("cia") String cia);
	
	//METODO QUE NOS PERMITE BUSCAR A UN CLIENTE POR SU CODIGO
	Arccmc findByObjIdArc(IdArccmc objIdArc);
	
	//METODO QUE NOS PERMITE BUSCAR A UN CLIENTE POR SU NOMBRE
	@Query("SELECT a FROM Arccmc a WHERE a.objIdArc.cia = :cia AND a.nombre LIKE %:dscri%")
	List<Arccmc> findByNombreAndCia(@Param("cia") String cia,@Param("dscri") String dscri);
	
}
