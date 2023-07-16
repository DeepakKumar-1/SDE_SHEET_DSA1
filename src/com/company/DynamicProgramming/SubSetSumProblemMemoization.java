package com.company.DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class SubSetSumProblemMemoization {
    private static int subSetSum(int []set, int sum, int [][]dp, int i){
        int m = i;
        int n = sum;
        if(sum == 0){
            dp[m][n] = 1;
            return dp[m][n];
        }
        if(i >= set.length || sum < 0){
            return 0;
        }

        // if already calculated
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        // otherwise calculated
        int opt1 = subSetSum(set, sum - set[i], dp, i+1);
        int opt2 = subSetSum(set, sum, dp, i+1);
        boolean a = (opt1 == 1);
        boolean b = (opt2 == 1);
        dp[m][n] = (a || b) ? 1 : 0;
        return dp[m][n];
    }
    private static Boolean subSetSum(int []set, int sum){
        int [][]dp = new int[set.length+1][sum+1];

        for(int []r : dp){
            Arrays.fill(r, -1);
        }
        int res =  subSetSum(set, sum, dp, 0);
        return res == 1;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []set = new int[n];
        for(int i=0; i<set.length; i++){
            set[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        boolean res = subSetSum(set, sum);
        System.out.println(res);
    }

}
