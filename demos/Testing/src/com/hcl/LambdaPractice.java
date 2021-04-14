package com.hcl;

public class LambdaPractice {

	public static void main(String[] args) {
		
		DogQuerier dq = d -> d.getAge() > 9;
		
		/*
		 * DogQuerier dq = d -> { System.out.println("inside the lambda"); return
		 * d.getAge() > 9; };
		 */
		
		// DogQuerier dq = (d) -> d.getAge() > 9; // legal
		// DogQuerier dq = (Dog d) -> d.getAge() > 9; // legal
		//DogQuerier dq = d -> {return d.getAge() > 9;}; // legal
		
		Dog d1 = new Dog();
		//d1.setAge(22);
	
		System.out.println("Is my dog older than 9? " + dq.test(d1));

	}

}
