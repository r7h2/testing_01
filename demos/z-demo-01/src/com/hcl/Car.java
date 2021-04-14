package com.hcl;

public class Car { // a blueprint  or recipe
	
	// encapsulating your data by using the private keyword
	private String model; // null by default
	private int year; // 0 by default
	private String licensePlate;
	private boolean registered; // false by default
	
	public void startUp() {
		
		System.out.println("starting method");
		
		System.out.println("model: " + model + "\nyear: " + year + "\nlicensePlate: " + 
		licensePlate + "\nregistered: " + registered);
		
	} // end of the startUp method

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
