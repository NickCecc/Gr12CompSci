package cecchin.JavaBasics;
import java.util.Scanner;
import java.util.Random;

public class WhileLoops {
    public WhileLoops(){
        /*
         * while(condition) { // code to be repeated }
         */
        // Counter Example
        int i = 0; // counter variable
        while (i < 10) {
            System.out.println(i);
            i++; // same as i=i+1;
        }

        // Accumulator Example
        i = 0;
        int accumulator = 0; // or sum, total, etc.
        int randomNum = 0;
        Random rand = new Random();
        // Generate 10 random nums b/w 0 & 250 and add them together, display total
        while (i < 10) {
            i++;
            randomNum = rand.nextInt(251);
            System.out.println("Random number " + i + " is: " + randomNum);
            accumulator += randomNum;
            System.out.println("Accumulator: " + accumulator);
        }

        System.out.println("Final accumulator total: " + accumulator);

        // Flag Example
        Scanner sc = new Scanner(System.in);
        int input = -1; // input flag
        while (input != 0) {
            System.out.println("Please enter a number, 0 to exit");
            // 0 value flags the exit condition
            input = sc.nextInt();
            System.out.println("You entered: " + input);
        }

        // using break - break out of loop
        i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break; // break out of loop early if i is 4
            }
        }

        // using continue - force the next iteration of a loop
        i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }


        // EXERCISE SOLUTIONS
        // 1. Print the #s from 0 to 100 (inclusive) [0, 100]
        i = 0; // can use another name like count or counter
        while (i <= 100) {
            System.out.println(i);
            i++; // order is important - reverse these statements and the output will be off by
            // one logically
        }

        // 2. Loop backward from 200 to 100
        i = 200;
        while (i >= 100) {
            System.out.println("i is: " + i);
            i--;
        }

        // 3. & 4. subtotal of the loop indexes
        // using a while loop:
        i = 2;
        int total = 0;
        while (i <= 100) {
            System.out.println("i is: " + i);
            total += i;
            i += 2;
        }
        System.out.println("Total is: " + total);

        // 5. average of 10 random int numbers
        int num = 0;
        i = 0;
        while (i < 10) {
            num = rand.nextInt(11);
            System.out.println("num is: " + num);
            i++;
            total += num;
        }
        System.out.println("Average is: " + total / 10);

        // 6. Average of a set of marks entered by user
        System.out.println("Welcome to the average calculator! Enter your marks, -1 to exit");

        // track mark entered, sum of marks, and num marks entered
        int mark = 0;
        int sum = 0;
        int numMarks = 0;

        // user enters mark until -1
        while (mark != -1) {
            mark = sc.nextInt();
            if (mark != -1) {
                sum += mark;
                numMarks++;
            }
        }
        double avg = sum / numMarks;
        System.out.println("Your average is: " + Math.round(avg));

        // using break - break out of loop
        i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break; // break out of loop early if i is 4
            }
        }

        // using continue - force the next iteration of a loop
        i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

        // EXERCISE SOLUTIONS - BREAK/CONTINUE
        // 1. count up to 10, and break out of the loop if the looping index (count or
        // i) is divisible by 5.
        int counter = 1;
        while (counter < 10) {
            System.out.println(counter);
            if (counter % 5 == 0) {
                break;
            }
            counter++; // will this run the same if it gets moved up?
        }

        /*
         * 2. Create a while loop that generates a random number between 0 & 10. Break
         * out of the loop when the generated number is equal to 5. Cast each random
         * number to an int with the line: int rand = (int)(Math.random()* x); where x
         * is the range. Print each #. Bonus: output # tries it took to get a 5.
         */
        counter = 0;
        int num1 = 5;
        while (true) {
            num1 = (int) (Math.random() * 10);
            System.out.println("num is: " + num1);
            counter++;
            if (num1 == 5) {
                break;
            }
        }
        System.out.println("It took: " + counter + " tries");

        // EXERCISE SOLUTIONS - LOOP APPLICATIONS
        // 1. Cost of producing a certain product is C = 1500 + 1.78U and R = 2.03U
        // where U is the number of units produced. Use a loop (changing U) to find out
        // where P >= C.
        // Answer: 6002 units
        // 6000
        // they get 5999
        double c = 1500;
        double p = 0;
        int u = 0; // a starting guess
        while (c > p) {
            c = 1500 + 1.78 * u; // or c += 1.78;
            p = 2.03 * u; // some decimals can't be stored exactly by double values;
            // inaccuracy is inherent when using digital hardware to store infinite
            // decimals, so you
            // won't get the exact p of 12180 that you're looking for
            // System.out.println("profit: " + p + " cost: " + c + " u: " + u);
            u++;
        }
        System.out.println("Profit will exceed costs at " + (u - 1) + " units");

        // 2. & 3. Track whether user entered a negative number, and count # of +/-
        // values entered
        boolean negative = false; // tracks whether user ever enters a negative #
        int negatives = 0;
        int positives = 0;
        int number = -1;

        while (number != 0) {
            System.out.println("Enter a number (int value), 0 to exit:");
            number = sc.nextInt();

            if (number < 0) {
                negative = true;
                negatives++;
            } else if (number > 0) {
                positives++;
            }
            System.out.println("Your number is: " + number);
        }

        System.out.println("You entered " + negatives + " total negative numbers");
        System.out.println("You entered " + positives + " total positive numbers");

        if (negative) {
            System.out.println("You are super negative today, entering a negative # and all.");
        }

        // 4. Print the powers of 2 up to, and including, 2048.
        int power = 1; // result
        int exp = 0; // exponent
        while (power <= 2048) {
            System.out.println("Next power of two is: " + power);
            exp++;
            power = (int) Math.pow(2, exp);

        }

        // 5. Create a simple menu system for the user, allowing them to purchase
        // specified products.
        // Keep a running subtotal until they are done. When finished, display a total
        // for your user.
        int item = -1;
        float subtotal = 0;
        boolean done = false;

        while (!done) {
            System.out.println("\nEnter your selection: 1. phone case 2. screen protector 3. controller 4. head set 5. exit");
            item = sc.nextInt();
            switch (item) {
                case 1:
                    subtotal += 40.25f;
                    break;
                case 2:
                    subtotal += 25f;
                    break;
                case 3:
                    subtotal += 89.88f;
                    break;
                case 4:
                    subtotal += 85f;
                    break;
                case 5:
                    done = true;
                    break;
                default:
                    System.out.println("Invalid entry. Please try again");
            }
        }
        float totalOwed = subtotal * 1.13f; // include tax
        System.out.println("You owe: " + totalOwed);

        sc.close();


    }
    public static void main(String[] args){
        new WhileLoops();
    }

}
