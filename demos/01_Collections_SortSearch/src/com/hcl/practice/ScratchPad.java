package com.hcl.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;



public class ScratchPad {

	public static void main(String[] args) {
		
		Stream<Double> strDoubles = Stream.of(1.26, 3.22,.55, 8.76, 4.21, 7.76, 1.78);
		strDoubles.filter(d -> 
		{
			System.out.println("num" + d);
			return d > 3;
		})
		.limit(3).forEach(System.out::println);
		
		//System.out.println("count: " + count);
		
		// Predicate: object -> boolean
		Predicate<String> p1 = s -> s.length() > 3;
		System.out.println(p1.test("Fred"));
		
		//Consumer: object -> void
		Consumer<String> cons = s -> 
		{
			System.out.println("original:" + s);
			String str = s.toUpperCase();
			System.out.println("updated:" + str);
		};
		cons.accept("Hello");
		
		//Supplier: () -> object
		Supplier<String> strSupplier = () -> "Sally";
		String suppliedString = strSupplier.get();
		System.out.println(suppliedString);
		
		//Function (java.util.function.Function): object -> same/diff object
		Function<Integer, Integer> intFunction = i -> ++i;
		Integer result = intFunction.apply(5);
		System.out.println("result: " + result);
		
		Function<String, String> strFunct = s -> {
			System.out.println("s = " + s);
			return s.toUpperCase();
		};
		System.out.println("result: " + strFunct.apply("abc"));
		
		Consumer<Double> consDouble = System.out::println;
		consDouble.accept(56.7);
		
		List<String> strList1 = new ArrayList<>();
		strList1.add("apple pie");
		strList1.add("rig");
		strList1.add("zebra");
		strList1.add("pear");
		strList1.add("ran");
		strList1.add("darkKnight");
		
		Stream<String> streamString = strList1.stream();
		streamString.filter(s -> {
			System.out.println(s);
			return s.length() > 4;
		})
		.map(i -> i.toUpperCase())
		.limit(3)
		.forEach(System.out::println);
		
		List<Double> doubleList = new ArrayList<>();
		doubleList.add(56.2);
		doubleList.add(22.1);
		doubleList.add(98.3);
		doubleList.add(3.56);
		doubleList.add(18.5);
		doubleList.add(22.1);
		
		List<Double> finishedList = doubleList.stream().filter(d -> {
			System.out.println("filter: " + d);
			return d > 23;
			})
		.map(i -> i+100)
		//.forEach(System.out::println);
		.collect(toList());
		
		
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
		
		Optional<String> firstNum = doubleList.stream().filter(d -> d >4)
		.distinct().skip(1)
		.map(i -> "number:" + i)
		.findFirst();
		//.forEach(System.out::println);
		//.allMatch(s -> s.startsWith("y"));
		//System.out.println(firstNum);
		firstNum.ifPresent(System.out::println);
		
		Integer[] myNums = {1,2,3,4,5,10,2,88,2,87,5,77,84,98,22,10};
		Stream<Integer> myStream = Stream.of(myNums);
		myStream.filter(i -> i >3)
		.distinct()
		.skip(2)
		.map(i -> "this is the data: " + i)
		.forEach(System.out::println);
		
		Stream<String> strStream = Stream.of("mouse", "circle", "friend", 
				"Green Bay Packers", "yes", "no", "baseball", "tennis", "blue");
		
		strStream.filter(s -> {
			System.out.println("filtering: " + s);
			return s.length() > 4;
		})
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
		
		
		System.out.println("=====\n");
		Stream<String> strmStr = Stream.of("rock", "apron", "ruler", 
				"no", "yes", "i", "flipping", "TimberWolves", "yes", "ruler", "Sally");
		strmStr.filter(s -> s.length() > 2)
		.map(i -> i.toUpperCase())
		.distinct()
		.sorted().skip(1).forEach(System.out::println);
		
		Stream<String> str1 = Stream.of("blah", "z", "read", "Green Bay Packers", "rocky", 
				"no", "yes", "z", "flipper");
		long count = str1.filter(s -> s.length() > 1)
		.map(i -> i.length())
		//.reduce(0, Integer::sum);
		.reduce(0, (a,b)-> a + b);
		System.out.println(count);
		
		List<String> listMyStrings = Arrays.asList("blah", "v", "running", "Jump", "eat", 
				"zebra", "apple","no", "t");
		
		listMyStrings.stream().filter(s -> {
			System.out.println("processing this string: " + s);
			return s.length() > 3;	
		})
		
		.map(i -> {
			
			System.out.println("converting this string to uppercase: " + i);
			return i.toUpperCase();
		})
		.limit(3)
		.forEach(item -> {
			System.out.println("the final item: " + item);
			
		});
		
		Stream<String> streamNames = Stream.of("fred", "sally", "jane", "rambo", "pluto");
		List<String> collectedList = streamNames.map(s -> s.toUpperCase())
		.sorted()
		.collect(java.util.stream.Collectors.toList());
		System.out.println("collected list: " + collectedList); 
		// import static java.util.stream.Collectors.toList;
		

	}

}
