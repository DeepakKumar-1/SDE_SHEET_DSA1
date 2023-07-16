package com.company.DynamicProgramming;

import java.util.Scanner;

public class GoldMineProblemRecursion {

    private static int goldMine(int [][]mat){
        int ans = Integer.MIN_VALUE;
        for(int r =0; r < mat.length; r++){
            ans = Math.max(ans, goldMine(r, 0, mat));
        }
        return ans;
    }
    private static int goldMine(int r, int c, int[][] mat) {
        // Base case
        if(r >= mat.length ||  r < 0 || c >= mat[0].length){
            return 0;
        }

        // right diagonal UP
        int opt1 = goldMine(r-1, c+1, mat);
        // right
        int opt2 = goldMine(r, c+1, mat);
        // right diagonal DOWN
        int opt3 = goldMine(r+1, c+1, mat);
        return   mat[r][c]+ Math.max(opt1, Math.max(opt2, opt3));

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
