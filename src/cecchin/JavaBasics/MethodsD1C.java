/*
 * Method call with parameters & return type
 * STEPS TO CALL A METHOD:
 * 1. Write the method name
 * 2. Add (); after the method name
 * 3. Add parameters to the () if necessary
 * 4. Store a return value if necessary
 */
package cecchin.JavaBasics;

import java.util.Scanner;

public class MethodsD1C {

	// by convention, constructor is the first method in a file
	public MethodsD1C() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num = sc.nextInt();
		// var data type must match method return type of method call
		boolean result = printStuff(num);
		if(result) {
			System.out.println("data printed!");
		}
		float avg = average(5, 8, 6);
		System.out.println("Your average is: " + avg);
		long res = factorial(4);
		System.out.println("4!=" + res);
		sc.close();
	}

	// method printStuff takes an int and returns a boolean
	private boolean printStuff(int input) {
		System.out.println(input);
		// return value must match type given by method return type
		return true;	// could also return a calculation value/expn/var
	}
	
	// PAUSE - Do VITAL Practise 3
	// even though an int is returned, the return type is listed
	// as float, which is a wider type, so this works
	private float average(int num1, int num2, int num3) {
		int avg = (num1 + num2 + num3) / 3;
		return avg;
	}
	
	
	/**
	 * This calculates the factorial
	 * @param i an integer whose factorial will be calculated
	 * @return the factorial of the parameter
	 */
	private long factorial(int i) {
		long total = 1;
		while(i >= 1) {
			total*=i;
			i--;
			System.out.println("i: " + i + " total: " + total);
		}
		return total;
	}

	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new MethodsD1C();
	}

}

