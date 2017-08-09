package com.github.jakubslazyk.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.github.jakubslazyk.converter.DataConverter;


@Entity
@Table(name="Actor")
public class Actor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="first_name")
	private String first_name;
	@Column(name="surname")
	private String surname;
	@Column(name="nationality")
	private String nationality;
	
	@Column(name="birth_date")
	private LocalDate birth_date;
	
	@Override
	public String toString() {
		return "Actor [id=" + id + ", first_name=" + first_name + ", surname=" + surname + ", nationality="
				+ nationality + ", birth_date=" + birth_date+  "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public LocalDate getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String date) {
		this.birth_date= LocalDate.of(Integer.parseInt(date.substring(0,4)),
									  Integer.parseInt(date.substring(5,7)), 
									  Integer.parseInt(date.substring(8,10)));
	}

	public Actor(){
	}
	
}
