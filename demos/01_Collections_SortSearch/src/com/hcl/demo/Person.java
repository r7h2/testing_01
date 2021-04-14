package com.hcl.demo;

public class Person implements Comparable<Person> {
	
	private String name;
	private int age;
	
	public Person() {} // default constructor

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}
	
	

	@Override
	public int compareTo(Person o) {
		
		// if both are the same: then 0
		// if first name is < than second name: - number
		// if first name is > than second name: + number
		
		//return name.compareTo(o.getName()) ;
		return  Integer.compare(age, o.getAge()) ; // the "natural" sorting order is by age
	}
	
	

}
