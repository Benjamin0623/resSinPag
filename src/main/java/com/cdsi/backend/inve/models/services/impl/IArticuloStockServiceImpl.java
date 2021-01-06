package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.dto.StockLibroDTO;
import com.cdsi.backend.inve.models.dao.ArticuloStockDao;
import com.cdsi.backend.inve.models.dao.IArticuloDao;
import com.cdsi.backend.inve.models.services.IArticuloStockService;

@Service
public class IArticuloStockServiceImpl implements IArticuloStockService{

	@Autowired
	private ArticuloStockDao artiDao;
	private final Logger log = LoggerFactory.getLogger(ArticuloServiceImpl.class);
	
	/*@Override
	public Page<StockLibroDTO> pagArtiPrecStock(Pageable pageable, String cia, String cat) {
		return artiDao.pagArtiPreStock(pageable, cia, cat);
	}*/

	@Override
	public List<StockLibroDTO> pagArtiFind(String cia, String cat, String lin, String sub, String fam, String alm, String pre) {
		
		return artiDao.findByCiaAndCatalogoAndLineaAndSubLineaAndFamAndAlmacenAndTipo(cia, cat, lin, sub, fam, alm, pre);
	}

	@Override
	public List<StockLibroDTO> pagArtiFindLinea(String cia, String cat, String lin, String alm, String pre) {
		// TODO Auto-generated method stub
		return artiDao.findByCiaAndCatalogoAndLineaAndAlmacenAndTipo(cia, cat, lin, alm, pre);
	}

	@Override
	public List<StockLibroDTO> pagArtiFindSubLinea(String cia, String cat, String lin, String sub,
			String alm, String pre) {
		// TODO Auto-generated method stub
		return artiDao.findByCiaAndCatalogoAndLineaAndSubLineaAndAlmacenAndTipo(cia, cat, lin, sub, alm, pre);
	}

	@Override
	public List<StockLibroDTO> pagArtiFindCatalogo(String cia, String cat, String alm, String pre) {
		// TODO Auto-generated method stub
		return artiDao.findByCiaAndCatalogoAndAlmacenAndTipo(cia, cat, alm, pre);
	}

	

}
