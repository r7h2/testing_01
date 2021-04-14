package com.hcl.constructor;

public class Dog extends Animal { // Dog is a subclass of Animal - Dog IS-A Animal, Dog IS-A Object
	private int age; // default is set to 0;
	private boolean b; // default value of b: false
	
	public Dog() {
		this(5);
		// calls the superclass default constructor in Animal
		// chisel and define the age property. And set to what default value: 0  
		System.out.println("in the Dog constructor - age: " + age);
		age = 2;
		System.out.println("in the Dog constructor - age: " + age);
	} // sends address of the Dog object back to client
	public Dog(int age) {
		super();
		System.out.println("in the overloaded Dog constructor age = " + age);
		this.age = age;
		System.out.println("in the overloaded Dog constructor age= " + age);
	}
	
	public void makeNoise() {System.out.println("woof woof");}
	
	public void blah() {}	
}

// Animal a = new Dog();

// Animal d = new Cat() //  spring framework provides
// Animal d = AnimalFactory.getAnimal("cat"); // Spring
// ApplicationContext ctx = setup stuff
// String cat = ctx.getBean("1");
// d.makese();