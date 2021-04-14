package com.hcl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dog_01")
public class Dog {
	
	@Autowired
	@Qualifier("myFluffy")
	private String name;
	
	

	/*
	 * public Dog(String name) { super(); this.name = name; }
	 */


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
