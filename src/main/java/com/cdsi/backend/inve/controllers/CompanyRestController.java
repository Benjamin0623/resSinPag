package com.cdsi.backend.inve.controllers;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.exception.ModeloNotFoundException;
import com.cdsi.backend.inve.models.entity.Arfamc;
import com.cdsi.backend.inve.models.services.IArfamcService;

@RestController
@RequestMapping("/api")
public class CompanyRestController {
	
	@Autowired
	private IArfamcService compaService;
	
	@GetMapping(value = "/company/list")
	public ResponseEntity<List<Arfamc>>  listar() {
		List<Arfamc> cia = new ArrayList<>();
		cia = compaService.findAll();
		return new ResponseEntity<List<Arfamc>>(cia,HttpStatus.OK);
	}
	
	@GetMapping(value = "/company/{cia}")
	public ResponseEntity<Arfamc> company(@PathVariable("cia") String cia){
		Arfamc obj = compaService.finById(cia);
		
		if(obj == null ) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + cia);
		}
		return new ResponseEntity<Arfamc>(obj,HttpStatus.OK);
	}
}
