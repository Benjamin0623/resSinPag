package com.cdsi.backend.inve.models.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arpfoe;
import com.cdsi.backend.inve.models.entity.IdArpfoe;

@Repository
public interface IArpfoeDao extends JpaRepository<Arpfoe, IdArpfoe>{

	
	@Query("FROM Arpfoe a WHERE a.idArpfoe.cia=:cia AND a.idArpfoe.noOrden=:orden")
	Arpfoe traePedido(@Param("cia") String cia,@Param("orden") String orden);
	
}
