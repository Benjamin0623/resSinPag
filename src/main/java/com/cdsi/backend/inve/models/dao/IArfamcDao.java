package com.cdsi.backend.inve.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arfamc;

@Repository
public interface IArfamcDao extends PagingAndSortingRepository<Arfamc, Long> {
	
	Arfamc findByCia(String cia);
	
}
