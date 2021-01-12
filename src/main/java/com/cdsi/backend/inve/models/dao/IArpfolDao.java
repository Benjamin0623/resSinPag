package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arpfol;
import com.cdsi.backend.inve.models.entity.IdArpfol;

@Repository
public interface IArpfolDao extends JpaRepository<Arpfol,IdArpfol>{

	@Query("FROM Arpfol a WHERE a.idArpfol.cia=:cia AND a.idArpfol.noOrden=:orden")
	List<Arpfol> listarDetalle(@Param("cia") String cia,@Param("orden") String orden);
}
