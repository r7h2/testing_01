package com.hcl.garbagecollect;

import java.util.Date;

public class GarbageTruck {

	public static void main(String[] args) {
		
		// an object is eligible for garbage collection when no live thread can access it
		
		//example: nulling a reference
		StringBuffer sb1 = new StringBuffer("testing");
		System.out.println("sb1: " + sb1); // sb1 is not eligible for garbage collection. 
		sb1 = null; // sb1 is now eligible for collection
		
		//example: reassigning a reference variable
		StringBuffer sb2 = new StringBuffer("hello");
		StringBuffer sb3 = new StringBuffer("goodbye");
		System.out.println("sb2: " + sb2);
		sb2 = sb3; // now "hello" StringBuffer object is eligible for garbage collection
		
		// example: objects that are created in a method
		Date d = getDate();
		System.out.println("d :" + d);

	}

	
	private static Date getDate() {
		Date d2 = new Date();
		StringBuffer now = new StringBuffer(d2.toString());
		System.out.println("now: " + now);
		return d2; // after this returns,  StringBuffer "now" object is eligible for garbage collection
	}

}
