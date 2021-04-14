package com.hcl;

public class Car implements Comparable<Car> {
	private String model;
	private int year;
	
	
	
	public Car(String make, int year) {
		super();
		this.model = make;
		this.year = year;
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


	
	  @Override public int compareTo(Car o) { // TODO Auto-generated method stub
	  return model.compareTo(o.getModel()); }
	 


	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + "]";
	}


	
	

}
