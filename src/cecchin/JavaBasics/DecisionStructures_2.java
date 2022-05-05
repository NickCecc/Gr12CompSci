package cecchin.JavaBasics;

public class DecisionStructures_2 {
    public DecisionStructures_2() {
        int mark = 85;
        int absences = 5;

        // Nested selection - an if inside an if
        if (mark >= 80) {
            if (mark >= 90) {
                System.out.println("Your diligence has paid off with an A+");
            }
            System.out.println("You made the honour roll!");
        } else if (mark > 49) {
            System.out.println("You passed!");
        } else {
            System.out.println("Sorry, try again!");
        }

        // BOOLEAN OPERATORS
        // Using || logical OR
        if (mark < 50 || absences > 5) {
            System.out.println("Please see your guidance counsellor for assistance.");
        }

        // Using && - logical AND
        if (mark >= 90 && absences == 0) {
            System.out.println("Wow, excellent work!");
        }

        // Using ! - NOT operator
        boolean flag = true;
        if (!flag) {
            System.out.println("loading start screen...");
        }

        // Using ! in condition
        int x = 50;
        boolean hitEdge = false;

        // if x is >= 50 AND you haven't hit edge
        if (x >= 50 && !hitEdge) {
            hitEdge = true;
            System.out.println("You hit the edge");
        }

        String weather = "sunnY";
        boolean clouds = false;
        int temp = 28;
        // All three conditions must be true for code block to execute
        if (weather.equalsIgnoreCase("Sunny") && !clouds && temp > 26) {
            System.out.println("It's a beautiful day!");
        }

        // Selection with (expression ? assignThis: elseAssignThis) ternary operator
        int number = 5;
        String printMsg = number % 2 == 0 ? "even" : "odd";
        System.out.println("Your number is: " + printMsg);

        boolean bothParties = true;
        int numAttending = 0;
        numAttending = bothParties ? 2 : 1; // if both parties are attending, plan a meal for 2 people; otherwise, 1
        System.out.println(numAttending + " people will attend the party");

        // Selection with switch - works with expressions (that evaluate to an int) and
        // strings
        // More efficiently implemented than if-else blocks
        int month = 8;
        String monthString;
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid Month";
                break;
        } // closes switch
        System.out.println(monthString);

        // Can also use the "fall-through" nature of cases to your advantage!
        month = 2;
        String season = "";

        switch (month) {
            case 1:
            case 2:
            case 3:
            case 12:
                season = "winter";
                break;
            case 4:
            case 5:
                season = "spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "summer";
            case 9:
            case 10:
            case 11:
                season = "fall";
            default:
                season = "invalid month";
        }
        System.out.println(season);

        // Exercise Solutions
        /*
         * 1. Shopping trip - Assume that if an item is on sale with a price of less
         * than $5 or it is on your grocery list you will buy it. Store this data in a
         * float and boolean, respectively – salePrice and groceryList. Write an if
         * statement that outputs the word “buy” if either the sale price is good enough
         * OR groceryList are true – if neither are true, encourage the shopper to hold
         * off on the purchase.
         */
        float salePrice = 4.99f;
        boolean groceryList = false;
        if (salePrice < 5 || groceryList) {
            System.out.println("Buy");
        } else {
            System.out.println("Steer clear - you don't need that this week!");
        }

        /*
         * 2. Driving - You may drive if you are insured and have a license. Store both
         * variables and write an if statement that outputs “drive safely!” if a person
         * has a license AND is insured.
         */
        boolean license = true;
        boolean insured = false;

        if (license && insured) {
            System.out.println("Drive safely!");
        }
        /*
         * boolean drive = (licensed && insured ? true : false); if(drive) { S.o.p.(...)
         * }
         */

        // 3. Level up
        int time = 25;
        int score = 55;
        boolean level2;
        if (time > 30 && score > 50) {
            level2 = true;
        }

        // 4. Animal vaccination
        boolean vaccinated = true;
        if (!vaccinated) {
            System.out.println("Protect your pet with vaccination!");
        }

        // TERNARY AND SWITCH EXERCISES
        // 5. Use ternary operator to give a student a pass/fail message
        mark = 90;
        String pass = mark >= 50 ? "You passed" : "Sorry, try again";

        // 6. Use a switch for a menu system
        // Selection with switch
        int menuSelection = 3;
        double subtotal = 0;

        switch (menuSelection) {
            case 1:
                subtotal += 6.95;
                break;
            case 2:
                subtotal += 8.95;
                break;
            case 3:
                subtotal += 0.99;
                break;
            default:
                break;
        }
        System.out.println("Subtotal is: " + subtotal);

    }

    public static void main(String[] args) {
        new DecisionStructures_2();
    }

}
