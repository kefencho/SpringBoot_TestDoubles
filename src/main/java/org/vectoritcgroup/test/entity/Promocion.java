package org.vectoritcgroup.test.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author VECTOR
 *
 */
@Entity
@Table(name="promocion")
public class Promocion {
	@Id
	private String codigo_promocion;
	private String descripcion;
	private Integer descuento;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "promocion")
	private Set<Producto> productos = new HashSet<Producto>(0);	
	
	public Promocion() {
		super();
	}
	
	public Promocion(String descripcion, Integer descuento, String codigo_promocion) {
		super();
		this.descripcion = descripcion;
		this.descuento = descuento;
		this.codigo_promocion = codigo_promocion;
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
	 * @return the descuento
	 */
	public Integer getDescuento() {
		return descuento;
	}
	/**
	 * @param descuento the descuento to set
	 */
	public void setDescuento(Integer descuento) {
		this.descuento = descuento;
	}
	/**
	 * @return the codigo_promocion
	 */
	public String getCodigo_promocion() {
		return codigo_promocion;
	}
	/**
	 * @param codigo_promocion the codigo_promocion to set
	 */
	public void setCodigo_promocion(String codigo_promocion) {
		this.codigo_promocion = codigo_promocion;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Promocion [descripcion=" + descripcion + ", descuento=" + descuento + ", codigo_promocion="
				+ codigo_promocion + "]";
	}
}
