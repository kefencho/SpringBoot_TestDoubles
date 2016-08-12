package org.vectoritcgroup.test.repository;

import java.util.List;

import org.vectoritcgroup.test.entity.Cliente;

public interface ClienteDao {
	public List<Cliente> obtenerTodosClientes();
	public Cliente obtenerClientePorDni(Integer dni);
}
