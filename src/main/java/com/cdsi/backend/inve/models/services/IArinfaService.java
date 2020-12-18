package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.models.entity.Arinfa;
import com.cdsi.backend.inve.models.entity.IdArinfa;

public interface IArinfaService {
	List<Arinfa> getAllArinfas();
	Arinfa createArinfa(Arinfa objAf);
	Arinfa updateArinfa(IdArinfa objIdAf,Arinfa objAf);
	void deleteArinfa(IdArinfa objIdAf);
	//BUSCAMOS UN ARTICULO
	Arinfa findArinfa(IdArinfa objIdAf);
	//PAGINACION
	List<Arinfa> findAll(String cia,String tipo, String clase,String cate);
}
