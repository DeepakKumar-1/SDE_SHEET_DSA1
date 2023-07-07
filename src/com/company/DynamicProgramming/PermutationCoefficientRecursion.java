package com.company.DynamicProgramming;

import java.util.Scanner;

public class PermutationCoefficientRecursion {

    private static int permutationCoeff(int n, int k) {
        if(k > n){
            return 0;
        }
        // Base Case
        if(k == 0){
            return 1;
        }
        if(n == k){
            // return n!
            int fact = 1;
            for(int i=1; i<=n; i++){
                fact *= i;
            }
            return fact;
        }
        return permutationCoeff(n-1, k) + (k*permutationCoeff(n-1, k-1));
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int res = permutationCoeff(n, k);
        System.out.println(res);
    }

}
