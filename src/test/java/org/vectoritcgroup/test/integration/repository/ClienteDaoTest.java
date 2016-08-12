package org.vectoritcgroup.test.integration.repository;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.vectoritcgroup.test.ApplicationTests;
import org.vectoritcgroup.test.entity.Cliente;
import org.vectoritcgroup.test.repository.ClienteDao;

public class ClienteDaoTest extends ApplicationTests {

	@Autowired
	private ClienteDao clienteDao;
	
	@Test
	public void obtenerTodosClientesTest(){
		List<Cliente> lista = clienteDao.obtenerTodosClientes();		
		assertTrue(!lista.isEmpty());
	}
	
	@Test
	public void obtenerClientePorDniTest(){
		Cliente cliente = clienteDao.obtenerClientePorDni(43610836);
		assertTrue(cliente.getApellidos().equals("Asto Hinostroza"));
	}
}
