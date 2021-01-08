package com.cdsi.backend.inve.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.dto.VendedorDTO;
import com.cdsi.backend.inve.exception.ModeloNotFoundException;
import com.cdsi.backend.inve.models.entity.Arccvc;
import com.cdsi.backend.inve.models.services.IArccvcService;

@RestController
@RequestMapping("/api/vendedores")
public class ArccvcController {

	@Autowired
	private IArccvcService service;
	
	@GetMapping("/list/{cia}")
	public ResponseEntity<List<Arccvc>> listaVendedores(@PathVariable("cia") String cia) {
		List<Arccvc> vendedores = new ArrayList<>();
		vendedores= service.listaVende(cia);
		return new ResponseEntity<List<Arccvc>>(vendedores,HttpStatus.OK);
	}
	@PostMapping("/vendedor")
	public ResponseEntity<Arccvc> vendedor(@RequestBody VendedorDTO dto) {		
		//codigo="09152188";
		Arccvc obj = service.traeVendedor(dto);
		
		if(obj == null ) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + dto.getCodigo());
		}
		return new ResponseEntity<Arccvc>(obj, HttpStatus.OK);
	}
	@PostMapping("/vendedor/caja")
	public ResponseEntity<VendedorDTO> vendeCaja(@RequestBody VendedorDTO dto) {		
		//codigo="09152188";
		Arccvc obj = service.traeVendedor(dto);
		VendedorDTO vendedor = new VendedorDTO();
		if(obj == null ) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + dto.getCodigo());
		}
		vendedor = service.traeEmpelado(obj.getIdArc().getCia(), obj.getIdArc().getCodigo());
		if(vendedor.getCodEmp() == null ) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + dto.getCodigo());
		}
		return new ResponseEntity<VendedorDTO>(vendedor, HttpStatus.OK);
	}
	
}
