package org.vectoritcgroup.test.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {

	@Id
	private Integer dni;
	private String nombre;
	private String apellidos;
	private String correo;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	private Set<OrdenVenta> listaOrdenVenta = new HashSet<OrdenVenta>(0);
	
	public Cliente() {
		super();
	}
	public Cliente(Integer dni, String nombre, String apellidos, String correo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
	}
	/**
	 * @return the dni
	 */
	public Integer getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(Integer dni) {
		this.dni = dni;
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}
	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
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
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", correo=" + correo + "]";
	}
}
