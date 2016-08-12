package org.vectoritcgroup.test.model;

public class PrecioVenta extends ModelResult {
	private static final long serialVersionUID = 3653698927028121120L;
	
	private String precioUnitario;
	private String cantidad;
	private String precioFinal;
	private String descuento;
	/**
	 * @return the precio
	 */
	public String getPrecioUnitario() {
		return precioUnitario;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecioUnitario(String precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	/**
	 * @return the descuento
	 */
	public String getDescuento() {
		return descuento;
	}
	/**
	 * @param descuento the descuento to set
	 */
	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}
	/**
	 * @return the precioFinal
	 */
	public String getPrecioFinal() {
		return precioFinal;
	}
	/**
	 * @param precioFinal the precioFinal to set
	 */
	public void setPrecioFinal(String precioFinal) {
		this.precioFinal = precioFinal;
	}
	/**
	 * @return the cantidad
	 */
	public String getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
}
