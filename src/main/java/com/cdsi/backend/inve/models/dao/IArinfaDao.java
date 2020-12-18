package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arinfa;
import com.cdsi.backend.inve.models.entity.IdArinfa;

@Repository
public interface IArinfaDao extends PagingAndSortingRepository<Arinfa,IdArinfa> {
	
	//VAMOS A TRAER TODAS LAS SUB LINEAS DE UN ARTICULO
	@Query("SELECT a FROM Arinfa a WHERE a.idArfa.cia = :cia and a.idArfa.tipo = :tipo and a.idArfa.clase = :clase and a.idArfa.categoria = :cate")
	List<Arinfa> findAll(@Param("cia") String cia,@Param("tipo") String tipo,@Param("clase") String clase,@Param("cate") String cate);

	//VAMOS A BUSCAR UNA FAMILIA DE ARTICULOS
	Arinfa findByIdArfa(IdArinfa idArfa);
	
}
