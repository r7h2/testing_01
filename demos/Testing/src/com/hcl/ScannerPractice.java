package com.hcl;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		
		/*
		 * Scanner in = new Scanner(System.in); String s = "enter a few names:";
		 * System.out.println(s); while((s = in.nextLine()) != "") {
		 * System.out.println("input is this: " + s); String [] tokens = s.split(" ");
		 * System.out.println(tokens[0]); }
		 */
		
		Scanner in2 = new Scanner(System.in);
		//in2.useDelimiter(", *"); // delimiter is a comma separated by zero or more whitespaces
		// note: Scanner uses white space as default delimiter
		System.out.println("now enter a few numbers separted by spaces:");
		while(in2.hasNext()) {
			System.out.println("in2 contents: " + in2.next());	
		}

	}

}
