package com.company.DynamicProgramming;

import java.util.Scanner;

public class BinomialCoefficientDP2 {

    private static int binomialCoeff(int n, int k) {
        if(n < k){
            return 0;
        }
        int MOD = (int)Math.pow(10, 9) + 7;
        int []dp = new int[n+1];
        dp[0] = 1;
        for(int i=1; i<=dp.length-1; i++){
            for(int j = dp.length-1; j >= 1; j--){
                dp[j] = ((dp[j]%MOD) + (dp[j-1]%MOD))%MOD;
            }
        }
        return dp[k%n];
    }
    public static void main(String []args){

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int res = binomialCoeff(n, k);
            System.out.println(res);

    }

}
