package com.github.jakubslazyk.DAO;

import java.util.List;

import com.github.jakubslazyk.entity.Movie;

public interface DAOLayer<T> {
	List <T> getAll(String table);
	List <T> getAll(String table, int id);
	Movie getBestMovie();
	void add(T object);
}
