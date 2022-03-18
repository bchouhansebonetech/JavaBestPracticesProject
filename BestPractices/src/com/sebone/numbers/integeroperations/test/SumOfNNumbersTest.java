package com.sebone.numbers.integeroperations.test;

import com.sebone.numbers.integeroprations1.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumOfNNumbersTest {

	@Test
	public void testGetSumUpto1toN() {
		SumOfNNumbers sumOfNNumbers = new SumOfNNumbers();
		
		assertEquals(55, sumOfNNumbers.getSumUpto1toN(10));
		assertEquals(0, sumOfNNumbers.getSumUpto1toN(0));
		assertEquals(1, sumOfNNumbers.getSumUpto1toN(1));
		assertEquals(0, sumOfNNumbers.getSumUpto1toN(-10));
	}

}
