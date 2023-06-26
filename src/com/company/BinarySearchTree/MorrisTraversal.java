package com.company.BinarySearchTree;

public class MorrisTraversal {
    private static void morrisTraversal(Node root){
        Node curr = root;
        while(curr != null){
            // if left doesn't Exist
            if(curr.left == null){
                // visit curr
                System.out.print(curr.val + " ");
                curr = curr.right;
            }else{
                // find predecessor
//                Node pred = findPred(curr);
                Node pred = curr.left;
                while (pred.right != null
                        && pred.right != curr)
                    pred = pred.right;

                // if right of predecessor is null then create temp link
                if(pred.right == null){
                    pred.right = curr;
                    curr = curr.left;
                }else{
                    // break the temp created link
                    pred.right = null;
                    System.out.print(curr.val + " ");
                    curr = curr.right;
                }
            }
        }
    }

    private static Node findPred(Node root) {
        Node temp = root.left;
        while(temp.right != null && temp.right != root){
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
        morrisTraversal(root);
    }
}
