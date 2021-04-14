package com.hcl.staticdemo;

public class StaticDemo {
	
	static int[] intArray; // static == blueprint == class
	
	public static void main(String[] args) {
		/*
		 * System.out.println("in main method"); for(int i : intArray)
		 * {System.out.println("i = " + i);}
		 */
		
		System.out.println("----------------");
		
		Cat c1 = new Cat();
		c1.makeNoise();
		//c1.makeNoise();
		System.out.println("----------------");
		Cat c2 = new Cat();
		

	}
	
	static {
		System.out.println("in StaticDemo static block");
		intArray = new int[5];
		intArray[0] = 25;
		intArray[2] = 387;
		intArray[4] = 42;
	}

}
