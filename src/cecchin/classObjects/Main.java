package cecchin.classObjects;

import java.util.ArrayList;

class Main {
	public Main() {

		/*// Create a Fraction class. It should have attributes including a numerator and
		// a denominator. It should have a service that calculates and returns the value
		// of the numerator divided by the denominator, returned as a double. In your
		// Main class, create a new Fraction and set its numerator and denominator (to a
		// non-zero value!). Display the fraction, along with its decimal equivalent, on
		// the screen.

		Fraction div = new Fraction();
		div.nume = 100;
		div.denom = 10;
		double num = div.divide();
		System.out.format("Fraction is: %.2f/%.2f. Equals: %.2f", div.nume, div.denom, num);

		// Create a Car class for use in a car dealership’s inventory system, declaring
		// attributes including make, model, year and colour. Add several basic methods
		// including drive() and printAttributes() methods. In your Main(), create 3 new
		// Cars with different attributes. Print the attributes of each Car to the
		// screen.

		System.out.println();
		Car car1 = new Car();
		car1.make = "Ram";
		car1.colour = "White";
		car1.model = "TRX";
		car1.year = 2021;
		car1.printAttributes();
		System.out.println();

		Car car2 = new Car();
		car2.year = 2022;
		car2.colour = "Black";
		car2.make = "Ram";
		car2.model = "1500";
		car2.printAttributes();

		// Create a Vegetable class to represent a vegetable in a grocer’s computer
		// system. Add appropriate attributes and services. Create 5 new vegetables with
		// different attributes. Print the attributes of each Vegetable to the screen.

		System.out.println();
		Vegetable veg1 = new Vegetable();
		veg1.name = "Carrot";
		veg1.weight = 1.06;
		veg1.colour = "Orange";
		veg1.vegAttributes();

		// Create a SalesTax class to return the tax and total on a purchase. The class
		// should have attributes including: cost, total, and taxRate (declared as
		// private). Add a method called getTaxRate() that returns the taxRate value.
		// Add a method called tax that returns a double of the tax calculated on the
		// purchase. Add a method called calcTotal that returns a double with the total
		// cost. It should store the total in the total field before returning this
		// value to the caller. In your Main() class, create a new SalesTax object and
		// set the cost of the item. Display the taxRate, tax and the total in the
		// Console.

		SalesTax ob = new SalesTax();
		ob.cost = 10;
		System.out.format("%n%nTax rate: %.2f, Cost: %.2f, Tax: %.2f Total: %.2f", ob.getTaxRate(), ob.cost, ob.tax(),
				ob.calcTotal());

		System.out.println();
		Student me = new Student();
		me.setfName("Nick");
		me.setAge(10);
		me.setlName("Cecchin");
		me.setGrade(10);

		// Create a Student class that stores a student’s first name, last name, id
		// (String), grade (int), and age. Include getters and setters for all
		// attributes. Ensure that when names are set that they are not empty or null.
		// Ensure that when the grade is set, that it is in the range [9,12]. If
		// constraints are violated, print an error message to the screen. Create a
		// toString() method that prints the details for a specific student. In the
		// Main() program, create 3 students, setting their attributes, and display
		// their information to the screen.

		Student joey = new Student();
		joey.setfName("Tim");
		joey.setlName("Hardy");
		joey.setGrade(9);

		System.out.format("%n %s %d %s %d", me.getfName(), me.getAge(), me.getlName(), me.getGrade());

		// Create a Team class. Its attributes include: sport (String), numPlayers
		// (int), coach (String), and players (ArrayList<String>). Encapsulate all data.
		// Include a toString() method. In the Main() program, create a Team. Create 3
		// players (adding them to an ArrayList), and add this roster to the team. Print
		// out the team info using the toString() method.
		ArrayList<String> players = new ArrayList<String>();
		players.add("Nick");
		Team t1 = new Team();
		t1.setCoach("Nick");

		t1.setNumPlayers(1);
		t1.setSport("Hockey");

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

		Rectangle r1 = new Rectangle();
		r1.setLength(10);
		r1.setWidth(10);

		Rectangle r2 = new Rectangle();
		r2.setLength(100);
		r2.setWidth(10);

		System.out.format("%nArea of r1: %.2f Area of r2: %.2f %d", r1.getArea(), r2.getArea(), r1.compareArea(r2));

		School s1 = new School();
		s1.setAddress("1111 shield");
		s1.setPhoneNum("111111111111");
		s1.setPrincipal("Nick");
		s1.setSchool("Vista");
		ArrayList<String> teacher = new ArrayList<String>();
		teacher.add("Nick");
		s1.setStaff(teacher);
		System.out.format("%n%s", s1.toString());

		System.out.println();
		Shirt shirt1 = new Shirt();
		shirt1.setColour("Blue");
		shirt1.setSize("M");
		System.out.println(shirt1.toString());

		Shirt shirt2 = new Shirt("Green", "S");
		System.out.println(shirt2.toString());

		// Create an Account class. It should have attributes for name, age, and
		// balance. Add getters and setters for all attributes. Create a default
		// constructor, a constructor that accepts a name and age, and a third
		// constructor that accepts name, age and balance. Create withdraw and deposit
		// methods. Create an accountDetails() method that prints the details for a
		// specific account. In the Main(), create an Account and perform a deposit of
		// $100, and a withdrawal of $50. Display the account details after each
		// operation.
		System.out.println();
		Account a1 = new Account("Nick", 17);
		System.out.println(a1.accountDetails());
		a1.deposit(152.67f);
		System.out.println(a1.accountDetails());
		a1.withdraw(23.25f);
		System.out.println(a1.accountDetails());

		System.out.println();
		// The Amazing Animals Veterinary Clinic needs software to track their animal
		// patients and have hired you for the job! Here are some attributes of the pets
		// that they would like to track: Name Age Weight Type (dog, cat, lizard,
		// etc.) Breed List of visit dates (formatted in Strings) Owner’s name
		// Owner’s phone 1.Create a class that keeps track of the attributes above to
		// help maintain pet records at the animal clinic. Encapsulate the data.
		// 2.Create 2 constructors, one with no parameters and one with many parameters
		// to initialize all the instance variables. 3.Create a toString() method that
		// returns all the information in a pet record. 4.In the Main method, create 3
		// pet objects and call their constructors, accessor methods, and toString
		// methods to test your methods. Add these pets to an ArrayList held in the Main
		// class. 5.Make sure you document your code!
		
		ArrayList<String> visits = new ArrayList<String>();
		visits.add("January 1, 2021");
		visits.add("March 2, 2022");
		
		Animal pet1 = new Animal();
		pet1.setAge(10);
		pet1.setBreed("Poodle");
		pet1.setName("Nick");
		pet1.setOwnerName("Tim");
		pet1.setPhone("226-348-4591");
		pet1.setType("Dog");
		pet1.setWeight(12.78f);
		pet1.setVisits(visits);
		System.out.println(pet1.info());
		System.out.println();
		
		//String name, int age, float weight, String type, String breed, ArrayList<String> visits, String ownerName, String phone
		ArrayList<String> visits2 = new ArrayList<String>();
		visits2.add("May 30, 1990");
		visits2.add("November 6, 2019");
		Animal pet2 = new Animal("Nohwaa", 15, 14.14f, "Dog", "Beaglier", visits2, "Dave", "226-235-7613");
		System.out.println(pet2.info());
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(pet1);
		animals.add(pet2);
		
		for (Animal a : animals) {
			System.out.println(a.info());
		
			
		}
		*/
		System.out.println();
		
		// Create list of sp for comp1; Assign values for computers specs
		ArrayList<String> sp1 = new ArrayList<String>();
		sp1.add("Windows");
		sp1.add("Linux");
		Computer comp1 = new Computer("Apple", "Macbook Pro", 1999.98f, sp1 );

		// Create list of sp for comp2; Assign values for computers specs
		ArrayList<String> sp2 = new ArrayList<String>();
		sp2.add("Minecraft");
		sp2.add("Eclipse");
		sp2.add("XCode");
		Computer comp2 = new Computer("Microsoft", "Windows Surface 2", 1529.56f, sp2);

		// Create list of sp for comp3; Assign values for computers specs
		ArrayList<String> sp3 = new ArrayList<String>();
		sp3.add("COD");
		sp3.add("Steam");
		sp3.add("Unity");
		sp3.add("Photobooth");
		Computer comp3 = new Computer("Lenovo", "ThinkCenter", 15.35f, sp3);

		// Create list of computers
		ArrayList<Computer> computers = new ArrayList<Computer>();
		computers.add(comp1);
		computers.add(comp2);
		computers.add(comp3);

		// Print in stock inventory
		System.out.println("In stock Inventory: ");
		for (Computer c : computers) {
			System.out.println();
			System.out.println(c);
		}

		// Print in stock models
		System.out.println();
		System.out.println("In stock models: ");
		for (Computer c : computers) {
			System.out.println(c.getModel());
		}

		// Update comp1 to have sp of Ms teams
		System.out.println();
		sp1.clear();
		sp1.add("MS Teams");
		System.out.println(comp1.toString());
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}