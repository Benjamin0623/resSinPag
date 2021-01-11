package com.cdsi.backend.inve.controllers;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cdsi.backend.inve.dto.CajaDTO;
import com.cdsi.backend.inve.dto.DatosCajaDTO;
import com.cdsi.backend.inve.exception.ModeloNotFoundException;
import com.cdsi.backend.inve.models.entity.Arcaaccaj;
import com.cdsi.backend.inve.models.entity.IdArcaaccaj;
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
	@PutMapping
	public ResponseEntity<Arcaaccaj> modifical(@Valid @RequestBody Arcaaccaj caja) throws Exception {
		
		
		Arcaaccaj obj = service.actualizaCaja(caja);

		return new ResponseEntity<Arcaaccaj>(obj,HttpStatus.OK);
	}

	@PostMapping("/valida/caja")
	public ResponseEntity<Arcaaccaj> cajaActual(@RequestBody DatosCajaDTO dto) throws Exception{

		Arcaaccaj obj = service.buscarCaja(dto);
		if (obj == null) {
			throw new ModeloNotFoundException("CAJA NO APERTURADA " + dto.getCaja());
		}
		return new ResponseEntity<Arcaaccaj>(obj, HttpStatus.OK);
	}
	
	@PostMapping("/traerCaja")
	public ResponseEntity<Arcaaccaj> cajaSeleccionada(@RequestBody IdArcaaccaj id) throws Exception{

		Arcaaccaj obj = service.findById(id);
		if (obj == null) {
			throw new ModeloNotFoundException("CAJA NO APERTURADA " + id.getCodCaja());
		}
		return new ResponseEntity<Arcaaccaj>(obj, HttpStatus.OK);
	}
	
	@PostMapping("/caja")
	public ResponseEntity<List<Arcaaccaj>> caja(@RequestBody DatosCajaDTO dto) throws Exception{

		List<Arcaaccaj> obj = new ArrayList<>();
				obj = service.caja(dto);
		/*if (obj == new ArrayList<Arcaaccaj>()) {
			throw new ModeloNotFoundException("NO HAY CAJA ASIGNADA" + dto.getCajera());
		}*/
		return new ResponseEntity<List<Arcaaccaj>>(obj, HttpStatus.OK);
	}
	
	@PostMapping("/total")
	public ResponseEntity<List<Arcaaccaj>> totalCajas(@RequestBody DatosCajaDTO dto) throws Exception{

		List<Arcaaccaj> obj = service.totalCajas(dto);
		/*if (obj == new ArrayList<Arcaaccaj>()) {
			throw new ModeloNotFoundException("CAJA EXISTEN CAJAS ABIERTAS EN LAS FECHAS "+ dto.getFecha()+" - "+ dto.getFechaSgte());
		}*/
		return new ResponseEntity<List<Arcaaccaj>>(obj, HttpStatus.OK);
	}
	@PostMapping("/eliminar")
	public ResponseEntity<Void> eliminar(@RequestBody IdArcaaccaj id) throws Exception{
		Arcaaccaj obj = service.findById(id);
		if(obj.getIdArcaja() == null ) {
			throw new ModeloNotFoundException("ID de caja"+id.getCodCaja()+"no encontrado" + id.getCod_aper());
		}
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	@GetMapping("/{cia}/{centro}")
	public ResponseEntity<List<CajaDTO>> listaCajas(@PathVariable("cia")String cia,@PathVariable("centro")String centro) throws Exception{
		List<CajaDTO> obj = service.listaCajas(cia, centro);
	
		return new ResponseEntity<List<CajaDTO>>(obj,HttpStatus.OK);
	}
}
