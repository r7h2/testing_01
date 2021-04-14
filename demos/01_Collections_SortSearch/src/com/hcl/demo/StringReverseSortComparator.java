package com.hcl.demo;

import java.util.Comparator;

public class StringReverseSortComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1); // Z -> A
	}

}
