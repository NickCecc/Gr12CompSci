package cecchin.JavaBasics;

public class NestedLoops {

	public NestedLoops() {
		// create a single row of data
		String str = new String();
		for (int i = 0; i < 6; i++) {
			str = str + "*";
		} // ends * for loop
		System.out.println(str);

		// repeat the code that creates a single row of data
		// builds the rows
		for (int i = 0; i < 5; i++) {
			// create a single row of data/builds the cols
			str = new String(); // clear the previous string
			for (int j = 0; j < 6; j++) {
				str = str + "*";
			} // ends inner loop
			System.out.println(str); // print out the line
		} // ends outer loop

		/**************************************************/
		System.out.println("Right-angled triangle");
		// print out a right-angled triangle with 90 angle in upper right
		for (int i = 0; i < 4; i++) {

			// create a single row of data
			str = new String(); // clear the previous string

			// add spaces
			for (int j = 0; j < i; j++) {
				str = str + " ";
			}

			// add stars
			for (int j = 0; j < 4 - i; j++) {
				str = str + "*";
			}
			System.out.println(str); // print out the line
		}

		// Does this need a nested for loop?
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// What is the output of this?
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}


	}

	public static void main(String[] args) {
		NestedLoops examples = new NestedLoops();
	} // ends main

} // ends class
