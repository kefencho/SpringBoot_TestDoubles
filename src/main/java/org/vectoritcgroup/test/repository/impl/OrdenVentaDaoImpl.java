package org.vectoritcgroup.test.repository.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.SessionFactoryUtils;
import org.springframework.stereotype.Repository;
import org.vectoritcgroup.test.entity.OrdenVenta;
import org.vectoritcgroup.test.repository.OrdenVentaDao;

@Repository
public class OrdenVentaDaoImpl implements OrdenVentaDao {

	private HibernateTemplate hibernateTemplate;
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public OrdenVentaDaoImpl(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
		this.jdbcTemplate = new JdbcTemplate(SessionFactoryUtils.getDataSource(sessionFactory));
	}
	
	@Override
	public List<OrdenVenta> obtenerTodosOrdenVenta() {
		StringBuffer query = new StringBuffer(" from OrdenVenta ");
		List<OrdenVenta> list = (List<OrdenVenta>)hibernateTemplate.find(query.toString());
		return list;
	}

	@Override
	public OrdenVenta obtenerOrdenPorId(Integer idOrden) {
		OrdenVenta ordenVenta = hibernateTemplate.get(OrdenVenta.class, idOrden);
		return ordenVenta;
	}

}
