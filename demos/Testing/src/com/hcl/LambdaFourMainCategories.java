package com.hcl;

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

		// You'll find 43 functional interfaces in java.util.function, and they all fall
	    // into one of four categories: predicates, suppliers, consumers, or functions. Each functional
	    // interface has a single abstract method (the functional method) and sometimes static 
	    // and default methods. 
	    // The four basic types of functional interfaces (@FunctionalInterface):
	    // Predicate, Supplier, Consumer, Function
	
	public static void main(String[] args) {
		//Predicate: obj -> boolean      
		//https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html
		Predicate<Integer> pred01 = i -> (i > 50);
		boolean result = pred01.test(41);
		System.out.println("result: " + result);
		
		//Supplier: () -> obj
		Supplier<String> supp01 = () -> {
			return "testing out supplier";
		};
		String supplierResult = supp01.get();
		System.out.println(supplierResult);
		
		//Consumer: obj -> void
		Consumer<String> cons01 = s -> System.out.println(s);
		Consumer<Double> cons02 = System.out::println;
		cons01.accept("woo hoo!");
		cons02.accept(8.2);
		
		// Function: obj -> obj
		Function<String, Integer> func01 = s -> s.length();
		System.out.println("the Function output: " + func01.apply("Yes"));
		
		//BiConsumer: obj, obj -> void
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
		strList.forEach(System.out::println);
		strList.forEach(i -> System.out.println("item: " + i));
		
		List<String> strList2 = new ArrayList<>();
		strList2.add("Clover");
		strList2.add("Rover");
		strList2.add("Aiko");
		strList2.forEach(d -> System.out.println("Dog's name: " + d));
	

	}

}
