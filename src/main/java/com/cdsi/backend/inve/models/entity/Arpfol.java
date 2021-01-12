package com.cdsi.backend.inve.models.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Arpfol {

	@EmbeddedId
	private IdArpfol idArpfol;
	
	private String grupo;
	@Column(name = "NO_CLIENTE")
	private String noCliente;
	@Column(name = "TIPO_ARTI")
	private String tipoArti;
	@Column(name = "ARTI_NUEVO")
	private String artiNuevo;
	private String bodega;
	@Column(name = "CANT_COMP")
	private Double cantComp;
	@Column(name = "CANT_SOLICITADA")
	private Double cantSolicitada;
	@Column(name = "CANT_ENTREG")
	private Double cantEntreg;
	@Column(name = "CANT_ASIGNADA")
	private Double cantAsignada;
	@Column(name = "CANT_REASIGNADA")
	private Double cantReasignada;
	@Column(name = "FECHA_REGISTRO")
	private LocalDateTime fechaRegistro;
	private Double precio ;
	@Column(name = "TOT_LINEA")
	private Double totLinea;
	private String estado;
	private Double igv ;
	@Column(name = "NO_LINEA")
	private Double noLinea;
	@Column(name = "P_DSCTO3")
	private Double pDscto3;
	@Column(name = "M_DSCTO1")
	private Double mDscto1;
	@Column(name = "M_DSCTO2")
	private Double mDscto2;
	@Column(name = "M_DSCTO3")
	private Double mDscto3;
	@Column(name = "IMP_IGV")
	private Double impIgv;
	@Column(name = "PRECIO_SIGV")
	private Double precioSIgv;
	@Column(name = "TOTAL_LIN")
	private Double totalLin;
	private String descripcion;
	@Column(name = "TIPO_AFECTACION")
	private String tipoAfectacion;
	@Column(name = "PRECIO_UNI")
	private Double precioUni;
	@Column(name = "OPER_GRATUITAS")
	private Double operGratuitas;
	@Column(name = "OPER_GRAVADAS")
	private Double operGravadas;
	@Column(name = "OPER_INAFECTAS")
	private Double operInafectas;
	@Column(name = "OPER_EXONERADAS")
	private Double operExoneradas;
	
	public IdArpfol getIdArpfol() {
		return idArpfol;
	}
	public void setIdArpfol(IdArpfol idArpfol) {
		this.idArpfol = idArpfol;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getNoCliente() {
		return noCliente;
	}
	public void setNoCliente(String noCliente) {
		this.noCliente = noCliente;
	}
	public String getTipoArti() {
		return tipoArti;
	}
	public void setTipoArti(String tipoArti) {
		this.tipoArti = tipoArti;
	}
	public String getArtiNuevo() {
		return artiNuevo;
	}
	public void setArtiNuevo(String artiNuevo) {
		this.artiNuevo = artiNuevo;
	}
	public String getBodega() {
		return bodega;
	}
	public void setBodega(String bodega) {
		this.bodega = bodega;
	}
	public Double getCantComp() {
		return cantComp;
	}
	public void setCantComp(Double cantComp) {
		this.cantComp = cantComp;
	}
	public Double getCantSolicitada() {
		return cantSolicitada;
	}
	public void setCantSolicitada(Double cantSolicitada) {
		this.cantSolicitada = cantSolicitada;
	}
	public Double getCantEntreg() {
		return cantEntreg;
	}
	public void setCantEntreg(Double cantEntreg) {
		this.cantEntreg = cantEntreg;
	}
	public Double getCantAsignada() {
		return cantAsignada;
	}
	public void setCantAsignada(Double cantAsignada) {
		this.cantAsignada = cantAsignada;
	}
	public Double getCantReasignada() {
		return cantReasignada;
	}
	public void setCantReasignada(Double cantReasignada) {
		this.cantReasignada = cantReasignada;
	}
	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	public Double getTotLinea() {
		return totLinea;
	}
	public void setTotLin(Double totLinea) {
		this.totLinea = totLinea;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Double getIgv() {
		return igv;
	}
	public void setIgv(Double igv) {
		this.igv = igv;
	}
	public Double getNoLinea() {
		return noLinea;
	}
	public void setNoLinea(Double noLinea) {
		this.noLinea = noLinea;
	}
	public Double getpDscto3() {
		return pDscto3;
	}
	public void setpDscto3(Double pDscto3) {
		this.pDscto3 = pDscto3;
	}
	public Double getmDscto1() {
		return mDscto1;
	}
	public void setmDscto1(Double mDscto1) {
		this.mDscto1 = mDscto1;
	}
	public Double getmDscto2() {
		return mDscto2;
	}
	public void setmDscto2(Double mDscto2) {
		this.mDscto2 = mDscto2;
	}
	public Double getmDscto3() {
		return mDscto3;
	}
	public void setmDscto3(Double mDscto3) {
		this.mDscto3 = mDscto3;
	}
	public Double getImpIgv() {
		return impIgv;
	}
	public void setImpIgv(Double impIgv) {
		this.impIgv = impIgv;
	}
	public Double getPrecioSIgv() {
		return precioSIgv;
	}
	public void setPrecioSIgv(Double precioSIgv) {
		this.precioSIgv = precioSIgv;
	}
	public Double getTotalLin() {
		return totalLin;
	}
	public void setTotalLin(Double totalLin) {
		this.totalLin = totalLin;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTipoAfectacion() {
		return tipoAfectacion;
	}
	public void setTipoAfectacion(String tipoAfectacion) {
		this.tipoAfectacion = tipoAfectacion;
	}
	public Double getPrecioUni() {
		return precioUni;
	}
	public void setPrecioUni(Double precioUni) {
		this.precioUni = precioUni;
	}
	public Double getOperGratuitas() {
		return operGratuitas;
	}
	public void setOperGratuitas(Double operGratuitas) {
		this.operGratuitas = operGratuitas;
	}
	public Double getOperGravadas() {
		return operGravadas;
	}
	public void setOperGravadas(Double operGravadas) {
		this.operGravadas = operGravadas;
	}
	public Double getOperInafectas() {
		return operInafectas;
	}
	public void setOperInafectas(Double operInafectas) {
		this.operInafectas = operInafectas;
	}
	public Double getOperExoneradas() {
		return operExoneradas;
	}
	public void setOperExoneradas(Double operExoneradas) {
		this.operExoneradas = operExoneradas;
	}
	
	
}
