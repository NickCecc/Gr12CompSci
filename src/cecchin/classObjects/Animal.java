package cecchin.classObjects;
import java.util.ArrayList;

public class Animal {
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
	private String name;
	private int age;
	private float weight;
	private String type;
	private String breed;
	private String ownerName;
	private String phone;
	private ArrayList<String> visits;
	
	public Animal() {
		
	}
	
	public Animal(String name, int age, float weight, String type, String breed, ArrayList<String> visits, String ownerName, String phone) {
		setName(name);
		setAge(age);
		setType(type);
		setBreed(breed);
		setVisits(visits);
		setOwnerName(ownerName);
		setPhone(phone);
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public ArrayList<String> getVisits() {
		return visits;
	}
	public void setVisits(ArrayList<String> visits) {
		this.visits = visits;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String info() {
		StringBuilder sb = new StringBuilder();
		sb.append("Pet name: ");
		sb.append(name);
		sb.append("\n");
		sb.append("Age: ");
		sb.append(age);
		sb.append("\n");
		sb.append("Weight: ");
		sb.append(weight);
		sb.append("\n");
		sb.append("Type: ");
		sb.append(type);
		sb.append("\n");
		sb.append("Breed: ");
		sb.append(breed);
		sb.append("\n");
		sb.append("Visits: ");
		sb.append(visits);
		sb.append("\n");
		sb.append("Owners Name: ");
		sb.append(ownerName);
		sb.append("\n");
		sb.append("Phone number: ");
		sb.append(phone);
		return sb.toString();


	}
	

}
