package com.cdsi.backend.inve.dto;

import java.util.List;

import com.cdsi.backend.inve.models.entity.Arpfoe;
import com.cdsi.backend.inve.models.entity.Arpfol;

public class PedidoDTO {

	private Arpfoe pedido;
	private List<Arpfol> detallePedido;
	
	public Arpfoe getPedido() {
		return pedido;
	}
	public void setPedido(Arpfoe pedido) {
		this.pedido = pedido;
	}
	public List<Arpfol> getDetallePedido() {
		return detallePedido;
	}
	public void setDetallePedido(List<Arpfol> detallePedido) {
		this.detallePedido = detallePedido;
	}
	
	
	
}
