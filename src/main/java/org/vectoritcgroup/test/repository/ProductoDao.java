package org.vectoritcgroup.test.repository;

import java.util.List;

import org.vectoritcgroup.test.entity.Producto;

public interface ProductoDao {

	public List<Producto> obtenerTodosProductos();
	public Producto obtenerProductoPorCodigo(String codigo);
}
