package Linked_List;

public class Main {
    public static void main(String[] args) {
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
    }
}
