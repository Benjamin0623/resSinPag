package com.cdsi.backend.inve.models.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
@Entity
public class Arfacc {

	@EmbeddedId
	private IdArfacc idArfacc;
	@Column(name = "ANO_DOC")
	private String anoDoc;
	@Column(name = "CONS_INICIO")
	private Integer consInicio;
	@Column(name = "CONS_DESDE")
	private Integer consDesde;
	@Column(name = "CONS_HASTA")
	private Integer consHasta;
	private Integer lineas;
	@Column(name = "IND_CONTROL_AUTO")
	private String indControlAuto;
	@Column(name = "TIPO_M")
	private String tipoM;
	private String activo;
	@Column(name = "IND_FECHA_AUTO")
	private String indFechaAuto;
	@Column(name = "NO_CABA")
	private String noCaba;
	private Integer feria;
	@Column(name = "NO_CLIENTE")
	private String noCliente;
	@Column(name = "USU_PROV")
	private String usuProv;
	private String marca1;

	public IdArfacc getIdArfacc() {
		return idArfacc;
	}

	public void setIdArfacc(IdArfacc idArfacc) {
		this.idArfacc = idArfacc;
	}

	public String getAnoDoc() {
		return anoDoc;
	}

	public void setAnoDoc(String anoDoc) {
		this.anoDoc = anoDoc;
	}

	public Integer getConsInicio() {
		return consInicio;
	}

	public void setConsInicio(Integer consInicio) {
		this.consInicio = consInicio;
	}

	public Integer getConsDesde() {
		return consDesde;
	}

	public void setConsDesde(Integer consDesde) {
		this.consDesde = consDesde;
	}

	public Integer getConsHasta() {
		return consHasta;
	}

	public void setConsHasta(Integer consHasta) {
		this.consHasta = consHasta;
	}

	public Integer getLineas() {
		return lineas;
	}

	public void setLineas(Integer lineas) {
		this.lineas = lineas;
	}

	public String getIndControlAuto() {
		return indControlAuto;
	}

	public void setIndControlAuto(String indControlAuto) {
		this.indControlAuto = indControlAuto;
	}

	public String getTipoM() {
		return tipoM;
	}

	public void setTipoM(String tipoM) {
		this.tipoM = tipoM;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getIndFechaAuto() {
		return indFechaAuto;
	}

	public void setIndFechaAuto(String indFechaAuto) {
		this.indFechaAuto = indFechaAuto;
	}

	public String getNoCaba() {
		return noCaba;
	}

	public void setNoCaba(String noCaba) {
		this.noCaba = noCaba;
	}

	public Integer getFeria() {
		return feria;
	}

	public void setFeria(Integer feria) {
		this.feria = feria;
	}

	public String getNoCliente() {
		return noCliente;
	}

	public void setNoCliente(String noCliente) {
		this.noCliente = noCliente;
	}

	public String getUsuProv() {
		return usuProv;
	}

	public void setUsuProv(String usuProv) {
		this.usuProv = usuProv;
	}

	public String getMarca1() {
		return marca1;
	}

	public void setMarca1(String marca1) {
		this.marca1 = marca1;
	}

}
