package org.vectoritcgroup.test.repository;

import java.util.List;

import org.vectoritcgroup.test.entity.Promocion;

public interface PromocionDao {

	public List<Promocion>obtenerTodasPromociones();
	public Promocion obtenerPromocioPorCodigo(String codigo);
}
