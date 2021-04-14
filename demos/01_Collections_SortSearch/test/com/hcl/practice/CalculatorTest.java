package com.hcl.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private static Calculator calc;
	
	@BeforeAll
	public static void setUpOnce() {
		System.out.println("in @BeforeAll");
		calc = new Calculator();
	}
	
	@BeforeEach
	public void runBeforeEachTest() {
		System.out.println("in runBeforeEachTest");
	}

	@Test
	void test() {
		System.out.println("test() method");
		double actual = calc.add(2, 3);
		Assertions.assertEquals(5, actual);
	}
	@Test
	void secondTest() {
		System.out.println("second test");
		double actual = calc.add(2, 3);
		Assertions.assertFalse(4 > 4);
	}
	@Test
	void thirdTest() {
		System.out.println("third test");
		double actual = calc.add(-2, 3);
		Assertions.assertEquals(1, actual);
	}
	
	@AfterEach
	public void afterEachTest() {
		
		System.out.println("in AfterEachTest method");
		
	}
	
	@AfterAll
	public static void closeDownOnce() {
		System.out.println("in @AfterAll");
	}

}
