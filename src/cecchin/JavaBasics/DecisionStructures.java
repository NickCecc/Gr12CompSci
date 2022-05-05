package cecchin.JavaBasics;

import java.util.Scanner;

public class DecisionStructures {
    public DecisionStructures() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your mark: (float value)");
        float mark = sc.nextFloat();

        // IF - one-way selection
        if (mark >= 50) {
            System.out.println("You passed!");
        }

        // two-way selection
        if (mark >= 50) {
            System.out.println("You passed!");
        } else {
            System.out.println("Sorry, try again");
        }

        // multi-way selection
        System.out.println("Enter a month of the year as an int");
        int month = sc.nextInt();
        if (month == 7) {
            System.out.println("July");
        } else if (month == 8) {
            System.out.println("August");
        } else { //default/base case
            System.out.println("School!! :-|");
        }

        // multi-way selection
        //mark = 80;  // set mark to a specific value to make this code section easier to test
        mark = sc.nextFloat();

        if (mark >= 80) {
            System.out.println("A");
        } else if (mark >= 70) {
            System.out.println("B");
        } else if (mark >= 60) {
            System.out.println("C");
        } else if (mark >= 50) {
            System.out.println("D");
        } else {
            System.out.println("C'mon!");
        }

        // EXERCISE SOLUTIONS
        // 1.	Add code to tell if a number is greater than 5.  Output a message if it is.
        int num = 10;
        if (num > 5) {
            System.out.println("Number is greater than 5!");
        }

        // 2.	Add code that determines and outputs if a number input by the user is positive, zero, or negative.
        if (num > 0) {
            System.out.println("The nubmer is positive");
        } else if (num < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Zero!!!");
        }

        // 3.	Add code that determines the age of a person in years, given the person's birth year and knowing the current year. If the person's age is over 100, output an appropriate congratulatory message.  If the person's age is under 18, output the message "You're a minor".
        System.out.println("Enter the year of your birth");
        int year = sc.nextInt();
        int currentYear = 2020;
        int age = currentYear - year;
        System.out.println("You are " + age + " years old!");

        if (age >= 100) {
            System.out.println("You are 100+ years old!");
        } else if (age < 18) {
            System.out.println("You are a minor");
        }

        // 4.	A postsecondary institution grants scholarships based on academic achievement.  Their schedule is as follows: President’s scholarship: $3000 for an average of 90+.  Chancellor’s scholarship: $2000 for an average of 80+.  Dean’s Award: $500 for an average of 70+.  Use an if-else construct to output the award given to recipients with an average of 95%, 83%, 77%, and 60%.
        mark = 95;
        if (mark >= 90) {
            System.out.println("President's scholarship for you!");
        } else if (mark >= 80) {
            System.out.println("Chancellor's scholarship for you!");
        } else if (mark >= 70) {
            System.out.println("Dean's award recipient");
        }

        // 5. Simple calculator
        int operation = 1; // possible values: 1 - 4
        float op1 = 5; // operand 1
        float op2 = 10; // operand 2
        double result = 0; // result of operation
        if (operation == 1) {
            result = op1 + op2; // Note: Java is automatically casting to the wider double type
        } else if (operation == 2) {
            result = op1 - op2;
        } else if (operation == 3) {
            result = op1 * op2;
        } else if (operation == 4) {
            if (op2 != 0) {
                result = op1 / op2;
            } else {
                // divide-by-0 error message
                System.out.println("Can't divide by 0");
            }
        }
        System.out.println("Result is: " + result);

        // 6. Children's entertainment cost
        int kids = 15;
        if (kids > 10) {
            System.out.println("Cost is $50");
        } else {
            System.out.println("Cost is  $35");
        }



        sc.close();
    }

}
