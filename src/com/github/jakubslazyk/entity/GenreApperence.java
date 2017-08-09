package com.github.jakubslazyk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Genre_apperence")
public class GenreApperence {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;
	
	@ManyToOne
	@JoinColumn(name="id_movie")
	private Movie id_movie;
	
	@ManyToOne
	@JoinColumn(name="id_genre")
	private Genre id_genre;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Movie getId_movie() {
		return id_movie;
	}

	public void setId_movie(Movie id_movie) {
		this.id_movie = id_movie;
	}

	public Genre getId_genre() {
		return id_genre;
	}

	public void setId_genre(Genre id_genre) {
		this.id_genre = id_genre;
	}
	public GenreApperence() {}
}
