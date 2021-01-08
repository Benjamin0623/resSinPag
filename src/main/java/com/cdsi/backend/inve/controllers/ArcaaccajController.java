package com.cdsi.backend.inve.controllers;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cdsi.backend.inve.dto.DatosCajaDTO;
import com.cdsi.backend.inve.exception.ModeloNotFoundException;
import com.cdsi.backend.inve.models.entity.Arcaaccaj;
import com.cdsi.backend.inve.models.services.IArcaaccajService;

@RestController
@RequestMapping("/api/cajas")
public class ArcaaccajController {

	@Autowired
	private IArcaaccajService service;

	@PostMapping
	public ResponseEntity<Void> registrar(@Valid @RequestBody Arcaaccaj caja) throws Exception {
		
		
		Arcaaccaj obj = service.aperturaCaja(caja);

		// localhost:8080/pacientes/5
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdArcaja())
				.toUri();
		return ResponseEntity.created(location).build();
	}

	@PostMapping("/caja")
	public ResponseEntity<Arcaaccaj> cajaActual(@RequestBody DatosCajaDTO dto) throws Exception{

		Arcaaccaj obj = service.buscarCaja(dto);
		if (obj == null) {
			throw new ModeloNotFoundException("CAJA NO APERTURADA " + dto.getCaja());
		}
		return new ResponseEntity<Arcaaccaj>(obj, HttpStatus.OK);
	}
	
}
