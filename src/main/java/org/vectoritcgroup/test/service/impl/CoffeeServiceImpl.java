package org.vectoritcgroup.test.service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.vectoritcgroup.test.entity.OrdenVenta;
import org.vectoritcgroup.test.entity.Producto;
import org.vectoritcgroup.test.service.CoffeeService;

@Service
public class CoffeeServiceImpl implements CoffeeService {

	@Override
	public BigDecimal calcularTotalPagarSinDescuento(OrdenVenta orden) {
		BigDecimal total = BigDecimal.ZERO;
		total = orden.getProducto().getPrecio().multiply(new  BigDecimal(orden.getCantidad()));
		return total;
	}

	@Override
	public Boolean tienePromocion(Producto producto) {
		if(producto.getPromocion()!=null && StringUtils.hasText(producto.getPromocion().getCodigo_promocion())){
			return true;
		}
		return false;
	}

	@Override
	public BigDecimal calcularTotalPagarConDescuento(OrdenVenta orden) {
		BigDecimal total = BigDecimal.ZERO;
		BigDecimal calcularTotalPagarSinDescuento = this.calcularTotalPagarSinDescuento(orden);
		Integer descuento = orden.getProducto().getPromocion().getDescuento();
		BigDecimal descuentoAux = calcularTotalPagarSinDescuento.multiply(new BigDecimal(descuento));
		BigDecimal descuentoTotal = descuentoAux.divide(new BigDecimal(100));
		total = calcularTotalPagarSinDescuento.subtract(descuentoTotal);
		return total;
	}

}
