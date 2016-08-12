package org.vectoritcgroup.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.vectoritcgroup.test.entity.Cliente;
import org.vectoritcgroup.test.repository.ClienteDao;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
		@Autowired
		private ClienteDao clienteDao;
		
		@RequestMapping("/all")
		public @ResponseBody String getTodosClientes() {
			List<Cliente> listCliente = clienteDao.obtenerTodosClientes();
			return listCliente.get(0).toString();
		}
}
