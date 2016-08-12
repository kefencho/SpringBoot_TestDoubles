package org.vectoritcgroup.test.integration.repository;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.vectoritcgroup.test.ApplicationTests;
import org.vectoritcgroup.test.entity.Promocion;
import org.vectoritcgroup.test.repository.PromocionDao;

public class PromocionDaoTest extends ApplicationTests {
	
	@Autowired
	private PromocionDao promocionDao;

	@Test
	public void obtenerTodasPromocionesTest(){
		List<Promocion> listaPromocion = promocionDao.obtenerTodasPromociones();
		assertTrue(!listaPromocion.isEmpty());
	}
	
	@Test
	public void obtenerPromocioPorCodigoTest(){
		Promocion promocion = promocionDao.obtenerPromocioPorCodigo("P0001");
		assertTrue(promocion.getDescripcion().equals("Coffe Verano"));
	}
}
