package cecchin.DataStructures.Stacks;

import java.util.Iterator;
import java.util.Deque;
import java.util.ArrayDeque;


public class StackPractice {
    public StackPractice() {
        //Create a program that pushes 5 numbers on a stack, one at a time.
        // Print the resulting stack after each operation.
        // Pop each number off the stack, printing the resulting stack after each operation.
        Deque<Integer> stack = new ArrayDeque<Integer>();
        stack.push(1);
        System.out.println(stack);
        stack.push(2);
        System.out.println(stack);
        stack.push(3);
        System.out.println(stack);
        stack.push(4);
        System.out.println(stack);
        stack.push(5);
        System.out.println(stack);

        //Create a program that pushes the top 5 countries you want to visit onto a Stack.
        // Complete the following operations, and print the resulting stack after each operation.
        // 1.Peek at the head of the stack.
        // 2.Output the size of the stack.
        // 3.Remove and print the top element of the stack.
        // 4.Clear the stack.
        Deque<String> countries = new ArrayDeque<String>();
        countries.push("Canada");
        countries.push("Mexico");
        countries.push("North Korea");
        countries.push("Africa");
        countries.push("Uganda");
        System.out.println(countries.peek());
        System.out.println(countries.size());
        System.out.println(countries.pop());
        countries.clear();

        //I will place them in a stack, where the first student who asks for help watches in confusion as
        // every other student who requests help gets help before they do!  Each student has a name and a
        // Java bug that they are working on fixing.  Track this information in a Student class, adding 3
        // students to a stack, then using an Iterator to display the details for each student (use the toString()
        // method that should be coded in your Student class).  Pop each student off the stack.

        Student s1 = new Student();
        s1.setName("Nick");
        s1.setBug("Class");
        Student s2 = new Student();
        s2.setName("Joey");
        s2.setBug("Running");
        Student s3 = new Student();
        s3.setName("Prab");
        s3.setBug("IDK");

        Deque<Student> students = new ArrayDeque<Student>();
        students.push(s1);
        students.push(s2);
        students.push(s3);

        Iterator stuIterator = students.iterator();
        while (stuIterator.hasNext()) {
            System.out.println(stuIterator.next());
        }


    }

    public static void main(String[] args) {
        new StackPractice();
    }
}
