
package com.sebone.numbers.integeroprations1;
//should be within 8 char

/* 
 * importing java.util.Scanner for taking inputs
 */
import java.util.Scanner;

/*
 * class name: SumOfNNumbers 
 * objective: This class is created for getting the sum of 1 to n numbers where n is taken by user
 * author: Bhanu Singh
 * Date: 17/03/2022
 */

public class SumOfNNumbers {
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
		// Taking the input called number for getting the sum of 1 to numbers
		int number = inputObject.nextInt();
		// Creating the object of SumOfNNumbers class for calling the member functions of class SumOfNNumbers
		SumOfNNumbers sumOfNNumbers = new SumOfNNumbers();
		// Invoking the getSumUpto1toN function, and returned value of getSumUpto1toN got printed by System.out.println();
		System.out.println(sumOfNNumbers.getSumUpto1toN(number));
		inputObject.close();
	}
	
	/*
	 * function name: getSumUpto1toN 
	 * objective: This is created for getting the sum of numbers from 1 to number, in this function i just apply the formula of getting sum of first
	 * n natural numbers and return the resultant value;
	 * parameters: This function takes 1 parameter called number of int type;
	 * return: This function will return sum of first n numbers as int value; 
	 * author: Bhanu Singh
	 * Date: 17/03/2022
	 */
	int getSumUpto1toN(int number){
		return 	(number*(number+1)/2);
	}

}
