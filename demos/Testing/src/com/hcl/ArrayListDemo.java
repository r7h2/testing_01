package com.hcl;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		Cat c1 = new Cat("fred");
		Cat c2 = new Cat("jane");
		Cat c3 = new Cat("lily");
		//System.out.println("cat: " +  c1);
		
		// java/util/ArrayList.class
		
		ArrayList<Cat> catArrayList = new ArrayList<>();
		catArrayList.add(c1);
		catArrayList.add(c2);
		catArrayList.add(c3);
		
		for(Cat c : catArrayList) {
			System.out.println(c);		
		}
		
		System.out.println("Cat array is this: " + catArrayList);
		
		
		
		
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("apple");
		list.add("5"); // a String object that has the value 5
		list.add("pear");
		list.add("Fred");
		list.add("Sally");
		list.add("Lucy");
	
		System.out.println("this is the size of the list: " + list.size());
		list.remove("Fred");
		System.out.println("this is the size of the list after the removal: " + list.size());
		
		System.out.println("this is the arraylist: " + list); // println will be calling list.toString()
		
		
		for(String s : list) {
			System.out.println(s);
		}

	}

}
