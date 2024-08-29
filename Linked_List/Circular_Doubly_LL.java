package Linked_List;

public class Circular_Doubly_LL {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    // Creation of CDLL
    public DoublyNode createCDLL(int nodevalue) { // O(1) - STC
        DoublyNode node = new DoublyNode();
        node.value = nodevalue;
        node.next = node;
        node.prev = node;
        head = tail = node;
        size = 1;
        return head;
    }

    // Inserting a node
    public void insertCDLL(int nodevalue, int loc) { // O(N) - TC && O(1) - SC
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodevalue;
        if (head == null) {
            createCDLL(nodevalue);
            return;
        } else if (loc == 0) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            head = newNode;
            tail.next = head;
        } else if (loc >= size) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
        } else {
            DoublyNode tDoublyNode = head;
            for (int i = 0; i < loc - 1; i++) {
                tDoublyNode = tDoublyNode.next;
            }
            newNode.prev = tDoublyNode;
            newNode.next = tDoublyNode.next;
            tDoublyNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

    // Traversal of LL
    public void traversalCDLL() { // O(N) - TC && O(1) - SC
        if (head == null) {
            System.out.print("CDLL doesn't exist");
        } else {
            DoublyNode tNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tNode.value);
                if (i != size - 1) {
                    System.out.print("<-->");
                }
                tNode = tNode.next;
            }
        }
        System.out.println("");
    }

    // Reverse Traversal
    public void reverseTraversalCDLL() { // O(N) - TC && O(1) - SC
        if (head == null) {
            System.out.print("CDLL doesn't exist");
        } else {
            DoublyNode tNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tNode.value);
                if (i != size - 1) {
                    System.out.print("<-->");
                }
                tNode = tNode.prev;
            }
        }
        System.out.println("");
    }

    // Search in CDLL
    public void searchInCDLL(int value) { // O(N) - TC && O(1) - SC
        if (head == null) {
            System.out.print("DLL doesn't exist");
        } else {
            DoublyNode tDoublyNode = head;
            for (int i = 0; i < size; i++) {
                if (tDoublyNode.value == value) {
                    System.out.println("Value present in DLL at location " + i);
                    return;
                }
                tDoublyNode = tDoublyNode.next;
            }
            System.out.println("Value doesn't present in DLL");
        }
    }

    // Delete a node in CDLL
    public void deleteFromCDLL(int location) { // O(N) - TC && O(1) - SC
        if (head == null) {
            System.out.println("LInked List doesn't exist");
            return;
        } else if (location == 0) {
            head.next.prev = tail;
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0) {
                tail = null;
                head = null;
                head.next = head.prev = null;
            }
        } else if (location >= size) {
            DoublyNode tNode = tail.prev;
            tNode.next = head;
            head.prev = tNode;
            tail = tNode;
            size--;
            if (size == 0) {
                tail = null;
                head = null;
                head.next = head.prev = null;
            }
        } else {
            DoublyNode tNode = head;
            for (int i = 0; i < location - 1; i++) {
                tNode = tNode.next;
            }
            tNode.next = tNode.next.next;
            tNode.next.prev = tNode;
            size--;
        }
        return;
    }

    // Deleting entire CDLL
    public void deleteCDLL() { // O(N) - TC && O(1) - SC
        DoublyNode tNode = head;
        for (int i = 0; i < size; i++) {
            tNode.prev = null;
            tNode = tNode.next;
        }
        head = tail = null;
        System.out.println("CDLL is deleted successfully");
    }
}
