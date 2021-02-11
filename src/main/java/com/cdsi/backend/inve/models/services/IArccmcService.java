package com.cdsi.backend.inve.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cdsi.backend.inve.dto.DatosClienteDTO;
import com.cdsi.backend.inve.models.entity.Arccmc;
import com.cdsi.backend.inve.models.entity.IdArccmc;


public interface IArccmcService {

	Arccmc createArccmc(Arccmc articulo);

	Arccmc updateArccmc(IdArccmc objIdArc, Arccmc objA);

	void deleteArccmc(IdArccmc objIdArc);
	
	//BUSCAR UN ARTICULO
	Arccmc findArccmc(IdArccmc objIdArc);
	
	//Pagination de los clientes por compañia
	List<Arccmc> findPagByCia(String cia);   
    
    //VAMOS A BUSCAR UN CLIENTES POR SU DESCRIPCION
    List<Arccmc> buscaClienteNombre(DatosClienteDTO dto);
    
    Arccmc buscaClienteDocumento(DatosClienteDTO dto);
}
