package com.hcl.lambdas;

import java.util.function.Predicate;

public class FunctionalInterfaceClient {

	public static void main(String[] args) {
		
		//#1 option - traditional 
		Bounceable<String> b1 = new Ball();
		System.out.println(   b1.test("Li")    );
		
		
		
		// #2 option - anonymous inner class
		Bounceable<String> b2 = new Bounceable<String>() { // anonymous inner class
			
			@Override
			public boolean test(String obj) {
				// TODO Auto-generated method stub
				return obj.length() > 2;
			}
		};
		
		System.out.println( "anonymous inner class result: " +   b2.test("Ian")    );
		
		
		
		// #3 option - lambda
		//java.util.function.Predicate
		// T -> boolean
		Bounceable<String> p1 = (String s) -> s.length() > 2; // this is a lambda
		System.out.println("Bounceable version using lambda: " + p1.test("Ian"));
		
		Predicate<String> p2 = s -> s.length() > 2; // this is a lambda: T -> boolean
		
		System.out.println("predicate version: " + p2.test("Lu"));
		

	}

}
