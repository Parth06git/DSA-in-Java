package Stacks.Using_Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack(4);

        // boolean emptyCheck = stack.isEmpty();
        // System.out.println(emptyCheck);
        // boolean fullCheck = stack.isFull();
        // System.out.println(fullCheck);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
        System.out.println(Arrays.toString(stack.arr));
        System.out.println(stack.peek());
        stack.delete();
        System.out.println(Arrays.toString(stack.arr));
    }
}
