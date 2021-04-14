package com.hcl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {

	public static void main(String[] args) {
		Pattern pat;
		Matcher mat;
		boolean found;
		
		pat = Pattern.compile("Java");
		mat = pat.matcher("Javag");
		found = mat.matches(); // check for a match
		
		System.out.println("Testing Java against Java");
		if (found) System.out.println("Matches");
		else System.out.println("no match");
		
		System.out.println();
		
		System.out.println("Testing Java against Java 10");
		mat = pat.matcher("Java 10");
		found = mat.matches();
		
		
		if (found) System.out.println("Matches");
		else System.out.println("no match");
		
		System.out.println("trying out the find() method that looks for a subsequence");
		
		if (mat.find()) {
			System.out.println("subsequence found");
		}
		else System.out.println("no subsequence match found");
		

	}

}
