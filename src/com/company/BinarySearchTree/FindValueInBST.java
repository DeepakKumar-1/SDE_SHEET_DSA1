package com.company.BinarySearchTree;

class Node{
    int val;
    Node left;
    Node right;
    public Node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class FindValueInBST {
    private static boolean findVal(Node root, int key){
        // Base Case
        if(root == null){
            return false;
        }
        if(root.val == key){
            return true;
        }
        if(root.val > key){
            return findVal(root.left, key);
        }
        return findVal(root.right, key);
    }
    public static void main(String []args){

    }
}
