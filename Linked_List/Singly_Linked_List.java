package Linked_List;

public class Singly_Linked_List {
    public Node head;
    public Node tail;
    public int size;

    // Creating Singly LL
    public Node createSinglyLL(int nodeValue) { // O(1) - STC {SC is O(1) because we are only creating one node}
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Inserting a node in LL
    public void insertInLL(int nodeValue, int location) { // O(N) - TC && O(1) - SC
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSinglyLL(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size += 1;
        return;
    }

    // traversal of singly LL
    public void traversalSinglyLL() { // O(N) - TC && O(1) - SC
        if (head == null) {
            System.out.print("Linked List doesn't exist");
        } else {
            Node tNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tNode.value);
                if (tNode.next != null) {
                    System.out.print("-->");
                }
                tNode = tNode.next;
            }
        }
        System.out.println("");
    }

    // Search in LL
    public void searchInLL(int value) { // O(N) - TC && O(1) - SC
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

    // Deleting in LL
    public void deleteFromLL(int location) { // O(N) - TC && O(1) - SC
        if (head == null) {
            System.out.println("LInked List doesn't exist");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head = tail = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tNode = head;
            for (int i = 0; i < location - 1; i++) {
                tNode = tNode.next;
            }
            tNode.next = tNode.next.next;
            size--;
        }

    }

    // Deleting entire LL
    public void deleteLL() { // O(1) - STC
        head = null;
        tail = null;
        System.out.println("Singly LL is deleted Successfully");
    }
}
