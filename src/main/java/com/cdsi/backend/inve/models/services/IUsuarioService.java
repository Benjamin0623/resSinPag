package com.cdsi.backend.inve.models.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cdsi.backend.inve.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
	
	Usuario createUsusario(Usuario usuario);
	void deleteUsusario(Long codigo);
	//PAGINACION
	Page<Usuario> findAllPage(Pageable pageable,String cia);
}
