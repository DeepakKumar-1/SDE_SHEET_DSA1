package com.company.LinkedList;

import java.util.Scanner;

public class DetectCycleInLinkedList {
    private static boolean cycleDetection(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
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
            p5.next = p2;
//            displayLinkedList(p1);
            boolean res = cycleDetection(p1);
            System.out.println(res);

        }

}
