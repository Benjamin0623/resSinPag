package com.cdsi.backend.inve.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.models.entity.Linea;
import com.cdsi.backend.inve.models.services.ILineaService;

@RestController
@RequestMapping("/api/lineas")
public class LineaController {

	@Autowired
	private ILineaService linSer;
	
	@GetMapping("/list/{cia}/{lin}")
  	//@Secured({"ROLE_ADMIN","ROLE_VENDEDOR","ROLE_USER"})
  	public List<Linea> listaLineas(@PathVariable("cia") String cia,@PathVariable("lin") String lin){
  		return linSer.findLineas(cia,lin);
  	}
}
