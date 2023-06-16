package com.company.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumAndMinimumElementsInArray {
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    private static void minMax(int []arr){

        for(int i =0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
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
//        System.out.println("Min: " + min + " Max: " + max);
        minMax(arr);
        System.out.println("Min: " + min + " Max: " + max);
    }
}
