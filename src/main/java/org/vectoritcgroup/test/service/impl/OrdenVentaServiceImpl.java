package org.vectoritcgroup.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vectoritcgroup.test.entity.OrdenVenta;
import org.vectoritcgroup.test.repository.OrdenVentaDao;
import org.vectoritcgroup.test.service.OrdenVentaService;

@Service
public class OrdenVentaServiceImpl implements OrdenVentaService {

	@Autowired
	private OrdenVentaDao ordenVenta;
	
	@Override
	public OrdenVenta obtenerOrdenPorId(Integer idOrden) {
		OrdenVenta orden = ordenVenta.obtenerOrdenPorId(idOrden);
		return orden;
	}

}
