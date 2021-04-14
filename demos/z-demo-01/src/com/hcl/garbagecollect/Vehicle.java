package com.hcl.garbagecollect;

public class Vehicle {

	Integer i = 12;
	String s1 = "hi";
	
	public void blah() {
		
		
	}
	// this is called at most only once by JVM
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("removed: " + this);
	}
	
	

}
