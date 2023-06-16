package com.company.LinkedList;

public class StartingPointOfLinkedList {
    private static Node startingPoint(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){ // Loop Detected
                return slow;
            }
        }
        return null;
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
        Node p2 = new Node(2);
        Node p3 = new Node(3);
        Node p4 = new Node(4);
        Node p5 = new Node(5);
        Node p6 = new Node(6);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = p6;
        p6.next = p3;
//        displayLinkedList(p1);
        Node sp = startingPoint(p1);
        System.out.println(sp);
    }
}
