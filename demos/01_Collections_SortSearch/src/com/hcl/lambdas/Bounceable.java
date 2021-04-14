package com.hcl.lambdas;

@FunctionalInterface  // Bounceable is a functional interface (has exactly one abstract method)
public interface Bounceable<T> {
	
	public boolean test(T obj); // T -> boolean : what you find in a Predicate interface
	
	
	public default void bounceThis() {
		System.out.println("bouncing in the default method");
	}

}
