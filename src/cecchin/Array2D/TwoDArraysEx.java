package cecchin.Array2D;


public class TwoDArraysEx {
    public TwoDArraysEx() {
        int[][] nums; // B array

        // A1 Add code - declare and create a 3 by 3 two-dimensional int array named
        // table. The finished code will print the values 0 to 8.
        int[][] table = new int[3][3];

        // Should print the values in table
        int count = 0;
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table.length; col++) {
                table[row][col] = count;
                count++;
                System.out.print(table[row][col] + " ");
            }
        }

        // A2 - Add code - declare and initialize a two-dimensional String array called
        // students with the names “Brice, Marvin, Anna” in the first row and “Kamal,
        // Maria, Elissa” in the second. The finished code will print all the names in
        // the array starting with all in the first row followed by all in the second
        // row.
        String[][] students = {
                {"Brice", "Marvin", "Anna"},
                {"Kamal", "Maria", "Elissa"}
        };


        // Should print the values in students in order
        for (int row = 0; row < students.length; row++) {
            for (int col = 0; col < students.length; col++) {
                System.out.print(students[row][col] + " ");
            }
        }
        System.out.println();

        // A3 - Add code - Print the values 47, 51, and 20 by accessing them in the the
        // given two-dimensional array.
        int[][] arr = {{47, 3, 12}, {51, 74, 20}};
        // Prints 47, 51, 20 in that order
        System.out.println(arr[0][0]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][2]);


        // A4 - Add code - Print the values 8, 3, 87, and 34 by accessing them from the
        // given two-dimensional array.
        int[][] arr2 = {{10, 39, 8}, {3}, {35, 87}, {22}, {34}};
        // Prints 8, 3, 87, and 34 in order


        // A5 - Add code - Print the number of rows in the given two-dimensional array,
        // or the length of the outer array. Then print the number of columns, or the
        // length of each inner array.
        // Ex. The array { {“hello”,”there”,”world”},{“how”,”are”,”you”} } should print:
        // Rows: 2 Columns: 3
        String[][] arr3 = {{"hello", "there", "world"}, {"how", "are", "you"}};

        System.out.println("Rows:");
        // ADD CODE TO PRINT NUMBER OF ROWS HERE //

        System.out.println("Columns:");
        // ADD CODE TO PRINT NUMBER OF COLUMNS HERE //


        // A6 - Add code - Loop through the given two-dimensional array, printing out
        // the values in the first row followed by those in the second row and so on.
        String[][] arr4 = {{"Hey ", "there! "}, {"I ", "hope "}, {"you ", "are "}, {"doing ", "well"}};


        // A7 - Add code - Replace the “ADD CODE HERE” below with the code to count and
        // print the number of 7’s that are in the 2d array. It should print 2.
        int[][] arr5 = {{4, 7, 8}, {8, 8, 7}};
        count = 0;

        // ADD CODE HERE
        for (int row = 0; row < arr5.length; row++) {
            for (int col = 0; col < arr5.length; col++) {
                if ((arr5[row][col]) == 7) {
                    count++;
                }

            }
        }

        System.out.println("Number of 7's is: " + count);


        // A8 - Add code - Replace the “ADD CODE HERE” below with the code to print out
        // the sum of the numbers in the second row of the “table” array. It should
        // print 18.
        int[][] table2 = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
        int sum = 0;

        for (int i = 0; i < table2.length; i++) {
            sum += table2[1][i];
        }

        System.out.println("The sum is: " + sum);

        // A9 Replace the “ADD CODE HERE” below with the code to find the sum of the
        // values on the diagonal from [0][0] to [num rows - 1][num rows - 1] Print the
        // sum. It should print 5.
        int[][] arr6 = {{1, 2, 3}, {-1, -2, -3}, {4, 5, 6}};
        int total = 0;

        // ADD CODE HERE

        System.out.println("The sum of the diagonal is: " + total);

        // A10 Replace the “ADD CODE HERE” below with the code to declare and create a
        // two-dimensional array of integers numbers with the numbers (1,2,3) in the
        // first row, and the numbers (4,5,6) in the second row. Then loop through the
        // two-dimensional array, printing out the values in the first row followed by
        // those in the second row.

        // ADD CODE HERE


        // A11 Replace the “ADD CODE HERE” below with the code to declare and create a
        // two-dimensional array of integers numbers with the numbers (1,2,3) in the
        // first row, the numbers (4,5,6) in the second row, and the numbers (7,8,9) in
        // the third row. Then loop through the two-dimensional array, printing out the
        // values in the first row followed by those in the second row and so on.

        // ADD CODE HERE


        // A12 Given the following array, replace the “ADD CODE HERE” below with the
        // code to replace the word “purple” with “yellow”.

        String[][] arr7 = {{"red", "orange", "purple"}, {"green", "blue", "indigo"}};

        // ADD CODE HERE

        for (int row = 0; row < arr7.length; row++) {
            for (int col = 0; col < arr7[1].length; col++) {
                System.out.println(arr7[row][col]);
            }
        }


    }

    public static void main(String[] args) {
        new TwoDArraysEx();
    }
}
