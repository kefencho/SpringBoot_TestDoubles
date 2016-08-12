package org.vectoritcgroup.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.vectoritcgroup.test.entity.Promocion;
import org.vectoritcgroup.test.repository.PromocionDao;

@RestController
@RequestMapping("/promo")
public class PromocionController {
	
	@Autowired
	private PromocionDao promocionDao;
	
	@RequestMapping("/todo")
	public @ResponseBody String getTodosPromociones() {
		List<Promocion> listPromocion = promocionDao.obtenerTodasPromociones();
		return listPromocion.get(0).toString();
	}

}
