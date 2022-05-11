package cecchin.JavaBasics;

import java.util.Random;

class ArraysD1Teacher {
	public ArraysD1Teacher() {
		// Example 1 - Declaring & initialize a new array, assigning indices vals and
		// printing them
		// name is usually plural
		String[] names = new String[3];
		// assign values to specific indices
		names[0] = "Smith";
		names[1] = "Smythe";
		names[2] = "Stevens";// Comment this line out and look at the result that gets printed
		// Any uninitialized indices will be filled by Java with "null"
		// now print out the values from the array - we KNOW we have 3 elements
		// in the array, so we can print them using their indices - we have to know
		// how many elements there are 
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);  // BE SURE TO INITIALIZE ALL VALUES
		// Any uninitialized values will be filled for you - last value is null 
		// (it fills last position with null value)
		// USE A LOOP TO PRINT THESE TYPICALLY INSTEAD - THAT IS THE PREFERRED
		// METHOD OF PRINTING
		//Then delete that code lines 18-20
		// Preferred method of printing - i is the looping index, and we use it as the array index; names.lenght is
		// recalc @ start of every loop
		// PREFERRED WAY TO PRINT OUT ARRAY ELEMENTS B/C IT DOESN'T RELY ON A
		// PROGRAMMER'S KNOWLEDGE OF THE ARRAY CONTENTS	
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		for(String name: names) {
			System.out.println(name);
		}
 
		// Example 2 - Use a loop to assign values to indices in an array & print them
		System.out.println("Creating an array of 10 ints");
		int size = 25;
		int[] marks = new int[size];

		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		// int[] will be filled with 0s instead of null values if uninitialized

		Random randNum = new Random();
		// add random numbers b/w 0 & 100 to the array
		for (int i = 0; i < marks.length; i++) {
			marks[i] = randNum.nextInt(101);
		}

		// ALWAYS use length of the array when printing entries to avoid
		// ArrayIndexOutOfBounds error
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

		// Example 3
		// Another way to create and initialize an array
		int[] tileMap = { 0, 0, 1, 1, 1, 3, 2, 2, 2, 3, 3, 2, 1, 1, 1 };
		for (int i = 0; i < tileMap.length; i++) {
			switch (tileMap[i]) { // a short if statement
			case 0:
				System.out.println("Tile 0");
				break;
			case 1:
				System.out.println("Tile 1");
				break;
			case 2:
				System.out.println("Tile 2");
				break;
			case 3:
				System.out.println("Tile 3");
				break;
			default:
				System.out.println("Invalid tile");
				break;
			}
			// System.out.println(tileMap[i]);
		}

		// Example 3 - The Swapping Operation - Swapping 2 array elements
	    int[] values = {5, 4, 2, 1, 3};
	    // swap elements 0 & 3 - typically we would swap elements at two for loop indices
	    // need to set up a temp var
	    int temp = values[0];
	    values[0] = values[3];
	    values[3] = temp;
	    
	}

	public static void main(String[] args) {
		new ArraysD1Teacher();
	}
}