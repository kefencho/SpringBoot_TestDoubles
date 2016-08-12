package org.vectoritcgroup.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orden_venta")
public class OrdenVenta {
	
	@Id
	@Column(name="id_orden")
	private Integer idOrden;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_cliente", nullable = false)
	private Cliente cliente;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_producto", nullable = false)
	private Producto producto;
	
	private Integer cantidad;
	
	public OrdenVenta() {
		super();
	}
	
	public OrdenVenta(Integer idOrden, Integer cantidad) {
		super();
		this.idOrden = idOrden;
		this.cantidad = cantidad;
	}

	/**
	 * @return the idOrden
	 */
	public Integer getIdOrden() {
		return idOrden;
	}
	/**
	 * @param idOrden the idOrden to set
	 */
	public void setIdOrden(Integer idOrden) {
		this.idOrden = idOrden;
	}
	
	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	/**
	 * @return the cantidad
	 */
	public Integer getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OrdenVenta [idOrden=" + idOrden + ", cliente=" + cliente + ", producto=" + producto + ", cantidad="
				+ cantidad + "]";
	}

}
