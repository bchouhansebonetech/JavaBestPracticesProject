package com.sebone.numbers.integeroprations2;

/* 
 * importing java.util.Scanner for taking inputs
 */
import java.util.Scanner;


/*
 * class name: FibonacciSeries 
 * objective: This class is created for getting fibonacci series upto the n;
 * author: Bhanu Singh
 * Date: 17/03/2022
 */
public class FibonacciSeries {
	/*
	 * function name: main 
	 * objective: This is the main function which is public and static, this function is first function invoked when the program runs; 
	 * author: Bhanu Singh
	 * Date: 17/03/2022
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		// Creating the object of scanner class for taking inputs;
		Scanner inputObject = new Scanner(System.in);
		// Taking the input called number for calculating and printing the fibonacci series upto the "number" steps;
		int number = inputObject.nextInt();
		// Creating the object of FibonacciSeries class for calling the member functions of class FibonacciSeries
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		// Invoking the getFibonacciSeriesUptoN function, and the function getFibonacciSeriesUptoN will return the array of fibonacci series;
		int fibonacciSeriesList [] = fibonacciSeries.getFibonacciSeriesUptoN(number);
		for(int iterator = 0; iterator < number; iterator++)
			System.out.print(fibonacciSeriesList[iterator] + " ");
		inputObject.close();
	}
	
	/*
	 * function name: getFibonacciSeriesUptoN 
	 * objective: This function is created for getting the series of fibonacci numbers upto the n steps, firstly i created the array of "numbers" 
	 * and initialize the array 0th index as 0 and 1st index as 1, and then i run the loop till the "number" and just put the sum of array 
	 * previous place and second previous place;
	 * parameters: This function takes 1 parameter called number of int type;
	 * return: This function will return the array of fibonacci series till "number" steps; 
	 * author: Bhanu Singh
	 * Date: 17/03/2022
	 */
	public int[] getFibonacciSeriesUptoN(int number){
		if(number <= 0){
			int arr[] = new int[0];
			return arr;
		}
		int fibonacciSeriesList [] = new int[number];
		
		fibonacciSeriesList[0] = 0;
		
		if(number == 1)
			return fibonacciSeriesList;
		
		fibonacciSeriesList[1] = 1;
		
		for(int iterator = 2; iterator < number; iterator++){
			fibonacciSeriesList[iterator] = fibonacciSeriesList[iterator - 1] + fibonacciSeriesList[iterator - 2];
		}
		
		return fibonacciSeriesList;
	}

}
