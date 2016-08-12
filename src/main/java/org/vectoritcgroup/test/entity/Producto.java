package org.vectoritcgroup.test.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	@Id
	private String codigo;
	private String nombre;	
	private String descripcion;
	private Boolean estado;
	private BigDecimal precio;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cod_promocion", nullable = false)
	private Promocion promocion;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "producto")
	private Set<OrdenVenta> listaOrdenVenta = new HashSet<OrdenVenta>(0);
	
	public Producto() {
		super();
	}
	public Producto(String nombre, String codigo, String descripcion, Boolean estado, BigDecimal precio) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.estado = estado;
		this.precio = precio;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the estado
	 */
	public Boolean getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	/**
	 * @return the precio
	 */
	public BigDecimal getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	/**
	 * @return the promocion
	 */
	public Promocion getPromocion() {
		return promocion;
	}
	/**
	 * @param promocion the promocion to set
	 */
	public void setPromocion(Promocion promocion) {
		this.promocion = promocion;
	}
	/**
	 * @return the listaOrdenVenta
	 */
	public Set<OrdenVenta> getListaOrdenVenta() {
		return listaOrdenVenta;
	}
	/**
	 * @param listaOrdenVenta the listaOrdenVenta to set
	 */
	public void setListaOrdenVenta(Set<OrdenVenta> listaOrdenVenta) {
		this.listaOrdenVenta = listaOrdenVenta;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", estado="
				+ estado + ", precio=" + precio + ", promocion=" + promocion + "]";
	}
}
