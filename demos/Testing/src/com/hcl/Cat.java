package com.hcl;

import java.util.Objects;

// Cat is subclass; Object is superclass; Object has generic toString(); Cat inherits
// generic toString(); need to override toString() to give Cat-specific version
public class Cat  {
	
	private String name;
	private int age;
	

	public Cat(String name) {
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
		return "Cat's name: " + name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
		//return name.length() * age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		return Objects.equals(name, other.name);
	}

	

	
	
	
	
	

}
