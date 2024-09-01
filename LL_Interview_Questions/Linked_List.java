package LL_Interview_Questions;

public class Linked_List {
    public Node head;
    public Node tail;
    public int size;

    public void createLL(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public void insertNodeLast(int nodeValue) {
        if (head == null) {
            createLL(nodeValue);
            return;
        }
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertNodeStart(int nodeValue) {
        if (head == null) {
            createLL(nodeValue);
            return;
        }
        Node node = new Node();
        node.value = nodeValue;
        node.next = head;
        head = node;
        size++;
    }

    public void traverseLL() {
        if (head == null) {
            System.out.print("Linked List doesn't exist");
        } else {
            Node tNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tNode.value);
                if (i != size - 1) {
                    System.out.print("-->");
                }
                tNode = tNode.next;
            }
        }
        System.out.println("");
    }

}
