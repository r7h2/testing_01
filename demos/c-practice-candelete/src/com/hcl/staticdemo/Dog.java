package com.hcl.staticdemo;

public class Dog {
	private String name;
	private int age;
	private static int counter;
	
	public void makeNoise() {
		
		System.out.println("in makeNoise method");
		counter++;
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

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Dog.counter = counter;
	}
	
	

}
