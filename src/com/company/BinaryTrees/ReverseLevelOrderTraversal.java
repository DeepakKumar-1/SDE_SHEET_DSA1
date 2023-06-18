package com.company.BinaryTrees;

import java.util.*;

public class ReverseLevelOrderTraversal {
    private static List<Integer> reverseLevelOrderTraversal(Node root){
        List<Integer> res = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        Node curr = root;
        if(curr == null){
            return res;
        }
        queue.add(curr);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            for(int i=0; i<levelSize; i++){
                curr = queue.poll();
                stack.push(curr.val);
                if(curr.right != null){
                    queue.add(curr.right);
                }
                if(curr.left != null){
                    queue.add(curr.left);
                }

            }
        }

        // Now Remove Elements from stack and push it into res List
        while (!stack.isEmpty()){
            res.add(stack.peek());
            stack.pop();
        }
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



        List<Integer> res = reverseLevelOrderTraversal(root);
        for(int i: res){
            System.out.print(i + " ");
        }
    }
}
