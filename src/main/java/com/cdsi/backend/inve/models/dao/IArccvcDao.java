package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arccvc;
import com.cdsi.backend.inve.models.entity.IdArccvc;
@Repository
public interface IArccvcDao extends JpaRepository<Arccvc,IdArccvc> {

	@Query(value = "SELECT NO_CIA,COD_VEN_COB,DESCRIPCION,PASSWORD FROM Arccvc WHERE NO_CIA = :cia AND IND_VEN_COB IN ('01','02','03')", nativeQuery = true)
	List<Arccvc> listaVende(@Param("cia") String cia);
	
	@Query(value = "SELECT NO_CIA,COD_VEN_COB,DESCRIPCION,PASSWORD FROM Arccvc a WHERE a.NO_CIA=:cia AND a.COD_VEN_COB=:codigo AND a.PASSWORD=:pass", nativeQuery = true)
	Arccvc traeVendedor(@Param("cia") String cia,@Param("codigo") String codigo,@Param("pass") String pass);
	
	@Query(value = "select NO_CIA, CEDULA,NO_EMPLE from ARPLME a where a.no_cia=:cia and a.CEDULA=:emp", nativeQuery = true)
	List<Object[]> listaEmpleado(@Param("cia") String cia,@Param("emp") String emp);
}
