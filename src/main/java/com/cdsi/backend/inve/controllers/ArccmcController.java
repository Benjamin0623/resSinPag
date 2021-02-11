package com.cdsi.backend.inve.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.dto.DatosClienteDTO;
import com.cdsi.backend.inve.exception.ModeloNotFoundException;
import com.cdsi.backend.inve.models.entity.Arccmc;
import com.cdsi.backend.inve.models.services.IArccmcService;

@RestController
@RequestMapping("/api/cli")
public class ArccmcController {
	
	@Autowired
	private IArccmcService arccService;
	
	@PostMapping("/list/descripcion")
	//@Secured({"ROLE_ADMIN", "ROLE_USAR"})
	public ResponseEntity<List<Arccmc>> listaClientes(@RequestBody DatosClienteDTO filtro) {
		
		List<Arccmc> clientes = new ArrayList<>();
		if(filtro != null) {
			if(filtro.getDocumento()== null) {
				clientes= arccService.buscaClienteNombre(filtro);
			}
		}
		return new ResponseEntity<List<Arccmc>>(clientes, HttpStatus.OK);
	}
	@PostMapping("/cliente")
	//@Secured({"ROLE_ADMIN", "ROLE_USAR"})
	public ResponseEntity<Arccmc> traeCliente(@RequestBody DatosClienteDTO filtro) {
		
		Arccmc cliente = new Arccmc();
		cliente= arccService.buscaClienteDocumento(filtro);
		if(cliente==null) {
			throw new ModeloNotFoundException("Cliente inactivo o no existe " + filtro.getDocumento());
		}
		return new ResponseEntity<Arccmc>(cliente, HttpStatus.OK);
	}
	
	//METODO QUE ENVIA UNA PAGINACION DE CLIENTES
  	@GetMapping("/list/{cia}")
  	//@Secured({"ROLE_ADMIN", "ROLE_USAR"})
  	public List<Arccmc> paginacion(@PathVariable("cia") String cia){
  	
  		return arccService.findPagByCia(cia);
  	}

}
