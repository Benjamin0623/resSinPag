package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.dto.StockLibroDTO;
import com.cdsi.backend.inve.models.entity.IdArticulo;

@Repository
public interface ArticuloStockDao extends PagingAndSortingRepository<StockLibroDTO, IdArticulo> {

	// METODO QUE NOS DEVUELVE EL ARTICULO CON SU PRECIO,STOCK Y COMPROMISO
	// Page<StockLibroDTO> pagArtiPreStock(Pageable pageable,@Param("cia") String
	// cia, @Param("cat") String cat);
	
	
	
	
	List<StockLibroDTO> findByCiaAndCatalogoAndAlmacenAndTipo(@Param("cia") String cia,
			@Param("cat") String cat, @Param("alm") String alm, @Param("pre") String pre);
	
	List<StockLibroDTO> findByCiaAndCatalogoAndLineaAndAlmacenAndTipo(@Param("cia") String cia,
			@Param("cat") String cat, @Param("lin") String lin, @Param("pre") String pre, @Param("alm") String alm);

	List<StockLibroDTO> findByCiaAndCatalogoAndLineaAndSubLineaAndAlmacenAndTipo(@Param("cia") String cia,@Param("cat") String cat,
			@Param("lin") String lin,@Param("sub") String sub, @Param("pre") String pre, @Param("alm") String alm);

	List<StockLibroDTO> findByCiaAndCatalogoAndLineaAndSubLineaAndFamAndAlmacenAndTipo(
			@Param("cia") String cia, @Param("cat") String cat, @Param("lin") String lin, @Param("sub") String sub,
			@Param("fam") String fam, @Param("pre") String pre, @Param("alm") String alm);
}
