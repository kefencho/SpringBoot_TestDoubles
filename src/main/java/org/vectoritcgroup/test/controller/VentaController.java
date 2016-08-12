package org.vectoritcgroup.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.vectoritcgroup.test.model.PrecioVenta;
import org.vectoritcgroup.test.model.Result;
import org.vectoritcgroup.test.service.VentaService;

@RestController
@RequestMapping("/venta")
public class VentaController {

	@Autowired
	private VentaService ventaService;
	
	@RequestMapping("/calcular/{orden}/{descuento}")
	public @ResponseBody PrecioVenta obtenerPrecioTotalVenta(@PathVariable final Integer orden,@PathVariable final String descuento) {
		PrecioVenta precioVenta = new PrecioVenta();
		try{			
			precioVenta = ventaService.realizarVenta(orden, descuento);
			precioVenta.setResult(new Result("san-200", "Tarea completada con éxito."));
			return precioVenta;
		}catch(Exception e){
			precioVenta.setResult(new Result("error-404", e.getMessage()));
			return precioVenta;
		}

	}
}
