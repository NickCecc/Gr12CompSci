package cecchin.DataStructures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExamples {
    public QueueExamples() {
        //Add five Integer elements to a queue.
        // Display the queue after each operation: dequeue the head element,
        // peek at the head element, and display the queue’s size.
        Queue<Integer> que = new LinkedList<Integer>();
        que.add(1);
        que.add(2);
        que.add(3);
        System.out.println(que);
        que.remove();
        System.out.println(que.peek());
        System.out.println(que.size());

        // Allow the user to enter a set of words, one at a time, stored in a queue.
        // The user should enter a O when complete.
        // Then, each word should be removed from the queue in FIFO order,
        // and printed to the screen as it is removed.
        Queue<String> words = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int num = 0;
        String input;
        while (num != 1) {
            input = sc.nextLine();
            if (input.equals("1")) {
                num = 1;
            } else {
                words.add(input);
            }

        }
        System.out.println(words);


        Iterator qIt = words.iterator();

        while (qIt.hasNext()) {
            System.out.println(words.remove());
        }

    }


    public static void main(String[] args) {
        new QueueExamples();
    }


}
