package com.company.DynamicProgramming;

import java.util.Scanner;

public class Knapsack01DP {

    private static int knapsack01(int[] profits, int[] weights, int maxWeight) {
        int[][] dp = new int[maxWeight + 1][profits.length + 1];

        // Initialize the first row to 0 (no weight capacity)
        for (int j = 0; j <= profits.length; j++) {
            dp[0][j] = 0;
        }

        // Initialize the first column to 0 (no items selected)
        for (int i = 0; i <= maxWeight; i++) {
            dp[i][0] = 0;
        }

        // Calculate the maximum profit
        for (int i = 1; i <= maxWeight; i++) {
            for (int j = 1; j <= profits.length; j++) {
                // Take the jth item if it can fit in the remaining weight
                int opt1 = 0;
                if (weights[j - 1] <= i) {
                    opt1 = profits[j - 1] + dp[i - weights[j - 1]][j - 1];
                }

                // Not taking the jth item
                int opt2 = dp[i][j - 1];

                // Select the maximum profit
                dp[i][j] = Math.max(opt1, opt2);
            }
        }

        return dp[maxWeight][profits.length];
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
