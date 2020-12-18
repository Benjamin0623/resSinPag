package com.cdsi.backend.inve.models.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdsi.backend.inve.models.dao.IUsuarioDao;
import com.cdsi.backend.inve.models.entity.Usuario;

@Service
public class UsuarioService implements IUsuarioService{
	
	private Logger logger = LoggerFactory.getLogger(UsuarioService.class);

	@Autowired
	private IUsuarioDao usuarioDao;
	/*
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	*/
	

	@Override
	@Transactional(readOnly=true)
	public Usuario findByUsername(String username) {
		return usuarioDao.findByUsername(username);
	}

	@Override
	public Usuario createUsusario(Usuario usuario) {
		
		Usuario objU = new Usuario();
		objU.setEnabled(usuario.getEnabled());
		objU.setRoles(usuario.getRoles());
		objU.setUsername(usuario.getUsername());
		objU.setCia(usuario.getCia());
		return usuarioDao.save(objU);
	}

	@Override
	public void deleteUsusario(Long codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<Usuario> findAllPage(Pageable pageable,String cia) {
		return usuarioDao.findAllPage(pageable, cia);
	}

}
