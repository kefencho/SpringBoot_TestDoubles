package org.vectoritcgroup.test.repository.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.SessionFactoryUtils;
import org.springframework.stereotype.Repository;
import org.vectoritcgroup.test.entity.Producto;
import org.vectoritcgroup.test.repository.ProductoDao;

@Repository
public class ProductoDaoImpl implements ProductoDao {
	
	private HibernateTemplate hibernateTemplate;
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public ProductoDaoImpl(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
		this.jdbcTemplate = new JdbcTemplate(SessionFactoryUtils.getDataSource(sessionFactory));
	}

	@Override
	public List<Producto> obtenerTodosProductos() {
		StringBuffer query = new StringBuffer(" from Producto ");
		List<Producto> list = (List<Producto>)hibernateTemplate.find(query.toString());
		return list;
	}

	@Override
	public Producto obtenerProductoPorCodigo(String codigo) {
		Producto producto = hibernateTemplate.get(Producto.class, codigo);
		return producto;
	}

}
