package com.hcl.streams;

 public class Cat extends Animal {
	
	private String name; // instance variable
	private int age; // instance variable
	
	// this is essentially a global variable defined in only place: the blueprint
	private static int counter; // static == blueprint == class
	private static final int SHOE_SIZE = 13;
	
	// Math.PI
	// would be public static final double PI = 3.14..
	
	public Cat() {
	}

	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	// instance method
	@Override
	void makeNoise() {
		counter++;
		System.out.println("meow meow");
		
	}
	
  

// instance methods
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
		Cat.counter = counter;
	}
	
	
	

}
