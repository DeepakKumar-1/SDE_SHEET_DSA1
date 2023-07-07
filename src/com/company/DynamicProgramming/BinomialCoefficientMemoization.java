package com.company.DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class BinomialCoefficientMemoization {

    private static int binomialCoeff(int n, int k, int [][]dp){
        // base case
        if(n == k || k == 0){
            dp[n][k] = 1;
            return dp[n][k];
        }

        dp[n][k] = binomialCoeff(n-1, k-1, dp) + binomialCoeff(n-1, k, dp);
        return dp[n][k];
    }
    private static int binomialCoeff(int n, int k) {
        if(k > n){
            return 0;
        }
        int [][]dp = new int[n+1][k+1];
        for(int []a : dp){
            Arrays.fill(a, -1);
        }
        return binomialCoeff(n, k, dp);

    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int res = binomialCoeff(n, k);
        System.out.println(res);
    }

}
