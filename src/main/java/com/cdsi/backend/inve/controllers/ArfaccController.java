package com.cdsi.backend.inve.controllers;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cdsi.backend.inve.dto.CorrelDTO;
import com.cdsi.backend.inve.dto.PedidoDTO;
import com.cdsi.backend.inve.exception.ModeloNotFoundException;
import com.cdsi.backend.inve.models.entity.Arfacc;
import com.cdsi.backend.inve.models.entity.Arpfoe;
import com.cdsi.backend.inve.models.entity.Arpfol;
import com.cdsi.backend.inve.models.services.IArfaccService;
import com.cdsi.backend.inve.models.services.IPedidoService;

@RestController
@RequestMapping("/api/correlativos")
public class ArfaccController {

	@Autowired
	private IArfaccService service;
	
	@PostMapping
	public ResponseEntity<Object> actualizaCorrel(@Valid @RequestBody CorrelDTO dto)  throws Exception{
		Object obj = service.actualizaCorrel(dto);
		
		return new  ResponseEntity<Object>(obj,HttpStatus.OK);
	}		
}
