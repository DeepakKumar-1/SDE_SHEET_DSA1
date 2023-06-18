package com.company.BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DiagonalTraversal {

    private static List<Integer> diagonalTraversal(Node root) {
        List<Integer> res = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node curr = queue.poll();
            res.add(curr.val);
            if(curr.left != null){
                queue.add(curr.left);
            }

            if(curr.right != null){
                Node ptr = curr.right;
                while(ptr != null){
                    if(ptr.left != null){
                        queue.add(ptr.left);
                    }
                    res.add(ptr.val);
                    ptr = ptr.right;
                }
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



        List<Integer> res = diagonalTraversal(root);
        for(int i: res){
            System.out.print(i + " ");
        }
    }

}
