package com.cdsi.backend.inve.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cdsi.backend.inve.dto.StockLibroDTO;
import com.cdsi.backend.inve.models.entity.Articulo;
import com.cdsi.backend.inve.models.entity.IdArticulo;

public interface IArticuloService {

	List<Articulo> getAllArticulos();

	Articulo createArticulo(Articulo articulo);

	Articulo updateArticulo(String cia, String cod, Articulo objA);

	void deleteArticulo(IdArticulo objIdAr);
	
	//BUSCAR UN ARTICULO
	Articulo findArticulo(IdArticulo objIdAr);
	
	//BUSCAR UN ARTICULO POR SU CIA Y CODIGO
	Articulo findByCiaAndCod(String cia, String cod);
	
	//Pagination
    Page<Articulo> findAll(Pageable pageable,String cia,String cat);
    

    
     // PAGINACION DE ARTICULOS CON SU PRECIO Y STOCK Y LIKE DESCRIPCION
    Page<Object> pagArtiPreStockAndDesc(Pageable pageable,String cia,String cat,String desc);
    
    // PAGINACION DE ARTICULOS CON SU PRECIO Y STOCK Y CODIGO
    Page<Object> pagArtiPreStockAndCodigo(Pageable pageable,String cia,String cat,String cod);
    
    //Pagination
    Page<Articulo> findAllArti(Pageable pageable,String cia,String codigo);
    
    //VAMOS A BUSCAR UNOS ARTICULOS POR SU CODIGO
    List<Articulo> findCodArti(String cia,String codigo);
    
    //VAMOS A BUSCAR UN ARTICULOS POR SU DESCRIPCION
    List<Articulo> likeDescripArti(String cia,String descrip);
    
    //PRECIO DEL ARTICULO
    String precioArticulo(String cia, String arti);
    
    //SALDO DE ARTICULO
    String saldoArticulo(String cia, String arti);
    
    //SALDO DE ARTICULO
    String saldoComprometido(String cia, String arti);
}
