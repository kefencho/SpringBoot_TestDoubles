package org.vectoritcgroup.test.repository;

import java.util.List;

import org.vectoritcgroup.test.entity.OrdenVenta;

public interface OrdenVentaDao {

	public List<OrdenVenta> obtenerTodosOrdenVenta();
	public OrdenVenta obtenerOrdenPorId(Integer idOrden);
}
