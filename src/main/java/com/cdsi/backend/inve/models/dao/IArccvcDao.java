package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.cdsi.backend.inve.models.entity.Arccvc;
import com.cdsi.backend.inve.models.entity.IdArccvc;

public interface IArccvcDao extends PagingAndSortingRepository<Arccvc,IdArccvc> {

	List<Arccvc> findAll(@Param("cia") String cia);
}
