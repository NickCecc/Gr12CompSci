package cecchin.classObjects;

public class SalesTax {

	// Create a SalesTax class to return the tax and total on a purchase. The class
	// should have attributes including: cost, total, and taxRate (declared as
	// private). Add a method called getTaxRate() that returns the taxRate value.
	// Add a method called tax that returns a double of the tax calculated on the
	// purchase. Add a method called calcTotal that returns a double with the total
	// cost. It should store the total in the total field before returning this
	// value to the caller. In your Main() class, create a new SalesTax object and
	// set the cost of the item. Display the taxRate, tax and the total in the
	// Console.

	double cost;
	double total;
	
	private double taxRate = 0.13;
	
	public double getTaxRate() {
	return taxRate;
	}
	
	public double tax() {
		return cost * taxRate;
		
	}
	
	public double calcTotal() {
		total = cost + tax();
		return total;
		
	}
	
}
