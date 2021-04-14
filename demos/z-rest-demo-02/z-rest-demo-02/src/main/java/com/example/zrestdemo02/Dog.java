package com.example.zrestdemo02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myDogFluffy")
public class Dog {
	
	@Autowired
	@Qualifier("getPetName01")
	//@Qualifier("spike")
	String name;
	




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}
	
	

}
