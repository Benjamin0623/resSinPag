package com.cdsi.backend.inve.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.models.entity.Arccvc;
import com.cdsi.backend.inve.models.services.IArccvcService;

@RestController
@RequestMapping("/api/vendedores")
public class ArccvcController {

	@Autowired
	private IArccvcService arccServ;
	
	@GetMapping("/list/{cia}")
	// @Secured({"ROLE_ADMIN","ROLE_VENDEDOR","ROLE_USER"})
	public List<Arccvc> listaVendedores(@PathVariable("cia") String cia) {
		return arccServ.findAll(cia);
	}
}
