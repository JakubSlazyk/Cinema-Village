package com.github.jakubslazyk.DAO;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.jakubslazyk.entity.Movie;

@Repository
public class DAOLayerImpl<T> implements DAOLayer<T> {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<T> getAll(String table) {
		Session mySession = sessionFactory.getCurrentSession();
		List <T> dataList = mySession.createQuery("from "+table).getResultList();
		return dataList;
	}

	@Override
	public void add(T object) {
		Session mySession = sessionFactory.getCurrentSession();
		mySession.save(object);	
		}

	@Override
	public List<T> getAll(String table, int id) {
		Session mySession = sessionFactory.getCurrentSession();
		List <T> dataList = mySession.createQuery("from "+table+" where id="+id).getResultList();
		return dataList;
	}

	@Override
	public Movie getBestMovie() {
		Session mySession = sessionFactory.getCurrentSession();
		List<Movie> myMovie=mySession.createQuery("from Movie order by rating desc").getResultList();
		return myMovie.get(0);
	}
	

}
