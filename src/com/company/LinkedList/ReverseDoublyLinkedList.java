package com.company.LinkedList;

class DLLNode{
    int val;
    DLLNode next;
    DLLNode prev;
    DLLNode(int val){
        this.val = val;
        this.next  = null;
        this.prev = null;
    }
}
public class ReverseDoublyLinkedList {
    private static void reverseLinkedList(DLLNode head) {
        DLLNode s = head;
        DLLNode e = head;

        while(e.next != null){
            e = e.next;
        }

        while(s != e && s.next != e){
            int temp = s.val;
            s.val = e.val;
            e.val = temp;
            s = s.next;
            e = e.prev;
        }
    }

    private static void displayLinkedList(DLLNode head) {
        DLLNode ptr = head;
        while(ptr != null){
            System.out.print(ptr.val + " -> ");
            ptr = ptr.next;
        }
        System.out.println(" ");
    }
    public static void main(String []args){
        DLLNode p1 = new DLLNode(1);
        DLLNode p2 = new DLLNode(2);
        DLLNode p3 = new DLLNode(3);
        DLLNode p4 = new DLLNode(4);
        DLLNode p5 = new DLLNode(5);

        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;

        p5.prev = p4;
        p4.prev = p3;
        p3.prev = p2;
        p2.prev = p1;

        displayLinkedList(p1);
        reverseLinkedList(p1);
        displayLinkedList(p1);
    }

}
