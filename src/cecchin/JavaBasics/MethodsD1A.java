package cecchin.JavaBasics;
import java.util.*;

public class MethodsD1A {

	// Method call with no parameters or return value
	int num; // field or property "global var"
			 // declaring var outside ALL methods every method can see num var 
	
	// special method called the constructor -has the same name as the class
	public MethodsD1A() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		num = sc.nextInt();
		printStuff();	// method call
		// VITAL PRACTISE A TAKE UP
		posNeg();
		System.out.println("DONE");
		sc.close();
	}
	
	// method header/signature: access modifier (public/private) - return type (void or data type)
	// method name - (parameters)
	private void printStuff() {
		System.out.println(num);
	} // printStuff - frequent mistake to omit this
	// add a comment to indicate which method is closed
	

	// VITAL PRACTISE A TAKE UP
	// method to determine whether a num is +/-/0
	public void posNeg() {
		if(num > 0) {
			System.out.println("Positive");
		} else if (num < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("0");
		}
	} // close posNeg
	
	
	public static void main(String[] args) {
		new MethodsD1A();
	}

}
