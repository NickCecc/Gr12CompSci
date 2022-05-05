package cecchin.classObjects;

public class Shirt {
	// Create a Shirt class with properties colour and size. Encapsulate the data
	// with appropriate getters and setters. Ensure the shirt size provided is S, M
	// or L. Provide a default constructor and a constructor that accepts both
	// colour and size. Provide methods that putOn() and takeOff() the shirt, which
	// print a nice message to the user. Also provide a toString() method. Create
	// two new shirts – one with the default constructor and one with the
	// parameterized constructor. Display the attributes of both shirts. Then update
	// the first shirt with colour “red” and size M, and display its updated
	// attributes.
	private String colour;
	private String size;

	public Shirt() {

	}

	public Shirt(String colour, String size) {
		setSize(size);
		setColour(colour);
	}

	public String getColour() {
		return colour;
	}

	public String getSize() {
		return size;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setSize(String size) {
		if (size == "S" || size == "M" || size == "L") {
			this.size = size;
		}
	}

	public void setSizeandColour(String size, String Colour) {

	}

	public void putOn() {
		System.out.println("Shirt is on");
	}

	public void takeOff() {
		System.out.println("Shirt is off");
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(colour);
		sb.append(size);
		return sb.toString();
	}

}
