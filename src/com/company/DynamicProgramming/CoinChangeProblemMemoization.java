package com.company.DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChangeProblemMemoization {

    private static int coinChangeMemo(int[] coins, int amount, int[] dp) {
        if(amount == 0){
            return dp[amount];
        }

        int min = Integer.MAX_VALUE;
        for(int coin : coins){
            if(amount - coin >= 0){
                // check if already calculated
                if(dp[amount-coin] != -1){
                    return dp[amount-coin];
                }
                // otherwise calculate the result and store it
                int subAns = coinChangeMemo(coins, amount-coin, dp);
                if(subAns != Integer.MAX_VALUE && subAns+1 < min){
                    min = subAns+1;
                }
            }
        }
        // Store the result and return the Stored Result
        dp[amount] = min;
        return dp[amount];
    }
    private static int coinChange(int[] coins, int amount) {
        int []dp = new int[amount+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        return coinChangeMemo(coins, amount, dp);

    }


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
