package com.company.LinkedList;

public class AddNumbersRepresentedByTwoLinkedLists {
    private static Node addNumbers(Node head1, Node head2){
        Node p = head1;
        Node q = head2;
        Node dummyList = new Node(0);
        Node res = dummyList;
        int carry = 0;
        while(p != null || q != null){
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? p.val : 0;
            int sum = carry + x + y;
            res.next = new Node(sum % 10);
            res = res.next;
            carry = sum/10;
            // Move ahead
            if(p != null){
                p = p.next;
            }
            if(q != null){
                q = q.next;
            }
        }

        // if carry is left
        if(carry > 0){
            res.next = new Node(carry);
        }
        return dummyList.next;
    }
    private static void displayLinkedList(Node head) {
        if(head == null){
            System.out.println(" ");
        }
        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.val + " -> ");
            ptr = ptr.next;
        }
        System.out.println(" ");
    }
    public static void main(String []args){
        Node p1 = new Node(1);
        Node p2 = new Node(2);
        Node p3 = new Node(4);
        Node p4 = new Node(5);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;

        Node q1 = new Node(1);
        Node q2 = new Node(2);
        Node q3 = new Node(4);
        Node q4 = new Node(5);
        q1.next = q2;
        q2.next = q3;
        q3.next = q4;
        // Display both Lists
        displayLinkedList(p1);
        displayLinkedList(q1);
        Node head = addNumbers(p1,q1);
        displayLinkedList(head);
    }
}
