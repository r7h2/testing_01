package com.hcl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {

	public static void main(String[] args) {
		// old way of storing items
		/*
		 * int[] intArray = new int[5]; // 58 0111101 intArray[0] = 43; intArray[1] =
		 * 88; for(int i : intArray) { System.out.println("i: " + i); } intArray[3] =
		 * 24; for(int x = 0; x < intArray.length; x++) { System.out.println("x: " +
		 * intArray[x]); }
		 */
	
		
		  List<Integer> integerList = new ArrayList<>(); 
		  integerList.add(51);
		  integerList.add(88); 
		  integerList.add(55); 
		  integerList.add(13);
		  integerList.add(99);
		  
		  System.out.println(integerList.contains(88));
		  System.out.println(integerList.size());
		  System.out.println(integerList.get(1)); 
		  System.out.println(integerList);
		  
		  System.out.println("---------");
		  
		  ArrayList<String> list1 = new ArrayList<>(); list1.add("bingo");
		  list1.add("oats"); list1.add("carrots"); list1.add("chess");
		  //list1.remove(1); list1.add(1, "pizza"); //list1.add(5);
		  
		  System.out.println("Looping through the ArrayList of Strings:"); 
		  for(String s: list1) { System.out.println("Item: " + s); }
		 
		System.out.println("---------");
		
		Set<String> set1 = new HashSet<>();
		set1.add("door"); // bucket(4)
		set1.add("eye"); // bucket(3) "eye" is already existing here
		set1.add("fish"); // bucket(4) now there are two strings in bucket4
		set1.add("eye"); // rejecting this one 1. runs the hashcode() 2. runs the equals() method
		// hashCode is basically corresponds to a bucket(54)
		// hashcode for "eye" would be bucket(3)
		set1.add("bingo"); // bucket(5)
		System.out.println("\nsize: " + set1.size());
		
		for(String s : set1) {
			System.out.println(s);
		}
		
		System.out.println("---------");
		
		Cat c1 = new Cat("Molly");
		
		Set<Cat> catSet = new HashSet<>();
		catSet.add(c1);
		catSet.add(new Cat("Rick"));
		catSet.add(new Cat("Rita"));
		catSet.add(new Cat("Bill"));
		catSet.add(new Cat("Bill"));
		//catSet.remove(c1);
		
		System.out.println("\nsize of catSet: " + catSet.size());
		
		for(Cat c : catSet) {
			System.out.println(  c.toString()  );
		}
		
		//catSet.forEach(System.out::println);
		/*
		 * catSet.forEach(cat -> { System.out.println("--------");
		 * System.out.println(cat); });
		 */
		
		System.out.println("---------");
		
		Map<String, String> myMap = new HashMap<>();
		myMap.put("one", "blah");
		myMap.put("two", "yes");
		myMap.put("three", "baseball");
		myMap.put("four", "rocks");
		
		System.out.println("myMap printed out is this: " + myMap);
		System.out.println(myMap.get("three"));
		System.out.println("-------");
		
		System.out.println("-------");
		//myMap.forEach((k,v) -> System.out.println("key:" + k + "||value:" + v));
		
		System.out.println("item from map: " + myMap.get("three"));
		Set<String> stringsSet = myMap.keySet();
		System.out.println(stringsSet);
		
		Map<Integer, String> myIntegerMap = new HashMap<>();
		myIntegerMap.put(8, "winter");
		myIntegerMap.put(22, "singer");
		myIntegerMap.put(41, "chair");
		
		myIntegerMap.replace(22, "opera singer");
		System.out.println(myIntegerMap);
		
		

	} // end main

}
