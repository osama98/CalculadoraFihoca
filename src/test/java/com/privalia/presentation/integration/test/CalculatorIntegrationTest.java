package com.privalia.presentation.integration.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.privalia.presentation.Calculator;
import com.privalia.presentation.ICalculator;

public class CalculatorIntegrationTest {

	@Test
	public void testSum() {
		ICalculator calculator = new Calculator();
		assertTrue(calculator.sum(4, 4) == 8);
	}

	@Test
	public void testSubstract() {
		ICalculator calculator = new Calculator();
		assertTrue(calculator.substract(4, 4) == 0);
	}

	@Test
	public void testMultiply() {
		ICalculator calculator = new Calculator();
		assertTrue(calculator.multiply(4, 4) == 16);
	}

	@Test
	public void testDivide() {
		ICalculator calculator = new Calculator();
		assertTrue(calculator.divide(4, 4) == 1);
	}

}
