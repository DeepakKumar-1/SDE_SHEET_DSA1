package com.company.DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class GoldMineProblemMemoization {

    private static int goldMine(int [][]mat){
        int ans = Integer.MIN_VALUE;
        int n = mat.length;
        int m = mat[0].length;
        int [][]dp = new int[n+1][m+1];
        for(int []r : dp){
            Arrays.fill(r, -1);
        }
        for(int r =0; r < mat.length; r++){
            ans = Math.max(ans, goldMine(r, 0, mat, dp));
        }
        return ans;
    }
    private static int goldMine(int r, int c, int[][] mat, int [][]dp) {
        // Base case
        if(r >= mat.length ||  r < 0 || c >= mat[0].length){
            return 0;
        }

        if(dp[r][c] != -1){
            return dp[r][c];
        }

        // right diagonal UP
        int opt1 = goldMine(r-1, c+1, mat, dp);
        // right
        int opt2 = goldMine(r, c+1, mat, dp);
        // right diagonal DOWN
        int opt3 = goldMine(r+1, c+1, mat, dp);
        dp[r][c]  =  mat[r][c]+ Math.max(opt1, Math.max(opt2, opt3));
        return dp[r][c];
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][]mat = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int r = sc.nextInt();
        int c = sc.nextInt();
        int res = goldMine(mat);
        System.out.println(res);
    }
}
