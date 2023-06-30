package com.company.DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Knapsack01Memoization {

    private static int knapsack01Memo(int []profits, int []weights, int maxWeight, int i, int [][]dp){
        if(maxWeight == 0 || i >= weights.length){
            dp[maxWeight][i] = 0;
            return dp[maxWeight][i];
        }
        // if result is already Calculated
        if(dp[maxWeight][i] != -1){
            return dp[maxWeight][i];
        }
        // if already not calculated then calculate it
        int opt1 = 0;
        if(weights[i] <= maxWeight){
            opt1 = knapsack01Memo(profits, weights, maxWeight-weights[i], i+1, dp);
        }
        int opt2 = knapsack01Memo(profits, weights, maxWeight, i+1, dp);
        return Math.max(opt1, opt2);
    }
    private static int knapsack01(int[] profits, int[] weights, int maxWeight) {
        int [][]dp = new int[maxWeight+1][weights.length+1];
        for(int []a : dp){
            Arrays.fill(a, -1);
        }
        return knapsack01Memo(profits, weights, maxWeight, 0, dp);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Elements: ");
        int n = sc.nextInt();
        int []profits = new int[n];
        int []weights = new int[n];
        System.out.print("Enter Profits: ");
        for(int i=0; i<profits.length; i++){
            profits[i] = sc.nextInt();
        }
        System.out.print("Enter Weights: ");
        for(int i=0; i<weights.length; i++){
            weights[i] = sc.nextInt();
        }
        System.out.print("Enter Max Weight: ");
        int maxWeight = sc.nextInt();
        int res = knapsack01(profits, weights, maxWeight);
        System.out.println(res);
    }

}
