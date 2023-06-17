package com.company.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfTree {
    private static void leftView(Node root) {
        if (root == null) {
            return;
        }
        Node curr = root;
        Queue<Node> queue = new LinkedList<>();
        queue.add(curr);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            System.out.print(queue.peek().val + " ");
            for (int i = 0; i < levelSize; i++) {
                curr = queue.poll();
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }
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

        leftView(root);
    }
}
