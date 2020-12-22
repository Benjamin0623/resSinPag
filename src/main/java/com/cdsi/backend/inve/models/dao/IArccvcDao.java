package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arccvc;
import com.cdsi.backend.inve.models.entity.Arfamc;
import com.cdsi.backend.inve.models.entity.IdArccvc;
@Repository
public interface IArccvcDao extends PagingAndSortingRepository<Arccvc,IdArccvc> {

	@Query(value = "SELECT NO_CIA,COD_VEN_COB,DESCRIPCION,PASSWORD FROM Arccvc WHERE NO_CIA = :cia AND IND_VEN_COB IN ('01','02','03')", nativeQuery = true)
	List<Arccvc> findAll(@Param("cia") String cia);
	
	@Query(value = "SELECT NO_CIA,COD_VEN_COB,DESCRIPCION,PASSWORD FROM Arccvc WHERE NO_CIA = :cia AND IND_VEN_COB IN ('01','02','03') AND COD_VEN_COB=:cod AND PASSWORD=:pas", nativeQuery = true)
	Arccvc ObtenerVende(@Param("cia") String cia,@Param("cod") String cod,@Param("pas") String pas);
	
	@Query("SELECT a FROM Arccvc a where a.idArc.cia=:cia and a.idArc.codigo=:cod")
	Arccvc findCia(@Param("cia") String cia,@Param("cod") String cod);
}
