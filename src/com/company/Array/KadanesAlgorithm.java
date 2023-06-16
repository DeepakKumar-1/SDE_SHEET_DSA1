package com.company.Array;

import java.util.Arrays;
import java.util.Scanner;

public class KadanesAlgorithm {
    private static int kadanesAlgo(int []arr){
//        int maxSum = 0;
//        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<arr.length; i++){
            currSum += arr[i];
            if(currSum > maxSum){
                maxSum = currSum;
            }
            if(currSum < 0){
                currSum = 0;
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
        int maxSum  = kadanesAlgo(arr);
        System.out.println(maxSum);
    }
}
