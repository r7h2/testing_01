package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SelectPackages;

//https://www.springboottutorial.com/spring-boot-unit-testing-and-mocking-with-mockito-and-junit
// https://spring.io/guides/gs/testing-web/
//https://howtodoinjava.com/spring-boot2/testing/datajpatest-annotation/
class CalculatorTest {

	static Calculator calc;
	@BeforeAll
	static void setup() {
		System.out.println("BeforeAll - do setup stuff once");
	}
	
	@BeforeEach
	void setUpThis() {
		System.out.println("@BeforeEach executing");
		calc = new Calculator();
	}
	
	@Test
	void testPositiveNums() {
		System.out.println("Test_01");
		Assertions.assertEquals(5, calc.add(3, 2));
		Assertions.assertFalse(5 > calc.add(1, 5));
	}
	@Disabled
	@Test
	void testNegativeEvenNums() {
		System.out.println("Test_02");
		Assertions.assertNotEquals(-4, calc.add(-2, -3));
	}
	@Test
	void testOnDev() {
		System.out.println("Test_03");
		System.setProperty("ENV", "DEV");
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
		System.out.println("Passed the assume test");
		Assertions.assertNotNull(calc);
	}
	
	@AfterEach
	void tearThis() {
		System.out.println("@After each");
		calc = null;
	}
	
	@AfterAll
	static void tearDown() {
		System.out.println("AfterAll - clean up - only runs once");
	}


}
