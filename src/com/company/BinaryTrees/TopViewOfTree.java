package com.company.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

class Pair{
    Node node;
    int key;
    public Pair(Node node, int key){
        this.node = node;
        this.key = key;
    }
}
public class TopViewOfTree {
    private static void topView(Node root){

        Queue<Pair> queue = new LinkedList<>();
        Node curr = root;
        int key = 0;
        queue.add(new Pair(curr, key));
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while(!queue.isEmpty()){
            Pair p = queue.poll();
            curr = p.node;
            key = p.key;
            if(!map.containsKey(key)){
                map.put(key, curr.val);
            }
            if(curr.left != null){
                queue.add(new Pair(curr.left, key-1));
            }
            if(curr.right != null){
                queue.add(new Pair(curr.right, key+1));
            }
        }

        for(int k : map.keySet()){
            System.out.print(map.get(k) + " ");
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

        topView(root);
    }
}
