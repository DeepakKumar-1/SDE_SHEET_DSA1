package com.company.DynamicProgramming;

import java.util.Scanner;

// Problem Statement : We are given 'n' matrices, we have to
// multiply them in such a way that the total number of
// operations are minimum
public class MatrixChainMultiplicationOrderRecursion {

    private static int minOperations(int s ,int e ,int[] arr) {
        // Base case
        if(s == e){
            return 0;
        }
         int min = Integer.MAX_VALUE;
     for(int k=s; k<e; k++){
         int res = minOperations(s, k, arr) + minOperations(k+1, e, arr) + (arr[s-1] * arr[k] * arr[e]);
         if(res < min){
             min = res;
         }
     }
     return min;
    }

    private static int minOperations(int[] arr) {
        // for matrices 1 to N
        return minOperations(1, arr.length-1, arr);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int res = minOperations(arr);
        System.out.println(res);
    }

}
