package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ARINDA1")
public class Articulo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private IdArticulo idArti;

	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "NO_CIA",referencedColumnName = "NO_CIA", insertable=false, updatable=false),
		@JoinColumn(name = "TIPO_ARTI",referencedColumnName = "TIPO",insertable=false, updatable=false),
		@JoinColumn(name = "CLASE",referencedColumnName = "CODIGO",insertable=false, updatable=false)
	})
	private Linea linea;
	
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "NO_CIA", insertable=false, updatable=false),
		@JoinColumn(name = "TIPO_ARTI",insertable=false, updatable=false)
	})
	private Catalogo catalogo;

	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "NO_CIA",referencedColumnName = "NO_CIA", insertable=false, updatable=false),
		@JoinColumn(name = "TIPO_ARTI",referencedColumnName = "TIPO",insertable=false, updatable=false),
		@JoinColumn(name = "CLASE",referencedColumnName = "CLASE",insertable=false, updatable=false),
		@JoinColumn(name = "CATEGORIA",referencedColumnName = "CODIGO",insertable=false, updatable=false)
	})
	private Arincat arincat;
	
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "NO_CIA",referencedColumnName = "NO_CIA", insertable=false, updatable=false),
		@JoinColumn(name = "TIPO_ARTI",referencedColumnName = "TIPO",insertable=false, updatable=false),
		@JoinColumn(name = "CLASE",referencedColumnName = "CLASE",insertable=false, updatable=false),
		@JoinColumn(name = "CATEGORIA",referencedColumnName = "CATEGORIA",insertable=false, updatable=false),
		@JoinColumn(name = "FAMILIA",referencedColumnName = "CODIGO",insertable=false, updatable=false)
	})
	private Arinfa arinfa;
	
	@Column(name ="ARTI_PROVE")
	private String artiProve;
	
	private String descripcion;
	
	@Column(name ="ARTI_NACIONAL")
	private String artiNacional;
	
	@Column(name = "IND_LOTE")
	private String indLote;
	
	private String medida;
	private String marca;
	private String vigente;
	private String origen;
	
	@Column(name="COD_CLASIF")
	private String codClasif;
	
	@Column(name="COD_TIP_ART")
	private String codTipArt;
	
	private String coleccion;
	
	@Column(name="CONCEPTO_CTA")
	private String conceptoCta;
	
	@Column(name="IND_COD_BARRA")
	private String indCodBarra;
	
	@Column(name="IMP_VEN")
	private String impVen;
		
	@Column(name = "TIPO_AFECTACION")
	private String tipoAfectacion;
	
	// @Column(name = "RUTA_ARCHIVO_ARTI")
	private String foto;
	
	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public IdArticulo getIdArti() {
		return idArti;
	}

	public void setIdArti(IdArticulo idArti) {
		this.idArti = idArti;
	}

	public Linea getLinea() {
		return linea;
	}

	public void setLinea(Linea linea) {
		this.linea = linea;
	}

	public Catalogo getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(Catalogo catalogo) {
		this.catalogo = catalogo;
	}

	public Arincat getArincat() {
		return arincat;
	}

	public void setArincat(Arincat arincat) {
		this.arincat = arincat;
	}

	public Arinfa getArinfa() {
		return arinfa;
	}

	public void setArinfa(Arinfa arinfa) {
		this.arinfa = arinfa;
	}

	public String getArtiProve() {
		return artiProve;
	}

	public void setArtiProve(String artiProve) {
		this.artiProve = artiProve;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getArtiNacional() {
		return artiNacional;
	}

	public void setArtiNacional(String artiNacional) {
		this.artiNacional = artiNacional;
	}

	public String getIndLote() {
		return indLote;
	}

	public void setIndLote(String indLote) {
		this.indLote = indLote;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getVigente() {
		return vigente;
	}

	public void setVigente(String vigente) {
		this.vigente = vigente;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getCodClasif() {
		return codClasif;
	}

	public void setCodClasif(String codClasif) {
		this.codClasif = codClasif;
	}

	public String getCodTipArt() {
		return codTipArt;
	}

	public void setCodTipArt(String codTipArt) {
		this.codTipArt = codTipArt;
	}

	public String getColeccion() {
		return coleccion;
	}

	public void setColeccion(String coleccion) {
		this.coleccion = coleccion;
	}

	public String getConceptoCta() {
		return conceptoCta;
	}

	public void setConceptoCta(String conceptoCta) {
		this.conceptoCta = conceptoCta;
	}

	public String getIndCodBarra() {
		return indCodBarra;
	}

	public void setIndCodBarra(String indCodBarra) {
		this.indCodBarra = indCodBarra;
	}

	public String getImpVen() {
		return impVen;
	}

	public void setImpVen(String impVen) {
		this.impVen = impVen;
	}

	public String getTipoAfectacion() {
		return tipoAfectacion;
	}

	public void setTipoAfectacion(String tipoAfectacion) {
		this.tipoAfectacion = tipoAfectacion;
	}
		
}
