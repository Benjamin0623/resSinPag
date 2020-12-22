package com.cdsi.backend.inve.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.exception.ModeloNotFoundException;
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
	
	@GetMapping("/vendedor/{cia}/{cod}/{pas}")
	public ResponseEntity<Arccvc> obtVende(@PathVariable("cia") String cia,@PathVariable("cod") String cod,@PathVariable("pas") String pas) throws Exception{
		Arccvc obj = arccServ.obtener(cia, cod, pas);
		if(obj == null) {
			throw new ModeloNotFoundException("Vendedor no encontrado" + cod);
		}
		return new ResponseEntity<Arccvc>(obj,HttpStatus.OK);
	}
	
	@GetMapping("/ven/{cia}/{cod}")
	public ResponseEntity<Arccvc> vende(@PathVariable("cia") String cia,@PathVariable("cod") String cod) throws Exception{
		Arccvc obj = arccServ.vende(cia, cod);
		if(obj == null) {
			throw new ModeloNotFoundException("Vendedor no encontrado" + cod);
		}
		return new ResponseEntity<Arccvc>(obj,HttpStatus.OK);
	}
}
