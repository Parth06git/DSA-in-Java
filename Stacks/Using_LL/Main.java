package Stacks.Using_LL;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        stack.push(15);
        stack.push(14);
        stack.push(10);
        stack.push(20);
        stack.push(35);
        System.out.println(stack.isEmpty());
        stack.pop();
        stack.pop();
        System.out.println("The top element is " + stack.peek());
        stack.delete();
        System.out.println("The top element is " + stack.peek());
    }
}
