package com.hcl.model;

import javax.persistence.Column;
import javax.persistence.Entity; // this is JPA spec class
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table; // jpa spec classes

@Entity
@Table(name = "robot")
public class Robot {
	@Id // mandatory field in every @Entity class // this is the primary key
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="name")
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Robot [id=" + id + ", name=" + name + "]";
	}
	
	

}
