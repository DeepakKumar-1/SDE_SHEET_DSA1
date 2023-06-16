package com.company.LinkedList;

class ListNode{
    int val;
    ListNode next;
    ListNode child;
    public ListNode(int val){
        this.val = val;
        this.next = null;
        this.child = null;
    }
}
public class FlattenTheLinkedList {
    private static ListNode flattenLinkedList(ListNode head) {
        ListNode p = head; // For parent
        ListNode c = null;  // For Child
        ListNode dummyList = new ListNode(0);
        ListNode res = dummyList;
        while(p != null){
            res.next = new ListNode(p.val);
            res = res.next;
            c = p.child;
            while(c != null){
                res.next = new ListNode(c.val);
                res = res.next;
                c = c.child;
            }
            p = p.next;
        }
        return dummyList.next;
    }

    private static void displayLinkedList(ListNode head){
        ListNode ptr = head;
        while(ptr != null){
            System.out.print(ptr.val + " -> ");
            ptr = ptr.next;
        }
        System.out.println("\n");
    }

    public static void main(String []args){
        ListNode p1 = new ListNode(1);
        ListNode c1 = new ListNode(2);
        ListNode c2 = new ListNode(3);

        p1.child = c1;
        c1.child = c2;

        ListNode p2 = new ListNode(4);
        ListNode c3 = new ListNode(5);
        ListNode c4 = new ListNode(6);
        p2.child = c3;
        c3.child = c4;

        ListNode p3 = new ListNode(7);
        ListNode c5 = new ListNode(8);
        p3.child = c5;

        ListNode p4 = new ListNode(9);
        ListNode c6 = new ListNode(12);
        p4.child = c6;

        ListNode p5 = new ListNode(20);

        // Next Links
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;

        ListNode head = flattenLinkedList(p1);
        displayLinkedList(head);
    }


}
