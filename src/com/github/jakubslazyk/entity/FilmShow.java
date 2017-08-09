package com.github.jakubslazyk.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Film_show")
public class FilmShow {
	
	public FilmShow(){}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getDate_time() {
		return date_time;
	}

	public void setDate_time(LocalDateTime date_time) {
		this.date_time = date_time;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getTickets_left() {
		return tickets_left;
	}

	public void setTickets_left(int tickets_left) {
		this.tickets_left = tickets_left;
	}

	@ManyToOne
	@JoinColumn(name="id_movie")
	private Movie id_movie;
	
	@ManyToOne
	@JoinColumn(name="id_hall")
	private Hall id_hall;
	
	public Movie getId_movie() {
		return id_movie;
	}

	public void setId_movie(Movie id_movie) {
		this.id_movie = id_movie;
	}

	public Hall getId_hall() {
		return id_hall;
	}

	public void setId_hall(Hall id_hall) {
		this.id_hall = id_hall;
	}

	@Column
	private LocalDateTime date_time;
	
	@Column
	private float price;
	
	@Column
	private int tickets_left;

}
