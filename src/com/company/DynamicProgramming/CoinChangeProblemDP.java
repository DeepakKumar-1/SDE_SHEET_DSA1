package com.company.DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChangeProblemDP {

    public static int coinChange(int[] coins, int amount) {
        int []dp = new int[amount+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;


        for(int i=1; i<dp.length; i++){


            for(int coin : coins){
                if(i-coin >= 0 && dp[i-coin] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }


        }
        System.out.println(Arrays.toString(dp));

        if(dp[amount] == Integer.MAX_VALUE){
            return -1;
        }
        return dp[amount];

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
