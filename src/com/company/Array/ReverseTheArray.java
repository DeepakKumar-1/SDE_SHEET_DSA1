package com.company.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseTheArray {
    private static void reverseArray2(int []arr){
//        int start = 0;
//        int end = arr.length-1;
//        while(start <= end){
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
        for(int start=0, end =arr.length-1; start <= end; start++, end--){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
    private static void reverseArray1(int []arr){
        int n = arr.length;
        int []brr = new int[n];
        for(int i=n-1; i>=0; i--){
            brr[n-1-i] = arr[i];
        }
        // Copy to Original Array
        for(int i=0; i<n; i++){
            arr[i] = brr[i];
        }
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
//        reverseArray1(arr);
        reverseArray2(arr);
        System.out.println(Arrays.toString(arr));
    }
}
