package com.company.LinkedList;

public class SplitCircularLinkedListIntoTwoHalves {
    private static void halveCircularLinkedList(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next != head && fast.next.next != head){
            slow = slow.next;
            fast = fast.next.next;
        }
        //check  if there is Even No of Elements
        if(fast.next.next == head){
            fast = fast.next;
        }
        // Now Set the Heads for both Circular linked Lists
        Node head1 = head;
        Node head2 = slow.next;
        fast.next = head2 ;
        slow.next = head1;
        displayCircularLinkedList(head1);
        displayCircularLinkedList(head2);
    }

    private static void displayCircularLinkedList(Node head) {
        Node ptr = head;

        while(ptr.next != head){
            System.out.print(ptr.val + " -> ");
            ptr = ptr.next;
        }
        System.out.print(ptr.val);

        System.out.println(" ");
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
        displayCircularLinkedList(p1);
        halveCircularLinkedList(p1);

    }
}
