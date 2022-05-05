package cecchin.classObjects;

public class Car {
	// Create a Car class for use in a car dealership’s inventory system, declaring
	// attributes including make, model, year and colour. Add several basic methods
	// including drive() and printAttributes() methods. In your Main(), create 3 new
	// Cars with different attributes. Print the attributes of each Car to the
	// screen.
	
	String make;
	String model;
	int year;
	String colour;
	
	
	public void drive() {
		
	}
	
	public void printAttributes() {
		System.out.format("%n %s %s %d %s", make, model, year, colour);
	}

}
