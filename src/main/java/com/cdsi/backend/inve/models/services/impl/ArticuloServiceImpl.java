package com.cdsi.backend.inve.models.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdsi.backend.inve.dto.StockLibroDTO;
import com.cdsi.backend.inve.models.dao.IArticuloDao;
import com.cdsi.backend.inve.models.entity.Articulo;
import com.cdsi.backend.inve.models.entity.IdArticulo;
import com.cdsi.backend.inve.models.services.IArticuloService;


@Service
public class ArticuloServiceImpl implements IArticuloService {
	
	@Autowired
	private IArticuloDao artiDao;
	private final Logger log = LoggerFactory.getLogger(ArticuloServiceImpl.class);
	
	@Override
	@Transactional(readOnly = true)
	public List<Articulo> getAllArticulos() {
		List<Articulo> objAs = new ArrayList<Articulo>();
		artiDao.findAll().iterator().forEachRemaining(objAs::add);
		return objAs;
	}

	@Override
	@Transactional
	public Articulo createArticulo(Articulo articulo) {
		return artiDao.save(articulo);
	}

	@Override
	@Transactional
	public Articulo updateArticulo(String cia, String cod, Articulo articulo) {
		// TODO Auto-generated method stub
		Articulo objA = findByCiaAndCod(cia, cod);
		objA.setIdArti (articulo.getIdArti());
		objA.setCatalogo (articulo.getCatalogo());
		objA.setLinea( articulo.getLinea() );
		objA.setArincat(articulo.getArincat() );
		objA.setArinfa(articulo.getArinfa());
		objA.setArtiProve(articulo.getArtiProve());
		objA.setDescripcion(articulo.getDescripcion());
		objA.setArtiNacional(articulo.getArtiNacional());
		objA.setIndLote(articulo.getIndLote());
		objA.setMedida(articulo.getMedida());
		objA.setMarca(articulo.getMarca());
		objA.setVigente(articulo.getVigente());
		objA.setOrigen(articulo.getOrigen());
		objA.setCodClasif(articulo.getCodClasif());
		objA.setCodTipArt(articulo.getCodTipArt());
		objA.setColeccion(articulo.getColeccion());
		objA.setConceptoCta(articulo.getConceptoCta());
		objA.setIndCodBarra(articulo.getIndCodBarra());
		objA.setImpVen(articulo.getImpVen());
		objA.setTipoAfectacion(articulo.getTipoAfectacion());
		objA.setFoto(articulo.getFoto());
		return artiDao.save(objA);
	}

	@Override
	public void deleteArticulo(IdArticulo objIdAr) {
		// TODO Auto-generated method stub
		artiDao.delete(findArticulo(objIdAr));
	}
	
	@Override
	public Articulo findArticulo(IdArticulo objIdAr) {
		return artiDao.findByIdArti(objIdAr);
	}

	@Override
	public Page<Articulo> findAll(Pageable pageable,String cia,String cat) {
		// TODO Auto-generated method stub
		return artiDao.findAll(pageable,cia,cat);
	}

	@Override
	public Page<Articulo> findAllArti(Pageable pageable, String cia, String codigo) {
		// TODO Auto-generated method stub
		return artiDao.findAllArti(pageable, cia, codigo);
	}
	
	@Override
	public List<Articulo> findCodArti(String cia, String codigo) {
		// TODO Auto-generated method stub
		return artiDao.findCodigoArticulo(cia, codigo);
	}

	@Override
	public List<Articulo> likeDescripArti(String cia, String descrip) {
		// TODO Auto-generated method stub
		return artiDao.findDescripcionArticulo(cia, descrip);
	}

	@Override
	public String precioArticulo(String cia, String arti) {
		return artiDao.precioArtiCia(cia, arti);
	}

	@Override
	public String saldoArticulo(String cia, String arti) {
		return artiDao.saldoArticulo(cia, arti);
	}

	@Override
	public String saldoComprometido(String cia, String arti) {
		return artiDao.saldoComprometido(cia, arti);
	}


	@Override
	public Page<Object> pagArtiPreStockAndDesc(Pageable pageable, String cia, String cat, String desc) {
		return artiDao.pagArtiPreStockAndDesc(pageable, cia, cat, desc);
	}

	@Override
	public Page<Object> pagArtiPreStockAndCodigo(Pageable pageable, String cia, String cat, String cod) {
		return artiDao.pagArtiPreStockAndCod(pageable, cia, cat, cod);
	}
	// BUSCAR  ARTICULOS POR CIA Y CODIGO
	@Override
    @Transactional(readOnly = true)
	public Articulo findByCiaAndCod(String cia, String cod) {
		log.info("desde artiServiImple cia : "+cia+" ,cod : "+cod);
		return artiDao.buscarArtiCiaAndCod(cia, cod);
	}


}
