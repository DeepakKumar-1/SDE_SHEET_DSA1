package com.company.BinarySearchTree;

public class KthMinimumInBSTmorris {

    private static int kthMinimum(Node root, int k) {
        Node curr = root;
        int count = 0;
        while(curr != null){
            if(curr.left == null){
                if(++count == k){
                    return curr.val;
                }
                curr = curr.right;
            }else{
                Node pred = findPred(curr);
                if(pred.right == null){
                    pred.right = curr;
                    curr = curr.left;
                }else{
                    pred.right = null;
                    if(++count == k){
                        return curr.val;
                    }
                    curr = curr.right;
                }
            }
        }
        return -1;
    }

    private static Node findPred(Node curr) {
        Node temp = curr.left;
        while (temp.right != null && temp.right != curr){
            temp = temp.right;
        }
        return temp;
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
        int res = kthMinimum(root, 3);
        System.out.println(res);
    }

}
