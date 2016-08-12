package org.vectoritcgroup.test.service;

import org.vectoritcgroup.test.model.PrecioVenta;

public interface VentaService {

	public PrecioVenta realizarVenta(Integer orden,String descuento);
}
