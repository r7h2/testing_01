package com.hcl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		
		List<String> stringList = Arrays.asList("bear", "puppy", "zebra", "aardvark", "cat", "elephant",
				"wasp", "lizard");
		//stringList.set(1, "dog");
		//System.out.println(stringList.size());
		
		
		System.out.println("before sort: " + stringList);
		int binarySearchResult = Collections.binarySearch(stringList, "puppy");
		System.out.println("binary search result before sort: " + binarySearchResult);
	
		Collections.sort(stringList);
		System.out.println("after sort: " + stringList);
		binarySearchResult = Collections.binarySearch(stringList, "puppy");
		System.out.println("binary search result: " + binarySearchResult);
		
		System.out.println("--------------");
		Collections.sort(stringList, new ReverseSortComparator());
		System.out.println("after reverse sort: " + stringList);
		binarySearchResult =  Collections.binarySearch(stringList, "puppy", new ReverseSortComparator());
		System.out.println("binary search result after reverse sort: " + binarySearchResult);
		

	}

}
