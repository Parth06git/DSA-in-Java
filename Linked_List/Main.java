package Linked_List;

public class Main {
    public static void main(String[] args) {

        // Singly Linked List

        Singly_Linked_List sll = new Singly_Linked_List();
        sll.createSinglyLL(15);
        sll.insertInLL(23, 1);
        sll.insertInLL(2, 5);
        sll.insertInLL(4, 0);
        sll.insertInLL(14, 1);
        // System.out.println(sll.head.value);
        // System.out.println(sll.head.next.value);
        // System.out.println(sll.head.next.next.value);
        sll.traversalSinglyLL();
        sll.searchInLL(17);
        sll.deleteFromLL(2);
        sll.traversalSinglyLL();
        sll.deleteLL();
        sll.traversalSinglyLL();

        // Circular Singly Linked List
        Circular_Singly_LL csll = new Circular_Singly_LL();
        csll.createCircularSinglyLL(123);
        // System.out.println(csll.head.value);
        csll.insertCSLL(154, 0);
        csll.insertCSLL(143, 4);
        csll.insertCSLL(195, 1);
        // System.out.println(csll.head.next.value);
        csll.traversalCSLL();
        csll.searchInCSLL(145);
        csll.deleteFromCSLL(4);
        csll.traversalCSLL();
        csll.deleteCSLL();
        csll.traversalCSLL();
    }
}
