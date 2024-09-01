package LL_Interview_Questions;

public class Main {
    public static void main(String[] args) {
        Linked_List ll = new Linked_List();
        ll.createLL(15);
        ll.insertNodeLast(17);
        ll.insertNodeLast(19);
        ll.insertNodeLast(17);
        ll.insertNodeLast(7);
        ll.insertNodeLast(172);
        ll.traverseLL();
        Questions q = new Questions();
        q.removeDubs(ll);
        ll.traverseLL();
        q.lastNthElement(ll, 2);

        Linked_List parLL = q.partition(ll, 16);
        parLL.traverseLL();

        Linked_List lla = new Linked_List();
        lla.createLL(1);
        lla.insertNodeLast(3);
        lla.insertNodeLast(7);
        Linked_List llb = new Linked_List();
        llb.createLL(2);
        llb.insertNodeLast(4);
        llb.insertNodeLast(1);
        Linked_List sumLL = q.sumLists(lla, llb);
        sumLL.traverseLL();

        q.addSameNode(lla, llb, 12);
        q.addSameNode(lla, llb, 19);
        q.addSameNode(lla, llb, 25);
        q.addSameNode(lla, llb, 27);
        Node sameNode = q.findIntersection(lla, llb);
        System.out.println(sameNode.value);

    }
}
