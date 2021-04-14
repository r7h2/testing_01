package com.hcl;

public class HelloWorld {

	public static void main(String[] args) {
		
		int[] testArray = {5,7,10};
		System.out.println("array is " + testArray);
		
		System.out.println("array length: " + testArray.length);
		
		for(int i = 0; i < testArray.length; i++) {
			System.out.println("i = " + testArray[i]);
			
		}
		
		// for-each loop
		for(int x : testArray) {
			System.out.println("x = " + x);
		}
		
		String[] sArray = new String[10];
		
		sArray[0] = "Jimbo"; // new String("Jimbo");
		//sArray[10] = "Lily";

	}
}
