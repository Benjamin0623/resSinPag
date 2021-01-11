package com.cdsi.backend.inve.models.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.IdTapUsuPven;
import com.cdsi.backend.inve.models.entity.TapUsuPven;
@Repository
public interface ITapUsuPvenDao extends JpaRepository<TapUsuPven,IdTapUsuPven> {

	@Query("FROM TapUsuPven t WHERE t.idUsuario.cia=:cia AND t.emp=:emp")
	List<TapUsuPven> listarPorId(@Param("cia") String cia,@Param("emp") String emp);
	
	@Query("FROM TapUsuPven t WHERE t.idUsuario.cia=:cia AND t.centro=:centro AND t.tipusua='04' AND t.emp!=null")
	List<TapUsuPven> listarCajeros(@Param("cia") String cia,@Param("centro") String centro);
	
	
}
