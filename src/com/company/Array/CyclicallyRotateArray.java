package com.company.Array;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicallyRotateArray {
    private static void reverse(int []arr, int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    // Reversal Algorithm for Rotation of Array
    private static void reversalAlgorithm(int []arr, int k){
        int n = arr.length;
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }
    private static void rotateArray(int []arr){
        int temp = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
    }
    private static void rotateArray(int []arr, int k){
        for(int i=0; i<k; i++){
            rotateArray(arr);
        }
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter K: ");
        int k = sc.nextInt();
        System.out.println(Arrays.toString(arr));
//        rotateArray(arr, k);
        reversalAlgorithm(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
