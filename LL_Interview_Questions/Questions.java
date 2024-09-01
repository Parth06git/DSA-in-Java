package LL_Interview_Questions;

import java.util.HashSet;

public class Questions {

    // Question - 1

    void removeDubs(Linked_List ll) {
        HashSet<Integer> hs = new HashSet<>();
        Node curNode = ll.head;
        Node prevNode = null;
        while (curNode != null) {
            int curValue = curNode.value;
            if (hs.contains(curValue)) {
                prevNode.next = curNode.next;
                ll.size--;
            } else {
                hs.add(curValue);
                prevNode = curNode;
            }
            curNode = curNode.next;
        }
    }

    // Question - 2

    void lastNthElement(Linked_List ll, int loc) {
        // We know the size of LL
        Node tNode = ll.head;
        for (int i = 0; i < ll.size - loc; i++) {
            tNode = tNode.next;
        }
        System.out.println(tNode.value);

        // We don't know the size of LL
        // Node p1 = ll.head;
        // Node p2 = ll.head;
        // for (int i = 0; i < loc; i++) {
        // if (p2 == null)
        // System.err.println("LL is not that big");
        // p2 = p2.next;
        // }
        // while (p2 != null) {
        // p1 = p1.next;
        // p2 = p2.next;
        // }
        // System.out.println(p1.value);
    }

    // Question - 3

    Linked_List partition(Linked_List ll, int x) {

        // Method - 1
        // Linked_List newLL = new Linked_List();
        // newLL.createLL(ll.head.value);
        // Node tNode = ll.head.next;
        // while (tNode != null) {
        // if (tNode.value < x) {
        // newLL.insertNodeStart(tNode.value);
        // } else {
        // newLL.insertNodeLast(tNode.value);
        // }
        // tNode = tNode.next;
        // }
        // return newLL;

        // Method - 2
        Node curNode = ll.head;
        ll.tail = ll.head;
        while (curNode != null) {
            Node nextNode = curNode.next;
            if (curNode.value < x) {
                curNode.next = ll.head;
                ll.head = curNode;
            } else {
                ll.tail.next = curNode;
                ll.tail = curNode;
            }
            curNode = nextNode;
        }
        ll.tail.next = null;
        return ll;
    }

    // Question - 4

    Linked_List sumLists(Linked_List lla, Linked_List llb) {
        Node n1 = lla.head;
        Node n2 = llb.head;
        int carry = 0;
        Linked_List resultll = new Linked_List();
        while (n1 != null || n2 != null) {
            int result = carry;
            if (n1 != null) {
                result += n1.value;
                n1 = n1.next;
            }
            if (n2 != null) {
                result += n2.value;
                n2 = n2.next;
            }
            resultll.insertNodeLast(result % 10);
            carry = result / 10;
        }
        return resultll;
    }

    // Question - 5

    // Get kth Node
    Node getKthNode(Node head, int k) {
        Node curNode = head;
        while (k > 0 && curNode != null) {
            curNode = curNode.next;
            k--;
        }
        return curNode;
    }

    // Intersection Method
    Node findIntersection(Linked_List lla, Linked_List llb) {
        if (lla.head == null || llb.head == null)
            return null;
        if (lla.tail != llb.tail)
            return null;
        Node lNode = new Node();
        Node sNode = new Node();
        if (lla.size >= llb.size) {
            lNode = lla.head;
            sNode = llb.head;
        } else {
            sNode = lla.head;
            lNode = llb.head;
        }

        lNode = getKthNode(lNode, Math.abs(lla.size - llb.size));

        while (sNode != lNode) {
            sNode = sNode.next;
            lNode = lNode.next;
        }
        return lNode;
    }

    // Add same node
    void addSameNode(Linked_List llA, Linked_List llB, int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        llA.tail.next = newNode;
        llA.tail = newNode;
        llB.tail.next = newNode;
        llB.tail = newNode;
    }

}
