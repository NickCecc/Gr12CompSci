package cecchin.Assignments;

import java.util.Scanner;

public class NickOrder {
	Scanner sc;

	public NickOrder() {
		sc = new Scanner(System.in);
		float total = 0;
		
		menu();
		int sel = sc.nextInt();

		while (sel != 0) {
			switch (sel) {
			case 1:
				total = purchase(total);
				menu();
				sel = sc.nextInt();
				break;
			case 2:
				total = returns(total);
				menu();
				sel = sc.nextInt();
				break;
			case 3:
				exit(total);
				menu();
				total = 0;
				sel = sc.nextInt();
				break;

			default:
				System.out.println("Invalid selection. Try again.");
				sel = sc.nextInt();
				break;

			}
		}
		sc.close();
	}
	// Display menu:
	public void menu() {
		System.out.println("Menu: ");
		System.out.format("%n1 - Purchase%n2 - Return%n3 - Exit");
	}

	// Input/Calculate subtotal:
	public float purchase(float total) {
		System.out.println("Enter quantity of items being purchased: ");
		int quantity = sc.nextInt();
		System.out.println("Enter price of each item: ");
		float price = sc.nextFloat();
		total += (quantity * price);
		System.out.format("Your subtotal so far is: $%.2f%n", total);
		return total;

	}
	
	// Return items and remove from subtotal:
	public float returns(float total) {
		System.out.println("Enter the quanitity of items you wish to return: ");
		int returnQuantity = sc.nextInt();
		System.out.println("Enter the price of each item: ");
		float returnPrice = sc.nextFloat();
		float afterReturn = total - (returnQuantity * returnPrice);
		System.out.format("Your subtotal after returns is: $%.2f%n", afterReturn);
		return afterReturn;
	}

	// Exit the menu:
	public void exit(float total) {
		System.out.format("Your subtotal is: $%.2f%n", total);
		double tax = total * 0.13;
		System.out.format("Tax: $%.2f%n", tax);
		double finalTotal = tax + total;
		System.out.format("Total is: $%.2f%n", finalTotal);
		System.out.println("Thankyou for shopping with us!");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NickOrder();
	}

}
