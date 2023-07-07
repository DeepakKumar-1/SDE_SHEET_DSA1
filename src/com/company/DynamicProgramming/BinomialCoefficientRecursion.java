package com.company.DynamicProgramming;

import java.util.Scanner;

public class BinomialCoefficientRecursion {
    private static int binomialCoeff(int n, int k){
        // Base case
        if(k == 0 || k == n){
            return 1;
        }
        if(k > n){
            return 0;
        }
        return binomialCoeff(n-1, k-1) + binomialCoeff(n-1, k);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int res = binomialCoeff(n, k);
        System.out.println(res);
    }
}
