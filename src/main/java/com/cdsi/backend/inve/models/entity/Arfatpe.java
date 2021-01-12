package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Arfatpe implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private IdArfatpe idArfatpe;
	
	@Column(name = "COD_CLAS_PED", length = 3)
	private String clasPed;
	
	@Column( length = 50)
	private String descripcion;
	
	@Column(name = "TIPO_ARTI", length = 3)
	private String tipArti;
	
	@Column(name = "IND_DOC_REF", length = 1)
	private String indDoRef;
	
	@Column(name = "TIPO_DOC_REF", length = 2)
	private String tipDcRe;
	
	@Column(name = "IND_CLI_ESPEC", length = 1)
	private String indCliEs;
	
	@Column(name = "NO_CLIENTE_ESPEC", length = 11)
	private String cliEspec;
	
	@Column(name = "IND_CLI_DIR_ESPC", length = 1)
	private String indCliDiEsp;
	
	@Column(name = "IND_NOMB_CLI", length = 1)
	private String indNomCli;
	
	@Column(name = "IND_DIRE_CLI", length = 1)
	private String indDirCli;
	
	@Column(name = "IND_LISTA_PREC", length = 1)
	private String indLisPre;
	
	@Column(name = "IND_DSCTO_A", length = 1)
	private String indDsctA;
	
	@Column(name = "IND_DSCTO_B", length = 1)
	private String indDsctB;
	
	@Column(name = "IND_PED_VALORIZA", length = 1)
	private String indPedValor;
	
	@Column(name = "IND_COD_FPAGO", length = 1)
	private String indCodFPago;
	
	@Column(name = "IND_VENDEDOR", length = 1)
	private String indVendedor;
	
	@Column(name = "IND_IGV", length = 1)
	private String indIgv;
	
	@Column(name = "IND_GUIA_REM ", length = 1)
	private String indGuiaRem;
	
	@Column(name = "IND_BOLETA", length = 1)
	private String indBoleta;
	
	@Column(name = "IND_FACTURA", length = 1)
	private String indFactura;
	
	@Column(name = "TIPO_M", length = 4)
	private String tipoM;
	
	@Column(name = "ALMA_DEST", length = 5)
	private String almaDest;
	
	@Column(name = "MOT_SUNAT", length = 3)
	private String motSunar;
	
	@Column(name = "IND_INCOTERMS", length = 1)
	private String indIncoterms;
	
	@Column(name = "IND_TRANS_EXTER", length = 1)
	private String indTraExt;
	
	@Column(name = "IND_ALMA_ORIGEN", length = 1)
	private String indAlmaOrigen;
	
	@Column(name = "IND_ALMA_DESTINO", length = 1)
	private String indAlmaDestino;
	
	@Column(name = "COD_FPAGO", length = 1)
	private String codFpago;
	
	@Column(name = "COD_ENTREG_ESPEC", length = 3)
	private String codEntreEsp;
	
	@Column(name = "COD_OBSE", length = 1)
	private String codObse;
	
	@Column(name = "IND_COD_OBSE", length = 1)
	private String indCodObs;
	
	@Column(name = "TIPO_OBSE", length = 1)
	private String tipoObs;
	
	@Column(name = "IND_VTA_ANTICIPADA", length = 1)
	private String indVtaAntici;

	public IdArfatpe getIdArfatpe() {
		return idArfatpe;
	}

	public void setIdArfatpe(IdArfatpe idArfatpe) {
		this.idArfatpe = idArfatpe;
	}

	public String getClasPed() {
		return clasPed;
	}

	public void setClasPed(String clasPed) {
		this.clasPed = clasPed;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipArti() {
		return tipArti;
	}

	public void setTipArti(String tipArti) {
		this.tipArti = tipArti;
	}

	public String getIndDoRef() {
		return indDoRef;
	}

	public void setIndDoRef(String indDoRef) {
		this.indDoRef = indDoRef;
	}

	public String getTipDcRe() {
		return tipDcRe;
	}

	public void setTipDcRe(String tipDcRe) {
		this.tipDcRe = tipDcRe;
	}

	public String getIndCliEs() {
		return indCliEs;
	}

	public void setIndCliEs(String indCliEs) {
		this.indCliEs = indCliEs;
	}

	public String getCliEspec() {
		return cliEspec;
	}

	public void setCliEspec(String cliEspec) {
		this.cliEspec = cliEspec;
	}

	public String getIndCliDiEsp() {
		return indCliDiEsp;
	}

	public void setIndCliDiEsp(String indCliDiEsp) {
		this.indCliDiEsp = indCliDiEsp;
	}

	public String getIndNomCli() {
		return indNomCli;
	}

	public void setIndNomCli(String indNomCli) {
		this.indNomCli = indNomCli;
	}

	public String getIndDirCli() {
		return indDirCli;
	}

	public void setIndDirCli(String indDirCli) {
		this.indDirCli = indDirCli;
	}

	public String getIndLisPre() {
		return indLisPre;
	}

	public void setIndLisPre(String indLisPre) {
		this.indLisPre = indLisPre;
	}

	public String getIndDsctA() {
		return indDsctA;
	}

	public void setIndDsctA(String indDsctA) {
		this.indDsctA = indDsctA;
	}

	public String getIndDsctB() {
		return indDsctB;
	}

	public void setIndDsctB(String indDsctB) {
		this.indDsctB = indDsctB;
	}

	public String getIndPedValor() {
		return indPedValor;
	}

	public void setIndPedValor(String indPedValor) {
		this.indPedValor = indPedValor;
	}

	public String getIndCodFPago() {
		return indCodFPago;
	}

	public void setIndCodFPago(String indCodFPago) {
		this.indCodFPago = indCodFPago;
	}

	public String getIndVendedor() {
		return indVendedor;
	}

	public void setIndVendedor(String indVendedor) {
		this.indVendedor = indVendedor;
	}

	public String getIndIgv() {
		return indIgv;
	}

	public void setIndIgv(String indIgv) {
		this.indIgv = indIgv;
	}

	public String getIndGuiaRem() {
		return indGuiaRem;
	}

	public void setIndGuiaRem(String indGuiaRem) {
		this.indGuiaRem = indGuiaRem;
	}

	public String getIndBoleta() {
		return indBoleta;
	}

	public void setIndBoleta(String indBoleta) {
		this.indBoleta = indBoleta;
	}

	public String getIndFactura() {
		return indFactura;
	}

	public void setIndFactura(String indFactura) {
		this.indFactura = indFactura;
	}

	public String getTipoM() {
		return tipoM;
	}

	public void setTipoM(String tipoM) {
		this.tipoM = tipoM;
	}

	public String getAlmaDest() {
		return almaDest;
	}

	public void setAlmaDest(String almaDest) {
		this.almaDest = almaDest;
	}

	public String getMotSunar() {
		return motSunar;
	}

	public void setMotSunar(String motSunar) {
		this.motSunar = motSunar;
	}

	public String getIndIncoterms() {
		return indIncoterms;
	}

	public void setIndIncoterms(String indIncoterms) {
		this.indIncoterms = indIncoterms;
	}

	public String getIndTraExt() {
		return indTraExt;
	}

	public void setIndTraExt(String indTraExt) {
		this.indTraExt = indTraExt;
	}

	public String getIndAlmaOrigen() {
		return indAlmaOrigen;
	}

	public void setIndAlmaOrigen(String indAlmaOrigen) {
		this.indAlmaOrigen = indAlmaOrigen;
	}

	public String getIndAlmaDestino() {
		return indAlmaDestino;
	}

	public void setIndAlmaDestino(String indAlmaDestino) {
		this.indAlmaDestino = indAlmaDestino;
	}

	public String getCodFpago() {
		return codFpago;
	}

	public void setCodFpago(String codFpago) {
		this.codFpago = codFpago;
	}

	public String getCodEntreEsp() {
		return codEntreEsp;
	}

	public void setCodEntreEsp(String codEntreEsp) {
		this.codEntreEsp = codEntreEsp;
	}

	public String getCodObse() {
		return codObse;
	}

	public void setCodObse(String codObse) {
		this.codObse = codObse;
	}

	public String getIndCodObs() {
		return indCodObs;
	}

	public void setIndCodObs(String indCodObs) {
		this.indCodObs = indCodObs;
	}

	public String getTipoObs() {
		return tipoObs;
	}

	public void setTipoObs(String tipoObs) {
		this.tipoObs = tipoObs;
	}

	public String getIndVtaAntici() {
		return indVtaAntici;
	}

	public void setIndVtaAntici(String indVtaAntici) {
		this.indVtaAntici = indVtaAntici;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
