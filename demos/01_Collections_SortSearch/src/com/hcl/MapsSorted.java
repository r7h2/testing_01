package com.hcl;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapsSorted {

	public static void main(String[] args) {
		
		
		
		
		Set<String> s1 = new TreeSet<>();
		s1.add("Bill");
		s1.add("Sandy");
		s1.add("Susie");
		s1.add("Zeb");
		s1.add("Lucy");
		s1.add("Aaron");
		s1.add("Susie");
		System.out.println("Strings sorted in TreeSet" );
		for(String s : s1) {
			System.out.println(s);
		}
		
		Set<Double> d1 = new TreeSet<>();
		d1.add(3.23);
		d1.add(87.6);
		d1.add(1.22);
		d1.add(53.9);
		d1.add(1.22);
		System.out.println("\nDoubles sorted in TreeSet");
		for(Double d : d1) {
			System.out.println(d);
		}
		
		CarModelReverseSort carComparator = new CarModelReverseSort();
		//Set<Car> carSet = new TreeSet<>(carComparator);
		Set<Car> carSet = new TreeSet<>();
		carSet.add(new Car("Taurus", 1995));
		carSet.add(new Car("Carolla", 2002));
		carSet.add(new Car("Ultima", 2006));
		System.out.println("trying to sort cars");
		for(Car c : carSet) {
			
			System.out.println(c);
		}
		
		System.out.println("--------");
		
		Map<String, String> mapSorted = new TreeMap<>();
		mapSorted.put("five", "bingo");
		mapSorted.put("two", "blah");
		mapSorted.put("ten", "cow");
		mapSorted.put("seven", "chicken");
		
		System.out.println(mapSorted);
		for(String s : mapSorted.keySet()) {
			System.out.println(s);
		}
		for(Map.Entry<String, String> mapEntry : mapSorted.entrySet()) {
			
			System.out.println("key=" + mapEntry.getKey() + "|" + "value=" + mapEntry.getValue());
		}
		
		Map m = new TreeMap();
		m.put(10, "hi");
		m.put(5, "blah");
		

	}

}
