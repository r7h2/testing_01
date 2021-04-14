package com.hcl;

public class Car {
	
	// encapsulation = "hiding" your data/properties
	private String makeModel;
	private int year; // primitive data type: the value is stored directly in variable: 011110
	private String color; // reference variable type: F15R3S5
	private String licensePlate;
	private boolean registered;
	private double cost; // primitive type: e.g. 5327.98
	
	public void start() {
		System.out.println("starting car....");	
	}
	
	public String drive(String location, int speed) {
		
		System.out.println("location is the following: " + location);
		System.out.println("speed is " + speed);
		
		return "driving my " + year + "," + color + " car";
	}
	public void stop() {
		System.out.println("stopping car....");	
	}

	
	
	public boolean isRegistered() {
		return registered;
	}

	public void setRegistered(boolean registered) {
		this.registered = registered;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	

}
