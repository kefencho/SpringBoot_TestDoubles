package org.vectoritcgroup.test.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vectoritcgroup.test.entity.OrdenVenta;
import org.vectoritcgroup.test.model.PrecioVenta;
import org.vectoritcgroup.test.service.CoffeeService;
import org.vectoritcgroup.test.service.OrdenVentaService;
import org.vectoritcgroup.test.service.VentaService;

@Service
public class VentaServiceImpl implements VentaService {
	
	@Autowired
	private OrdenVentaService ordenVentaService;
	
	@Autowired
	private CoffeeService coffeeService;

	@Override
	public PrecioVenta realizarVenta(Integer orden, String descuento) {
		
		OrdenVenta ordenVenta = ordenVentaService.obtenerOrdenPorId(orden);
		PrecioVenta precioVenta = new PrecioVenta();
		
		BigDecimal precio = null;
		if(descuento.equals("S")){
			precio = coffeeService.calcularTotalPagarSinDescuento(ordenVenta);
		}else if(descuento.equals("C")){
			precio = coffeeService.calcularTotalPagarConDescuento(ordenVenta);
			precioVenta.setDescuento(ordenVenta.getProducto().getPromocion().getDescuento().toString());
		}else{
			precio = BigDecimal.ZERO;
		}
		precioVenta.setPrecioUnitario(ordenVenta.getProducto().getPrecio().toString());
		precioVenta.setPrecioFinal(precio.toString());
		precioVenta.setCantidad(ordenVenta.getCantidad().toString());
		
		return precioVenta;
	}
}
