package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arfatp;
import com.cdsi.backend.inve.models.entity.Arinfa;
import com.cdsi.backend.inve.models.entity.IdArfatp;
import com.cdsi.backend.inve.models.entity.IdArinfa;

@Repository
public interface IArfatpDao extends PagingAndSortingRepository<Arfatp,IdArfatp> {
	
	//VAMOS A TRAER TODAS LAS SUB LINEAS DE UN ARTICULO
	@Query("SELECT a FROM Arfatp a  WHERE a.idArfa.cia = :cia")
	List<Arfatp> findAll(@Param("cia") String cia);

	@Query("FROM Arfatp a  WHERE a.idArfa.cia = :cia AND a.indPTota = :pvta")
	List<Arfatp> listaPven(@Param("cia") String cia, @Param("pvta") String pvta);
	
	@Query("FROM Arfatp a  WHERE a.idArfa.cia = :cia AND a.idArfa.tipo = :tipo AND a.indPTota = :pvta")
	Arfatp buscarListPrecio(@Param("cia") String cia,@Param("tipo") String tipo, @Param("pvta") String pvta);
}
