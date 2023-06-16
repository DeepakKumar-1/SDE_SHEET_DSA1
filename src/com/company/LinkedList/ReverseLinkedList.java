package com.company.LinkedList;

import java.util.Scanner;

class Node{
    int val;
    Node next;

    public Node(int val){
        this.val = val;
        this.next = null;
    }
    public Node(int val, Node next){
        this.val = val;
        this.next = next;
    }
}

// Iterative Method
public class ReverseLinkedList {
    private static Node reverseLinkedList(Node head){
        Node prev = null;
        Node curr = head;
        Node next = head;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
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
        Node head = reverseLinkedList(p1);
        System.out.println("\n");
        displayLinkedList(head);
    }
}
