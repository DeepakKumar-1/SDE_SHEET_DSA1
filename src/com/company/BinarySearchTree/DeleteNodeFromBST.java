package com.company.BinarySearchTree;

public class DeleteNodeFromBST {
    private static Node deleteNodeFromBST(Node root, int key){
        // Base Case
        if(root == null){
            return  null;
        }
        // Search for key
        if(root.val > key){
            root.left = deleteNodeFromBST(root.left, key);
        }
        else if(root.val < key){
            root.right = deleteNodeFromBST(root.right, key);
        }
        else{
            // We got the key
            // Case 1 : Node is leaf Node
            if(root.left == null && root.right == null){
                return null;
            }
            // Case 2 : Left is Null but right is present
            else if(root.left == null){
                 return  root.right;

            }
            // Case 3 : right is Null but left is present
            else if(root.right == null){
                return  root.left;
            }
            // left and right both are present Then find Successor and replace successor with root and call delete method for successor
            Node succ = findMinNode(root.right);
            root.val = succ.val;
            root.right = deleteNodeFromBST(root.right, succ.val);
        }
        return  root;
    }

    private static Node findMinNode(Node root) {
        if(root == null){
            return  null;
        }
        while (root.left != null){
            root = root.left;
        }
        return root;
    }
    private static void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }

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
        inOrder(root);
        root = deleteNodeFromBST(root, 25);
        System.out.println(" ");
        inOrder(root);
    }
}
