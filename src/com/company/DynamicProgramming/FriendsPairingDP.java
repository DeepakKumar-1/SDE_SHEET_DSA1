package com.company.DynamicProgramming;

import java.util.Scanner;

public class FriendsPairingDP {

    private static int friendsPairing(int n) {
        int []dp = new int[n+1];
        // base case
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<=n; i++){
            dp[n] = dp[i-1] + (i-1)*dp[i-2];
        }
        return dp[n];
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = friendsPairing(n);
        System.out.println(res);
    }

}
