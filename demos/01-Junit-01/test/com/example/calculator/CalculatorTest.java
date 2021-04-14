package com.example.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
// https://www.springboottutorial.com/spring-boot-unit-testing-and-mocking-with-mockito-and-junit
//https://spring.io/guides/gs/testing-web/
//https://howtodoinjava.com/spring-boot2/testing/datajpatest-annotation/

class CalculatorTest {
	static Calculator calc;
	static String str1;
	
	@BeforeAll
	public static void runOnceFirst() {
		calc = new Calculator();
		System.out.println("in the runOnceFirst method");
	}
	
	@BeforeEach
	public void runEachTimeBefore() {
		System.out.println("run each time BEFORe");
	}
	
	//@Disabled
	@Test
	void testEvenPostiveNumbers() {
		System.out.println("in the testEvenPositive method");
		
		double result = calc.add(2, 4);
		Assertions.assertEquals(6, result);
		Assertions.assertEquals(10 ,calc.add(4,6));
		Assertions.assertFalse( 1 > 2);
		Assertions.assertTrue(3 > 2);
		Assertions.assertNotNull(calc);
		Assertions.assertNull(str1);
	
	}
	@Test
	void testOddPositiveNumbers() {
		System.out.println("in the TEST2 method");
		Assertions.assertEquals(4, calc.add(3, 1));
	
	}
	@AfterEach
	public void runEachTimeAfter() {
		System.out.println("run each time AFTER");
	}
	
	
	@AfterAll
	public static void runOnceLast() {
		System.out.println("in the runOnceLast method");
	}

}
