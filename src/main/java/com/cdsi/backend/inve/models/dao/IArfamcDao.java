package com.cdsi.backend.inve.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arfamc;

@Repository
public interface IArfamcDao extends JpaRepository<Arfamc, String> {
	
}
