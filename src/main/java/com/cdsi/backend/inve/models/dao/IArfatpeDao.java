package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arfatpe;
import com.cdsi.backend.inve.models.entity.IdArfatpe;

@Repository
public interface IArfatpeDao extends PagingAndSortingRepository<Arfatpe,IdArfatpe> {
	
	//METODO QUE NOS PERMITE TRAER UNA TRASACCION EN ESPECIFICO
	Arfatpe findByIdArfatpe(IdArfatpe idA);
	//METODO QUE NOS PERMITE TRAER TODAS LAS TRANSACCIONES DE LA COMPAÑIA
	@Query("SELECT * FROM Arfatpe WHERE a.idArfatpe.cia = cia")
	List<Arfatpe> listaTrasaccion(@Param("cia") String cia);
}
