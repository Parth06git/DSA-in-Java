package Stacks.Using_LL;

public class Stack { // O(1) - STC for all methods
    LinkedList ll;

    // create Stack
    public Stack() {
        ll = new LinkedList();
    }

    // isEmpty
    public boolean isEmpty() {
        if (this.ll.head == null) {
            return true;
        } else {
            return false;
        }
    }

    // push
    public void push(int value) {
        this.ll.addNoteAtStart(value);
        System.out.println("Value is successfully inserted");
    }

    // pop
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("The top element(value: " + this.ll.head.value + ") is removed");
            this.ll.deleteNodeAtStart();
        }
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return this.ll.head.value;
        }
    }

    // delete
    public void delete() {
        this.ll.deleteLL();
        System.out.println("Stack is deleted successfully");
    }
}
