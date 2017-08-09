package com.github.jakubslazyk.service;

import java.util.List;

import com.github.jakubslazyk.entity.Movie;

public interface ServiceLayer<T> {
	
	public List<T> getAll(String table);
	public List<T> getAll(String table,int id);
	public void add(T object);
	public Movie getBestMovie();
}
