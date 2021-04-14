package com.hcl;

public class Car {
	
	String model;
	int year;
	String licensePlate;
	boolean registered;
	
	
	
	public void startUp() {
		
		System.out.println("starting up");
		System.out.println("model: " + model + "\nyear: " + year + "\nlicensePlate: " + licensePlate 
				+ "\nregistered: " + registered);
		
	}

}
