package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "ARCAACCAJ")
public class Arcaaccaj implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private IdArcaaccaj idArcaja;

	@Column(name = "FECHA", nullable = false)
	private LocalDateTime fecha;
	@Column(name = "CAJERA", nullable = false)
	private String cajera;
	@Column(name = "SALDO_INICIAL", precision = 12, scale = 3)
	private Double saldoInicial;
	@Column(name = "FECHA_CIERRE")
	private LocalDateTime fechaCierre;
	@Column(name = "ESTADO")
	private String estado;
	@Column(name = "HORA", length = 5)
	private String hora;
	@Column(name = "HORA_CIERRE", length = 5)
	private String horaCierre;
	@Column(name = "SERIE_LIQ", length = 4)
	private String serieLiq;
	@Column(name = "NUM_LIQ", length = 11)
	private String numLiq;
	@Column(name = "TIPO_DOC_LIQ", length = 2)
	private String TipoDocLiq;
	@Column(name = "INGRESO_EFECTIVO_SOL", precision = 12, scale = 3)
	private Double ingresoEfectivoSol;
	@Column(name = "EGRESO_EFECTIVO_SOL", precision = 12, scale = 3)
	private Double egresoEfectivoSol;
	@Column(name = "INGRESO_EFECTIVO_DOL", precision = 12, scale = 3)
	private Double ingresoEfectivoDol;
	@Column(name = "EGRESO_EFECTIVO_DOL", precision = 12, scale = 3)
	private Double egresoEfectivoDol;

	public IdArcaaccaj getIdArcaja() {
		return idArcaja;
	}

	public void setIdArcaja(IdArcaaccaj idArcaja) {
		this.idArcaja = idArcaja;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getCajera() {
		return cajera;
	}

	public void setCajera(String cajera) {
		this.cajera = cajera;
	}

	public Double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(Double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public LocalDateTime getFechaCierre() {
		return fechaCierre;
	}

	public void setFechaCierre(LocalDateTime fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getHoraCierre() {
		return horaCierre;
	}

	public void setHoraCierre(String horaCierre) {
		this.horaCierre = horaCierre;
	}

	public String getSerieLiq() {
		return serieLiq;
	}

	public void setSerieLiq(String serieLiq) {
		this.serieLiq = serieLiq;
	}

	public String getNumLiq() {
		return numLiq;
	}

	public void setNumLiq(String numLiq) {
		this.numLiq = numLiq;
	}

	public String getTipoDocLiq() {
		return TipoDocLiq;
	}

	public void setTipoDocLiq(String tipoDocLiq) {
		TipoDocLiq = tipoDocLiq;
	}

	public Double getIngresoEfectivoSol() {
		return ingresoEfectivoSol;
	}

	public void setIngresoEfectivoSol(Double ingresoEfectivoSol) {
		this.ingresoEfectivoSol = ingresoEfectivoSol;
	}

	public Double getEgresoEfectivoSol() {
		return egresoEfectivoSol;
	}

	public void setEgresoEfectivoSol(Double egresoEfectivoSol) {
		this.egresoEfectivoSol = egresoEfectivoSol;
	}

	public Double getIngresoEfectivoDol() {
		return ingresoEfectivoDol;
	}

	public void setIngresoEfectivoDol(Double ingresoEfectivoDol) {
		this.ingresoEfectivoDol = ingresoEfectivoDol;
	}

	public Double getEgresoEfectivoDol() {
		return egresoEfectivoDol;
	}

	public void setEgresoEfectivoDol(Double egresoEfectivoDol) {
		this.egresoEfectivoDol = egresoEfectivoDol;
	}
	
	// FEC_MOD DATE,
	// USU_MODI VARCHAR2(10 BYTE),
	// FEC_MODI DATE
}
