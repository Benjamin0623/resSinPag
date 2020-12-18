package com.cdsi.backend.inve.models.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.cdsi.backend.inve.models.entity.Usuario;

public interface IUsuarioDao extends PagingAndSortingRepository<Usuario, Long>{
	
	public Usuario findByUsername(String username);
	
	@Query("SELECT u FROM Usuario u WHERE u.cia =:cia")
	Page<Usuario> findAllPage(Pageable pageable, @Param("cia") String cia);

}
