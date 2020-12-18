package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.dto.StockLibroDTO;
import com.cdsi.backend.inve.models.entity.Articulo;
import com.cdsi.backend.inve.models.entity.IdArticulo;

@Repository
public interface IArticuloDao extends PagingAndSortingRepository<Articulo,IdArticulo> {
	
	//METODO QUE NOS PERMITE TRAER TODOS LOS DATOS PARA LA TABLA
	@Query("SELECT a FROM Articulo a WHERE a.idArti.cia = :cia and a.idArti.noArti = :codigo")
	Page<Articulo> findAllArti(Pageable pageable,@Param("cia") String cia,@Param("codigo") String codigo);
	
	//METODO QUE NOS PERMITE TRAER TODOS LOS DATOS PARA LA TABLA
	@Query("SELECT a FROM Articulo a WHERE a.idArti.cia = :cia AND a.catalogo.idCata.codigo = :cat")
	Page<Articulo> findAll(Pageable pageable,@Param("cia") String cia, @Param("cat") String cat);
	
	
	// METODO QUE NOS PERMITE BUSCAR UN ARTICULO CON PRECIO POR NOMBRE DEL ARTICULO (PAGINACION)
	@Query(value = "SELECT NO_ARTI,DESCRIPCION,MEDIDA,MARCA,INVE.P_FILTRAR_PRECIOS_LISTA(:cia,'F8',NO_ARTI) PRECIO,Inve.F_Saldo_Articulo(:cia, '1L001', NO_ARTI, SysDate) STOCK, INVE.F_Saldo_Comprometido(:cia, NO_ARTI, null, '1L001', Null) COMPROMISO FROM INVE.ARINDA1 WHERE NO_CIA = :cia AND TIPO_ARTI = :cat AND DESCRIPCION LIKE '%:desc%' AND VIGENTE='S'",
			   countQuery = "SELECT count(*) FROM INVE.ARINDA1 WHERE NO_CIA = :cia AND TIPO_ARTI = :cat AND DESCRIPCION LIKE '%:desc%' AND VIGENTE='S'",
			   nativeQuery = true)
	Page<Object> pagArtiPreStockAndDesc(Pageable pageable,@Param("cia") String cia, @Param("cat") String cat, @Param("desc") String desc);
	
	
	// METODO QUE NOS PERMITE BUSCAR UN ARTICULO POR CODIGO
	@Query(value = "SELECT NO_ARTI,DESCRIPCION,MEDIDA,MARCA,INVE.P_FILTRAR_PRECIOS_LISTA(:cia,'F8',NO_ARTI) PRECIO,Inve.F_Saldo_Articulo(:cia, '1L001', NO_ARTI, SysDate) STOCK, INVE.F_Saldo_Comprometido(:cia, NO_ARTI, null, '1L001', Null) COMPROMISO FROM INVE.ARINDA1 WHERE NO_CIA = :cia AND NO_ARTI = :cod AND TIPO_ARTI = :cat AND 0 < Inve.F_Saldo_Articulo(:cia, '1L001', NO_ARTI, SysDate) AND VIGENTE='S'",
		   countQuery = "SELECT count(*) FROM INVE.ARINDA1 WHERE NO_CIA = :cia AND TIPO_ARTI = :cat AND NO_ARTI = :cod AND 0 < Inve.F_Saldo_Articulo(:cia, '1L001', NO_ARTI, SysDate) AND VIGENTE='S'",
		   nativeQuery = true)
	Page<Object> pagArtiPreStockAndCod(Pageable pageable,@Param("cia") String cia, @Param("cat") String cat, @Param("cod") String cod);
	
	@Query(nativeQuery = true , value = "SELECT INVE.P_FILTRAR_PRECIOS_LISTA(:cia,'F8',:arti) PRECIO FROM DUAL")
	String precioArtiCia(@Param("cia") String cia, @Param("arti") String arti);
	
	@Query(nativeQuery = true , value = "SELECT Inve.F_Saldo_Articulo(:cia, '1L001', :arti, SysDate) SG FROM DUAL")
	String saldoArticulo(@Param("cia") String cia, @Param("arti") String arti);
	
	@Query(nativeQuery = true , value = "SELECT INVE.F_Saldo_Comprometido(:cia, :arti, null, '1L001', Null) SC FROM DUAL")
	String saldoComprometido(@Param("cia") String cia, @Param("arti") String arti);
	
	//VAMOS A TRAER UN ARTICULO
	Articulo findByIdArti(IdArticulo idArti);
	
	// VAMOS A TRER UN ARTICULO POR SU COMPAÑIA Y CODIGO
	@Query("SELECT a FROM Articulo a WHERE a.idArti.cia = :cia AND a.idArti.noArti = :cod")
	Articulo buscarArtiCiaAndCod(@Param("cia") String cia, @Param("cod") String cod);
	
	//VAMOS A BUSCAR O TRAER TODOS LOS CODIGOS DEL ARTICULO SEGUN COMO ESCRIBE EL CODIGO
	@Query("SELECT a FROM Articulo a WHERE a.idArti.cia = :cia AND a.idArti.noArti LIKE '%:cod%'")
	List<Articulo> findCodigoArticulo(@Param("cia") String cia,@Param("cod") String cod);
	
   //VAMOS A TRAER TODOS LOS ARTICULOS SEGUN LA DESCRIPCION DEL ARTICULO
	@Query("SELECT a FROM Articulo a WHERE a.idArti.cia = :cia AND a.catalogo.idCata.codigo = '1' AND a.descripcion LIKE %:dscri%")
	List<Articulo> findDescripcionArticulo(@Param("cia") String cia,@Param("dscri") String dscri);
	
}
