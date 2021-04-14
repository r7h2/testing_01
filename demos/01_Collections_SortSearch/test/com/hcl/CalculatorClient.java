package com.hcl;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorClient {
	Calculator calc;
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("in setup method");
		calc = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("in teardown method");
	}

	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals(5, calc.add(2, 3));
	}
	@Test
	void testingIsGreaterThanTen() {
		assertTrue(calc.isGreaterThanTen(15));
	}

}
