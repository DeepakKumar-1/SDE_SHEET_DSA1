package com.company.DynamicProgramming;

import java.util.Scanner;

public class NthCatalanNumber {

    private static int catalan(int n) {

        if(n == 0|| n == 1){
            return 1;
        }

        int []fact = new int[2*n + 1];

        fact[0]  = 1;

        // calculate Factorial
        for(int i=1; i<fact.length; i++){

            fact[i] = i* fact[i-1];
        }
        return  fact[2*n]/(fact[n+1]*fact[n]);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = catalan(n);
        System.out.println(res);
    }

}
