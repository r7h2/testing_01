package com.hcl;

public class CarClient {

	public static void main(String[] args) {
		System.out.println("starting");
		Car car1 = new Car();
		car1.model = "Taurus";
		car1.year = 2009;
		car1.licensePlate = "xyz";
		car1.registered = true;
		
		car1.startUp();

	}

}
