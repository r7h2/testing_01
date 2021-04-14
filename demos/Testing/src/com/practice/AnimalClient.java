package com.practice;

public class AnimalClient {

	//private static Cat c1; // what is the value set to by default? null
	
	public static void main(String[] args) {
		
			Cat c1;
			c1 = new Cat(); // eligible for garbage collection by JVM
			c1.setName("Fluffy");
			System.out.println(c1.getName());
			c1.makeNoise();
			System.out.println("counter: " + Cat.getCounter());
			
			c1.makeNoise();
			
			
			Cat c2 = new Cat(); // this is the 2nd instance of Cat
			c2.setName("Lucy");
			System.out.println(c2.getName());
			c2.makeNoise();
			System.out.println("counter:" + Cat.getCounter());
			
		

	}

}
