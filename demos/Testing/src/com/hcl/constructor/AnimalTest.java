package com.hcl.constructor;

public class AnimalTest {

	public static void main(String[] args) {
	
		Animal a1 = new Dog();
		a1.makeNoise(); // this polymorphically calls the makeNoise method on the Dog instance
		
		//Cat c1 = new Cat();
	}

}
