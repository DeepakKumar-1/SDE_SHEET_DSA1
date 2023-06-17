package com.company.BinaryTrees;

import java.util.Stack;

class Node{
    int val;
    Node left;
    Node right;
    public Node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class PreOrderTraversal {
    private static void preOrderTraversal(Node root) {
        if(root == null){
            return;
        }
        System.out.print(root.val + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    private static void preOrderIteration(Node root){
        if(root == null){
            return;
        }
        Node curr = root;
        Stack<Node> stack = new Stack<>();
        stack.push(curr);
        while(!stack.isEmpty()){
            curr = stack.pop();
            System.out.print(curr.val + " ");
            if(curr.right != null){
                stack.push(curr.right);
            }
            if(curr.left != null){
                stack.push(curr.left);
            }
        }
    }
    public static void main(String[] args) {
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

        preOrderTraversal(root);
        System.out.println(" ");
        preOrderIteration(root);
    }

}
