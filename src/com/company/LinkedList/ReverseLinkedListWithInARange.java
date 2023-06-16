package com.company.LinkedList;

import java.util.Scanner;

public class ReverseLinkedListWithInARange {
    private static Node reverseElementsInRange(Node head, int s, int e){
        // get Previous Element
        Node p1 = head;
        Node p2 = head;
        int count = 1;
        while(count != s-1){
            p1 = p1.next;
            count++;
        }
        count = 1;
        while(count != e+1){
            p2 = p2.next;
            count++;
        }
        Node prev = p2;
        Node curr = p1.next;
        Node next = null;
        while(curr != p2){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        p1.next = prev;
        return head;
    }
    private static void displayLinkedList(Node head){
        Node ptr = head;
        while(ptr != null){
            // print values
            System.out.print(ptr.val + " -> ");
            ptr = ptr.next;
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Size of Linked List: ");
//        int n = sc.nextInt();
        Node p1 = new Node(1);
        Node p2 = new Node(2);
        Node p3 = new Node(3);
        Node p4 = new Node(4);
        Node p5 = new Node(5);
        // Link the Nodes
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        displayLinkedList(p1);
        Node head = reverseElementsInRange(p1, 2, 4);
        System.out.println("\n");
        displayLinkedList(head);
    }
}
