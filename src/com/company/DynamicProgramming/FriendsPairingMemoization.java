package com.company.DynamicProgramming;

import java.util.Scanner;

public class FriendsPairingMemoization {
    private static int friendsPairing(int n, int []dp){
        // base case
        if(n == 1 || n == 2){
            dp[n] = n;
            return dp[n];
        }
        dp[n] =  1*friendsPairing(n-1, dp)  + (n-1)*friendsPairing(n-2, dp);
        return dp[n];
    }
    private static int friendsPairing(int n){
        int []dp = new int[n+1];
        return friendsPairing(n, dp);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = friendsPairing(n);
        System.out.println(res);
    }
}
