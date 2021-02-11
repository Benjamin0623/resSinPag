package com.cdsi.backend.inve.models.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arfacc;
import com.cdsi.backend.inve.models.entity.IdArfacc;

@Repository
public interface IArfaccDao extends JpaRepository<Arfacc, IdArfacc>{

	
	@Query(value="CALL LLE.ACTUALIZA_CORREL_PEDIDO(:cia,:orden,:centro) ",nativeQuery = true)
	Object actualizaCorrel(@Param("cia") String cia,@Param("orden") String orden, @Param("centro") String centro);
	
}
