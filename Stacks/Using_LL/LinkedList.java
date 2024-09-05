package Stacks.Using_LL;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLL(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void addNoteAtStart(int value) {
        Node tNode = new Node();
        tNode.value = value;
        if (head == null) {
            createSinglyLL(value);
            return;
        } else {
            tNode.next = head;
            head = tNode;
        }
        size++;
        return;
    }

    public void deleteNodeAtStart() {
        head = head.next;
        size--;
        if (size == 0) {
            tail = null;
        }
        return;
    }

    public void deleteLL() {
        head = null;
        tail = null;
        return;
    }
}
