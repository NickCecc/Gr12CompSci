package cecchin.JavaBasics;

public class Strings {
	
	public Strings() {
		// DECLARE AND INITIALIZE STRINGS
		// Strings can hold special chars, #s and letters
		
		// Preferred way to declare a String - places it in the String pool, allowing for memory optimization
		String str = "The quick brown fox jumps over the lazy dog."; // short way to declare
		String name = new String("Mrs. Smith"); // declared using constructor
		
		String str2 = null; // set to null, can still be used/compared etc.
		String str3 = ""; // empty string, length 0, can still be used/compared etc.

		int length = str.length(); // saves 43 in length
		// used.. when printing out string b/c then you can see any whitespace
		// before or after the string
		System.out.println("Length of .." + str + ".. is: " + length);

		// using toString()
		Integer num = new Integer(5);
		// this conversion happens automatically when you S.o.p. an Integer
		// but can be performed manually with the toString() method
		String output = "My integer number is: " + num.toString();
		System.out.println(output);
		
		// String concatenation - joining Strings together
		// method 1: add a String literal to a var value
		str = "Smith";
		str = "Mrs. " + str;
		System.out.println("My name is: " + str);
		// method 2: add two String literals
		String sentence = "The lazy dog " + "trips over the log";
		// method 3: add two Strings using concat method
		sentence = sentence.concat(" and lands in a bog.");
		System.out.println(".." + sentence + "..");
		
		// STRING METHODS
		//Methods allow String data to be parsed (broken apart and analyzed), manipulated, modified, etc.
			
		// Use the dot operator on a string to look through all the String methods
		str = "All around the mulberry bush";
		
		if (str.length() > 0) {  // make sure there is a valid string before using any indices
			char c = str.charAt(0); // initial char in str
			System.out.println(c);
		} else {
			System.out.println("Invalid string");
		} 
		
		// Comparing strings 
		if(str.equals(sentence)) {  // OR: str.equalsIgnoreCase(sentence)
			System.out.println("The two sentences are the same");
		}
		
		// also available: 
		// str.compareTo(sentence) to compare using lexicographical (alphabetic) order
		// offers more information in its returned value than the equals() methods
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		// Find substrings of a String
		/*Substring method:
			str.substring(beginIndex) OR str.substring(beginIndex, endIndex)
			One parameter � beginIndex � will return a substring starting at the beginIndex (inclusive)
			Two parameters � beginIndex, endIndex � will return  a substring starting at the beginIndex position (inclusive), ending at the endIndex position (exclusive)
		 */    
		str = "Mrs. Smith";
		if(str.length() > 5) {	// check for a valid string
			System.out.println(str.substring(0,3)); // incl. beginIndex, excl. endIndex
			System.out.println(str.substring(5));	// beginIndex to end of String
		}
		
		// Finding an index then getting a substring
	    int index = str.indexOf(' ');  // find the first space
	    String sub = str.substring(0,index); // use variables instead of hard-coded values where possible
	    System.out.println("Substring is: .." +  sub + "..");

	    // Strings and loops - these are often used together
	    str = "Humpty Dumpty sat on a wall";
	    for(int i = 0; i < str.length(); i++) { // try adding <= and see what happens!  StringOOB Exception!
			char c = str.charAt(i); // access a char of a string
			System.out.println(c);
		}
	   
	} // closes constructor

	public static void main(String[] args) {
		new Strings();
	} // closes main

} // closes class
