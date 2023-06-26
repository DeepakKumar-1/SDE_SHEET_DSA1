package com.company.BinarySearchTree;

public class ValidateBST2 {
    static Node prev = null;
    private static boolean isBST(Node root){
        // InOrder
        if(root != null){
            if(!isBST(root.left)){
                return false;
            }
            // Logic
            if(prev != null && prev.val >= root.val){
                return false;
            }
            prev = root;
            return isBST(root.right);
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
        boolean res = isBST(root);
        System.out.println(res);
    }
}
