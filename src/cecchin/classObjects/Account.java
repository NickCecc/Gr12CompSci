package cecchin.classObjects;

public class Account {
	// Create an Account class. It should have attributes for name, age, and
	// balance. Add getters and setters for all attributes. Create a default
	// constructor, a constructor that accepts a name and age, and a third
	// constructor that accepts name, age and balance. Create withdraw and deposit
	// methods. Create an accountDetails() method that prints the details for a
	// specific account. In the Main(), create an Account and perform a deposit of
	// $100, and a withdrawal of $50. Display the account details after each
	// operation.

	String name;
	int age;
	float balance;

	public Account() {
		
	}
	
	public Account(String name, int age) {
		setName(name);
		setAge(age);
	}
	
	public Account(String name, int age, float balance) {
		setName(name);
		setAge(age);
		setBalance(balance);
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

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public void withdraw(float withdraw) {
		balance -= withdraw;
	}
	
	public void deposit(float deposit) {
		balance += deposit;
	}
	
	public String accountDetails() {
		StringBuilder sb = new StringBuilder();
		sb.append("Your name is: ");
		sb.append(name);
		sb.append(" Age is: ");
		sb.append(age);
		sb.append(" Balance is: ");
		sb.append(balance);
		return sb.toString();
	}
	
	

}
