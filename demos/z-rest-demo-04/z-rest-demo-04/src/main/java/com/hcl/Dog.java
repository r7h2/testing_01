package com.hcl;

public class Dog {
	
	private String name;
	
	public Dog() {}

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
