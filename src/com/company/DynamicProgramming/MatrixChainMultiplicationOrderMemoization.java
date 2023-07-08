package com.company.DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixChainMultiplicationOrderMemoization {

    private static int minOperations(int s ,int e ,int[] arr, int [][] dp) {
        // Base case
        if(s == e){
            dp[s][e] = 0;
            return dp[s][e];
        }
        // if already calculated then return that
        if(dp[s][e] != -1){
            return dp[s][e];
        }
        int min = Integer.MAX_VALUE;
        for(int k=s; k<e; k++){
            int res = minOperations(s, k, arr, dp) + minOperations(k+1, e, arr, dp) + (arr[s-1] * arr[k] * arr[e]);
            if(res < min){
                min = res;
            }
        }
        dp[s][e] = min;
        return dp[s][e];
    }

    private static int minOperations(int[] arr) {
        int [][]dp = new int[arr.length][arr.length];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        // for matrices 1 to N
        return minOperations(1, arr.length-1, arr, dp);
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
