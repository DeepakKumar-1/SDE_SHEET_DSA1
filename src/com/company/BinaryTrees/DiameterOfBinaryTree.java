package com.company.BinaryTrees;

public class DiameterOfBinaryTree {
    private static int height(Node root) {
        // Base case
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }
    private static int findDiameter(Node root){
        // Base case
        if(root == null){
            return 0;
        }
        int opt1 = height(root.left) + height(root.right);
        int opt2 = findDiameter(root.left);
        int opt3 = findDiameter(root.right);
        return Math.max(opt1, Math.max(opt2, opt3));
    }

    public static void main(String []args){
        Node root = new Node(1);
        Node p1 = new Node(2);
        Node p2 = new Node(3);
        Node p3 = new Node(4);
        Node p4 = new Node(5);
        Node p5 = new Node(6);
        Node p6 = new Node(7);

        root.left = p1;
        root.right = p2;
        p1.left = p3;
        p1.right = p4;
        p4.left = p5;
        p4.right = p6;

        int res = findDiameter(root);
        System.out.println(res);
    }
}
