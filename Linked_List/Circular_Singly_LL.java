package Linked_List;

public class Circular_Singly_LL {
    public Node head;
    public Node tail;
    public int size;

    // Creating Circular Singly LL
    public Node createCircularSinglyLL(int nodeValue) { // O(1) - STC
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Inserting a node
    public void insertCSLL(int nodeValue, int location) { // O(N) - TC && O(1) - SC
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createCircularSinglyLL(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;
        } else {
            Node tNode = head;
            int index = 0;
            while (index < location - 1) {
                tNode = tNode.next;
                index++;
            }
            node.next = tNode.next;
            tNode.next = node;
        }
        size += 1;
    }

    // Traversal of LL
    public void traversalCSLL() { // O(N) - TC && O(1) - SC
        if (head == null) {
            System.out.print("CSLL doesn't exist");
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

    // Searchin in CSLL
    public void searchInCSLL(int value) { // O(N) - TC && O(1) - SC
        if (head == null) {
            System.out.println("LInked List doesn't exist");
            return;
        } else {
            Node tNode = head;
            for (int i = 0; i < size; i++) {
                if (tNode.value == value) {
                    System.out.println("Value present in LL at location " + i);
                    return;
                }
                tNode = tNode.next;
            }
            System.out.println("Value doesn't present in LL");
            return;
        }
    }

    // Delete in CSLL
    public void deleteFromCSLL(int location) { // O(N) - TC && O(1) - SC
        if (head == null) {
            System.out.println("LInked List doesn't exist");
            return;
        } else if (location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0) {
                tail = null;
                head.next = null;
                head = null;
            }
        } else if (location >= size) {
            Node tNode = head;
            for (int i = 0; i < size - 1; i++) {
                tNode = tNode.next;
            }
            tNode.next = head;
            tail = tNode;
            size--;
        } else {
            Node tNode = head;
            for (int i = 0; i < location - 1; i++) {
                tNode = tNode.next;
            }
            tNode.next = tNode.next.next;
            size--;
        }
        return;
    }

    // Deleting entire CSLL
    public void deleteCSLL() { // O(1) - STC
        head.next = null;
        tail = head = null;
        System.out.println("CSLL is deleted successfully");
    }
}
