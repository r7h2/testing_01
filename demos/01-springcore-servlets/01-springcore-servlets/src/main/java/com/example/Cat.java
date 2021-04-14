package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myCat")
public class Cat {
	
	@Autowired
	//@Qualifier("myStringBean")
	private String name;
	
	public Cat() {}
	
	

	public Cat(String name) {
		super();
		this.name = name;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}
	
	
	

}
