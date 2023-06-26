package com.company.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class ValidateBST1 {


//     Method 1 - Brute Force
    private static void inOrder(Node root, List<Integer> l){
        if(root != null){
            inOrder(root.left, l);
            l.add(root.val);
            inOrder(root.right, l);
        }
    }
    private static boolean checkBST(Node root) {
        List<Integer> l = new ArrayList<>();
        inOrder(root, l);
        System.out.println(l);
        for(int i=0; i<l.size()-2; i++){
            if(l.get(i) > l.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String []args){
        Node root = new Node(30);
        Node p1 = new Node(20);
        Node p2 = new Node(39);
        Node p3 = new Node(10);
        Node p4 = new Node(25);
        Node p5 = new Node(35);
        Node p6 = new Node(42);
        Node p7 = new Node(15);
        Node p8 = new Node(23);
        root.left = p1;
        root.right = p2;

        p1.left = p3;
        p1.right = p4;

        p2.left = p5;
        p2.right = p6;

        p3.right = p7;

        p4.left = p8;
        boolean isBST = checkBST(root);
        System.out.println(isBST);
    }

}
