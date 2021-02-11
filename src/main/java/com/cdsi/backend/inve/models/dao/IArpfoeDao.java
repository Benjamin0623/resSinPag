package com.cdsi.backend.inve.models.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arfacc;
import com.cdsi.backend.inve.models.entity.Arpfoe;
import com.cdsi.backend.inve.models.entity.IdArpfoe;

@Repository
public interface IArpfoeDao extends JpaRepository<Arpfoe, IdArpfoe>{

	
	@Query("FROM Arpfoe a WHERE a.idArpfoe.cia=:cia AND a.idArpfoe.noOrden=:orden")
	Arpfoe traePedido(@Param("cia") String cia,@Param("orden") String orden);
	
	@Query("FROM Arpfoe a WHERE a.idArpfoe.cia=:cia")
	List<Arpfoe>  listaPedidos(@Param("cia") String cia);
	
	@Query(value="SELECT '9'||:centro||LPAD (TO_CHAR (NVL (TO_NUMBER (cons_desde), 0) + 1), 7, '0') FROM ARFACC WHERE (no_cia = :cia) AND (centro = :centro) AND (tipo_doc = 'P') AND (serie = '9' || :centro) AND ACTIVO = 'S'",nativeQuery = true)
	String noOrden(@Param("cia") String cia, @Param("centro") String centro);
	
}
