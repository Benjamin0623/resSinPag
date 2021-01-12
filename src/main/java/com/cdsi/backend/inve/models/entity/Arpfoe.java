package com.cdsi.backend.inve.models.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Arpfoe {
	@EmbeddedId
	private IdArpfoe idArpfoe;
	
	private String grupo;
	@Column(name = "NO_CLIENTE")
	private String noCliente;
	private String division;
	@Column(name = "NO_VENDEDOR")
	private String noVendedor;
	@Column(name = "COD_T_PED")
	private String codTPed;
	@Column(name = "COD_FPAGO")
	private String codFPago;
	@Column(name = "F_RECEPCION")
	private LocalDateTime fRecepcion;
	@Column(name = "FECHA_REGISTRO")
	private LocalDateTime fechaRegistro;
	@Column(name = "F_APROBACION")
	private LocalDateTime fAprobacion;
	@Column(name = "FECHA_ENTREGA")
	private LocalDateTime fechaEntrega;
	@Column(name = "FECHA_ENTREGA_REAL")
	private LocalDateTime fechaEntregaReal;
	@Column(name = "FECHA_VENCE")
	private LocalDateTime fechaVence;
	@Column(name = "TIPO_PRECIO")
	private String tipoPrecio;
	private String moneda;
	@Column(name = "TIPO_CAMBIO")
	private Double tipoCambio;
	@Column(name = "SUB_TOTAL")
	private Double subTotal;
	@Column(name = "T_IMPUESTO")
	private Double tImpuesto;
	@Column(name = "T_PRECIO")
	private Double tPrecio;
	private Double impuesto;
	private String estado;
	private String bodega;
	private Double igv;
	@Column(name = "IND_GUIADO")
	private String indGuiado;
	@Column(name = "PER_DE_GRACIA")
	private Double perDeGracia;
	@Column(name = "DIRECCION_COMERCIAL")
	private String direccionComercial;
	@Column(name = "CODI_DEPA")
	private String codiDepa;
	@Column(name = "CODI_PROV")
	private String codiProv;
	@Column(name = "CODI_DIST")
	private String codiDist;
	@Column(name = "MOTIVO_TRASLADO")
	private String motivoTraslado;
	@Column(name = "NOMBRE_CLIENTE")
	private String nombreCliente;
	private String ruc;
	@Column(name = "NO_FACTU")
	private String noFactu;
	@Column(name = "T_DESCUENTO")
	private String tDescuento;
	@Column(name = "COD_CLAS_PED")
	private String codClasPed;
	@Column(name = "TIPO_FPAGO")
	private String tipoPago;
	@Column(name = "T_DSCTO_GLOBAL")
	private Double tDsctoGlobal;
	@Column(name = "T_VALOR_VENTA")
	private Double tValorVenta;
	@Column(name = "COD_TIENDA")
	private String codTienda;
	@Column(name = "NOMB_TIENDA")
	private String nomTienda;
	@Column(name = "DIREC_TIENDA")
	private String direcTienda;
	@Column(name = "ALMA_ORIGEN")
	private String almaOrigen;
	@Column(name = "ALMA_DESTINO")
	private String almaDestino;
	@Column(name = "TIPO_ARTI")
	private String tipoArti;
	@Column(name = "NOMBRE_DIGI")
	private String nombreDiji;
	@Column(name = "DIRECCION_DIGI")
	private String direccionDigi;
	@Column(name = "TIPO_DOC_CLI")
	private String tipoDocCli;
	@Column(name = "NUM_DOC_CLI")
	private String numDocCli;
	@Column(name = "COD_DIR_ENTREGA")
	private String codDirEntrada;
	@Column(name = "COD_DIR_SALIDA")
	private String codDirSalida;
	@Column(name = "NO_CLIENTE_SALIDA")
	private String noClienteSalida;
	@Column(name = "ESTADO_ASIGNACION")
	private String estadoAsignacion;
	@Column(name = "VIG_PREC_INICIO")
	private LocalDateTime vigPrecInicio;
	@Column(name = "VIG_PREC_FINAL")
	private LocalDateTime vigPrecFinal;
	@Column(name = "LISTA_PREC_ANT")
	private String listaPrecAnt;
	@Column(name = "USUARIO_APROB")
	private String usuarioAprob;
	@Column(name = "TOTAL_BRUTO")
	private Double totalBruto;
	@Column(name = "COD_T_PED1")
	private String codTPed1;
	@Column(name = "COD_T_PEDB")
	private String codTPedb;
	@Column(name = "COD_T_PEDN")
	private String codTPedn;
	@Column(name = "IND_PVENT")
	private String indPvent;
	private String centro;
	@Column(name = "IND_FACTURA1")
	private String indFactura1;
	@Column(name = "IND_BOLETA1")
	private String indBoleta1;
	@Column(name = "COD_CAJA")
	private String codCaja;
	private String cajera;
	@Column(name = "CENTRO_COSTO")
	private String centroCosto;
	@Column(name = "IND_FERIAS")
	private String indFerias;
	@Column(name = "IND_PROVINCIA")
	private String indProvincia;
	private Double redondeo;
	@Column(name = "IND_COD_BARRA ")
	private String indCodBarra;
	@Column(name = "USU_CREA")
	private String usuCrea;
	@Column(name = "FEC_MODI")
	private LocalDateTime fecModi;
	@Column(name = "USU_MODI")
	private String usuModi;
	@Column(name = "TIPO_OPERACION")
	private String tipoOperacion;
	@Column(name = "OPER_GRAVADAS")
	private Double operGravadas;
	@Column(name = "OPER_INAFECTAS")
	private Double operInafectas;
	@Column(name = "OPER_EXONERADAS")
	private Double operExoneradas;
	@Column(name = "OPER_GRATUITAS")
	private Double operGratuitas;
	@Column(name = "EMAIL_PEDIDO")
	private String emailPedido;
	
	public IdArpfoe getIdArpfoe() {
		return idArpfoe;
	}

	public void setIdArpfoe(IdArpfoe idArpfoe) {
		this.idArpfoe = idArpfoe;
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

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getNoVendedor() {
		return noVendedor;
	}

	public void setNoVendedor(String noVendedor) {
		this.noVendedor = noVendedor;
	}

	public String getCodTPed() {
		return codTPed;
	}

	public void setCodTPed(String codTPed) {
		this.codTPed = codTPed;
	}

	public String getCodFPago() {
		return codFPago;
	}

	public void setCodFPago(String codFPago) {
		this.codFPago = codFPago;
	}

	public LocalDateTime getfRecepcion() {
		return fRecepcion;
	}

	public void setfRecepcion(LocalDateTime fRecepcion) {
		this.fRecepcion = fRecepcion;
	}

	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public LocalDateTime getfAprobacion() {
		return fAprobacion;
	}

	public void setfAprobacion(LocalDateTime fAprobacion) {
		this.fAprobacion = fAprobacion;
	}

	public LocalDateTime getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(LocalDateTime fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public LocalDateTime getFechaEntregaReal() {
		return fechaEntregaReal;
	}

	public void setFechaEntregaReal(LocalDateTime fechaEntregaReal) {
		this.fechaEntregaReal = fechaEntregaReal;
	}

	public LocalDateTime getFechaVence() {
		return fechaVence;
	}

	public void setFechaVence(LocalDateTime fechaVence) {
		this.fechaVence = fechaVence;
	}

	public String getTipoPrecio() {
		return tipoPrecio;
	}

	public void setTipoPrecio(String tipoPrecio) {
		this.tipoPrecio = tipoPrecio;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public Double getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(Double tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	public Double gettImpuesto() {
		return tImpuesto;
	}

	public void settImpuesto(Double tImpuesto) {
		this.tImpuesto = tImpuesto;
	}

	public Double gettPrecio() {
		return tPrecio;
	}

	public void settPrecio(Double tPrecio) {
		this.tPrecio = tPrecio;
	}

	public Double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(Double impuesto) {
		this.impuesto = impuesto;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getBodega() {
		return bodega;
	}

	public void setBodega(String bodega) {
		this.bodega = bodega;
	}

	public Double getIgv() {
		return igv;
	}

	public void setIgv(Double igv) {
		this.igv = igv;
	}

	public String getIndGuiado() {
		return indGuiado;
	}

	public void setIndGuiado(String indGuiado) {
		this.indGuiado = indGuiado;
	}

	public Double getPerDeGracia() {
		return perDeGracia;
	}

	public void setPerDeGracia(Double perDeGracia) {
		this.perDeGracia = perDeGracia;
	}

	public String getDireccionComercial() {
		return direccionComercial;
	}

	public void setDireccionComercial(String direccionComercial) {
		this.direccionComercial = direccionComercial;
	}

	public String getCodiDepa() {
		return codiDepa;
	}

	public void setCodiDepa(String codiDepa) {
		this.codiDepa = codiDepa;
	}

	public String getCodiProv() {
		return codiProv;
	}

	public void setCodiProv(String codiProv) {
		this.codiProv = codiProv;
	}

	public String getCodiDist() {
		return codiDist;
	}

	public void setCodiDist(String codiDist) {
		this.codiDist = codiDist;
	}

	public String getMotivoTraslado() {
		return motivoTraslado;
	}

	public void setMotivoTraslado(String motivoTraslado) {
		this.motivoTraslado = motivoTraslado;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getNoFactu() {
		return noFactu;
	}

	public void setNoFactu(String noFactu) {
		this.noFactu = noFactu;
	}

	public String gettDescuento() {
		return tDescuento;
	}

	public void settDescuento(String tDescuento) {
		this.tDescuento = tDescuento;
	}

	public String getCodClasPed() {
		return codClasPed;
	}

	public void setCodClasPed(String codClasPed) {
		this.codClasPed = codClasPed;
	}

	public String getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

	public Double gettDsctoGlobal() {
		return tDsctoGlobal;
	}

	public void settDsctoGlobal(Double tDsctoGlobal) {
		this.tDsctoGlobal = tDsctoGlobal;
	}

	public Double gettValorVenta() {
		return tValorVenta;
	}

	public void settValorVenta(Double tValorVenta) {
		this.tValorVenta = tValorVenta;
	}

	public String getCodTienda() {
		return codTienda;
	}

	public void setCodTienda(String codTienda) {
		this.codTienda = codTienda;
	}

	public String getNomTienda() {
		return nomTienda;
	}

	public void setNomTienda(String nomTienda) {
		this.nomTienda = nomTienda;
	}

	public String getDirecTienda() {
		return direcTienda;
	}

	public void setDirecTienda(String direcTienda) {
		this.direcTienda = direcTienda;
	}

	public String getAlmaOrigen() {
		return almaOrigen;
	}

	public void setAlmaOrigen(String almaOrigen) {
		this.almaOrigen = almaOrigen;
	}

	public String getAlmaDestino() {
		return almaDestino;
	}

	public void setAlmaDestino(String almaDestino) {
		this.almaDestino = almaDestino;
	}

	public String getTipoArti() {
		return tipoArti;
	}

	public void setTipoArti(String tipoArti) {
		this.tipoArti = tipoArti;
	}

	public String getNombreDiji() {
		return nombreDiji;
	}

	public void setNombreDiji(String nombreDiji) {
		this.nombreDiji = nombreDiji;
	}

	public String getDireccionDigi() {
		return direccionDigi;
	}

	public void setDireccionDigi(String direccionDigi) {
		this.direccionDigi = direccionDigi;
	}

	public String getTipoDocCli() {
		return tipoDocCli;
	}

	public void setTipoDocCli(String tipoDocCli) {
		this.tipoDocCli = tipoDocCli;
	}

	public String getNumDocCli() {
		return numDocCli;
	}

	public void setNumDocCli(String numDocCli) {
		this.numDocCli = numDocCli;
	}

	public String getCodDirEntrada() {
		return codDirEntrada;
	}

	public void setCodDirEntrada(String codDirEntrada) {
		this.codDirEntrada = codDirEntrada;
	}

	public String getCodDirSalida() {
		return codDirSalida;
	}

	public void setCodDirSalida(String codDirSalida) {
		this.codDirSalida = codDirSalida;
	}

	public String getNoClienteSalida() {
		return noClienteSalida;
	}

	public void setNoClienteSalida(String noClienteSalida) {
		this.noClienteSalida = noClienteSalida;
	}

	public String getEstadoAsignacion() {
		return estadoAsignacion;
	}

	public void setEstadoAsignacion(String estadoAsignacion) {
		this.estadoAsignacion = estadoAsignacion;
	}

	public LocalDateTime getVigPrecInicio() {
		return vigPrecInicio;
	}

	public void setVigPrecInicio(LocalDateTime vigPrecInicio) {
		this.vigPrecInicio = vigPrecInicio;
	}

	public LocalDateTime getVigPrecFinal() {
		return vigPrecFinal;
	}

	public void setVigPrecFinal(LocalDateTime vigPrecFinal) {
		this.vigPrecFinal = vigPrecFinal;
	}

	public String getListaPrecAnt() {
		return listaPrecAnt;
	}

	public void setListaPrecAnt(String listaPrecAnt) {
		this.listaPrecAnt = listaPrecAnt;
	}

	public String getUsuarioAprob() {
		return usuarioAprob;
	}

	public void setUsuarioAprob(String usuarioAprob) {
		this.usuarioAprob = usuarioAprob;
	}

	public Double getTotalBruto() {
		return totalBruto;
	}

	public void setTotalBruto(Double totalBruto) {
		this.totalBruto = totalBruto;
	}

	public String getCodTPed1() {
		return codTPed1;
	}

	public void setCodTPed1(String codTPed1) {
		this.codTPed1 = codTPed1;
	}

	public String getCodTPedb() {
		return codTPedb;
	}

	public void setCodTPedb(String codTPedb) {
		this.codTPedb = codTPedb;
	}

	public String getCodTPedn() {
		return codTPedn;
	}

	public void setCodTPedn(String codTPedn) {
		this.codTPedn = codTPedn;
	}

	public String getIndPvent() {
		return indPvent;
	}

	public void setIndPvent(String indPvent) {
		this.indPvent = indPvent;
	}

	public String getCentro() {
		return centro;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}

	public String getIndFactura1() {
		return indFactura1;
	}

	public void setIndFactura1(String indFactura1) {
		this.indFactura1 = indFactura1;
	}

	public String getIndBoleta1() {
		return indBoleta1;
	}

	public void setIndBoleta1(String indBoleta1) {
		this.indBoleta1 = indBoleta1;
	}

	public String getCodCaja() {
		return codCaja;
	}

	public void setCodCaja(String codCaja) {
		this.codCaja = codCaja;
	}

	public String getCajera() {
		return cajera;
	}

	public void setCajera(String cajera) {
		this.cajera = cajera;
	}

	public String getCentroCosto() {
		return centroCosto;
	}

	public void setCentroCosto(String centroCosto) {
		this.centroCosto = centroCosto;
	}

	public String getIndFerias() {
		return indFerias;
	}

	public void setIndFerias(String indFerias) {
		this.indFerias = indFerias;
	}

	public String getIndProvincia() {
		return indProvincia;
	}

	public void setIndProvincia(String indProvincia) {
		this.indProvincia = indProvincia;
	}

	public Double getRedondeo() {
		return redondeo;
	}

	public void setRedondeo(Double redondeo) {
		this.redondeo = redondeo;
	}

	public String getIndCodBarra() {
		return indCodBarra;
	}

	public void setIndCodBarra(String indCodBarra) {
		this.indCodBarra = indCodBarra;
	}

	public String getUsuCrea() {
		return usuCrea;
	}

	public void setUsuCrea(String usuCrea) {
		this.usuCrea = usuCrea;
	}

	public LocalDateTime getFecModi() {
		return fecModi;
	}

	public void setFecModi(LocalDateTime fecModi) {
		this.fecModi = fecModi;
	}

	public String getUsuModi() {
		return usuModi;
	}

	public void setUsuModi(String usuModi) {
		this.usuModi = usuModi;
	}

	public String getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
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

	public Double getOperGratuitas() {
		return operGratuitas;
	}

	public void setOperGratuitas(Double operGratuitas) {
		this.operGratuitas = operGratuitas;
	}

	public String getEmailPedido() {
		return emailPedido;
	}

	public void setEmailPedido(String emailPedido) {
		this.emailPedido = emailPedido;
	}
	
	
	
}
