package com.hcl;

public class CarClient {

	public static void main(String[] args) {
		System.out.println("BEGIN PROGRAM");
		
		Car car1 = new Car(); // car1 is points to the first "instance" of Car
		car1.setYear(2005);
		car1.setColor("yellow");
		car1.setCost(10500.87);
		
//		System.out.println("color of the car: " + car1.getColor());
//		System.out.println("year of the car: " + car1.getYear());
//		System.out.println("cost of the car: " + car1.getCost());
		
		car1.start();
		String location = "Dallas";
		String result = car1.drive(location, 55);
		System.out.println(result);
		
		System.out.println("MIDDLE");
		
		Car car2 = new Car(); // car2 points to a second "instance" of Car
		car2.setYear(2019);
		car2.setColor("blue");
		car2.setCost(25500.76);
		
//		System.out.println("color of the car: " + car2.getColor());
//		System.out.println("year of the car: " + car2.getYear());
//		System.out.println("cost of the car: " + car2.getCost());
//		
//		car1.setColor("red"); // car1 got a paint job
//		System.out.println("\ncar1's color is this: " + car1.getColor());
		
		System.out.println("END OF PROGRAM");
	} // end of main method, so end of java application

}
