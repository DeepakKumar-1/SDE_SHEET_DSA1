package com.company.LinkedList;

import java.util.Stack;

public class CheckPalindromeLinkedList {

    private static boolean checkPalindromeLL(Node head){
        if(head== null){
            return false;
        }
        Node slow = head;
        Node fast = head;
        Stack<Integer> stack = new Stack<>();
        while(fast != null && fast.next != null){
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        // check if number of elements are odd
        if(fast != null){
            // Skip Middle value
            slow = slow.next;
        }
        // now pop and check
        while(slow != null){
            int top = stack.pop();
            if(top != slow.val){
                return false;
            }
            slow = slow.next;
        }
        return true;
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
    public static void main(String []args) {

//        System.out.print("Enter Size of Linked List: ");
//        int n = sc.nextInt();
        Node p1 = new Node(1);
        Node p2 = new Node(2);
        Node p3 = new Node(3);
        Node p4 = new Node(2);
        Node p5 = new Node(1);
        // Link the Nodes
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;

        displayLinkedList(p1);
        boolean res = checkPalindromeLL(p1);
        System.out.println(res);
    }}
