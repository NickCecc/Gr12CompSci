package cecchin.JavaBasics;

import java.util.Scanner;

public class StringBuilderExerciseSolutions {

	public StringBuilderExerciseSolutions() {
		Scanner sc = new Scanner(System.in);

		// A1 - Glue a URL
		// could instead use a loop b/c you know there are 3 parts to this URL,
		// specified by the question
		System.out.format("Please enter the three sections of your URL:%n");
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		StringBuilder sb = new StringBuilder();
		sb.append(s1);
		sb.append(".");
		sb.append(s2);
		sb.append(".");
		sb.append(s3);
		
		// sb.append(s1).append(s2).append(s3); // alternative way to append all in one step
		
		/* OR:
		sb.setLength(0);
		for(int i = 0; i < 3; i++) {
			String str = sc.next();
			sb.append(str);
			if(i != 2) 	
				sb.append(".");
			
		}
		 */
		
		System.out.format("Your URL is: %s%n", sb);
		sc.nextLine(); // clear any extra tokens & the Enter key
		sb.setLength(0); // recycle the StringBuffer for the next question

		// A2 - Comma-Separated Name
		System.out.format("Please enter your first and last name:%n");
		s1 = sc.next();
		s2 = sc.next();
		sb = new StringBuilder();
		sb.append(s2).append(", ").append(s1);
		System.out.format("Your comma-separated name is %s%n", sb);
		sc.nextLine(); // clear any extra tokens & the Enter key
		sb.setLength(0); // clear the SB

		// A3 - Find the Middle Name
		s1 = "James";
		s2 = "Alex";
		s3 = "Smith";
		sb.append(s1).append(" ").append(s2).append(" ").append(s3);
		System.out.format("Names in a SB: ..%s..%n", sb);
		int index1 = sb.indexOf(" "); // find the first space in the name
		int index2 = sb.indexOf(" ", index1 + 1); // find the second space in the name
		System.out.format("Middle name on its own: ..%s..%n", sb.substring(index1 + 1, index2));
		sb.delete(index1, index2);
		System.out.format("Without the middle name: ..%s..%n", sb);

		// B1 - Find the Initials
		String myName = "Hal G. von Rilstone";
		StringBuilder initials = new StringBuilder();
		myName = myName.trim(); // trim whitespace off the string
		
		
		initials.append(myName.charAt(0));	// add the first initial to the SB
		int space = myName.indexOf(' ');	// find the first space in the name, if one exists
		
		while(space != -1) {				// while there are still spaces, there are still more names to process!
			initials.append(myName.charAt(space+1));	// append the initial after the space
			space = myName.indexOf(' ', space+1);		// look for the next space, after the most recent space

		}
		// alternate solution - add in initials based on the knowledge that they are uppercase letters. 
		// Doesn't work for all names - like Lily van Bakker, where one part of last name is not uppercased
		/* int length = myName.length();
		 * for (int i = 0; i < length; i++) {
			if (Character.isUpperCase(myName.charAt(i))) {
				initials.append(myName.charAt(i));
			}
		}*/
		System.out.format("My initials are: %s%n", initials);

		// B2 - Comma-Separated List
		StringBuilder names = new StringBuilder();
		names.append("Liz,");
		names.append("Lisa, ");
		names.append("Leila, ");
		names.append("Lee-Anne, ");
		names.append("Leslie, ");
		names.append("Lindsay, ");
		names.append("Linda, ");
		names.append("Lola, ");
		names.append("Linea, ");
		names.append("Linley");
		System.out.format("Original SB names were: %s%n", names);
		int index = -1;
		index = names.indexOf(",");
		if(index==-1) {		// there is only one name in the SB
			System.out.format("Name is: %s%n", names);
		} else {
			System.out.format("Names separated are:%n");
		}
		// StringBuilder is: Lisa, Leila, Lee-Anne, Leslie, Lindsay, Linda, Lola, Linea, Linley
		while (index != -1) { // while there is another ,
			System.out.format("%s%n", names.substring(0, index)); // print name
			names.delete(0, index + 2);  // delete name + , + extra space between names
			index = names.indexOf(",");  // find the next comma
			if (index == -1) { // on the last name, no more commas exist, just print the name
				System.out.format("%s%n", names);
			}
		}
		

	}

	public static void main(String[] args) {

		new StringBuilderExerciseSolutions();
	}

}
