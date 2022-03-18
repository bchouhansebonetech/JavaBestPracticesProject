package com.sebone.numbers.integeroperations.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sebone.numbers.integeroprations2.FactorialOfNumber;

public class FactorialOfNumberTest {

	@Test
	public void testGetFactorialOfNumber() {
		FactorialOfNumber factorialOfNumber = new FactorialOfNumber();
		
		assertEquals(120, factorialOfNumber.getFactorialOfNumber(5));
		assertEquals(0, factorialOfNumber.getFactorialOfNumber(-55));
		assertEquals(1, factorialOfNumber.getFactorialOfNumber(0));


	}

}
