package com.hcl.staticdemo;

public class Cat {
	
	private String name; // instance variable
	private int age; // instance variable
	private static int count = 10; // static variable = means that it is NOT copied out onto each instance. Only in one place - the class. 
	// this static variable == a global variable - this CAN change. 
	
	 public Cat(){
		System.out.println("in Cat constructor");
	}
	
	//instance block #1 // this runs BEFORE the Cat constructor is called
	{
		System.out.println("#1 instance block");
		count++;
		name = "Fluffy";
	}
	
	//instance block #2 // this runs BEFORE the Cat constructor is called
	{
		System.out.println("#2 instance block");
		System.out.println("cat name: " + name);
		System.out.println("cat age: " + age);
		
		count = 100;
		
		System.out.println("count from #2 instance block: " + count);
	}
	
	//static block
	// from a static context (method or block), you can only access other static variables/methods
	static {
		System.out.println("in Cat static block");
		//name = "Sally";
		count++;
		System.out.println("count in static block: " + count);	
	}
	
	// an instance method - this means that this method is copied out onto each instance that is created
	// from an instance variable/method, you can access instance things OR static things. 
	public void makeNoise() {
		count++; // static access
		name = "Sally"; // instance variable it is accessing/setting
		System.out.println("in makeNoise method");
		System.out.println("count in makeNoise: " + count);
	}
	
	

}
