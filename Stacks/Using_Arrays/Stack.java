package Stacks.Using_Arrays;

public class Stack {
    int[] arr;
    int topOfStack;

    // Creating a stack
    public Stack(int size) { // O(1) - TC && O(N) - SC
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("Stack is created with the size of " + size);
    }

    // isEmpty
    public boolean isEmpty() { // O(1) - STC
        if (topOfStack == -1) {
            return true;
        } else {
            return false;
        }
    }

    // isFull
    public boolean isFull() { // O(1) - STC
        if (this.arr.length == topOfStack + 1) {
            return true;
        } else {
            return false;
        }
    }

    // push
    public void push(int value) { // O(1) - STC
        if (isFull()) {
            System.out.println("Stack is already full! Can't push.");
            return;
        }
        this.arr[topOfStack + 1] = value;
        topOfStack++;
        System.out.println("Value is successfully inserted");
    }

    // pop
    public void pop() { // O(1) - STC
        if (isEmpty()) {
            System.out.println("Stack is Empty! Can't pop.");
            return;
        }
        int topValue = this.arr[topOfStack];
        arr[topOfStack] = 0;
        topOfStack--;
        System.out.println("The top element(value: " + topValue + ") is removed");
    }

    // peek
    public int peek() { // O(1) - STC
        if (isEmpty()) {
            System.out.println("Stack is Empty! Can't pop.");
            return -1;
        }
        return arr[topOfStack];
    }

    // delete
    public void delete() { // O(1) - STC
        arr = null;
        System.out.println("Stack is deleted successfully");
    }

}
