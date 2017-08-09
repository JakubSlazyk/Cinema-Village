package com.github.jakubslazyk.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name="Movie")
public class Movie {

	public Movie(){}
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String title;
	
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", duration=" + duration + ", rating=" + rating
				+ ", premiere_date=" + premiere_date + ", description=" + description + ", id_director=" + id_director
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalTime getDuration() {
		return duration;
	}

	public void setDuration(LocalTime duration) {
		this.duration = duration;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public LocalDate getPremiere_date() {
		return premiere_date;
	}

	public void setPremiere_date(LocalDate premiere_date) {
		this.premiere_date = premiere_date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Director getId_director() {
		return id_director;
	}

	public void setId_director(Director id_director) {
		this.id_director = id_director;
	}

	@Column
	private LocalTime duration;
	
	@Column
	private int rating;
	
	@Column
	private LocalDate premiere_date;
	
	@Column
	private String description;
	
	@ManyToOne
	@JoinColumn(name="id_director")
	private Director id_director;
	
	@Column
	private String trailerLink;
	
	public String getTrailerLink() {
		return trailerLink;
	}

	public void setTrailerLink(String trailerLink) {
		this.trailerLink = trailerLink;
	}

	public String getImgLink() {
		return imgLink;
	}

	public void setImgLink(String imgLink) {
		this.imgLink = imgLink;
	}

	@Column
	private String imgLink;
	
	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinTable(name="Actor_apperence",joinColumns={
			@JoinColumn(name="id_movie")
	},inverseJoinColumns={
			@JoinColumn(name="id_actor")
	})
	private List<Actor> actors = new LinkedList<Actor>();
	
	public List<Actor> getActors() {
		
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}
	
	@ManyToMany
	@Fetch(FetchMode.SELECT)
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(name="Genre_apperence",joinColumns={
			@JoinColumn(name="id_movie")
	},inverseJoinColumns={
			@JoinColumn(name="id_genre")
	})
	private List<Genre> genres = new LinkedList<Genre>();

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}
	

	
}
