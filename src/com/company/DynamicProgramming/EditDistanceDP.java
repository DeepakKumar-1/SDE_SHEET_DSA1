package com.company.DynamicProgramming;

import java.util.Scanner;

public class EditDistanceDP {

    private static int minDistance(String s, String t) {
        int m = s.length();
        int n = t.length();
        int [][]dp = new int[m+1][n+1];
        // corresponding to base Case
        for(int i=0; i<dp.length; i++){
            dp[i][0] = i;
        }
        for(int i=0; i<dp[0].length; i++){
            dp[0][i] = i;
        }

        // otherwise
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                if(s.charAt(m-1) == t.charAt(n-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    // explore all options
                    int opt1 = dp[i-1][j];
                    int opt2 = dp[i][j-1];
                    int opt3 = dp[i-1][j-1];
                    dp[i][j] = 1 + Math.min(opt1, Math.min(opt2, opt3));
                }
            }
        }
        return dp[m][n];

    }


    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String w1 = sc.next();
        String w2 = sc.next();
        int res = minDistance(w1, w2);
        System.out.println(res);
    }

}
