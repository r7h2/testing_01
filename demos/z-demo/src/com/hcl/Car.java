package com.hcl;

public class Car {
	
	private String model; // null  2nd major category: reference variable type F76287F
	private int year; // 76       011111100  a primitive variable
	private String licensePlate; // null
	private boolean registered; // false
	
	
	public void startUp() {
		
		System.out.println("starting up.... : model: " + model + ", year: " + year + 
				", licensePlate: " + licensePlate + " registered?: " + registered);
		
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getLicensePlate() {
		return licensePlate;
	}


	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}


	public boolean isRegistered() {
		return registered;
	}


	public void setRegistered(boolean registered) {
		this.registered = registered;
	}
	
	
	

}
