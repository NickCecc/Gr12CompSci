package cecchin.Stacks;
import java.util.ArrayDeque;
import java.util.Deque;

public class stackClass {
    //Create a custom Stack class, which implements the methods push() and pop(). The push() method takes one argument, an integer 'x' to be pushed into the stack and pop() which
    //returns an integer present at the top and popped out from the stack. If the stack is empty then return -1 from the pop() method.
    private Deque<Integer> stack = new ArrayDeque<Integer>();

    public void pushStack(Integer num) {
        stack.push(num);

    }

    public String popStack() {
        if (!stack.isEmpty()) {
            return (stack.pop()).toString();
        } else {
            return "-1";
        }

    }

}
