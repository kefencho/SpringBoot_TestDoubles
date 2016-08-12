package org.vectoritcgroup.test.repository.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.SessionFactoryUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.vectoritcgroup.test.entity.Cliente;
import org.vectoritcgroup.test.repository.ClienteDao;

@Repository
@Transactional
public class ClienteDaoImpl implements ClienteDao {
	
	private HibernateTemplate hibernateTemplate;
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public ClienteDaoImpl(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
		this.jdbcTemplate = new JdbcTemplate(SessionFactoryUtils.getDataSource(sessionFactory));
	}

	
	public List<Cliente> obtenerTodosClientes() {
		StringBuffer query = new StringBuffer(" from Cliente ");
		List<Cliente> list = (List<Cliente>)hibernateTemplate.find(query.toString());
		return list;
	}


	@Override
	public Cliente obtenerClientePorDni(Integer dni) {
		Cliente cliente = hibernateTemplate.get(Cliente.class, dni);
		return cliente;
	}
}
