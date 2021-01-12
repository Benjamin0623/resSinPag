package com.cdsi.backend.inve.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.models.entity.Arfatp;
import com.cdsi.backend.inve.models.services.IArfatpService;

@RestController
@RequestMapping("/api/listaprecios")
public class ArfatpController {

	@Autowired
	private IArfatpService arfServ;

	@GetMapping("/list/{cia}")
	// @Secured({"ROLE_ADMIN","ROLE_VENDEDOR","ROLE_USER"})
	public List<Arfatp> listaPrecios(@PathVariable("cia") String cia) {
		return arfServ.findAll(cia);
	}

	@GetMapping("/listventa/{cia}")
	// @Secured({"ROLE_ADMIN","ROLE_VENDEDOR","ROLE_USER"})
	public ResponseEntity<List<Arfatp>> listaPreciosVenta(@PathVariable("cia") String cia) {
		List<Arfatp> lis = arfServ.listaPven(cia, "S");
		return new ResponseEntity<List<Arfatp>>(lis, HttpStatus.OK);
	}

	@GetMapping("/get/{cia}/{tipo}/{pvta}")
	public ResponseEntity<Arfatp> buscarListPrecio(@PathVariable("cia") String cia, @PathVariable("tipo") String tipo,
			@PathVariable("pvta") String pvta) {
		Arfatp obj = arfServ.buscarTransac(cia, tipo, pvta);
		return new ResponseEntity<Arfatp>(obj, HttpStatus.OK);
	}

}
