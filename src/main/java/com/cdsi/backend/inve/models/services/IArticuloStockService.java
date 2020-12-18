package com.cdsi.backend.inve.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import com.cdsi.backend.inve.dto.StockLibroDTO;

public interface IArticuloStockService {

	// PAGINACION DE ARTICULOS CON SU PRECIO Y STOCK
	// Page<StockLibroDTO> pagArtiPrecStock(Pageable pageable,String cia,String
	// cat);

	List<StockLibroDTO> pagArtiFind(String cia, String cat, String lin, String sub, String fam, String pre, String alm);

	List<StockLibroDTO> pagArtiFindCatalogo(String cia, String cat, String alm,String pre);
	
	List<StockLibroDTO> pagArtiFindLinea(String cia, String cat, String lin, String alm,String pre);

	List<StockLibroDTO> pagArtiFindSubLinea(String cia, String cat, String lin, String sub, String alm,String pre);
}
