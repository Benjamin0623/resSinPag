package com.cdsi.backend.inve.models.dao;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arcaaccaj;
import com.cdsi.backend.inve.models.entity.IdArcaaccaj;

@Repository
public interface IArcaaccajDao extends JpaRepository<Arcaaccaj, IdArcaaccaj> {

	@Query(value = "SELECT CAJA.APERTURA(:cia,:fecha) FROM DUAL", nativeQuery = true)
	String codCaja(@Param("cia") String cia,@Param("fecha") LocalDateTime fecha);

	/*@Query(value="SELECT NO_CIA,CENTRO,COD_CAJA,COD_APER,FECHA,CAJERA,SALDO_INICIAL,FECHA_CIERRE,ESTADO,HORA,HORA_CIERRE,SERIE_LIQ,NUM_LIQ,TIPO_DOC_LIQ,INGRESO_EFECTIVO_SOL,EGRESO_EFECTIVO_SOL,INGRESO_EFECTIVO_DOL,EGRESO_EFECTIVO_DOL FROM Arcaaccaj a WHERE A.NO_CIA = :cia AND A.CENTRO=:centro AND A.COD_CAJA=:caja AND a.estado='A' AND a.cajera=:cajera", nativeQuery = true)
	Arcaaccaj buscarCaja(@Param("cia")String cia, @Param("centro") String centro, @Param("caja") String caja, @Param("cajera") String cajera);*/
	@Query("FROM Arcaaccaj a WHERE a.idArcaja.cia = :cia AND a.idArcaja.centro=:centro AND a.idArcaja.codCaja=:caja AND a.estado='A' AND a.cajera=:cajera")
	Arcaaccaj buscarCaja(@Param("cia")String cia, @Param("centro") String centro, @Param("caja") String caja, @Param("cajera") String cajera);
	
	@Query("FROM Arcaaccaj a WHERE a.idArcaja.cia = :cia AND a.idArcaja.centro=:centro AND a.estado='A' AND a.cajera=:cajera")
	List<Arcaaccaj> caja(@Param("cia")String cia, @Param("centro") String centro, @Param("cajera") String cajera);
	
	@Query("FROM Arcaaccaj a WHERE a.idArcaja.cia = :cia AND a.idArcaja.centro=:centro AND a.fecha BETWEEN :fecha AND :fechaSgte")
	List<Arcaaccaj> totalCajas(@Param("cia")String cia, @Param("centro") String centro,LocalDateTime fecha,@Param("fechaSgte") LocalDateTime fechaSgte);
	
	@Query(value = "SELECT  a.NO_CABA, a.DESC_CABA, a.MONEDA FROM artsccb a WHERE a.no_cia = :cia AND a.tipo_caba = 'C' AND a.centro = :centro and a.no_caba not in(Select cod_caja from ARCAACCAJ where no_cia = :cia and centro = :centro and estado='A')", nativeQuery = true)
	List<Object[]> listaCajas(@Param("cia")String cia, @Param("centro") String centro);
	
}
