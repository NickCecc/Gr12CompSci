package cecchin.DataStructures.Stacks;

public class stackMain {
    public stackMain() {
        stackClass stack = new stackClass();
        stack.pushStack(1);
        stack.pushStack(2);
        stack.pushStack(3);
        System.out.println(stack.popStack());
        System.out.println(stack.popStack());
        System.out.println(stack.popStack());
        System.out.println(stack.popStack());


    }

    public static void main(String[] args) {
        new stackMain();
    }
}
