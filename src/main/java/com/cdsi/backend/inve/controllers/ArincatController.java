package com.cdsi.backend.inve.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.models.entity.Arincat;
import com.cdsi.backend.inve.models.services.IArincatService;

@RestController
@RequestMapping("/api/sublineas")
public class ArincatController {

	@Autowired
	private IArincatService subLinSer;

	@GetMapping("/list/{cia}/{tipo}/{clase}")
	// @Secured({"ROLE_ADMIN","ROLE_VENDEDOR","ROLE_USER"})
	public List<Arincat> listaLineas(@PathVariable("cia") String cia, @PathVariable("tipo") String tipo,
			@PathVariable("clase") String clase) {
		return subLinSer.findAll(cia, tipo, clase);
	}
}
