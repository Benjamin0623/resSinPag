package com.cdsi.backend.inve.models.services.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdsi.backend.inve.dto.CorrelDTO;
import com.cdsi.backend.inve.models.dao.IArfaccDao;
import com.cdsi.backend.inve.models.services.IArfaccService;
@Service
public class IArfaccServiceImpl implements IArfaccService{

	@Autowired
	private IArfaccDao cab;

	
	@Transactional
	@Override
	public Object actualizaCorrel(CorrelDTO dto) throws Exception {
		// TODO Auto-generated method stub
		return cab.actualizaCorrel(dto.getOrden(), dto.getCia(), dto.getCentro());
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
