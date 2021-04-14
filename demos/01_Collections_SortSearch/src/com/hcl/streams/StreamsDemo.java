package com.hcl.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class StreamsDemo {

	public static void main(String[] args) {
		
		System.out.println("========\n");
		
		// Stream: source -> intermediate operation(s) -> terminal operations
		
		Stream<String> stringStream = Stream.of("mouse", "circle", "friend", 
				"Green Bay Packers", "yes", "no", "baseball");
		
		List<String> myList = stringStream.filter(i -> i.length() > 2)
		.collect(java.util.stream.Collectors.toList());
		System.out.println(myList);
		
		List<String> listStrings1 = Arrays.asList("blue", "random", "hi", "yes", "no", "i", "Packers", "zebra");
		listStrings1.stream().filter(s -> {
			System.out.println("processing this: " + s );
			return s.length() >2; 
			
		})
		.map(x -> x.toUpperCase() )
		.limit(4)
		.skip(1)
		.forEach(i -> System.out.println("value: " + i));
		
		
		
		
		//.collect(null)
		
		//source -> intermediate operations - terminal operation
		
		Stream<Double> doubleStream1 = Stream.of(8.0,98.0,1.98,4.5,98.22, 65.4, 21.0, 95.0);
	     double value = doubleStream1.reduce(1.0, (a,b) -> a*b );
		System.out.println("value: " + value);
		
		
		//System.out.println(count);
		
		
		
		
		System.out.println("========\n");
		
		
		
		List<String> title = Arrays.asList("Java", "Hi", "Run Fast" ,"blah", "yes","apple");
		Stream<String> streamStrings = title.stream();
				streamStrings.filter(s -> s.length() > 3)
				.map(input -> input.toUpperCase() )
				//.map(String::toUpperCase)
				.limit(2)
				.forEach(System.out::println);
				
		List<String> listStrings = new ArrayList<>();
		listStrings.add("Mary");
		listStrings.add("Fred");
		listStrings.add("Nellie");
		listStrings.add("Doug");
		listStrings.add("frED");
		listStrings.add("FrED");
		
		List<String> newList = listStrings.stream().filter(s -> s.equalsIgnoreCase("Fred"))
				.map(i -> i.concat(" is my name"))
				.collect(toList());
		System.out.println("new filtered list: " + newList);
		
		List<Cat> catList = new ArrayList<>();
		catList.add(new Cat("Fluffy", 10));
		catList.add(new Cat("Scrunchy", 5));
		catList.add(new Cat("Gnarley", 4));
		catList.add(new Cat("Beans", 13));
		catList.add(new Cat("Randy", 2));
		catList.add(new Cat("Lucy", 2));
		
		catList.stream().filter(c -> c.getAge() > 4)
		.map(item -> item.getName().toLowerCase())
		.limit(2)
		.forEach(System.out:: println);
		
		Map<String,String> map_01 = new HashMap<>();
		map_01.put("01", "funny");
		map_01.put("02","hello");
		map_01.put("03", "wow");
		
		/*
		 * map_01.forEach((key, value) -> { System.out.println("key:" + key +
		 * " || value: " + value); });
		 */
		Stream<String> strmStrings = Stream.of("zip", "ringo", "bye", "joking", "reading", "ringo", "yellow");
		strmStrings.filter(s -> s.length() > 3)
		.distinct()
		.forEach(System.out::println);
		
		// it starts processing foreach on the fly
		Stream<Integer> strmInts = Stream.of(8,88,12,97,22,654,1,987,46,287,11);
		strmInts.sorted()
		.filter(i -> {
			System.out.println("number being proccessed: " + i);
			return i > 50;})
		//.forEach(System.out::println);
		.forEach(i -> {System.out.println("integer: " + i);});
		
		int reduceResult = Stream.of(9,66,52,11,97,2,4,6)
		.reduce(0, (a,b) -> a+b);
		  //.reduce(0, Integer::sum);
		  //.reduce(0, Integer::max);
		//.reduce(0, Integer::min);
		System.out.println("numbers: " + reduceResult);
		
		System.out.println("-------");
		
		List<String> li = new ArrayList<>();
		li.add("Bob");
		li.add("Aaron");
		li.add("Zeb");
		li.add("Sarah");
		li.stream()
		// "natural" sort using String's Comparable implementation
		.sorted().forEach(s -> System.out.println("String item: " + s));
		//.sorted().forEach(System.out::println);
		// "custom" sort using a Comparator - passing it a lambda that implements Comparator
		// Comparator "functional interface": T,T -> int
		//.sorted((s1,s2) -> s2.compareTo(s1)).forEach(System.out::println);
		
		System.out.println("-----------");
		
		//external iteration = traditional non-streams
		// you control the loop and tell the JVM HOW to do the processing
		
		// internal iteration - Streams
		// you just say WHAT you want - declaratively
		Stream<String> s01 = Stream.of("zip", "ringo", "bye", "joking", "reading", "ringo", "yellow");
		s01.filter(s -> {
			System.out.println("string being filtered: " + s);
			return s.length() > 3;}
		)
		.map(s -> s.toUpperCase())
		.limit(2)
		.forEach(System.out::println);
		
		
		List<Integer> someNumbers = Arrays.asList(5,8,1,9,10,55,7,1,9);
		System.out.println(  someNumbers.stream().reduce(0, (a,b) -> a+b)         );
		Optional<Integer> opt = someNumbers.stream().reduce( (a,b) -> a+b    );
		System.out.println( opt.orElse(87)  );
		opt.ifPresent(System.out::println);
		int sum = someNumbers.stream().reduce(0, Integer::sum);
		System.out.println(sum);
		int max = someNumbers.stream().reduce(0, Integer::max);
		System.out.println(max);
		System.out.println(  someNumbers.stream().reduce(Integer::min).get()    );
		System.out.println(  someNumbers.stream().map(d -> 1).reduce(0, Integer::sum)       );
		
		
		Stream<Integer> newStream = Stream.of(1,5,19,2,88,12, 98,7, 54,23);
		//int newSum = newStream.reduce(0, Integer::sum);
		//System.out.println("sum:" + newSum);
		newStream.filter(i -> {
			System.out.println("i: " + i);
			return i > 20;
		})
		.map(i -> ("value: " + i))
		.limit(2)
		.forEach(System.out::println);
		
		//Predicate, Supplier, Consumer, Function
		Stream<String> newStringStream = Stream.of("fish", "b", "zebra", "skip", "random",
				"yes", "no", "x", "bucaneers", "zebra", "skip", "freddy");
		newStringStream.filter(stringInput -> {
			System.out.println("stringInput = " + stringInput);
			return stringInput.length() >=2;
		})
		.map(s -> s.toUpperCase())
		.distinct()
		.forEach(i -> System.out.println(i));
		
		List<Integer> listIntegers = Arrays.asList(8,9,22,9,1,22,77,87,23,54,12);
		Stream<Integer> strIntegers = listIntegers.stream();
		List<Integer> myIntList = strIntegers.filter(num -> num > 10)
		.map(number -> number * number)
		.collect(java.util.stream.Collectors.toList());
		System.out.println(myIntList);
		
		

	}

}
