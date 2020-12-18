package com.cdsi.backend.inve.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.models.entity.Arinmr;
import com.cdsi.backend.inve.models.services.IArinmrService;

@RestController
@RequestMapping("/api/marcas")
public class ArinmrController {
	
	@Autowired
	private IArinmrService arinServ;
	
	@GetMapping("/list/{cia}")
	// @Secured({"ROLE_ADMIN","ROLE_VENDEDOR","ROLE_USER"})
	public List<Arinmr> listaMarcas(@PathVariable("cia") String cia) {
		return arinServ.findAll(cia);
	}

}
