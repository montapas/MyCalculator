package com.cts.examples.cal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.cts.examples.cal.Calculator;
import com.cts.examples.cal.ICalculator;

public class CalculatorTest {
	private static ICalculator calculator;

	@BeforeClass
	public static void initCalculator() {
		calculator = new Calculator();
	}

 
	@Test
	public void testSum() {
		 
		int result = calculator.sum(3, 4);
             	assertEquals(7, result);
	}

	@Test
	public void testDivison() {
		try {
			int result = calculator.divison(10, 2);
                    	assertEquals(5, result);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

	 

	@Ignore
	@Test
	public void testEqual() {
		boolean result = calculator.equalIntegers(20, 20);

		assertFalse(result);
	}

	 
	@Test
	public void testSubstraction() {
		int result = 10 - 3;

		assertTrue(result == 7);
	}
}
