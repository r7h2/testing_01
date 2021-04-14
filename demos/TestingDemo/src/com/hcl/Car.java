package com.hcl;

public class Car {
	
	String makeModel;
	int year;
	double cost;
	String color;
	String licensePlate;
	boolean registered;
	
	public void start() {
		System.out.println("My " + year + " "  + color + ", " + makeModel + 
				" is starting!");	
	}
	
	public void stop() {
		System.out.println("stopping my " + makeModel + " with licence plate #: " + 
	licensePlate);
		
	}
	

}
