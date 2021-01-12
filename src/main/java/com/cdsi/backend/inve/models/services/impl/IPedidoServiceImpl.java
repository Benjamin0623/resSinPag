package com.cdsi.backend.inve.models.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		
		cab.save(pedido.getPedido());
		Arpfoe obj = cab.findById(pedido.getPedido().getIdArpfoe()).orElse(null);
		if(obj != null) {
			pedido.getDetallePedido().forEach(x->{
				det.save(x);
			});
		}else {
			throw new ModeloNotFoundException("No se pudo registrar el detalle del pedido N°"+ pedido.getPedido().getIdArpfoe().getNoOrden());
		}
		return pedido.getPedido();
	}
	
	@Override
	public Arpfoe traeCabecera(String cia, String orden) throws Exception {
		// TODO Auto-generated method stub
		return cab.traePedido(cia, orden);
	}

	@Override
	public List<Arpfol> listarDetalle(String cia, String orden) {
		// TODO Auto-generated method stub
		
		Arpfoe obj = cab.traePedido(cia, orden);

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
