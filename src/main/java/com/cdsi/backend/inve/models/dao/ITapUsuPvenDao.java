package com.cdsi.backend.inve.models.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.IdTapUsuPven;
import com.cdsi.backend.inve.models.entity.TapUsuPven;
@Repository
public interface ITapUsuPvenDao extends JpaRepository<TapUsuPven,IdTapUsuPven> {

	@Query("FROM TapUsuPven t WHERE t.idUsuario.cia=:cia AND t.emp=:emp")
	TapUsuPven listarPorId(@Param("cia") String cia,@Param("emp") String emp);
}
