package cecchin.JavaBasics;
import java.util.Scanner; // import java.util.*;

public class ScannerInput {

	public ScannerInput() {
		
		/* Recapping steps: (input scanner)
		1. Input - Prompt user for input of a specific type. Include valid ranges if needed. Accept input.
		2. Processing - Set up data storage. Perform calculations.
		3. Output - Ensure it's labeled.
		4. Close the scanner when finished.
		Note***Only use one scanner per file!
		*/

		// create a new scanner, pointed to kybd
		Scanner sc = new Scanner(System.in);
		
		// INPUT
		// include valid ranges if needed
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.println("Your name is: " + name);
		
		System.out.println("Enter a marks: (int value, 0-100)");
		int mark = sc.nextInt();
		int mark2 = sc.nextInt();
		int mark3 = sc.nextInt();
		// notice that you can enter them on a single line
		// PROCESSING
		int avg = (mark + mark2 + mark3) / 3;
		
		// after using nextInt() clear the Enter key with nextLine()
		sc.nextLine();
		// omit this and then try the below question
		
		// OUTPUT
		System.out.println("Your average is: " + avg);
		System.out.println("Enter your favourite course:");
		String favCourse = sc.nextLine();
		System.out.println("Your favourite course was: " + favCourse);
		
		sc.close();
		
	}
	
	public static void main(String[] args) {
		new ScannerInput();
	}

}
