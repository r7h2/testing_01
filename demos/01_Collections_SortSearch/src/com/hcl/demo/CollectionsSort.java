package com.hcl.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsSort {

	public static void main(String[] args) {

		List<String> stringList = new ArrayList<>();

		stringList.add("bread");
		// stringList.add(5); // autoboxes int 5 to Integer(5)
		stringList.add("apple");
		stringList.add("zebra");
		stringList.add("cookie");
		stringList.add("apple");
		stringList.add(2, "pear");

		String result = (String) stringList.get(1);

		System.out.println(stringList);
		for (Object x : stringList) {
			System.out.println(x);
		}

		Collections.sort(stringList);
		System.out.println("sorted list: " + stringList);
		
		//stringList.forEach(System.out::println);
		stringList.forEach(s -> System.out.println("item:" + s));
		
		//Collections.reverse(stringList);
		//System.out.println("trying reverse sort" + stringList);
		StringReverseSortComparator rs = new StringReverseSortComparator();
		Collections.sort(stringList, rs  );
		System.out.println("reverse sorted list with Comparator: " + stringList);
		
		
		
		System.out.println("------");
		
		List<Person> p1 = new ArrayList<>();
		Person person1 = new Person("Rick", 88);
		p1.add(new Person("Bill", 50));
		p1.add(new Person("Sandy", 25));
		p1.add(new Person("Lucy", 10));
		p1.add(new Person("Linus", 60));
		p1.add(new Person("Bjarne", 77));
		p1.add(new Person("Zeb", 36));
		
		System.out.println("unsorted:" + p1);
		
		Collections.sort(p1);
		System.out.println("sorted by age:" + p1);
		
		
		
		
		Collections.sort(p1, new PersonByAgeComparator());
		System.out.println("sorted using Comparator:" + p1);
		
		
		
		
		
		

	}

}
