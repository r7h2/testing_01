package com.hcl;

public class CarClient {

	public static void main(String[] args) {
		System.out.println("Starting program");
		
		Car car1 = new Car(); // instance #1
		car1.startUp();
		car1.setModel("Taurus");
		car1.setYear(2006);
		car1.startUp();
		
		Car car2 = new Car(); // instance #2
		car2.setModel("Jetta");
		car2.setYear(1998);
		car2.setLicensePlate("xyz");
		car2.startUp();
		
		System.out.println("End program");
	} // end of the main method

}
