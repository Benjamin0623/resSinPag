package com.cdsi.backend.inve.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.models.entity.Catalogo;
import com.cdsi.backend.inve.models.services.ICatalogoService;


@RestController
@RequestMapping("/api/catalogos")
public class CatalogoController {

	@Autowired
	private ICatalogoService catSer;
	
	@GetMapping("/list/{cia}")
  	//@Secured({"ROLE_ADMIN","ROLE_VENDEDOR","ROLE_USER"})
  	public List<Catalogo> listaCatalogo(@PathVariable("cia") String cia){
  		return catSer.findAllCatalogos(cia);
  	}
}
