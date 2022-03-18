/**
 * 
 */
package com.sebone.numbers.integeroperations.test;
import com.sebone.numbers.integeroprations2.*;
//import com.sebone.numbers.integeroprations2.FindingPrimeNumber;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Bhanu Singh
 *
 */
public class FindingPrimeNumberTest {

	@Test
	public void testIsPrime() {
		FindingPrimeNumber findingPrimeNumber = new FindingPrimeNumber();
		
		assertEquals(false, findingPrimeNumber.isPrime(8));
		assertEquals(true, findingPrimeNumber.isPrime(7));
		assertEquals(true, findingPrimeNumber.isPrime(0));
		//here i defined negative numbers as not prime;
		assertEquals(false, findingPrimeNumber.isPrime(-6));
	}

}
