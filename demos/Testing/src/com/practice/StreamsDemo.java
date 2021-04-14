package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class StreamsDemo {

	public static void main(String[] args) {
		
		List<String> title = Arrays.asList("Java", "Hi", "Run Fast" ,"blah", "yes","apple");
		Stream<String> streamStrings = title.stream();
				streamStrings.filter(s -> s.length() > 3)
				//.map(input -> input.toUpperCase() )
				.map(String::toUpperCase)
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
		
		map_01.forEach((key, value) -> {
			System.out.println("key:" + key + " || value: " + value);
		});
		

	}

}
