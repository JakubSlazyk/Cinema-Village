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
@Table(name="Actor_apperence")
public class ActorApperence {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;
	
	@ManyToOne
	@JoinColumn(name="id_movie")
	private Movie id_movie;
	
	@ManyToOne
	@JoinColumn(name="id_actor")
	private Actor id_actor;

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

	public Actor getId_actor() {
		return id_actor;
	}

	public void setId_actor(Actor id_actor) {
		this.id_actor = id_actor;
	}
	public ActorApperence() {}
}
