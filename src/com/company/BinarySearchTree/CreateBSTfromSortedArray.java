package com.company.BinarySearchTree;

public class CreateBSTfromSortedArray {

    private static Node createBST(int[] arr, int s, int e) {
        if(s > e){
            return null;
        }
        // find Mid
        int mid = s + (e-s)/2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, s, mid-1);
        root.right = createBST(arr, mid+1, e);
        return root;
    }

    private static Node createBST(int[] arr) {
        return createBST(arr, 0, arr.length-1);
    }
    private static void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }
    public static void main(String []args){
        int []arr = {1, 2, 3, 4, 5, 6, 7, 8};
        Node root = createBST(arr);
        inOrder(root);
    }


}
