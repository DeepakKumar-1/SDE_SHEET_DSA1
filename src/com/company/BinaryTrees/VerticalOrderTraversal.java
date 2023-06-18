package com.company.BinaryTrees;

import java.util.*;

public class VerticalOrderTraversal {
    private static List<Integer> verticalOrderTraversal(Node root){
        List<Integer> res = new ArrayList<>();
        Queue<Pair> queue = new LinkedList<>();
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        Node curr = root;
        if(curr == null){
            return res;
        }
        queue.add(new Pair(curr, 0));
        while(!queue.isEmpty()){
            Pair p = queue.poll();
            int hd = p.key; // Horizontal Distance
            List<Integer> ls;
           if(map.containsKey(hd)) {
                ls = map.get(hd);
           }else{
               ls = new ArrayList<>();
           }
            ls.add(p.node.val);
            map.put(hd, ls);
            if(p.node.left != null){
                queue.add(new Pair(p.node.left, hd-1));
            }
            if(p.node.right != null){
                queue.add(new Pair(p.node.right, hd+1));
            }
        }

        for(int k: map.keySet()){
            List<Integer> l = map.get(k);
//            System.out.println(l);
            res.addAll(l);
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



        List<Integer> res = verticalOrderTraversal(root);
        for(int i: res){
            System.out.print(i + " ");
        }
    }
}
