package com.company.LinkedList;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicatesFromUnSortedLinkedList {
    private static Node removeDuplicates(Node head){
//        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        Node curr = head;
        Node prev = null;
        while(curr != null){
//            if(map.containsKey(curr.val)) {
//                prev.next = curr.next;
//            }
            if(set.contains(curr.val)) {
                prev.next = curr.next;
            }
            else{
//              map.put(curr.val, 1);
              set.add(curr.val);
              prev = curr;
            }
            curr = curr.next;
        }
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
        Node p2 = new Node(3);
        Node p3 = new Node(3);
        Node p4 = new Node(3);
        Node p5 = new Node(3);
        Node p6 = new Node(4);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = p6;

        displayLinkedList(p1);
        Node head = removeDuplicates(p1);
        displayLinkedList(head);
    }
}
