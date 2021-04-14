package com.hcl.constructor;

public class Animal extends Object { // Object() { // grabs a blob of marble/generic object}
	
	private String name; // chiseling this "name" property in it - and it sets it to null
	
	public Animal() { // no arg or "default" constructor
		super();
		// chiseling and defining and variables in Animal
		System.out.println("in the Animal constructor - name = " + name); //name = null
		name = "Fred";
		System.out.println("in the Animal constructor - name = " + name);
	} // passes back the address of the newly created Animal with value "Fred"

	
	public void makeNoise() {System.out.println("generic noise");};
	
	//Animal a = new Animal();
}
