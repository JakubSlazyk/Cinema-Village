package com.github.jakubslazyk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Hall")
public class Hall {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column
	private int hall_number;
	@Column
	private int capacity;
	

	@Override
	public String toString() {
		return "Hall [id=" + id + ", hall_number=" + hall_number + ", capacity=" + capacity + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getHall_number() {
		return hall_number;
	}


	public void setHall_number(int hall_number) {
		this.hall_number = hall_number;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public Hall(){
	}
	
}
