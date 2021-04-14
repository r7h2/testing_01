package com.hcl.garbagecollect;

public class Island {

	String name;
	Island i;
	
	public static void main(String[] args) {
		Integer i =  128; // range is -128 to +127 so now NOT be using the wrapper pool
		Integer ii = 128; // i and ii point to the same object in Integer wrapper pool
	
		String s1 = "hi";
		//s1 = null; // is "hi" eligible for garbage collection?
		String s2 = new String("hi");
		
		if(i == ii) {
			System.out.println("same");
			
		}
		//String s2 = "hi";
		
		Island i2 = new Island();
		Island i3 = new Island();
		Island i4 = new Island();
		
		i2.i = i3; // i2 refers to i3
		i3.i = i4; // i3 refers to i4
		i4.i = i2; // i4 refers to i2
		
		i2 = null;
		i3 = null;
		i4 = null; // now all three objects are all eligible for garbage collection
		
		System.gc();
		
		System.out.println("========");

	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("deleting island: " + this);
	}
	
	

}
