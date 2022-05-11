package cecchin.JavaBasics;

import java.util.Scanner;

public class MethodsD1B {

	public MethodsD1B() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your last name");
		// num is a LOCAL variable - only MethodD1Ex2 method can see it!
		String lastName = sc.nextLine();
		int age = 10;
		// parameters are passed to method in ()
		// type order must match the method header
		// Programmer must ensure correct ordering if params are same type 
		// to avoid logical errors
		printData(lastName, age);

		// VITAL PRACTISE SOLN Method Calls
		int n1 = 98;
		int n2 = 85;
		int n3 = 78;
		average(n1, n2, n3);
		equalityTest(n1,n2);

		sc.close();
	}
	
	// method names are camel-cased, can be aliased
	private void printData(String name, int age) {
		System.out.println("Your name is " + name + " your age is: " + age);
	}
	

	// VITAL PRACTISE 2
	private void average(int num1, int num2, int num3) {
		int avg = (num1 + num2 + num3) / 3;
		System.out.println("Your average is: " + avg);
	}
	
	private void equalityTest(int num1, int num2) {
		if(num1 > num2) {
			System.out.format("%d is greater than %d%n", num1, num2);
		} else if(num1 == num2) {
			System.out.format("%d is equal to %d%n", num1, num2);
		} else {
			System.out.format("%d is less than %d%n", num1, num2);
		}
	}
	public static void main(String[] args) {
		new MethodsD1B();
	}

}
