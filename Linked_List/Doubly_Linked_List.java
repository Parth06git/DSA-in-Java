package Linked_List;

public class Doubly_Linked_List {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    // Creating a dll
    public DoublyNode createDLL(int nodeValue) { // O(1) - STC
        head = new DoublyNode();
        DoublyNode node = new DoublyNode();
        node.next = node.prev = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Inserting a node
    public void insertDLL(int nodeValue, int loc) { // O(N) - TC && O(1) - SC
        DoublyNode node = new DoublyNode();
        node.value = nodeValue;
        if (head == null) {
            createDLL(nodeValue);
            return;
        } else if (loc == 0) {
            node.next = head;
            node.prev = null;
            head.prev = node;
            head = node;
        } else if (loc >= size) {
            node.next = null;
            node.prev = tail;
            tail.next = node;
            tail = node;
        } else {
            DoublyNode tDoublyNode = head;
            int index = 0;
            while (index < loc - 1) {
                tDoublyNode = tDoublyNode.next;
                index++;
            }
            node.next = tDoublyNode.next;
            node.prev = tDoublyNode;
            tDoublyNode.next = node;
            node.next.prev = node;
        }
        size++;
    }

    // Traversal the dll
    public void traversalDLL() { // O(N) - TC && O(1) - SC
        if (head == null) {
            System.out.print("DLL doesn't exist");
        } else {
            DoublyNode tNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tNode.value);
                if (tNode.next != null) {
                    System.out.print("<-->");
                }
                tNode = tNode.next;
            }
        }
        System.out.println("");
    }

    // Reverse Traversal the dll
    public void reverseTraversalDLL() { // O(N) - TC && O(1) - SC
        if (head == null) {
            System.out.print("DLL doesn't exist");
        } else {
            DoublyNode tNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tNode.value);
                if (tNode.prev != null) {
                    System.out.print("<-->");
                }
                tNode = tNode.prev;
            }
        }
        System.out.println("");
    }

    // Search in DLL
    public void searchInDLL(int value) { // O(N) - TC && O(1) - SC
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

    // Delete a node
    public void deleteInDLL(int loc) { // O(N) - TC && O(1) - SC
        if (head == null) {
            System.out.print("DLL doesn't exist");
            return;
        } else if (loc == 0) {
            head.next.prev = null;
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
                head = null;
            }
        } else if (loc >= size) {
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            }
            DoublyNode tDoublyNode = tail.prev;
            tDoublyNode.next = null;
            tail = tDoublyNode;
            size--;
        } else {
            DoublyNode tDoublyNode = head;
            for (int i = 0; i < loc - 1; i++) {
                tDoublyNode = tDoublyNode.next;
            }
            tDoublyNode.next = tDoublyNode.next.next;
            tDoublyNode.next.prev = tDoublyNode;
            size--;
        }
    }

    // Deleting entire DLL
    public void deleteDLL() { // O(N) - TC && O(1) - SC
        if (head == null) {
            System.out.print("DLL doesn't exist");
        } else {
            DoublyNode tDoublyNode = head;
            for (int i = 0; i < size; i++) {
                tDoublyNode.prev = null;
                tDoublyNode = tDoublyNode.next;
            }
            head = null;
            tail = null;
            System.out.println("DLL is deleted Successfully");
        }
    }
}
