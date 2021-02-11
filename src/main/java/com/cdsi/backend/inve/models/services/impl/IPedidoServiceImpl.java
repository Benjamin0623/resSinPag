package com.cdsi.backend.inve.models.services.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdsi.backend.inve.dto.PedidoDTO;
import com.cdsi.backend.inve.exception.ModeloNotFoundException;
import com.cdsi.backend.inve.models.dao.IArpfoeDao;
import com.cdsi.backend.inve.models.dao.IArpfolDao;
import com.cdsi.backend.inve.models.entity.Arpfoe;
import com.cdsi.backend.inve.models.entity.Arpfol;
import com.cdsi.backend.inve.models.services.IPedidoService;
@Service
public class IPedidoServiceImpl implements IPedidoService{

	@Autowired
	private IArpfoeDao cab;
	@Autowired
	private IArpfolDao det;
	
	@Transactional
	@Override
	public Arpfoe registrarPedido(PedidoDTO pedido) throws Exception{
		// TODO Auto-generated method stub
		//pedido.getPedido().getIdArpfoe().setNoOrden(cab.noOrden(pedido.getPedido().getIdArpfoe().getCia(), pedido.getPedido().getCentro()));
		pedido.getPedido().setfRecepcion(pedido.getPedido().getFechaEntrega());
		pedido.getPedido().setfAprobacion(pedido.getPedido().getFechaEntrega());
		pedido.getPedido().setFechaEntrega(pedido.getPedido().getFechaEntrega());
		pedido.getPedido().setFechaEntregaReal(pedido.getPedido().getFechaEntrega());
		pedido.getPedido().setFechaVence(pedido.getPedido().getFechaEntrega().plusDays(1));
		cab.save(pedido.getPedido());
		Arpfoe obj = cab.findById(pedido.getPedido().getIdArpfoe()).orElse(null);
		if(obj == null) {
		throw new ModeloNotFoundException("No se pudo registrar el detalle del pedido N°"+ pedido.getPedido().getIdArpfoe().getNoOrden());
		}
		pedido.getDetallePedido().forEach(x->{
			x.getIdArpfol().setCia(obj.getIdArpfoe().getCia());
			x.getIdArpfol().setNoOrden(obj.getIdArpfoe().getNoOrden());
			det.save(x);
		});
		
		return pedido.getPedido();
	}
	
	@Override
	public Arpfoe traeCabecera(String cia, String orden) throws Exception {
		// TODO Auto-generated method stub
		return cab.traePedido(cia, orden);
	}
	
	@Override
	public List<Arpfoe> listaPedidos(String cia) {
		// TODO Auto-generated method stub
		return cab.listaPedidos(cia);
	}
	
	@Override
	public List<Arpfol> listarDetalle(String cia, String orden) throws Exception {
		// TODO Auto-generated method stub
		
		Arpfoe obj = cab.traePedido(cia, orden);//this.traeCabecera(cia, orden);
		

		return 	det.listarDetalle(obj.getIdArpfoe().getCia(),obj.getIdArpfoe().getNoOrden());
	}

	@Override
	public PedidoDTO traePedido(String cia, String orden) throws Exception {
		// TODO Auto-generated method stub
		
		PedidoDTO pedido = new PedidoDTO();
		pedido.setPedido(cab.traePedido(cia, orden));
		pedido.setDetallePedido(det.listarDetalle(cia, orden));
		
		
		return pedido;
	}

	@Override
	public String noOrden(String cia, String centro) throws Exception {
		// TODO Auto-generated method stub
		return cab.noOrden(cia, centro);
	}
	
	
	

	

	/*@Override
	public List<PedidoDTO> listapedido(String cia, String orden) throws Exception {
		// TODO Auto-generated method stub
		List<PedidoDTO> pedido = new ArrayList<>();
		
		pedido.forEach(x->{
			x.setPedido(cab.traePedido(cia, orden));
			pedido.add(x);
		});
		
		return pedido;
	}*/


}
