package cecchin.JavaBasics;

import java.util.Scanner;

public class StringsExSolns {

	public StringsExSolns() {
		// A1 - We're Twinsies!
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your first name");
	    String name = sc.next(); // only take the first token (word) the user entered on the line
	    sc.nextLine(); // process/get rid of any other words and the Enter key that was left on the
	            // input
	    if (name.equalsIgnoreCase("Mrs.")) {
	      System.out.println("We're twins!");
	    } else {
	      System.out.println("Not a match!");
	    }

	    // A2 - Print last character of a string
	    System.out.println("\nEnter a word");
	    String word = sc.next();
	    System.out.println("Length of word " + word + " is " + word.length());
	    System.out.println("The last letter of this word is: " + word.charAt(word.length() - 1));
	    sc.nextLine();

	    // A3 - Spaces, Spaces, Everywhere!
	    name = " John Smith ";
	    System.out.println("\nName without spaces .." + name.trim() + ".."); // name with spaces
	    System.out.println("Space index is " + name.indexOf(' '));

	    // A4 - Find the Comma
	    String location = "Toronto, Ontario";
	    int index = location.indexOf(',');
	    System.out.println("\nCity: .." + location.substring(0, index) + "..");
	    System.out.println("Province: .." + location.substring(index + 1).trim() + ".."); // omit any residual
	                                              // whitespace

	    // B1 - Count the Vowels
	    String sillySentence = "All around the mulberry bush";
	    int vowels = 0;
	    for (int i = 0; i < sillySentence.length(); i++) {
	      char c = sillySentence.charAt(i);
	      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
	          || c == 'U')
	        vowels++;
	    }
	    System.out.println("\nThere are " + vowels + " vowels in " + sillySentence);
	    // Another solution
	    String vowelsStr = "aeiouAEIOU";
	    vowels = 0;
	    for (int i = 0; i < sillySentence.length(); i++) {
	      if(vowelsStr.indexOf(sillySentence.charAt(i)) != -1) {
	        vowels++;
	      }
	    }
	    System.out.println("\nThere are " + vowels + " vowels in " + sillySentence);


	    // B2 - Triplets
	    String original = "Hello";
	    String sub = original.substring(original.length() - 2);
	    String triplets = sub + sub + sub;
	    System.out.println("\nThe triplets of " + original + " are " + triplets);

	    
	    // B5 - Interleaving
	    String str1 = "Tecumseh";
	    String str2 = "Vista";
	    // Figure out which string has longest length
	    int len1 = str1.length();
	    int len2 = str2.length();
	    // Find the max of two values with the Math.max method
	    int maxLength = Math.max(len1, len2);
	    String interleaved = "";
	    // iterate over the longest string's length
	    for (int i = 0; i < maxLength; i++) {
	      if (i <= len1 - 1) {
	        interleaved += str1.substring(i, i + 1);
	      }
	      if (i <= len2 - 1) {
	        interleaved += str2.substring(i, i + 1);
	      }
	    }
	    System.out.println("\nInterleaving strings: " + str1 + " and " + str2 + " produces: " + interleaved);

	    
	}
	public static void main(String[] args) {
		new StringsExSolns();

	}

}
