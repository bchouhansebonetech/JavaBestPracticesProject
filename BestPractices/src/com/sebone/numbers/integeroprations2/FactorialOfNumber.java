package com.sebone.numbers.integeroprations2;

/* 
 * importing java.util.Scanner for taking inputs
 */
import java.util.Scanner;


/*
 * class name: FactorialOfNumber 
 * objective: This class is created for getting the foctorial of given number;
 * author: Bhanu Singh
 * Date: 17/03/2022
 */
public class FactorialOfNumber {
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
		
		// Taking the input called number for getting the factorial of "number" variable;
		int number = inputObject.nextInt();
		
		// Creating the object of FactorialOfNumber class for calling the member functions of class FactorialOfNumber
		FactorialOfNumber factorialOfNumber = new FactorialOfNumber();
		
		// Invoking the getFactorialOfNumber function, and returned value of getFactorialOfNumber got printed by System.out.println();
		System.out.println("The Factorial of " + number + " is " + factorialOfNumber.getFactorialOfNumber(number));
		inputObject.close();
	}
	
	/*
	 * function name: getFactorialOfNumber 
	 * objective: This function is created for getting the factorial of given number, for doing this we just we run the loop from "number" to 
	 * 0 and every time we decrease the var "number" by one and multiply "number" with factorialValueOfNumber which will we our result at the end; 
	 * parameters: This function takes 1 parameter called number of int type;
	 * return: This function will return factorial of var "number" as int; 
	 * author: Bhanu Singh
	 * Date: 17/03/2022
	 */
	public int getFactorialOfNumber(int number) {
		
		if(number < 0)
			return 0;
		if(number == 0)
			return 1;
		
		int factorialValueOfNumber = 1;
		
		while(number > 0)
		{
			factorialValueOfNumber *= number;
			number--;
		}
		
		return factorialValueOfNumber;
	}
}
