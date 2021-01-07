package com.cdsi.backend.inve.models.dao;


import java.time.LocalDateTime;

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
}
