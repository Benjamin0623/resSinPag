package com.cdsi.backend.inve.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.models.entity.Arfatpe;
import com.cdsi.backend.inve.models.entity.IdArfatpe;
import com.cdsi.backend.inve.models.services.IArfatpeService;

@RestController
@RequestMapping("/api/trans")
public class ArfatpeController {
   
	@Autowired
	private IArfatpeService service;
	
	@GetMapping("/get/{cia}/{cod}")
	public Arfatpe traerTrasaccion(@PathVariable("cia") String cia, @PathVariable("cod") String cod) {
		IdArfatpe idArfa = new IdArfatpe();
		idArfa.setCia(cia);
		idArfa.setCodPed(cod);
		
		return service.findByIdArfatpe(idArfa);
	}
	
	@GetMapping("/list/{cia}")
	public List<Arfatpe> listaTrasaccion(@PathVariable("cia") String cia){
		return service.listarTransacXCia(cia);
	}
}
