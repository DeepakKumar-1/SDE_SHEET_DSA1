package com.company.LinkedList;

public class FindMiddleOfLinkedList {
    private static Node middleElement(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast .next.next;
        }
        return slow;
    }
    private static void displayLinkedList(Node head){
        Node ptr = head;
        while(ptr != null){
            // Display Value
            System.out.print(ptr.val + " -> ");
            ptr = ptr.next;
        }
        System.out.print("\n");
    }
    public static void main(String []args){
        Node p1 = new Node(1);
        Node p2 = new Node(3);
        Node p3 = new Node(3);
        Node p4 = new Node(3);
        Node p5 = new Node(3);
//        Node p6 = new Node(4);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;

//        p5.next = p6;

        displayLinkedList(p1);
        Node middle = middleElement(p1);
        System.out.println(middle.val);
    }
}
