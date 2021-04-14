package com.hcl;

import java.util.ArrayList;
import java.util.Collections;

public class PersonClient {

	public static void main(String[] args) {
		
		ArrayList<String> stuff = new ArrayList<>();
		stuff.add("Denver");
		stuff.add("Boulder");
		stuff.add("Vail");
		stuff.add("Aspen");
		stuff.add("Telluride");
		System.out.println("unsorted " + stuff);
		Collections.sort(stuff);
		System.out.println("sorted " + stuff);
		
		System.out.println("-------");
		
		ArrayList<Person> personArrList = new ArrayList<>();
		personArrList.add(new Person("Fred", 96));
		personArrList.add(new Person("Jane", 32));
		personArrList.add(new Person("Wilma", 64));
		personArrList.add(new Person("Jack", 37));
		personArrList.add(new Person("Brianna", 55));
		
		System.out.println("personArrList unsorted: " + personArrList);
		Collections.sort(personArrList);
		System.out.println("personArrList sorted: " + personArrList);
		

	}

}
