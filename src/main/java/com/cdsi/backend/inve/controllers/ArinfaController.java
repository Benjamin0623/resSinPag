package com.cdsi.backend.inve.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.models.entity.Arinfa;
import com.cdsi.backend.inve.models.services.IArinfaService;

@RestController
@RequestMapping("/api/familias")
public class ArinfaController {

	@Autowired
	private IArinfaService famSer;

	@GetMapping("/list/{cia}/{tipo}/{clase}/{cate}")
	// @Secured({"ROLE_ADMIN","ROLE_VENDEDOR","ROLE_USER"})
	public List<Arinfa> listaLineas(@PathVariable("cia") String cia, @PathVariable("tipo") String tipo,
			@PathVariable("clase") String clase,@PathVariable("cate") String cate) {
		return famSer.findAll(cia, tipo, clase, cate);
	}
}
