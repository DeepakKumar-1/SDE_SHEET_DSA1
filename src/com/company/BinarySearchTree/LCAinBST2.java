package com.company.BinarySearchTree;

public class LCAinBST2 {
    private static Node lca(Node root, Node p, Node q) {
        if(root == null){
            return null;
        }
        // Redundant
//        if(root == p || root == q){
//            return root;
//        }

        // Both Nodes lies on Left
        if(root.val > p.val && root.val > q.val){
            return lca(root.left, p, q);
        }
        // Both Nodes lies on Right
       if(root.val < p.val && root.val < q.val){
           return lca(root.right, p, q);
       }
        // One Node is on left and another is on right
        return  root;
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
        Node res = lca(root, p2, p4);
        System.out.println(res.val);
    }

}
