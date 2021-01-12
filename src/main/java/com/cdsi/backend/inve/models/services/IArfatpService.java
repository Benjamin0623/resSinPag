package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.models.entity.Arfatp;

public interface IArfatpService {
	/*
	 * List<Arinfa> getAllArinfas(); Arinfa createArinfa(Arinfa objAf); Arinfa
	 * updateArinfa(IdArinfa objIdAf,Arinfa objAf); void deleteArinfa(IdArinfa
	 * objIdAf); //BUSCAMOS UN ARTICULO Arinfa findArinfa(IdArinfa objIdAf);
	 */
	// PAGINACION
	List<Arfatp> findAll(String cia);

	List<Arfatp> listaPven(String cia, String pvta);

	// METODO QUE NOS BUSCA UNA TRANSACCION ESPECIFICA
	Arfatp buscarTransac(String cia, String tipo, String pvta);
}
