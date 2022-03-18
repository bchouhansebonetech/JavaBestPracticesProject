package com.sebone.numbers.integeroprations2;

/* 
 * importing java.util.Scanner for taking inputs
 */
import java.util.Scanner;


/*
 * class name: FindingPrimeNumber 
 * objective: This class is created for finding that the given number is prime is not
 * author: Bhanu Singh
 * Date: 17/03/2022
 */
public class FindingPrimeNumber {
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
		
		// Taking the input called number for checking if the given number is prime or not;
		int number = inputObject.nextInt();
		
		// Creating the object of FindingPrimeNumber class for calling the member functions of class FindingPrimeNumber
		FindingPrimeNumber findingPrimeNumber = new FindingPrimeNumber();
		
		// Invoking the isPrime function, and returned value of isPrime will decide that given number is prime or not;
		if(findingPrimeNumber.isPrime(number))
			System.out.println(number + " is a Prime number");
		else
			System.out.println(number + " is not a Prime number");
		
		inputObject.close();
	}
	
	/*
	 * function name: isPrime 
	 * objective: This function is created for checking that the given number is prime or not, basically the function will take one argument called 
	 * "number" and we are trying to devide number variable by 1 to number/2 and if the number is fully divide more than 2 numbers than the number 
	 * is not prime unless is prime;
	 * parameters: This function takes 1 parameter called number of int type;
	 * return: This function will return boolean value; 
	 * author: Bhanu Singh
	 * Date: 17/03/2022
	 */
	public boolean isPrime(int number){
		if(number < 0)
			return false;
		int count = 0;
		boolean prime = false;
		for(int iterator = 1; iterator <= number/2; iterator++){
			if(number % iterator == 0)
				count++;
		}
		if(count <= 2)
			prime = true;
		
		return prime;
	}

}
