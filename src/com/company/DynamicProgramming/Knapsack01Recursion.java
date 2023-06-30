package com.company.DynamicProgramming;

import java.util.Scanner;

public class Knapsack01Recursion {

    private static int knapsack01(int []profits, int []weights, int maxWeight, int i){
        if(maxWeight == 0 || i >= profits.length){
            return 0;
        }

        // Either take Current Element or not take
        int  opt1 = 0;
        if(weights[i] <= maxWeight) {
             opt1 = profits[i] + knapsack01(profits, weights, maxWeight - weights[i], i + 1);

        }
        int opt2 = knapsack01(profits, weights, maxWeight,i+1);
        return Math.max(opt1, opt2);
    }
    private static int knapsack01(int[] profits, int[] weights, int maxWeight) {
        return knapsack01(profits, weights, maxWeight, 0);
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
