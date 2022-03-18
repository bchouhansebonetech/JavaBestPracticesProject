package com.sebone.numbers.integeroprations2;


/* 
 * importing java.util.Scanner for taking inputs
 */
import java.util.Scanner;
import java.lang.Math;

/*
 * class name: CountDigitsOfNumber 
 * objective: This class is created for counting the number of digits of given number;
 * author: Bhanu Singh
 * Date: 17/03/2022
 */
public class CountDigitsOfNumber {
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
		
		// Taking the input called number for getting the count of digits of "number" variable;
		int number = inputObject.nextInt();
		
		// Creating the object of CountDigitsOfNumber class for calling the member functions of class CountDigitsOfNumber
		CountDigitsOfNumber countDigitsOfNumber = new CountDigitsOfNumber();
		
		// Invoking the getNumberOfDigitsOfGivenNumber function, and the returned value of getNumberOfDigitsOfGivenNumber will be printed
		// by System.out.println();
		System.out.println("Number of Digits in " + number + " is " + countDigitsOfNumber.getNumberOfDigitsOfGivenNumber(number));
		inputObject.close();
	}
	
	/*
	 * function name: getNumberOfDigitsOfGivenNumber 
	 * objective: This function is created for getting the count of digits of number, the idea for doing this is just dividing the number by 10 and 
	 * every time number get reduce by 1 digit, the loop will end when number become zero and every time we increase the value of count by 1;
	 * parameters: This function takes 1 parameter called number of int type;
	 * return: This function will return the number of digits in var "number" as int; 
	 * author: Bhanu Singh
	 * Date: 17/03/2022
	 */
	public int getNumberOfDigitsOfGivenNumber(int number) {
		if(number == 0)
			return 1;
		
		number = Math.abs(number);
		int count = 0;
		while(number > 0){
			number = number / 10;
			count++;
		}
		return count;
	}
	
}
