package com.sebone.string.stringoperations;

/* 
 * importing java.util.Scanner for taking inputs
 */
import java.util.Scanner;


/*
 * class name: ReverseTheString 
 * objective: This class is created for reversing the given string like "java" to "avaj";
 * author: Bhanu Singh
 * Date: 17/03/2022
 */
public class ReverseTheString {
	/*
	 * function name: main 
	 * objective: This is the main function which is public and static, this function is first function invoked when the program runs; 
	 * author: Bhanu Singh
	 * Date: 17/03/2022
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		// Creating the object of scanner class for taking inputs;
		Scanner inputObject = new Scanner(System.in);
		
		// Creating the object of ReverseTheString class for calling the member functions of class ReverseTheString
		ReverseTheString reverseTheString = new ReverseTheString();
		
		System.out.println("Enter the String");
		
		// Taking the input called stringForReverse for getting the reverse form of the string; 
		String stringForReverse = inputObject.nextLine();
		
		// Invoking the getReverseString function, and returned string of getReverseString got printed by System.out.println();
		System.out.println(reverseTheString.getReverseString(stringForReverse));
		inputObject.close();
	}
	
	/*
	 * function name: getReverseString 
	 * objective: This function is created for getting the reverse order of given string, the idea is iterating the given string from backward
	 * and concatenating each character of given string in new resultant string;
	 * parameters: This function takes 1 parameter called number of int type;
	 * return: This function will return factorial of var "number" as int; 
	 * author: Bhanu Singh
	 * Date: 17/03/2022
	 */
	public String getReverseString(String stringForReverse) {
		String reversedString = "";
		
		for(int iterator = stringForReverse.length() - 1; iterator >= 0; iterator--)
		{
			char currentChar = stringForReverse.charAt(iterator);
			
			reversedString += currentChar;
		}
		
		return reversedString;
	}

}
