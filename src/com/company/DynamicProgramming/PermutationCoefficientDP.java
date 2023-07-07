package com.company.DynamicProgramming;

import java.util.Scanner;

public class PermutationCoefficientDP {

    private static int permutationCoeff(int n, int k) {
        if(k > n){
            return 0;
        }
        if(k == n){
            return 1;
        }
        int []fact = new int[n+1];
        fact[0] = 1;
        for(int i=1; i<fact.length; i++){
            fact[i] = i * fact[i-1];
        }
        return fact[n]/fact[n-k];
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int res = permutationCoeff(n, k);
        System.out.println(res);
    }

}
