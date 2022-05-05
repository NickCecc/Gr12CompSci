package cecchin.classObjects;

public class Rectangle {

	// Create a Rectangle class. Attributes stored should include the length, width
	// and unit of measure Encapsulate the data with appropriate getters and
	// setters, ensuring that the length and width are not <= 0 The class should
	// include a public method that calculates and returns the area of the rectangle
	// (make sure the length & width have been initialized/are not 0 prior to
	// performing this calculation) Also include a compareArea(Rectangle r2) method
	// that returns an int value of 1 if the area of r2 is less than the area of
	// rectangle r1, 0 if they are equal in area, and -1 if r2 is greater in area.
	// Include a toString() method that prints the details of a specific rectangle.
	// In the Main() program, create 2 rectangles. Set their attributes, print their
	// details, and compare them.

	private int length;
	private int width;
	private String uom;
	private double area;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		if (length > 0) {
			this.length = length;
		} else {
			System.out.println("Invalid");
		}
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if (width > 0) {
			this.width = width;

		} else {
			System.out.println("Invalid");
		}

	}

	public String getUOM() {
		return uom;
	}

	public void setUOM(String uom) {
		this.uom = uom;
	}
	
	public double getArea() {
		area = length * width;
		return area;
	}
	
	public int compareArea(Rectangle r2) {
		double a1 = getArea();
		double a2 = r2.getArea();
		if (a1 < a2) {
			return 1;
		}
		else if(a1 < a2) {
			return 2;
		}
		else {
			return -1;
		}
		
	}

	
	
}
