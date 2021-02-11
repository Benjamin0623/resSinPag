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
import com.cdsi.backend.inve.models.services.IPedidoService;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

	@Autowired
	private IPedidoService service;
	
	@PostMapping
	public ResponseEntity<Void> RegistrarPedido(@Valid @RequestBody PedidoDTO pedido) throws Exception {
		Arpfoe obj = service.registrarPedido(pedido);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(obj.getIdArpfoe().getNoOrden()).toUri();

		return ResponseEntity.created(location).build();
	}
	
	@GetMapping("/cabecera/{cia}/{orden}")
	public ResponseEntity<Arpfoe> traeCabecera(@PathVariable("cia") String cia, @PathVariable("orden") String orden) throws Exception{
		Arpfoe obj = service.traeCabecera(cia, orden);
		if(obj == null ) {
			throw new ModeloNotFoundException("N° " + orden + " No encontrado");
		}
		return new ResponseEntity<Arpfoe>(obj, HttpStatus.OK);
	}
	@GetMapping("/{cia}")
	public ResponseEntity<List<Arpfoe>> listaPedidos(@PathVariable("cia") String cia)  throws Exception{
		List<Arpfoe> lista = new ArrayList<>();
		lista = service.listaPedidos(cia);
		
		return new  ResponseEntity<List<Arpfoe>>(lista,HttpStatus.OK);
	}
	@GetMapping("/detalle/{cia}/{orden}")
	public ResponseEntity<List<Arpfol>> listarDetalle(@PathVariable("cia") String cia, @PathVariable("orden") String orden) throws Exception{
		List<Arpfol> lista = service.listarDetalle(cia, orden);
		if(lista.isEmpty() == true ) {
			throw new ModeloNotFoundException("No existe detalle para la orden N° " + orden);
		}
		return new ResponseEntity<List<Arpfol>>(lista, HttpStatus.OK);
	}
	@GetMapping("/pedido/{cia}/{orden}")
	public ResponseEntity<PedidoDTO> traePedido(@PathVariable("cia") String cia, @PathVariable("orden") String orden)  throws Exception{
		PedidoDTO lista = new PedidoDTO();
		lista = service.traePedido(cia, orden);
		
		return new  ResponseEntity<PedidoDTO>(lista,HttpStatus.OK);
	}
	@GetMapping("/orden/{cia}/{centro}")
	public ResponseEntity<String> noOrden(@PathVariable("cia") String cia, @PathVariable("centro") String centro)  throws Exception{
		String orden="";
		orden = service.noOrden(cia, centro);
		
		return new  ResponseEntity<String>(orden,HttpStatus.OK);
	}
}
