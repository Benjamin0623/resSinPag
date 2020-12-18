package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.models.entity.Role;

public interface IRolService {

	Role getRol(Long id);
	List<Role> rolesUnicos();

}
