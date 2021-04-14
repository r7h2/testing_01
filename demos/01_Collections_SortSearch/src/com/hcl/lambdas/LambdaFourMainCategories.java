package com.hcl.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaFourMainCategories {

		// You'll find 43 functional interfaces in java.util.function. They all fall
	    // into one of four categories: predicates, suppliers, consumers, or functions. Each functional
	    // interface has a single abstract method (the functional method) and sometimes optional static 
	    // and default methods. 
	
	    // The four basic types of functional interfaces (@FunctionalInterface):
	    // #1: java.util.function.Predicate
	    // #2: java.util.function.Supplier
		// #3: java.util.function.Consumer
	    // #4: java.util.function.Function
	
	public static void main(String[] args) {
		
		// #1: Predicate: T -> boolean   
		// method in Predicate interface called "test"   
		//https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html
		
		Predicate<Integer> pred01 = i -> (i > 50); //T -> boolean
		boolean result = pred01.test(48);
		System.out.println("predicate result: " + result);
		
		// #2: Supplier: () -> T // this will supply me with what type of object? String
		// method in Supplier interface called "get"
		
		Supplier<String> supp01 = () -> {
			System.out.println("hello" );
			return "testing out supplier";
		};
		String supplierResult = supp01.get();
		System.out.println(supplierResult);
		
		// #3: Consumer: T -> void
		// method in Consumer interface called "accept"
		
		Consumer<String> cons01 = s -> System.out.println("this is the consumer output: " + s);
		//Consumer<String> cons01 = System.out::println; //method reference
		Consumer<Double> cons02 = System.out::println; // method reference
		cons01.accept("woo hoo!");
		cons02.accept(8.2);
		
		// #4: Function: T -> R
		// method in Function interface called "apply"
		
		Function<String, Integer> func01 = s -> s.length() ;
		System.out.println("the Function output: " + func01.apply("Hello World"));
		
		//BiConsumer: T,T -> void
		
		BiConsumer<String, Integer> biConsumer01 = (s,i) -> System.out.println("Input 1: " + 
		s + " Input 2: " + i);
		biConsumer01.accept("Fred", 77);
		
		//IntSupplier: () -> int
		
		IntSupplier intSupplier = () -> {return 56;};
		System.out.println("int supplied was this: " + intSupplier.getAsInt());
		
		Predicate<Integer> p1 = i -> i > 5;
		Predicate<Integer> p2 = i -> i < 20;
		Predicate<Integer> p3 = p1.and(p2);
		System.out.println("testing the AND operator: " + p3.test(4));
		System.out.println("testing the AND operator: " + p3.test(16));
		
		// Negating the boolean result of a predicate with "negate()" method
		System.out.println("NEGATE test: " + p1.negate().test(3));
		
		List<String> strList = Arrays.asList("apple", "pear", "grapes", "orange", "blueberries");
		//strList.forEach(System.out::println);
		strList.forEach(i -> System.out.println("item: " + i)); // T -> void
		
		
		List<String> strList2 = new ArrayList<>();
		strList2.add("Clover");
		strList2.add("Rover");
		strList2.add("Aiko");
		strList2.forEach(d -> System.out.println("Dog's name: " + d));
		
	
	

	}

}
