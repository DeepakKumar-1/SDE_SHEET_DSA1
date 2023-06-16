package com.company.LinkedList;

public class MoveLastElementToFront {
    private static Node moveLastToFront(Node head){
        if(head.next == null){
            return head;
        }
        Node curr = head;
        Node prev = null;
        while(curr.next != null){
            prev = curr;
            curr = curr.next;
        }
        curr.next = head;
        prev.next = null;
        head = curr;
        return head;
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

//        p5.next = p6;

        displayLinkedList(p1);
        Node head = moveLastToFront(p1);
        displayLinkedList(head);
    }
}
