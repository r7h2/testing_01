package com.hcl;

public class CarClient {

	public static void main(String[] args) {
		System.out.println("starting the program");
		
		Car car1 = new Car(); // instance #1 has an address
		car1.setModel("Accord");
		car1.setYear(2008);
		
		car1.startUp();
		
		
		Car car2 = new Car(); // instance #2 has an address
		//car2.model = "Jetta";
		//car2.year = 2006;
		//car2.licensePlate = "xyz";
		
		car2.startUp();
		
		System.out.println("end of the program");

	}

}
