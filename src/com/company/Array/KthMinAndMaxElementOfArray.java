package com.company.Array;

import java.util.Arrays;
import java.util.Scanner;

public class KthMinAndMaxElementOfArray {
    static int min;
    static int max;
    private static void minMax(int []arr, int k){
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        min = arr[k-1];
        max = arr[n-1-(k-1)];
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter K: ");
        int k = sc.nextInt();
//        System.out.println("Min: " + min + " Max: " + max);
        minMax(arr, k);
        System.out.println("Min: " + min + " Max: " + max);
    }
}
