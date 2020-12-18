package com.cdsi.backend.inve.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.models.entity.Arfatp;
import com.cdsi.backend.inve.models.services.IArfatpService;

@RestController
@RequestMapping("/api/listaprecios")
public class ArfatpController {
	
	@Autowired
	private IArfatpService arfServ;
	
	@GetMapping("/list/{cia}")
	// @Secured({"ROLE_ADMIN","ROLE_VENDEDOR","ROLE_USER"})
	public List<Arfatp> listaPrecios(@PathVariable("cia") String cia) {
		return arfServ.findAll(cia);
	}

}
