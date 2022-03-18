package com.sebone.numbers.integeroperations.test;

import com.sebone.numbers.integeroprations2.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciSeriesTest {

	@Test
	public void testGetFibonacciSeriesUptoN() {
		
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		
		int arr1[] = {0, 1, 1, 2, 3};
		assertArrayEquals(arr1 , fibonacciSeries.getFibonacciSeriesUptoN(5));
		int arr2[] = {0, 1};
		assertArrayEquals(arr2 , fibonacciSeries.getFibonacciSeriesUptoN(2));
		int arr3[] = {0};
		assertArrayEquals(arr3 , fibonacciSeries.getFibonacciSeriesUptoN(1));
		int arr4[] = {};
		assertArrayEquals(arr4 , fibonacciSeries.getFibonacciSeriesUptoN(0));
		assertArrayEquals(arr4 , fibonacciSeries.getFibonacciSeriesUptoN(-56));
		
	}

}
