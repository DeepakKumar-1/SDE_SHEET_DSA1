package com.company.DynamicProgramming;

import java.util.Scanner;

public class CoinChangeProblemRecursion {

    // Method 1 Recursion
    public static int coinChangeHelper(int []coins, int amount){
        // Base case
        if(amount == 0){
            return 0;
        }
        // For all dominations return minimum coins
        int min = Integer.MAX_VALUE;
        for(int coin : coins){
            if(amount - coin >= 0){
                int subAns = coinChangeHelper(coins, amount-coin);
                if(subAns != Integer.MAX_VALUE && subAns+1 < min){
                    min = subAns+1;
                }
            }
        }

        return min;
    }
    public static int coinChange(int[] coins, int amount) {
        int res  = coinChangeHelper(coins, amount);
        if(res >= 0 && res != Integer.MAX_VALUE){
            return res;
        }
        return -1;
    }





//    static int min = Integer.MAX_VALUE;
//    private static int coinChange(int []coins, int amount, int count){
//
//        // Base case
//        if(amount == 0){
//            return count;
//        }
//
//        // For all coins
//        for(int coin : coins){
//
//            if(amount - coin >= 0){
//                int c =  coinChange(coins, amount-coin, count+1);
//                 min =  Math.min(min, c);
//            }
//
//        }
//        return min;
//    }
//    private static int coinChange(int[] coins, int amount) {
//        return coinChange(coins, amount, 0);
//    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []coins = new int[n];
        for(int i=0; i<n; i++){
            coins[i] = sc.nextInt();
        }
        System.out.println("Enter Amount");
        int amount = sc.nextInt();
        int res = coinChange(coins, amount);
        System.out.println(res);
    }
}
