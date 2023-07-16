package com.company.DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class EditDistanceMemoization {

    private static int minDistance(String s, String t, int [][]dp){
        int m = s.length();
        int n = t.length();
        // base case
        if(s.isEmpty()){
            dp[m][n] = n;
        }
        if(t.isEmpty()){
            dp[m][n] = m;
        }
        // if already calculated
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        // check first character
        if(s.charAt(0) == t.charAt(0)){
            dp[m][n] = minDistance(s.substring(1), t.substring(1), dp);
            return dp[m][n];
        }
        // else explore all options
        // opt1 : insert one character
        int opt1 = minDistance(s, t.substring(1));
        int opt2 = minDistance(s.substring(1), t);
        int opt3 = minDistance(s.substring(1), t.substring(1));
        dp[m][n] = 1 + Math.min(opt1, Math.min(opt2, opt3));
        return dp[m][n];
    }
    private static int minDistance(String s, String t) {
        int [][]dp = new int[s.length()+1][t.length()+1];
        for(int []r: dp){
            Arrays.fill(r, -1);
        }
        return minDistance(s, t, dp);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String w1 = sc.next();
        String w2 = sc.next();
        int res = minDistance(w1, w2);
        System.out.println(res);
    }

}
