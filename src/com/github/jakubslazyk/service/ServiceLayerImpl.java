package com.github.jakubslazyk.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.jakubslazyk.DAO.DAOLayer;
import com.github.jakubslazyk.entity.Movie;

@Service
public class ServiceLayerImpl<T> implements ServiceLayer<T> {

	@Autowired
	private DAOLayer<T> daoObject;
	
	@Override
	@Transactional
	public List<T> getAll(String table) {
		return daoObject.getAll(table);
	}

	@Override
	@Transactional
	public void add(T object) {
		daoObject.add(object);
	}

	@Override
	@Transactional
	public List<T> getAll(String table, int id) {
		return daoObject.getAll(table,id);
	}

	@Override
	@Transactional
	public Movie getBestMovie() {
		return daoObject.getBestMovie();
		
	}

}
