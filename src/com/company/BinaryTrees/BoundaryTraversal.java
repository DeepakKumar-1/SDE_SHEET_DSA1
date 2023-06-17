package com.company.BinaryTrees;

import java.util.ArrayList;


public class BoundaryTraversal {

    private static boolean isLeaf(Node root) {
        return (root.left == null) && (root.right == null);
    }

    private static void addLeftBoundary(Node root, ArrayList<Integer> res) {
        Node curr = root.left;
        while(curr != null) {
            if (!isLeaf(curr)) {
                res.add(curr.val);
            }
            if (curr.left != null) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

    }


    private static void addLeaves(Node root, ArrayList<Integer> res) {
        if(isLeaf(root)){
            res.add(root.val);
            return;
        }
        if(root.left != null){
            addLeaves(root.left, res);
        }
        if(root.right != null){
            addLeaves(root.right, res);
        }
    }


    private static void addRightBoundary(Node root, ArrayList<Integer> res) {
        Node curr = root.right;
        ArrayList<Integer> ls = new ArrayList<>();
        while(curr != null) {
            if (!isLeaf(curr)) {
                ls.add(curr.val);
            }
            if (curr.right != null) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }
        for(int i=ls.size()-1; i>=0; i--){
            res.add(ls.get(i));
        }

    }


    private static ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (!isLeaf(root)) res.add(root.val);
        addLeftBoundary(root, res);
        addLeaves(root, res);
        addRightBoundary(root, res);
        return res;
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



        ArrayList<Integer> res = boundaryTraversal(root);
       for(int i: res){
           System.out.print(i + " ");
       }
    }
}
