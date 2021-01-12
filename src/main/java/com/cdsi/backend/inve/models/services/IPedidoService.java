package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.dto.PedidoDTO;
import com.cdsi.backend.inve.models.entity.Arpfoe;
import com.cdsi.backend.inve.models.entity.Arpfol;

public interface IPedidoService {

	Arpfoe registrarPedido(PedidoDTO pedido) throws Exception;
	
	Arpfoe traeCabecera(String cia, String orden) throws Exception;
	
	List<Arpfol> listarDetalle(String cia, String orden);
	
	PedidoDTO traePedido(String cia, String orden) throws Exception;
}
