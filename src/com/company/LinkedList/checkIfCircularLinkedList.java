package com.company.LinkedList;


public class checkIfCircularLinkedList {
    private static boolean checkCircularLinkedList(Node head){
        if(head== null){
            return false;
        }

        Node ptr = head.next;
        while(ptr != null && ptr != head){
            ptr = ptr.next;
        }
        return (head == ptr);
    }
    public static void main(String []args) {

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
        p5.next = p1;
//            displayLinkedList(p1);
        boolean res = checkCircularLinkedList(p1);
        System.out.println(res);
    }
}
