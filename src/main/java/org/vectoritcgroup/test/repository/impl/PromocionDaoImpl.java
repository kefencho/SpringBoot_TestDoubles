package org.vectoritcgroup.test.repository.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.SessionFactoryUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.vectoritcgroup.test.entity.Promocion;
import org.vectoritcgroup.test.repository.PromocionDao;

@Repository
@Transactional
public class PromocionDaoImpl implements PromocionDao{
	private HibernateTemplate hibernateTemplate;
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public PromocionDaoImpl(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
		this.jdbcTemplate = new JdbcTemplate(SessionFactoryUtils.getDataSource(sessionFactory));
	}

	
	public List<Promocion> obtenerTodasPromociones() {
		StringBuffer query = new StringBuffer(" from Promocion ");
		List<Promocion> list = (List<Promocion>)hibernateTemplate.find(query.toString());
		return list;
	}


	@Override
	public Promocion obtenerPromocioPorCodigo(String codigo) {
		Promocion promocion = hibernateTemplate.get(Promocion.class, codigo);
		return promocion;
	}
}
