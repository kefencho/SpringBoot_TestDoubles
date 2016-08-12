package org.vectoritcgroup.test.service;

import java.math.BigDecimal;

import org.vectoritcgroup.test.entity.OrdenVenta;
import org.vectoritcgroup.test.entity.Producto;

public interface CoffeeService {

	public Boolean tienePromocion(Producto producto);
	public BigDecimal calcularTotalPagarSinDescuento(OrdenVenta orden);
	public BigDecimal calcularTotalPagarConDescuento(OrdenVenta orden);
}
