package com.cdsi.backend.inve.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.models.entity.Arinbo1;
import com.cdsi.backend.inve.models.services.IArinbo1Service;

@RestController
@RequestMapping("/api/almacenes")
public class Arinbo1Controller {
	
	@Autowired
	private IArinbo1Service arinServ;
	
	@GetMapping("/list/{cia}")
	// @Secured({"ROLE_ADMIN","ROLE_VENDEDOR","ROLE_USER"})
	public List<Arinbo1> listaAlmacenes(@PathVariable("cia") String cia) {
		return arinServ.findAll(cia);
	}

}
