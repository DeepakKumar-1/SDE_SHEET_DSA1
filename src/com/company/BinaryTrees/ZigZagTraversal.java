package com.company.BinaryTrees;

import java.util.*;

public class ZigZagTraversal {
    private static List<Integer> zigZagTraversal(Node root){
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        boolean leftToRight = true;
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> ls = new ArrayList<>();
            for(int i=0; i<levelSize; i++){
                Node curr = queue.poll();
                ls.add(curr.val);
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
            if(leftToRight){
                res.addAll(ls);
                leftToRight = false;
            }else{
                for(int i=ls.size()-1; i>=0; i--){
                    res.add(ls.get(i));
                }
                leftToRight = true;
            }
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

        List<Integer> res = zigZagTraversal(root);
        for(int i: res){
            System.out.print(i + " ");
        }
    }
}
