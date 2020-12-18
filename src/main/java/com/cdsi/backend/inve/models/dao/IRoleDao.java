package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Role;

@Repository
public interface IRoleDao extends CrudRepository<Role, Long>{

	@Query("SELECT r FROM Role r")
	List<Role> findRolesUnicos();
}
