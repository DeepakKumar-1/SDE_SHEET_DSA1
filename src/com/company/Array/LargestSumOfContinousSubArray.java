package com.company.Array;

import java.util.Arrays;
import java.util.Scanner;

public class LargestSumOfContinousSubArray {
    private static int subArrayMaxSum(int []arr){
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
               sum += arr[j];
               if(maxSum < sum){
                   maxSum = sum;
               }
            }
        }
        return maxSum;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int maxSum  = subArrayMaxSum(arr);
        System.out.println(maxSum);
    }
}
