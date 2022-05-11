// Nick Cecchin; April 12, 2022; 5A OOP Assignment 1
package cecchin.OOPAssignment;

import java.util.ArrayList;

public class Computer {
// Write a full Java class that will represent a Computer in their inventory system.  
	// Attributes that must be tracked include: manufacturer, model (String), price
	// (float), and set of software packages installed (set of Strings).
	// Encapsulate this data and add an appropriate set of constructors.
	// Add a method that will provide anappropriate String representation of the
	// object’s field data.

	// Declare encapsulated variables for computer specs
	private String manufacturer;
	private String model;
	private float price;
	private ArrayList<String> sp;

	// Default
	public Computer() {
		setManufacturer("");
		setModel("");
		setPrice(0.0f);
		setSp(null);

	}

	public Computer(String manufacturer, String model, float price, ArrayList<String> sp) {
		setManufacturer(manufacturer);
		setModel(model);
		setPrice(price);
		setSp(sp);
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		if (price > 0) {
			this.price = price;
		} else {
			this.price = -1;
		}

	}

	public ArrayList<String> getSp() {
		return sp;
	}

	public void setSp(ArrayList<String> sp) {
		this.sp = sp;
	}

	// Create printable spec sheet
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Computer manufacturer: ").append(manufacturer);
		sb.append("\n");
		sb.append("Model: ").append(model);
		sb.append("\n");
		sb.append("Price: $").append(price);
		sb.append("\n");
		sb.append("Software packages installed: ").append(sp.toString());
		return sb.toString();
	}

}
