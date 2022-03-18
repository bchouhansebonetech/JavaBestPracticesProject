package com.sebone.numbers.integeroperations.test;

import com.sebone.numbers.integeroprations2.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountDigitsOfNumberTest {

	@Test
	public void testGetNumberOfDigitsOfGivenNumber () {
		CountDigitsOfNumber countDigitsOfNumber = new CountDigitsOfNumber();
		
		assertEquals(1, countDigitsOfNumber.getNumberOfDigitsOfGivenNumber(0));
		assertEquals(5, countDigitsOfNumber.getNumberOfDigitsOfGivenNumber(94582));
		assertEquals(6, countDigitsOfNumber.getNumberOfDigitsOfGivenNumber(983274));
		assertEquals(3, countDigitsOfNumber.getNumberOfDigitsOfGivenNumber(-555));
		assertEquals(1, countDigitsOfNumber.getNumberOfDigitsOfGivenNumber(-0));
	}

}
