package com.hcl;

import java.util.ArrayList;

public class PersonClient {

	public static void main(String[] args) {
		System.out.println("Start program");
		
		ArrayList<String> a1 = new ArrayList<String>();
		System.out.println(a1.stream().count()); // prints 0
		
		int[] intArray = new int[5];
		intArray[0] = 43;
		intArray[1] = 88;
		for(int i : intArray) {System.out.println("i: " + i);}
		for(int x = 0; x <= intArray.length; x++) {
			System.out.println("x: " + intArray[x]);
		}
		
		
		Person p1 = new Person();
		p1.sayHello();
		
		System.out.println("Middle of program");
		
		System.out.println("End of program");
		
		
		
	}

}
