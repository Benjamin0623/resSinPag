package com.cdsi.backend.inve.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
//import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.models.entity.Arccmc;
import com.cdsi.backend.inve.models.services.IArccmcService;

@CrossOrigin(origins = {"*"}, methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/cli")
public class ArccmcController {
	
	@Autowired
	private IArccmcService arccService;
	
	@GetMapping("/list/{cia}/{dscri}")
	//@Secured({"ROLE_ADMIN", "ROLE_USAR"})
	public List<Arccmc> listaNombreCia(@PathVariable("cia") String cia, @PathVariable("dscri") String dscri) {
		return arccService.findByNombreAndCia(cia, dscri);
	}
	
	//METODO QUE ENVIA UNA PAGINACION DE CLIENTES
  	@GetMapping("/list/page/{cia}/{page}")
  	//@Secured({"ROLE_ADMIN", "ROLE_USAR"})
  	public Page<Arccmc> paginacion(@PathVariable("cia") String cia, @PathVariable("page") Integer page){
  		Pageable pageable = PageRequest.of(page, 15);
  		return arccService.findPagByCia(pageable, cia);
  	}

}
