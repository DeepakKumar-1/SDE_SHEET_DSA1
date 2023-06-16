package com.company.LinkedList;

public class MergeTwoSortedLinkedList {
    private static void addAtLast(Node head, int val){
        Node n = new Node(val);
        Node ptr = head;
        while(ptr.next != null){
            ptr = ptr.next;
        }
        // Now add the new Node
        ptr.next = n;
    }
    private static Node mergeLinkedLists(Node head1, Node head2){
        Node p = head1;
        Node q = head2;
        Node res  = new Node(0);
        Node ptr = res;
        while(p != null && q != null){
            if(p.val > q.val){
//                addAtLast(res, q.val);
                Node n = new Node(q.val);
                ptr.next = n;
                q = q.next;
                ptr = ptr.next;
            }else{
//                addAtLast(res, p.val);
                Node n = new Node(q.val);
                ptr.next = n;
                p = p.next;
                ptr = ptr.next;
            }
        }
        while (p != null){
//            addAtLast(res, p.val);
//            p = p.next;
            Node n = new Node(p.val);
            ptr.next = n;
            p = p.next;
            ptr = ptr.next;
        }
        while (q != null){
//            addAtLast(res, q.val);
//            q = q.next;
            Node n = new Node(q.val);
            ptr.next = n;
            q = q.next;
            ptr = ptr.next;
        }
        return res.next;
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
        Node head = mergeLinkedLists(p1,q1);
        displayLinkedList(head);
    }


}
