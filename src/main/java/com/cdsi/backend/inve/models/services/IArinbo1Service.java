package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.models.entity.Arinbo1;

public interface IArinbo1Service {
	/*List<Arinfa> getAllArinfas();
	Arinfa createArinfa(Arinfa objAf);
	Arinfa updateArinfa(IdArinfa objIdAf,Arinfa objAf);
	void deleteArinfa(IdArinfa objIdAf);
	//BUSCAMOS UN ARTICULO
	Arinfa findArinfa(IdArinfa objIdAf);*/
	//PAGINACION
	List<Arinbo1> findAll(String cia);
}
