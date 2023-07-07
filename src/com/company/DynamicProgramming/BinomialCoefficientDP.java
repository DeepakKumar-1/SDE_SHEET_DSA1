package com.company.DynamicProgramming;

import java.util.Scanner;

public class BinomialCoefficientDP {

    private static int binomialCoeff(int n, int k) {
        int MOD = (int)Math.pow(10, 7) + 9;
        if(k > n){
            return 0;
        }
        int[][]dp = new int[n+1][k+1];
        // for k == 0
        for(int i=0; i<dp.length; i++){
            dp[i][0] = 1;
        }
        // for n == k i.e diagonal
        for(int i=0; i<Math.min(dp.length, dp[0].length); i++){
            dp[i][i] = 1;
        }

        for(int i=1; i< dp.length; i++){
            for(int j = 1; j<dp[0].length; j++){
                if(i < j){
                    dp[i][j] = 0;
                }
                if(i != j){
                    dp[i][j] = ((dp[i-1][j-1]%MOD) + (dp[i-1][j]%MOD))%MOD;
                }
            }
        }
        return (dp[n][k]%MOD);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int res = binomialCoeff(n, k);
        System.out.println(res);
    }

}
